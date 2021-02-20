package typings.ejWebAll.ej

import typings.ejWebAll.JQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tooltip extends Widget_ {
  
  var defaults: Model = js.native
  
  /** Disables the Tooltip control.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the Tooltip control.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Hide the Tooltip popup.
    * @param {string}  optional Determines the type of effect that takes place when hiding the tooltip.
    * @param {() => void}  optional custom effect takes place when hiding the tooltip.
    * @returns {void}
    */
  def hide(): Unit = js.native
  def hide(effect: js.UndefOr[scala.Nothing], func: js.Function0[Unit]): Unit = js.native
  def hide(effect: String): Unit = js.native
  def hide(effect: String, func: js.Function0[Unit]): Unit = js.native
  
  @JSName("model")
  var model_Tooltip: Model = js.native
  
  /** Shows the Tooltip popup for the given target element with the specified effect.
    * @param {string} optional Determines the type of effect that takes place when showing the tooltip.
    * @param {() => void} optional custom effect takes place when showing the tooltip.
    * @param {JQuery} optional Tooltip will be shown for the given element
    * @returns {void}
    */
  def show(): Unit = js.native
  def show(effect: js.UndefOr[scala.Nothing], func: js.UndefOr[scala.Nothing], target: JQuery): Unit = js.native
  def show(effect: js.UndefOr[scala.Nothing], func: js.Function0[Unit]): Unit = js.native
  def show(effect: js.UndefOr[scala.Nothing], func: js.Function0[Unit], target: JQuery): Unit = js.native
  def show(effect: String): Unit = js.native
  def show(effect: String, func: js.UndefOr[scala.Nothing], target: JQuery): Unit = js.native
  def show(effect: String, func: js.Function0[Unit]): Unit = js.native
  def show(effect: String, func: js.Function0[Unit], target: JQuery): Unit = js.native
}
object Tooltip {
  
  @js.native
  sealed trait Associate extends StObject
  @JSGlobal("ej.Tooltip.Associate")
  @js.native
  object Associate extends StObject {
    
    ///Sets the position related to (x,y) co-ordinates.
    @js.native
    sealed trait Axis extends Associate
    
    ///Sets the position related to mouse, first entry to the target element.
    @js.native
    sealed trait MouseEnter extends Associate
    
    ///Sets the position related to mouse.
    @js.native
    sealed trait MouseFollow extends Associate
    
    ///Sets the position related to target element.
    @js.native
    sealed trait Target extends Associate
    
    ///Sets the position related to browser window.
    @js.native
    sealed trait Window extends Associate
  }
  
  @js.native
  sealed trait CloseMode extends StObject
  @JSGlobal("ej.Tooltip.CloseMode")
  @js.native
  object CloseMode extends StObject {
    
    ///Sets the delay for Tooltip close
    @js.native
    sealed trait Auto extends CloseMode
    
    ///The Tooltip will be display normally.
    @js.native
    sealed trait None extends CloseMode
    
    ///Enables close button in Tooltip.
    @js.native
    sealed trait Sticky extends CloseMode
  }
  
  @js.native
  sealed trait Collision extends StObject
  @JSGlobal("ej.Tooltip.Collision")
  @js.native
  object Collision extends StObject {
    
    ///Shift the Tooltip popup away from the edge of the window(collision side) that means adjacent position.
    @js.native
    sealed trait Fit extends Collision
    
    ///Flips the Tooltip to the opposite side of the target, if collision is occurs.
    @js.native
    sealed trait Flip extends Collision
    
    ///Ensure as much of the element is visible as possible to showcase.
    @js.native
    sealed trait FlipFit extends Collision
    
    ///No collision detection is take place
    @js.native
    sealed trait None extends Collision
  }
  
  @js.native
  sealed trait Trigger extends StObject
  @JSGlobal("ej.Tooltip.Trigger")
  @js.native
  object Trigger extends StObject {
    
    ///The Tooltip to be shown when the target element is clicked.
    @js.native
    sealed trait Click extends Trigger
    
    ///Enables the Tooltip when focus is set to target element.
    @js.native
    sealed trait Focus extends Trigger
    
    ///Enables the Tooltip when hover on the target element.
    @js.native
    sealed trait Hover extends Trigger
  }
  
  @js.native
  sealed trait effect extends StObject
  @JSGlobal("ej.Tooltip.effect")
  @js.native
  object effect extends StObject {
    
    ///Fade the Tooltip in and out of visibility.
    @js.native
    sealed trait Fade extends effect
    
    ///No animation takes place when showing/hiding the Tooltip
    @js.native
    sealed trait None extends effect
    
    ///Sliding effect takes place when showing/hiding the Tooltip
    @js.native
    sealed trait Slide extends effect
  }
  
  @js.native
  trait Animation extends StObject {
    
    /** Determines the type of effect.
      * @Default {ej.Tooltip.Effect.None}
      */
    var effect: js.UndefOr[typings.ejWebAll.ej.Tooltip.effect | String] = js.native
    
