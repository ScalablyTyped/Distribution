package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Button
  extends StObject
     with Widget_ {
  
  var defaults: Model = js.native
  
  /** To disable the button
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** To enable the button
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  @JSName("model")
  var model_Button: Model = js.native
}
object Button {
  
  trait ClickEventArgs extends StObject {
    
    /** if the event should be canceled; otherwise, false.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** return the event model for sever side processing.
      */
    var e: js.UndefOr[Any] = js.undefined
    
    /** returns the button model
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** return the button state
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
      
      inline def setE(value: Any): Self = StObject.set(x, "e", value.asInstanceOf[js.Any])
      
      inline def setEUndefined: Self = StObject.set(x, "e", js.undefined)
      
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
    
    /** returns the button model
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
    
    /** returns the button model
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
    
    /** Fires when Button control is clicked successfully.Consider the scenario to perform any validation,modification of content or any other operations click on button,we can make use
      * of this click event to achieve the scenario.
      */
    var click: js.UndefOr[js.Function1[/* e */ ClickEventArgs, Unit]] = js.undefined
    
    /** Specifies the contentType of the Button. See below to know available ContentType
      * @default {ej.ContentType.TextOnly}
      */
    var contentType: js.UndefOr[ContentType | String] = js.undefined
    
    /** Fires after Button control is created.If the user want to perform any operation after the button control creation then the user can make use of this create event.
      */
    var create: js.UndefOr[js.Function1[/* e */ CreateEventArgs, Unit]] = js.undefined
    
    /** Sets the root CSS class for Button theme, which is used customize.
      */
    var cssClass: js.UndefOr[String] = js.undefined
    
    /** Fires when the button is destroyed successfully.If the user want to perform any operation after the destroy button control then the user can make use of this destroy event.
      */
    var destroy: js.UndefOr[js.Function1[/* e */ DestroyEventArgs, Unit]] = js.undefined
    
    /** Specify the Right to Left direction to button
      * @default {false}
      */
    var enableRTL: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the button control state.
      * @default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the height of the Button.
      * @default {28}
      */
    var height: js.UndefOr[Double] = js.undefined
    
    /** It allows to define the characteristics of the Button control. It will helps to extend the capability of an HTML element.
      * @default {{}}
      */
    var htmlAttributes: js.UndefOr[Any] = js.undefined
    
    /** Specifies the image position of the Button. This image position is applicable only with the textandimage contentType property. The images can be positioned in both imageLeft and
      * imageRight options. See below to know about available ImagePosition
      * @default {ej.ImagePosition.ImageLeft}
      */
    var imagePosition: js.UndefOr[ImagePosition | String] = js.undefined
    
    /** Specifies the primary icon for Button. This icon will be displayed from the left margin of the button.
      * @default {null}
      */
    var prefixIcon: js.UndefOr[String] = js.undefined
    
    /** Convert the button as repeat button. It raises the 'Click' event repeatedly from the it is pressed until it is released.
      * @default {false}
      */
    var repeatButton: js.UndefOr[Boolean] = js.undefined
    
    /** Displays the Button with rounded corners.
      * @default {false}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Specifies the size of the Button. See below to know available ButtonSize
      * @default {ej.ButtonSize.Normal}
      */
    var size: js.UndefOr[ButtonSize | String] = js.undefined
    
    /** Specifies the secondary icon for Button. This icon will be displayed from the right margin of the button.
      * @default {null}
      */
    var suffixIcon: js.UndefOr[String] = js.undefined
    
    /** Specifies the text content for Button.
      * @default {null}
      */
    var text: js.UndefOr[String] = js.undefined
    
    /** Specified the time interval between two consecutive 'click' event on the button.
      * @default {150}
      */
    var timeInterval: js.UndefOr[String] = js.undefined
    
    /** Specifies the Type of the Button. See below to know available ButtonType
      * @default {ej.ButtonType.Submit}
      */
    var `type`: js.UndefOr[ButtonType | String] = js.undefined
    
    /** Specifies the width of the Button.
      * @default {100px}
      */
    var width: js.UndefOr[String | Double] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Button.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Button.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Button.Model] (val x: Self) extends AnyVal {
      
      inline def setClick(value: /* e */ ClickEventArgs => Unit): Self = StObject.set(x, "click", js.Any.fromFunction1(value))
      
      inline def setClickUndefined: Self = StObject.set(x, "click", js.undefined)
      
      inline def setContentType(value: ContentType | String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setCreate(value: /* e */ CreateEventArgs => Unit): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      inline def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      inline def setCssClass(value: String): Self = StObject.set(x, "cssClass", value.asInstanceOf[js.Any])
      
      inline def setCssClassUndefined: Self = StObject.set(x, "cssClass", js.undefined)
      
      inline def setDestroy(value: /* e */ DestroyEventArgs => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction1(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setEnableRTL(value: Boolean): Self = StObject.set(x, "enableRTL", value.asInstanceOf[js.Any])
      
      inline def setEnableRTLUndefined: Self = StObject.set(x, "enableRTL", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setHtmlAttributes(value: Any): Self = StObject.set(x, "htmlAttributes", value.asInstanceOf[js.Any])
      
      inline def setHtmlAttributesUndefined: Self = StObject.set(x, "htmlAttributes", js.undefined)
      
      inline def setImagePosition(value: ImagePosition | String): Self = StObject.set(x, "imagePosition", value.asInstanceOf[js.Any])
      
      inline def setImagePositionUndefined: Self = StObject.set(x, "imagePosition", js.undefined)
      
      inline def setPrefixIcon(value: String): Self = StObject.set(x, "prefixIcon", value.asInstanceOf[js.Any])
      
      inline def setPrefixIconUndefined: Self = StObject.set(x, "prefixIcon", js.undefined)
      
      inline def setRepeatButton(value: Boolean): Self = StObject.set(x, "repeatButton", value.asInstanceOf[js.Any])
      
      inline def setRepeatButtonUndefined: Self = StObject.set(x, "repeatButton", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setSize(value: ButtonSize | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSuffixIcon(value: String): Self = StObject.set(x, "suffixIcon", value.asInstanceOf[js.Any])
      
      inline def setSuffixIconUndefined: Self = StObject.set(x, "suffixIcon", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTimeInterval(value: String): Self = StObject.set(x, "timeInterval", value.asInstanceOf[js.Any])
      
      inline def setTimeIntervalUndefined: Self = StObject.set(x, "timeInterval", js.undefined)
      
      inline def setType(value: ButtonType | String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setWidth(value: String | Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
