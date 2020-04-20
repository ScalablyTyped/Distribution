package typings.electron.Electron

import typings.electron.electronStrings.audio
import typings.electron.electronStrings.canvas
import typings.electron.electronStrings.file
import typings.electron.electronStrings.image
import typings.electron.electronStrings.keyboard
import typings.electron.electronStrings.mouse
import typings.electron.electronStrings.none
import typings.electron.electronStrings.plugin
import typings.electron.electronStrings.touch
import typings.electron.electronStrings.touchMenu
import typings.electron.electronStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContextMenuParams extends js.Object {
  /**
    * An array of suggested words to show the user to replace the `misspelledWord`.
    * Only available if there is a misspelled word and spellchecker is enabled.
    */
  var dictionarySuggestions: js.Array[String]
  /**
    * These flags indicate whether the renderer believes it is able to perform the
    * corresponding action.
    */
  var editFlags: EditFlags
  /**
    * The character encoding of the frame on which the menu was invoked.
    */
  var frameCharset: String
  /**
    * URL of the subframe that the context menu was invoked on.
    */
  var frameURL: String
  /**
    * Whether the context menu was invoked on an image which has non-empty contents.
    */
  var hasImageContents: Boolean
  /**
    * If the context menu was invoked on an input field, the type of that field.
    * Possible values are `none`, `plainText`, `password`, `other`.
    */
  var inputFieldType: String
  /**
    * Whether the context is editable.
    */
  var isEditable: Boolean
  /**
    * Text associated with the link. May be an empty string if the contents of the
    * link are an image.
    */
  var linkText: String
  /**
    * URL of the link that encloses the node the context menu was invoked on.
    */
  var linkURL: String
  /**
    * The flags for the media element the context menu was invoked on.
    */
  var mediaFlags: MediaFlags
  /**
    * Type of the node the context menu was invoked on. Can be `none`, `image`,
    * `audio`, `video`, `canvas`, `file` or `plugin`.
    */
  var mediaType: none | image | audio | video | canvas | file | plugin
  /**
    * Input source that invoked the context menu. Can be `none`, `mouse`, `keyboard`,
    * `touch` or `touchMenu`.
    */
  var menuSourceType: none | mouse | keyboard | touch | touchMenu
  /**
    * The misspelled word under the cursor, if any.
    */
  var misspelledWord: String
  /**
    * URL of the top level page that the context menu was invoked on.
    */
  var pageURL: String
  /**
    * Text of the selection that the context menu was invoked on.
    */
  var selectionText: String
  /**
    * Source URL for the element that the context menu was invoked on. Elements with
    * source URLs are images, audio and video.
    */
  var srcURL: String
  /**
    * Title or alt text of the selection that the context was invoked on.
    */
  var titleText: String
  /**
    * x coordinate.
    */
  var x: Double
  /**
    * y coordinate.
    */
  var y: Double
}

object ContextMenuParams {
  @scala.inline
  def apply(
    dictionarySuggestions: js.Array[String],
    editFlags: EditFlags,
    frameCharset: String,
    frameURL: String,
    hasImageContents: Boolean,
    inputFieldType: String,
    isEditable: Boolean,
    linkText: String,
    linkURL: String,
    mediaFlags: MediaFlags,
    mediaType: none | image | audio | video | canvas | file | plugin,
    menuSourceType: none | mouse | keyboard | touch | touchMenu,
    misspelledWord: String,
    pageURL: String,
    selectionText: String,
    srcURL: String,
    titleText: String,
    x: Double,
    y: Double
  ): ContextMenuParams = {
    val __obj = js.Dynamic.literal(dictionarySuggestions = dictionarySuggestions.asInstanceOf[js.Any], editFlags = editFlags.asInstanceOf[js.Any], frameCharset = frameCharset.asInstanceOf[js.Any], frameURL = frameURL.asInstanceOf[js.Any], hasImageContents = hasImageContents.asInstanceOf[js.Any], inputFieldType = inputFieldType.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], linkText = linkText.asInstanceOf[js.Any], linkURL = linkURL.asInstanceOf[js.Any], mediaFlags = mediaFlags.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], menuSourceType = menuSourceType.asInstanceOf[js.Any], misspelledWord = misspelledWord.asInstanceOf[js.Any], pageURL = pageURL.asInstanceOf[js.Any], selectionText = selectionText.asInstanceOf[js.Any], srcURL = srcURL.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenuParams]
  }
}