    /** Sets the animation speed in milliseconds.
      * @Default {4000}
      */
    var speed: js.UndefOr[Double] = js.native
  }
  object Animation {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.Tooltip.Animation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tooltip.Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: typings.ejWebAll.ej.Tooltip.Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEffect(value: effect | String): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
    }
  }
  
  @js.native
  trait BeforeCloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.native
    
    /** returns the tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeCloseEventArgs {
    
    @scala.inline
    def apply(): BeforeCloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeCloseEventArgs]
    }
    
    @scala.inline
    implicit class BeforeCloseEventArgsMutableBuilder[Self <: BeforeCloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BeforeOpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object BeforeOpenEventArgs {
    
    @scala.inline
    def apply(): BeforeOpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BeforeOpenEventArgs]
    }
    
    @scala.inline
    implicit class BeforeOpenEventArgsMutableBuilder[Self <: BeforeOpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait ClickEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object ClickEventArgs {
    
    @scala.inline
    def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit class ClickEventArgsMutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CloseEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CloseEventArgs {
    
    @scala.inline
    def apply(): CloseEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CloseEventArgs]
    }
    
    @scala.inline
    implicit class CloseEventArgsMutableBuilder[Self <: CloseEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object CreateEventArgs {
    
    @scala.inline
    def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit class CreateEventArgsMutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait DestroyEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object DestroyEventArgs {
    
    @scala.inline
    def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit class DestroyEventArgsMutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait HoverEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object HoverEventArgs {
    
    @scala.inline
    def apply(): HoverEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HoverEventArgs]
    }
    
    @scala.inline
    implicit class HoverEventArgsMutableBuilder[Self <: HoverEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Model extends StObject {
    
    /** Tooltip control can be accessed through the keyboard shortcut keys.
      * @Default {true}
      */
    var allowKeyboardNavigation: js.UndefOr[Boolean] = js.native
    
    /** Specifies the animation behavior in  Tooltip. It contains the following sub properties.
      */
    var animation: js.UndefOr[typings.ejWebAll.ej.Tooltip.Animation] = js.native
    
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
    def apply(): typings.ejWebAll.ej.Tooltip.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Tooltip.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.Tooltip.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowKeyboardNavigation(value: Boolean): Self = StObject.set(x, "allowKeyboardNavigation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowKeyboardNavigationUndefined: Self = StObject.set(x, "allowKeyboardNavigation", js.undefined)
      
      @scala.inline
      def setAnimation(value: typings.ejWebAll.ej.Tooltip.Animation): Self = StObject.set(x, "animation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationUndefined: Self = StObject.set(x, "animation", js.undefined)
      
      @scala.inline
      def setAssociate(value: Associate | String): Self = StObject.set(x, "associate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssociateUndefined: Self = StObject.set(x, "associate", js.undefined)
      
      @scala.inline
      def setAutoCloseTimeout(value: Double): Self = StObject.set(x, "autoCloseTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCloseTimeoutUndefined: Self = StObject.set(x, "autoCloseTimeout", js.undefined)
      
      @scala.inline
      def setBeforeClose(value: /* e */ BeforeCloseEventArgs => Unit): Self = StObject.set(x, "beforeClose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeCloseUndefined: Self = StObject.set(x, "beforeClose", js.undefined)
      
      @scala.inline
      def setBeforeOpen(value: /* e */ BeforeOpenEventArgs => Unit): Self = StObject.set(x, "beforeOpen", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeforeOpenUndefined: Self = StObject.set(x, "beforeOpen", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setClose(value: /* e */ CloseEventArgs => Unit): Self = StObject.set(x, "close", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCloseMode(value: CloseMode | String): Self = StObject.set(x, "closeMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseModeUndefined: Self = StObject.set(x, "closeMode", js.undefined)
      
      @scala.inline
      def setCloseUndefined: Self = StObject.set(x, "close", js.undefined)
      
      @scala.inline
      def setCollision(value: Collision | String): Self = StObject.set(x, "collision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCollisionUndefined: Self = StObject.set(x, "collision", js.undefined)
      
      @scala.inline
      def setContainment(value: String): Self = StObject.set(x, "containment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContainmentUndefined: Self = StObject.set(x, "containment", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: String | Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHover(value: /* e */ HoverEventArgs => Unit): Self = StObject.set(x, "hover", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHoverUndefined: Self = StObject.set(x, "hover", js.undefined)
      
      @scala.inline
      def setIsBalloon(value: Boolean): Self = StObject.set(x, "isBalloon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsBalloonUndefined: Self = StObject.set(x, "isBalloon", js.undefined)
      
      @scala.inline
      def setOpen(value: /* e */ OpenEventArgs => Unit): Self = StObject.set(x, "open", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setPosition(value: Position): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setShowShadow(value: Boolean): Self = StObject.set(x, "showShadow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowShadowUndefined: Self = StObject.set(x, "showShadow", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTip(value: Tip): Self = StObject.set(x, "tip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipUndefined: Self = StObject.set(x, "tip", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTracking(value: /* e */ TrackingEventArgs => Unit): Self = StObject.set(x, "tracking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTrackingUndefined: Self = StObject.set(x, "tracking", js.undefined)
      
      @scala.inline
      def setTrigger(value: Trigger | String): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTriggerUndefined: Self = StObject.set(x, "trigger", js.undefined)
      
      @scala.inline
      def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait OpenEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the Tooltip's content
      */
    var content: js.UndefOr[String] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object OpenEventArgs {
    
    @scala.inline
    def apply(): OpenEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OpenEventArgs]
    }
    
    @scala.inline
    implicit class OpenEventArgsMutableBuilder[Self <: OpenEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait Position extends StObject {
    
    /** Sets the arrow position again popup.
      */
    var stem: js.UndefOr[PositionStem] = js.native
    
    /** Sets the Tooltip position against target.
      */
    var target: js.UndefOr[PositionTarget] = js.native
  }
  object Position {
    
    @scala.inline
    def apply(): Position = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Position]
    }
    
    @scala.inline
    implicit class PositionMutableBuilder[Self <: Position] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStem(value: PositionStem): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStemUndefined: Self = StObject.set(x, "stem", js.undefined)
      
      @scala.inline
      def setTarget(value: PositionTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  @js.native
  trait PositionStem extends StObject {
    
    /** Sets the arrow position again popup based on horizontal(x) value
      * @Default {center}
      */
    var horizontal: js.UndefOr[String] = js.native
    
    /** Sets the arrow position again popup based on vertical(y) value
      * @Default {bottom}
      */
    var vertical: js.UndefOr[String] = js.native
  }
  object PositionStem {
    
    @scala.inline
    def apply(): PositionStem = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionStem]
    }
    
    @scala.inline
    implicit class PositionStemMutableBuilder[Self <: PositionStem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: String): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait PositionTarget extends StObject {
    
    /** Sets the Tooltip position against target based on horizontal(x) value.
      * @Default {center}
      */
    var horizontal: js.UndefOr[String | Double] = js.native
    
    /** Sets the Tooltip position against target based on vertical(y) value.
      * @Default {top}
      */
    var vertical: js.UndefOr[String | Double] = js.native
  }
  object PositionTarget {
    
    @scala.inline
    def apply(): PositionTarget = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PositionTarget]
    }
    
    @scala.inline
    implicit class PositionTargetMutableBuilder[Self <: PositionTarget] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHorizontal(value: String | Double): Self = StObject.set(x, "horizontal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHorizontalUndefined: Self = StObject.set(x, "horizontal", js.undefined)
      
      @scala.inline
      def setVertical(value: String | Double): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait Tip extends StObject {
    
    /** Sets gap between tooltip against the target element.
      */
    var adjust: js.UndefOr[TipAdjust] = js.native
    
    /** Sets the Tooltip size.
      */
    var size: js.UndefOr[TipSize] = js.native
  }
  object Tip {
    
    @scala.inline
    def apply(): Tip = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Tip]
    }
    
    @scala.inline
    implicit class TipMutableBuilder[Self <: Tip] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjust(value: TipAdjust): Self = StObject.set(x, "adjust", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustUndefined: Self = StObject.set(x, "adjust", js.undefined)
      
      @scala.inline
      def setSize(value: TipSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TipAdjust extends StObject {
    
    /** Sets horizontal gap between Tooltip and target element.
      * @Default {0}
      */
    var xValue: js.UndefOr[Double] = js.native
    
    /** Sets vertical gap between Tooltip and target element.
      * @Default {0}
      */
    var yValue: js.UndefOr[Double] = js.native
  }
  object TipAdjust {
    
    @scala.inline
    def apply(): TipAdjust = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TipAdjust]
    }
    
    @scala.inline
    implicit class TipAdjustMutableBuilder[Self <: TipAdjust] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setXValue(value: Double): Self = StObject.set(x, "xValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXValueUndefined: Self = StObject.set(x, "xValue", js.undefined)
      
      @scala.inline
      def setYValue(value: Double): Self = StObject.set(x, "yValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYValueUndefined: Self = StObject.set(x, "yValue", js.undefined)
    }
  }
  
  @js.native
  trait TipSize extends StObject {
    
    /** Sets the Tooltip height.
      * @Default {10}
      */
    var height: js.UndefOr[Double] = js.native
    
    /** Sets the Tooltip width.
      * @Default {20}
      */
    var width: js.UndefOr[Double] = js.native
  }
  object TipSize {
    
    @scala.inline
    def apply(): TipSize = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TipSize]
    }
    
    @scala.inline
    implicit class TipSizeMutableBuilder[Self <: TipSize] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  @js.native
  trait TrackingEventArgs extends StObject {
    
    /** its value is set as true,if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.native
    
    /** returns the event object
      */
    var event: js.UndefOr[js.Any] = js.native
    
    /** returns the Tooltip model
      */
    var model: js.UndefOr[js.Any] = js.native
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.native
  }
  object TrackingEventArgs {
    
    @scala.inline
    def apply(): TrackingEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TrackingEventArgs]
    }
    
    @scala.inline
    implicit class TrackingEventArgsMutableBuilder[Self <: TrackingEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setEvent(value: js.Any): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
      
      @scala.inline
      def setModel(value: js.Any): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
