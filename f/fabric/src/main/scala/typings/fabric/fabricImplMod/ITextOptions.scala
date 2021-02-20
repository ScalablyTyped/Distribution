package typings.fabric.fabricImplMod

import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITextOptions extends TextOptions {
  
  /**
    * Indicates whether internal text char widths can be cached
    * @type Boolean
    */
  var caching: js.UndefOr[Boolean] = js.native
  
  /**
    * For functionalities on keyDown + ctrl || cmd
    */
  var ctrlKeysMapDown: js.UndefOr[js.Any] = js.native
  
  /**
    * For functionalities on keyUp + ctrl || cmd
    */
  var ctrlKeysMapUp: js.UndefOr[js.Any] = js.native
  
  /**
    * Color of default cursor (when not overwritten by character style)
    * @type String
    */
  var cursorColor: js.UndefOr[String] = js.native
  
  /**
    * Delay between cursor blink (in ms)
    * @type Number
    */
  var cursorDelay: js.UndefOr[Double] = js.native
  
  /**
    * Duration of cursor fadein (in ms)
    * @type Number
    */
  var cursorDuration: js.UndefOr[Double] = js.native
  
  /**
    * Width of cursor (in px)
    * @type Number
    */
  var cursorWidth: js.UndefOr[Double] = js.native
  
  /**
    * Indicates whether a text can be edited
    * @type Boolean
    */
  var editable: js.UndefOr[Boolean] = js.native
  
  /**
    * Border color of text object while it's in editing mode
    * @type String
    */
  var editingBorderColor: js.UndefOr[String] = js.native
  
  /**
    * Exposes underlying hidden text area
    */
  var hiddenTextarea: js.UndefOr[HTMLTextAreaElement] = js.native
  
  /**
    * Helps determining when the text is in composition, so that the cursor
    * rendering is altered.
    */
  var inCompositionMode: js.UndefOr[Boolean] = js.native
  
  /**
    * Indicates whether text is in editing mode
    * @type Boolean
    */
  var isEditing: js.UndefOr[Boolean] = js.native
  
  /**
    * For functionalities on keyDown
    * Map a special key to a function of the instance/prototype
    * If you need different behaviour for ESC or TAB or arrows, you have to change
    * this map setting the name of a function that you build on the fabric.Itext or
    * your prototype.
    * the map change will affect all Instances unless you need for only some text Instances
    * in that case you have to clone this object and assign your Instance.
    * this.keysMap = fabric.util.object.clone(this.keysMap);
    * The function must be in fabric.Itext.prototype.myFunction And will receive event as args[0]
    */
  var keysMap: js.UndefOr[js.Any] = js.native
  
  var path: js.UndefOr[String] = js.native
  
  /**
    * Indicates whether text is selected
    * @type Boolean
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  /**
    * Color of text selection
    * @type String
    */
  var selectionColor: js.UndefOr[String] = js.native
  
  /**
    * Index where text selection ends
    * @type Number
    */
  var selectionEnd: js.UndefOr[Double] = js.native
  
  /**
    * Index where text selection starts (or where cursor is when there is no selection)
    * @type Number
    */
  var selectionStart: js.UndefOr[Double] = js.native
  
  var useNative: js.UndefOr[Boolean] = js.native
}
object ITextOptions {
  
  @scala.inline
  def apply(): ITextOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITextOptions]
  }
  
  @scala.inline
  implicit class ITextOptionsMutableBuilder[Self <: ITextOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaching(value: Boolean): Self = StObject.set(x, "caching", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCachingUndefined: Self = StObject.set(x, "caching", js.undefined)
    
    @scala.inline
    def setCtrlKeysMapDown(value: js.Any): Self = StObject.set(x, "ctrlKeysMapDown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKeysMapDownUndefined: Self = StObject.set(x, "ctrlKeysMapDown", js.undefined)
    
    @scala.inline
    def setCtrlKeysMapUp(value: js.Any): Self = StObject.set(x, "ctrlKeysMapUp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKeysMapUpUndefined: Self = StObject.set(x, "ctrlKeysMapUp", js.undefined)
    
    @scala.inline
    def setCursorColor(value: String): Self = StObject.set(x, "cursorColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorColorUndefined: Self = StObject.set(x, "cursorColor", js.undefined)
    
    @scala.inline
    def setCursorDelay(value: Double): Self = StObject.set(x, "cursorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorDelayUndefined: Self = StObject.set(x, "cursorDelay", js.undefined)
    
    @scala.inline
    def setCursorDuration(value: Double): Self = StObject.set(x, "cursorDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorDurationUndefined: Self = StObject.set(x, "cursorDuration", js.undefined)
    
    @scala.inline
    def setCursorWidth(value: Double): Self = StObject.set(x, "cursorWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorWidthUndefined: Self = StObject.set(x, "cursorWidth", js.undefined)
    
    @scala.inline
    def setEditable(value: Boolean): Self = StObject.set(x, "editable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditableUndefined: Self = StObject.set(x, "editable", js.undefined)
    
    @scala.inline
    def setEditingBorderColor(value: String): Self = StObject.set(x, "editingBorderColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEditingBorderColorUndefined: Self = StObject.set(x, "editingBorderColor", js.undefined)
    
    @scala.inline
    def setHiddenTextarea(value: HTMLTextAreaElement): Self = StObject.set(x, "hiddenTextarea", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenTextareaUndefined: Self = StObject.set(x, "hiddenTextarea", js.undefined)
    
    @scala.inline
    def setInCompositionMode(value: Boolean): Self = StObject.set(x, "inCompositionMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInCompositionModeUndefined: Self = StObject.set(x, "inCompositionMode", js.undefined)
    
    @scala.inline
    def setIsEditing(value: Boolean): Self = StObject.set(x, "isEditing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsEditingUndefined: Self = StObject.set(x, "isEditing", js.undefined)
    
    @scala.inline
    def setKeysMap(value: js.Any): Self = StObject.set(x, "keysMap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysMapUndefined: Self = StObject.set(x, "keysMap", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
    
    @scala.inline
    def setSelectionColor(value: String): Self = StObject.set(x, "selectionColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionColorUndefined: Self = StObject.set(x, "selectionColor", js.undefined)
    
    @scala.inline
    def setSelectionEnd(value: Double): Self = StObject.set(x, "selectionEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionEndUndefined: Self = StObject.set(x, "selectionEnd", js.undefined)
    
    @scala.inline
    def setSelectionStart(value: Double): Self = StObject.set(x, "selectionStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionStartUndefined: Self = StObject.set(x, "selectionStart", js.undefined)
    
    @scala.inline
    def setUseNative(value: Boolean): Self = StObject.set(x, "useNative", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseNativeUndefined: Self = StObject.set(x, "useNative", js.undefined)
  }
}
