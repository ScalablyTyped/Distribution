package typings.ejWebAll.ej.SplitButton

import typings.ejWebAll.ej.ArrowPosition
import typings.ejWebAll.ej.ButtonMode
import typings.ejWebAll.ej.ButtonSize
import typings.ejWebAll.ej.ContentType
import typings.ejWebAll.ej.ImagePosition
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Specifies the arrowPosition of the Split or Dropdown Button.See arrowPosition
    * @Default {ej.ArrowPosition.Right}
    */
  var arrowPosition: js.UndefOr[String | ArrowPosition] = js.native
  
  /** Fires before menu of the split button control is opened.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Specifies the buttonMode like Split or Dropdown Button.See ButtonMode
    * @Default {ej.ButtonMode.Split}
    */
  var buttonMode: js.UndefOr[String | ButtonMode] = js.native
  
  /** Fires when Button control is clicked successfully
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** Fires before the list content of Button control is closed
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Specifies the contentType of the Split Button.See ContentType
    * @Default {ej.ContentType.TextOnly}
    */
  var contentType: js.UndefOr[String | ContentType] = js.native
  
  /** Fires after Split Button control is created.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Set the root class for Split Button control theme
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** Fires when the Split Button is destroyed successfully
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Specifies the enableRTL property for Split Button while initialization.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Specifies the disabling of Split Button if enabled is set to false.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Specifies the height of the Split Button.
    * @Default {â€œâ€}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** Specifies the HTML Attributes of the Split Button.
    * @Default {{}}
    */
  var htmlAttributes: js.UndefOr[js.Any] = js.native
  
  /** Specifies the imagePosition of the Split Button.See imagePositions
    * @Default {ej.ImagePosition.ImageRight}
    */
  var imagePosition: js.UndefOr[String | ImagePosition] = js.native
  
  /** Fires when a menu item is Hovered out successfully
    */
  var itemMouseOut: js.UndefOr[js.Function1[/* e */ ItemMouseOutEventArgs, Unit]] = js.native
  
  /** Fires when a menu item is Hovered in successfully
    */
  var itemMouseOver: js.UndefOr[js.Function1[/* e */ ItemMouseOverEventArgs, Unit]] = js.native
  
  /** Fires when a menu item is clicked successfully
    */
  var itemSelected: js.UndefOr[js.Function1[/* e */ ItemSelectedEventArgs, Unit]] = js.native
  
  /** Fires before the list content of Button control is opened
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** Specifies the image content for Split Button while initialization.
    */
  var prefixIcon: js.UndefOr[String] = js.native
  
  /** Specifies the showRoundedCorner property for Split Button while initialization.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Specifies the size of the Button. See ButtonSize
    * @Default {ej.ButtonSize.Normal}
    */
  var size: js.UndefOr[String | ButtonSize] = js.native
  
  /** Specifies the image content for Split Button while initialization.
    */
  var suffixIcon: js.UndefOr[String] = js.native
  
  /** Specifies the target of splitbutton menu while initialization with ID or class as a selector.
    */
  var target: js.UndefOr[String] = js.native
  
  /** Specifies the list content for Split Button while initialization
    */
  var targetID: js.UndefOr[String] = js.native
  
  /** Specifies the text content for Split Button while initialization.
    */
  var text: js.UndefOr[String] = js.native
  
  /** Specifies the width of the Split Button.
    * @Default {â€œâ€}
    */
  var width: js.UndefOr[String | Double] = js.native
}
object Model {
  
  @scala.inline
  def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit class ModelOps[Self <: Model] (val x: Self) extends AnyVal {
    
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
    def setArrowPosition(value: String | ArrowPosition): Self = this.set("arrowPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArrowPosition: Self = this.set("arrowPosition", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setButtonMode(value: String | ButtonMode): Self = this.set("buttonMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtonMode: Self = this.set("buttonMode", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setContentType(value: String | ContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    
    @scala.inline
    def setCreate(value: /* e */ CreateEventArgs => Unit): Self = this.set("create", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCssClass(value: String): Self = this.set("cssClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCssClass: Self = this.set("cssClass", js.undefined)
    
    @scala.inline
    def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = this.set("destroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setEnableRTL(value: Boolean): Self = this.set("enableRTL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRTL: Self = this.set("enableRTL", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: String | Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHtmlAttributes(value: js.Any): Self = this.set("htmlAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlAttributes: Self = this.set("htmlAttributes", js.undefined)
    
    @scala.inline
    def setImagePosition(value: String | ImagePosition): Self = this.set("imagePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePosition: Self = this.set("imagePosition", js.undefined)
    
    @scala.inline
    def setItemMouseOut(value: /* e */ ItemMouseOutEventArgs => Unit): Self = this.set("itemMouseOut", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemMouseOut: Self = this.set("itemMouseOut", js.undefined)
    
    @scala.inline
    def setItemMouseOver(value: /* e */ ItemMouseOverEventArgs => Unit): Self = this.set("itemMouseOver", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemMouseOver: Self = this.set("itemMouseOver", js.undefined)
    
    @scala.inline
    def setItemSelected(value: /* e */ ItemSelectedEventArgs => Unit): Self = this.set("itemSelected", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteItemSelected: Self = this.set("itemSelected", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPrefixIcon(value: String): Self = this.set("prefixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixIcon: Self = this.set("prefixIcon", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setSize(value: String | ButtonSize): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setSuffixIcon(value: String): Self = this.set("suffixIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuffixIcon: Self = this.set("suffixIcon", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTargetID(value: String): Self = this.set("targetID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetID: Self = this.set("targetID", js.undefined)
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
