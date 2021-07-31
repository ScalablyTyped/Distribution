package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToggleButton
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the ToggleButton to prevent all user interactions.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the ToggleButton.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  @JSName("model")
  var model_ToggleButton: Model = js.native
}
object ToggleButton {
  
  trait ChangeEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** return the toggle button checked state
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns the toggle button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ChangeEventArgs {
    
    @scala.inline
    def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit class ChangeEventArgsMutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      @scala.inline
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** return the toggle button checked state
      */
    var isChecked: js.UndefOr[Boolean] = js.undefined
    
    /** returns the toggle button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return the toggle button state
      */
    var status: js.UndefOr[Boolean] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      @scala.inline
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait CreateEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the toggle button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait DestroyEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** returns the toggle button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** returns the name of the event
      */
    var `type`: js.UndefOr[String] = js.undefined
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
      def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** Specify the icon in active state to the toggle button and it will be aligned from left margin of the button.
      */
    var activePrefixIcon: js.UndefOr[String] = js.undefined
    
    /** Specify the icon in active state to the toggle button and it will be aligned from right margin of the button.
      */
    var activeSuffixIcon: js.UndefOr[String] = js.undefined
    
    /** Sets the text when ToggleButton is in active state i.e.,checked state.
      * @Default {null}
      */
    var activeText: js.UndefOr[String] = js.undefined
    
    /** Fires when ToggleButton control state is changed successfully.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Fires when ToggleButton control is clicked successfully.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the contentType of the ToggleButton. See ContentType as below
      * @Default {ej.ContentType.TextOnly}
      */
    var contentType: js.UndefOr[ContentType | String] = js.undefined
    
    /** Fires when ToggleButton control is created successfully.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Specify the CSS class to the ToggleButton to achieve custom theme.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Specify the icon in default state to the toggle button and it will be aligned from left margin of the button.
      */
    var defaultPrefixIcon: js.UndefOr[String] = js.undefined
    
    /** Specify the icon in default state to the toggle button and it will be aligned from right margin of the button.
      */
    var defaultSuffixIcon: js.UndefOr[String] = js.undefined
    
    /** Specifies the text of the ToggleButton, when the control is a default state. i.e., unChecked state.
      * @Default {null}
      */
    var defaultText: js.UndefOr[String] = js.undefined
    
    /** Fires when ToggleButton control is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Save current model value to browser cookies for maintaining states. When refreshing the ToggleButton control page, the model value is applied from browser cookies or HTML 5local
      * storage.
      * @Default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Specify the Right to Left direction of the ToggleButton.
      * @Default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the state of the ToggleButton.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height of the ToggleButton.
      * @Default {28pixel}
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** It allows to define the characteristics of the ToggleButton control. It will helps to extend the capability of an HTML element.
      * @Default {{}}
      */
    var htmlAttributes: js.UndefOr[js.Any] = js.undefined
    
    /** Specifies the image position of the ToggleButton.
      * @Default {ej.ImagePosition.ImageLeft}
      */
    var imagePosition: js.UndefOr[ImagePosition | String] = js.undefined
    
    /** Allows to prevents the control switched to checked (active) state.
      * @Default {false}
      */
    var preventToggle: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the ToggleButton with rounded corners.
      * @Default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the size of the ToggleButton. See ButtonSize as below
      * @Default {ej.ButtonSize.Normal}
      */
    var size: js.UndefOr[ButtonSize | String] = js.undefined
    
    /** It allows to define the ToggleButton state to checked(Active) or unchecked(Default) at initial time.
      * @Default {false}
      */
    var toggleState: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the type of the ToggleButton. See ButtonType as below
      * @Default {ej.ButtonType.Button}
      */
    var `type`: js.UndefOr[ButtonType | String] = js.undefined
    
    /** Specifies the width of the ToggleButton.
      * @Default {100pixel}
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Model {
    
    @scala.inline
    def apply(): typings.ejWebAll.ej.ToggleButton.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ToggleButton.Model]
    }
    
    @scala.inline
    implicit class ModelMutableBuilder[Self <: typings.ejWebAll.ej.ToggleButton.Model] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivePrefixIcon(value: String): Self = StObject.set(x, "activePrefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePrefixIconUndefined: Self = StObject.set(x, "activePrefixIcon", js.undefined)
      
      @scala.inline
      def setActiveSuffixIcon(value: String): Self = StObject.set(x, "activeSuffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveSuffixIconUndefined: Self = StObject.set(x, "activeSuffixIcon", js.undefined)
      
      @scala.inline
      def setActiveText(value: String): Self = StObject.set(x, "activeText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveTextUndefined: Self = StObject.set(x, "activeText", js.undefined)
      
      @scala.inline
      def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      @scala.inline
      def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      @scala.inline
      def setContentType(value: ContentType | String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      @scala.inline
      def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      @scala.inline
      def setDefaultPrefixIcon(value: String): Self = StObject.set(x, "defaultPrefixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPrefixIconUndefined: Self = StObject.set(x, "defaultPrefixIcon", js.undefined)
      
      @scala.inline
      def setDefaultSuffixIcon(value: String): Self = StObject.set(x, "defaultSuffixIcon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultSuffixIconUndefined: Self = StObject.set(x, "defaultSuffixIcon", js.undefined)
      
      @scala.inline
      def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
      
      @scala.inline
      def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      @scala.inline
      def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHtmlAttributes(value: js.Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      @scala.inline
      def setImagePosition(value: ImagePosition | String): Self = StObject.set(x, "imagePosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImagePositionUndefined: Self = StObject.set(x, "imagePosition", js.undefined)
      
      @scala.inline
      def setPreventToggle(value: Boolean): Self = StObject.set(x, "preventToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreventToggleUndefined: Self = StObject.set(x, "preventToggle", js.undefined)
      
      @scala.inline
      def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      @scala.inline
      def setSize(value: ButtonSize | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setToggleState(value: Boolean): Self = StObject.set(x, "toggleState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToggleStateUndefined: Self = StObject.set(x, "toggleState", js.undefined)
      
      @scala.inline
      def setType(value: ButtonType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
