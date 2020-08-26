package typings.fabric.fabricImplMod

import typings.std.HTMLTextAreaElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ITextOptionsOps[Self <: ITextOptions] (val x: Self) extends AnyVal {
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
    def setCaching(value: Boolean): Self = this.set("caching", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaching: Self = this.set("caching", js.undefined)
    @scala.inline
    def setCtrlKeysMapDown(value: js.Any): Self = this.set("ctrlKeysMapDown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKeysMapDown: Self = this.set("ctrlKeysMapDown", js.undefined)
    @scala.inline
    def setCtrlKeysMapUp(value: js.Any): Self = this.set("ctrlKeysMapUp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCtrlKeysMapUp: Self = this.set("ctrlKeysMapUp", js.undefined)
    @scala.inline
    def setCursorColor(value: String): Self = this.set("cursorColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorColor: Self = this.set("cursorColor", js.undefined)
    @scala.inline
    def setCursorDelay(value: Double): Self = this.set("cursorDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorDelay: Self = this.set("cursorDelay", js.undefined)
    @scala.inline
    def setCursorDuration(value: Double): Self = this.set("cursorDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorDuration: Self = this.set("cursorDuration", js.undefined)
    @scala.inline
    def setCursorWidth(value: Double): Self = this.set("cursorWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCursorWidth: Self = this.set("cursorWidth", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setEditingBorderColor(value: String): Self = this.set("editingBorderColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditingBorderColor: Self = this.set("editingBorderColor", js.undefined)
    @scala.inline
    def setHiddenTextarea(value: HTMLTextAreaElement): Self = this.set("hiddenTextarea", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHiddenTextarea: Self = this.set("hiddenTextarea", js.undefined)
    @scala.inline
    def setInCompositionMode(value: Boolean): Self = this.set("inCompositionMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInCompositionMode: Self = this.set("inCompositionMode", js.undefined)
    @scala.inline
    def setIsEditing(value: Boolean): Self = this.set("isEditing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsEditing: Self = this.set("isEditing", js.undefined)
    @scala.inline
    def setKeysMap(value: js.Any): Self = this.set("keysMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeysMap: Self = this.set("keysMap", js.undefined)
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    @scala.inline
    def setSelectionColor(value: String): Self = this.set("selectionColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionColor: Self = this.set("selectionColor", js.undefined)
    @scala.inline
    def setSelectionEnd(value: Double): Self = this.set("selectionEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionEnd: Self = this.set("selectionEnd", js.undefined)
    @scala.inline
    def setSelectionStart(value: Double): Self = this.set("selectionStart", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionStart: Self = this.set("selectionStart", js.undefined)
    @scala.inline
    def setUseNative(value: Boolean): Self = this.set("useNative", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseNative: Self = this.set("useNative", js.undefined)
  }
  
}

