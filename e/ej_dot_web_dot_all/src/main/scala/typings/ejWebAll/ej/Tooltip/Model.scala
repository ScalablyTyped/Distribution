package typings.ejWebAll.ej.Tooltip

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** Tooltip control can be accessed through the keyboard shortcut keys.
    * @Default {true}
    */
  var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
  
  /** Specifies the animation behavior in  Tooltip. It contains the following sub properties.
    */
  var animation: js.UndefOr[Animation] = js.native
  
  /** Sets the position related to target element, window, mouse or (x,y) co-ordinates.
    * @Default {ej.Tooltip.Associate.Target}
    */
  var associate: js.UndefOr[Associate | String] = js.native
  
  /** Specified the delay to hide Tooltip when closeMode is auto.
    * @Default {4000}
    */
  var autoCloseTimeout: js.UndefOr[Double] = js.native
  
  /** This event is triggered before the Tooltip widget get closed.
    */
  var beforeClose: js.UndefOr[js.Function1[/* e */ BeforeCloseEventArgs, Unit]] = js.native
  
  /** This event is triggered before the Tooltip widget gets open.
    */
  var beforeOpen: js.UndefOr[js.Function1[/* e */ BeforeOpenEventArgs, Unit]] = js.native
  
  /** Fires on clicking to the target element.
    */
  var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.native
  
  /** This event is triggered after the Tooltip widget is closed.
    */
  var close: js.UndefOr[js.Function1[/* e */ CloseEventArgs, Unit]] = js.native
  
  /** Specifies the closing behavior of Tooltip popup.
    * @Default {ej.Tooltip.CloseMode.None}
    */
  var closeMode: js.UndefOr[CloseMode | String] = js.native
  
  /** Sets the Tooltip in alternate position when collision occurs.
    * @Default {ej.Tooltip.Collision.FlipFit}
    */
  var collision: js.UndefOr[Collision | String] = js.native
  
  /** Specified the selector for the container element.
    * @Default {body}
    */
  var containment: js.UndefOr[String] = js.native
  
  /** Specifies the text for Tooltip.
    * @Default {null}
    */
  var content: js.UndefOr[String] = js.native
  
  /** This event is triggered after the Tooltip is created successfully.
    */
  var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.native
  
  /** Sets the root CSS class for Tooltip for the customization.
    * @Default {null}
    */
  var cssClass: js.UndefOr[String] = js.native
  
  /** This event is triggered after the Tooltip widget is destroyed successfully.
    */
  var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.native
  
  /** Sets the Tooltip direction from right to left.
    * @Default {false}
    */
  var enableRTL: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables the Tooltip.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Defines the height of the Tooltip popup.
    * @Default {auto}
    */
  var height: js.UndefOr[String | Double] = js.native
  
  /** This event is triggered while hovering the target element, when tooltip positioning relates to target element.
    */
  var hover: js.UndefOr[js.Function1[/* e */ HoverEventArgs, Unit]] = js.native
  
  /** Enables the arrow in Tooltip.
    * @Default {true}
    */
  var isBalloon: js.UndefOr[Boolean] = js.native
  
  /** This event is triggered after the Tooltip is opened.
    */
  var open: js.UndefOr[js.Function1[/* e */ OpenEventArgs, Unit]] = js.native
  
  /** defines various attributes of the Tooltip position
    */
  var position: js.UndefOr[Position] = js.native
  
  /** Enables or disables rounded corner.
    * @Default {false}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables shadow effect.
    * @Default {false}
    */
  var showShadow: js.UndefOr[Boolean] = js.native
  
  /** Specified a selector for elements, within the container.
    * @Default {null}
    */
  var target: js.UndefOr[String] = js.native
  
  /** defines Tooltip size and gap between tooltip against the target element.
    */
  var tip: js.UndefOr[Tip] = js.native
  
  /** The title text to be displayed in the Tooltip header.
    * @Default {null}
    */
  var title: js.UndefOr[String] = js.native
  
  /** This event is triggered while hover the target element, when the tooltip positioning is relates to the mouse.
    */
  var tracking: js.UndefOr[js.Function1[/* e */ TrackingEventArgs, Unit]] = js.native
  
  /** Specified the event action to show case the Tooltip.
    * @Default {ej.Tooltip.Trigger.Hover}
    */
  var trigger: js.UndefOr[Trigger | String] = js.native
  
  /** Defines the width of the Tooltip popup.
    * @Default {auto}
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
    def setAllowKeyboardNavigation(value: Boolean): Self = this.set("allowKeyboardNavigation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowKeyboardNavigation: Self = this.set("allowKeyboardNavigation", js.undefined)
    
    @scala.inline
    def setAnimation(value: Animation): Self = this.set("animation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    
    @scala.inline
    def setAssociate(value: Associate | String): Self = this.set("associate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssociate: Self = this.set("associate", js.undefined)
    
    @scala.inline
    def setAutoCloseTimeout(value: Double): Self = this.set("autoCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoCloseTimeout: Self = this.set("autoCloseTimeout", js.undefined)
    
    @scala.inline
    def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = this.set("beforeClose", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeClose: Self = this.set("beforeClose", js.undefined)
    
    @scala.inline
    def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = this.set("beforeOpen", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeforeOpen: Self = this.set("beforeOpen", js.undefined)
    
    @scala.inline
    def setClick(value: /* e */ ClickEventArgs => Unit): Self = this.set("click", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClick: Self = this.set("click", js.undefined)
    
    @scala.inline
    def setClose(value: /* e */ CloseEventArgs => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    
    @scala.inline
    def setCloseMode(value: CloseMode | String): Self = this.set("closeMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloseMode: Self = this.set("closeMode", js.undefined)
    
    @scala.inline
    def setCollision(value: Collision | String): Self = this.set("collision", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollision: Self = this.set("collision", js.undefined)
    
    @scala.inline
    def setContainment(value: String): Self = this.set("containment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContainment: Self = this.set("containment", js.undefined)
    
    @scala.inline
    def setContent(value: String): Self = this.set("content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    
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
    def setHover(value: /* e */ HoverEventArgs => Unit): Self = this.set("hover", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHover: Self = this.set("hover", js.undefined)
    
    @scala.inline
    def setIsBalloon(value: Boolean): Self = this.set("isBalloon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsBalloon: Self = this.set("isBalloon", js.undefined)
    
    @scala.inline
    def setOpen(value: /* e */ OpenEventArgs => Unit): Self = this.set("open", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOpen: Self = this.set("open", js.undefined)
    
    @scala.inline
    def setPosition(value: Position): Self = this.set("position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setShowShadow(value: Boolean): Self = this.set("showShadow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowShadow: Self = this.set("showShadow", js.undefined)
    
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTip(value: Tip): Self = this.set("tip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTip: Self = this.set("tip", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTracking(value: /* e */ TrackingEventArgs => Unit): Self = this.set("tracking", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTracking: Self = this.set("tracking", js.undefined)
    
    @scala.inline
    def setTrigger(value: Trigger | String): Self = this.set("trigger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrigger: Self = this.set("trigger", js.undefined)
    
    @scala.inline
    def setWidth(value: String | Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
