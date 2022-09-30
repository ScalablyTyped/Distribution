package typings.electron.Electron

import typings.electron.electronStrings.adjustSelection
import typings.electron.electronStrings.adjustSelectionReset
import typings.electron.electronStrings.audio
import typings.electron.electronStrings.canvas
import typings.electron.electronStrings.file
import typings.electron.electronStrings.image
import typings.electron.electronStrings.keyboard
import typings.electron.electronStrings.longPress
import typings.electron.electronStrings.longTap
import typings.electron.electronStrings.mouse
import typings.electron.electronStrings.none
import typings.electron.electronStrings.plugin
import typings.electron.electronStrings.stylus
import typings.electron.electronStrings.touch
import typings.electron.electronStrings.touchHandle
import typings.electron.electronStrings.touchMenu
import typings.electron.electronStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Params extends StObject {
  
  /**
    * Alt text of the selection that the context menu was invoked on.
    */
  var altText: String
  
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
    * `touch`, `touchMenu`, `longPress`, `longTap`, `touchHandle`, `stylus`,
    * `adjustSelection`, or `adjustSelectionReset`.
    */
  var menuSourceType: none | mouse | keyboard | touch | touchMenu | longPress | longTap | touchHandle | stylus | adjustSelection | adjustSelectionReset
  
  /**
    * The misspelled word under the cursor, if any.
    */
  var misspelledWord: String
  
  /**
    * URL of the top level page that the context menu was invoked on.
    */
  var pageURL: String
  
  /**
    * The referrer policy of the frame on which the menu is invoked.
    */
  var referrerPolicy: Referrer
  
  /**
    * Rect representing the coordinates in the document space of the selection.
    */
  var selectionRect: Rectangle
  
  /**
    * Start position of the selection text.
    */
  var selectionStartOffset: Double
  
  /**
    * Text of the selection that the context menu was invoked on.
    */
  var selectionText: String
  
  /**
    * If the context is editable, whether or not spellchecking is enabled.
    */
  var spellcheckEnabled: Boolean
  
  /**
    * Source URL for the element that the context menu was invoked on. Elements with
    * source URLs are images, audio and video.
    */
  var srcURL: String
  
  /**
    * Suggested filename to be used when saving file through 'Save Link As' option of
    * context menu.
    */
  var suggestedFilename: String
  
  /**
    * Title text of the selection that the context menu was invoked on.
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
object Params {
  
  inline def apply(
    altText: String,
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
    menuSourceType: none | mouse | keyboard | touch | touchMenu | longPress | longTap | touchHandle | stylus | adjustSelection | adjustSelectionReset,
    misspelledWord: String,
    pageURL: String,
    referrerPolicy: Referrer,
    selectionRect: Rectangle,
    selectionStartOffset: Double,
    selectionText: String,
    spellcheckEnabled: Boolean,
    srcURL: String,
    suggestedFilename: String,
    titleText: String,
    x: Double,
    y: Double
  ): Params = {
    val __obj = js.Dynamic.literal(altText = altText.asInstanceOf[js.Any], dictionarySuggestions = dictionarySuggestions.asInstanceOf[js.Any], editFlags = editFlags.asInstanceOf[js.Any], frameCharset = frameCharset.asInstanceOf[js.Any], frameURL = frameURL.asInstanceOf[js.Any], hasImageContents = hasImageContents.asInstanceOf[js.Any], inputFieldType = inputFieldType.asInstanceOf[js.Any], isEditable = isEditable.asInstanceOf[js.Any], linkText = linkText.asInstanceOf[js.Any], linkURL = linkURL.asInstanceOf[js.Any], mediaFlags = mediaFlags.asInstanceOf[js.Any], mediaType = mediaType.asInstanceOf[js.Any], menuSourceType = menuSourceType.asInstanceOf[js.Any], misspelledWord = misspelledWord.asInstanceOf[js.Any], pageURL = pageURL.asInstanceOf[js.Any], referrerPolicy = referrerPolicy.asInstanceOf[js.Any], selectionRect = selectionRect.asInstanceOf[js.Any], selectionStartOffset = selectionStartOffset.asInstanceOf[js.Any], selectionText = selectionText.asInstanceOf[js.Any], spellcheckEnabled = spellcheckEnabled.asInstanceOf[js.Any], srcURL = srcURL.asInstanceOf[js.Any], suggestedFilename = suggestedFilename.asInstanceOf[js.Any], titleText = titleText.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Params]
  }
  
  extension [Self <: Params](x: Self) {
    
    inline def setAltText(value: String): Self = StObject.set(x, "altText", value.asInstanceOf[js.Any])
    
    inline def setDictionarySuggestions(value: js.Array[String]): Self = StObject.set(x, "dictionarySuggestions", value.asInstanceOf[js.Any])
    
    inline def setDictionarySuggestionsVarargs(value: String*): Self = StObject.set(x, "dictionarySuggestions", js.Array(value*))
    
    inline def setEditFlags(value: EditFlags): Self = StObject.set(x, "editFlags", value.asInstanceOf[js.Any])
    
    inline def setFrameCharset(value: String): Self = StObject.set(x, "frameCharset", value.asInstanceOf[js.Any])
    
    inline def setFrameURL(value: String): Self = StObject.set(x, "frameURL", value.asInstanceOf[js.Any])
    
    inline def setHasImageContents(value: Boolean): Self = StObject.set(x, "hasImageContents", value.asInstanceOf[js.Any])
    
    inline def setInputFieldType(value: String): Self = StObject.set(x, "inputFieldType", value.asInstanceOf[js.Any])
    
    inline def setIsEditable(value: Boolean): Self = StObject.set(x, "isEditable", value.asInstanceOf[js.Any])
    
    inline def setLinkText(value: String): Self = StObject.set(x, "linkText", value.asInstanceOf[js.Any])
    
    inline def setLinkURL(value: String): Self = StObject.set(x, "linkURL", value.asInstanceOf[js.Any])
    
    inline def setMediaFlags(value: MediaFlags): Self = StObject.set(x, "mediaFlags", value.asInstanceOf[js.Any])
    
    inline def setMediaType(value: none | image | audio | video | canvas | file | plugin): Self = StObject.set(x, "mediaType", value.asInstanceOf[js.Any])
    
    inline def setMenuSourceType(
      value: none | mouse | keyboard | touch | touchMenu | longPress | longTap | touchHandle | stylus | adjustSelection | adjustSelectionReset
    ): Self = StObject.set(x, "menuSourceType", value.asInstanceOf[js.Any])
    
    inline def setMisspelledWord(value: String): Self = StObject.set(x, "misspelledWord", value.asInstanceOf[js.Any])
    
    inline def setPageURL(value: String): Self = StObject.set(x, "pageURL", value.asInstanceOf[js.Any])
    
    inline def setReferrerPolicy(value: Referrer): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
    
    inline def setSelectionRect(value: Rectangle): Self = StObject.set(x, "selectionRect", value.asInstanceOf[js.Any])
    
    inline def setSelectionStartOffset(value: Double): Self = StObject.set(x, "selectionStartOffset", value.asInstanceOf[js.Any])
    
    inline def setSelectionText(value: String): Self = StObject.set(x, "selectionText", value.asInstanceOf[js.Any])
    
    inline def setSpellcheckEnabled(value: Boolean): Self = StObject.set(x, "spellcheckEnabled", value.asInstanceOf[js.Any])
    
    inline def setSrcURL(value: String): Self = StObject.set(x, "srcURL", value.asInstanceOf[js.Any])
    
    inline def setSuggestedFilename(value: String): Self = StObject.set(x, "suggestedFilename", value.asInstanceOf[js.Any])
    
    inline def setTitleText(value: String): Self = StObject.set(x, "titleText", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
