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

@js.native
trait ContextMenuParams extends js.Object {
  /**
    * An array of suggested words to show the user to replace the `misspelledWord`.
    * Only available if there is a misspelled word and spellchecker is enabled.
    */
  var dictionarySuggestions: js.Array[String] = js.native
  /**
    * These flags indicate whether the renderer believes it is able to perform the
    * corresponding action.
    */
  var editFlags: EditFlags = js.native
  /**
    * The character encoding of the frame on which the menu was invoked.
    */
  var frameCharset: String = js.native
  /**
    * URL of the subframe that the context menu was invoked on.
    */
  var frameURL: String = js.native
  /**
    * Whether the context menu was invoked on an image which has non-empty contents.
    */
  var hasImageContents: Boolean = js.native
  /**
    * If the context menu was invoked on an input field, the type of that field.
    * Possible values are `none`, `plainText`, `password`, `other`.
    */
  var inputFieldType: String = js.native
  /**
    * Whether the context is editable.
    */
  var isEditable: Boolean = js.native
  /**
    * Text associated with the link. May be an empty string if the contents of the
    * link are an image.
    */
  var linkText: String = js.native
  /**
    * URL of the link that encloses the node the context menu was invoked on.
    */
  var linkURL: String = js.native
  /**
    * The flags for the media element the context menu was invoked on.
    */
  var mediaFlags: MediaFlags = js.native
  /**
    * Type of the node the context menu was invoked on. Can be `none`, `image`,
    * `audio`, `video`, `canvas`, `file` or `plugin`.
    */
  var mediaType: none | image | audio | video | canvas | file | plugin = js.native
  /**
    * Input source that invoked the context menu. Can be `none`, `mouse`, `keyboard`,
    * `touch` or `touchMenu`.
    */
  var menuSourceType: none | mouse | keyboard | touch | touchMenu = js.native
  /**
    * The misspelled word under the cursor, if any.
    */
  var misspelledWord: String = js.native
  /**
    * URL of the top level page that the context menu was invoked on.
    */
  var pageURL: String = js.native
  /**
    * Text of the selection that the context menu was invoked on.
    */
  var selectionText: String = js.native
  /**
    * Source URL for the element that the context menu was invoked on. Elements with
    * source URLs are images, audio and video.
    */
  var srcURL: String = js.native
  /**
    * Title or alt text of the selection that the context was invoked on.
    */
  var titleText: String = js.native
  /**
    * x coordinate.
    */
  var x: Double = js.native
  /**
    * y coordinate.
    */
  var y: Double = js.native
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
  @scala.inline
  implicit class ContextMenuParamsOps[Self <: ContextMenuParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDictionarySuggestionsVarargs(value: String*): Self = this.set("dictionarySuggestions", js.Array(value :_*))
    @scala.inline
    def setDictionarySuggestions(value: js.Array[String]): Self = this.set("dictionarySuggestions", value.asInstanceOf[js.Any])
    @scala.inline
    def setEditFlags(value: EditFlags): Self = this.set("editFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameCharset(value: String): Self = this.set("frameCharset", value.asInstanceOf[js.Any])
    @scala.inline
    def setFrameURL(value: String): Self = this.set("frameURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasImageContents(value: Boolean): Self = this.set("hasImageContents", value.asInstanceOf[js.Any])
    @scala.inline
    def setInputFieldType(value: String): Self = this.set("inputFieldType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEditable(value: Boolean): Self = this.set("isEditable", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkText(value: String): Self = this.set("linkText", value.asInstanceOf[js.Any])
    @scala.inline
    def setLinkURL(value: String): Self = this.set("linkURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaFlags(value: MediaFlags): Self = this.set("mediaFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setMediaType(value: none | image | audio | video | canvas | file | plugin): Self = this.set("mediaType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMenuSourceType(value: none | mouse | keyboard | touch | touchMenu): Self = this.set("menuSourceType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMisspelledWord(value: String): Self = this.set("misspelledWord", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageURL(value: String): Self = this.set("pageURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectionText(value: String): Self = this.set("selectionText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSrcURL(value: String): Self = this.set("srcURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

