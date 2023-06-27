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
    
    inline def apply(): ChangeEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ChangeEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChangeEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(): ClickEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClickEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ClickEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setIsChecked(value: Boolean): Self = StObject.set(x, "isChecked", value.asInstanceOf[js.Any])
      
      inline def setIsCheckedUndefined: Self = StObject.set(x, "isChecked", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setStatus(value: Boolean): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(): CreateEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CreateEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
    
    inline def apply(): DestroyEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DestroyEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DestroyEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
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
      * @default {null}
      */
    var activeText: js.UndefOr[String] = js.undefined
    
    /** Fires when ToggleButton control state is changed successfully.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Fires when ToggleButton control is clicked successfully.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the contentType of the ToggleButton. See ContentType as below
      * @default {ej.ContentType.TextOnly}
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
      * @default {null}
      */
    var defaultText: js.UndefOr[String] = js.undefined
    
    /** Fires when ToggleButton control is destroyed successfully.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Save current model value to browser cookies for maintaining states. When refreshing the ToggleButton control page, the model value is applied from browser cookies or HTML 5local
      * storage.
      * @default {false}
      */
    var enablePersistence: js.UndefOr[Boolean] = js.undefined
    
    /** Specify the Right to Left direction of the ToggleButton.
      * @default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the state of the ToggleButton.
      * @default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height of the ToggleButton.
      * @default {28pixel}
      */
    var height: js.UndefOr[Double | String] = js.undefined
    
    /** It allows to define the characteristics of the ToggleButton control. It will helps to extend the capability of an HTML element.
      * @default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Specifies the image position of the ToggleButton.
      * @default {ej.ImagePosition.ImageLeft}
      */
    var imagePosition: js.UndefOr[ImagePosition | String] = js.undefined
    
    /** Allows to prevents the control switched to checked (active) state.
      * @default {false}
      */
    var preventToggle: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the ToggleButton with rounded corners.
      * @default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the size of the ToggleButton. See ButtonSize as below
      * @default {ej.ButtonSize.Normal}
      */
    var size: js.UndefOr[ButtonSize | String] = js.undefined
    
    /** It allows to define the ToggleButton state to checked(Active) or unchecked(Default) at initial time.
      * @default {false}
      */
    var toggleState: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the type of the ToggleButton. See ButtonType as below
      * @default {ej.ButtonType.Button}
      */
    var `type`: js.UndefOr[ButtonType | String] = js.undefined
    
    /** Specifies the width of the ToggleButton.
      * @default {100pixel}
      */
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.ToggleButton.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.ToggleButton.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.ToggleButton.Model] (val x: Self) extends AnyVal {
      
      inline def setActivePrefixIcon(value: String): Self = StObject.set(x, "activePrefixIcon", value.asInstanceOf[js.Any])
      
      inline def setActivePrefixIconUndefined: Self = StObject.set(x, "activePrefixIcon", js.undefined)
      
      inline def setActiveSuffixIcon(value: String): Self = StObject.set(x, "activeSuffixIcon", value.asInstanceOf[js.Any])
      
      inline def setActiveSuffixIconUndefined: Self = StObject.set(x, "activeSuffixIcon", js.undefined)
      
      inline def setActiveText(value: String): Self = StObject.set(x, "activeText", value.asInstanceOf[js.Any])
      
      inline def setActiveTextUndefined: Self = StObject.set(x, "activeText", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setContentType(value: ContentType | String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDefaultPrefixIcon(value: String): Self = StObject.set(x, "defaultPrefixIcon", value.asInstanceOf[js.Any])
      
      inline def setDefaultPrefixIconUndefined: Self = StObject.set(x, "defaultPrefixIcon", js.undefined)
      
      inline def setDefaultSuffixIcon(value: String): Self = StObject.set(x, "defaultSuffixIcon", value.asInstanceOf[js.Any])
      
      inline def setDefaultSuffixIconUndefined: Self = StObject.set(x, "defaultSuffixIcon", js.undefined)
      
      inline def setDefaultText(value: String): Self = StObject.set(x, "defaultText", value.asInstanceOf[js.Any])
      
      inline def setDefaultTextUndefined: Self = StObject.set(x, "defaultText", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnablePersistence(value: Boolean): Self = StObject.set(x, "enablePersistence", value.asInstanceOf[js.Any])
      
      inline def setEnablePersistenceUndefined: Self = StObject.set(x, "enablePersistence", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setImagePosition(value: ImagePosition | String): Self = StObject.set(x, "imagePosition", value.asInstanceOf[js.Any])
      
      inline def setImagePositionUndefined: Self = StObject.set(x, "imagePosition", js.undefined)
      
      inline def setPreventToggle(value: Boolean): Self = StObject.set(x, "preventToggle", value.asInstanceOf[js.Any])
      
      inline def setPreventToggleUndefined: Self = StObject.set(x, "preventToggle", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSize(value: ButtonSize | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setToggleState(value: Boolean): Self = StObject.set(x, "toggleState", value.asInstanceOf[js.Any])
      
      inline def setToggleStateUndefined: Self = StObject.set(x, "toggleState", js.undefined)
      
      inline def setType(value: ButtonType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
