package typings.ejWebAll.ej

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Signature
  extends StObject
     with Widget_ {
  
  /** Clears the strokes in the signature.
    * @returns {void}
    */
  def clear(): Unit = js.native
  
  var defaults: Model = js.native
  
  /** Disables the signature widget.
    * @returns {void}
    */
  def disable(): Unit = js.native
  
  /** Enables the signature widget.
    * @returns {void}
    */
  def enable(): Unit = js.native
  
  /** Hides the signature widget.
    * @returns {void}
    */
  def hide(): Unit = js.native
  
  @JSName("model")
  var model_Signature: Model = js.native
  
  /** redo the last drawn stroke of the signature
    * @returns {void}
    */
  def redo(): Unit = js.native
  
  /** Refreshes the Signature widget
    * @returns {void}
    */
  def refresh(): Unit = js.native
  
  /** used to save the drawn image.
    * @param {string} The file name of the signature to be downloaded.
    * @returns {void}
    */
  def save(Filename: String): Unit = js.native
  
  /** Used to Show the signature widget, if it is already hidden.
    * @returns {void}
    */
  def show(): Unit = js.native
  
  /** undo the last drawn stroke of the signature.
    * @returns {void}
    */
  def undo(): Unit = js.native
}
object Signature {
  
  @js.native
  sealed trait SaveImageFormat extends StObject
  @JSGlobal("ej.Signature.SaveImageFormat")
  @js.native
  object SaveImageFormat extends StObject {
    
    ///To save the signature image with BMP format only.
    @js.native
    sealed trait BMP
      extends StObject
         with SaveImageFormat
    
    ///To save the signature image with JPG format only.
    @js.native
    sealed trait JPG
      extends StObject
         with SaveImageFormat
    
    ///To save the signature image with PNG format only.
    @js.native
    sealed trait PNG
      extends StObject
         with SaveImageFormat
    
    ///To save the signature image with TIFF format only.
    @js.native
    sealed trait TIFF
      extends StObject
         with SaveImageFormat
  }
  
  trait ChangeEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Gives the last stored image
      */
    var lastImage: js.UndefOr[String] = js.undefined
    
    /** Instance of the signature model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
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
      
      inline def setLastImage(value: String): Self = StObject.set(x, "lastImage", value.asInstanceOf[js.Any])
      
      inline def setLastImageUndefined: Self = StObject.set(x, "lastImage", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait Model extends StObject {
    
    /** This property is used to set the background color for the signature.
      * @Default {#ffffff}
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /** This property is used to set the background image for the signature.
      */
    var backgroundImage: js.UndefOr[String] = js.undefined
    
    /** Triggers when the stroke is changed.
      */
    var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.undefined
    
    /** Enables or disables the Signature textbox widget.
      * @Default {true}
      */
    var enabled: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the height of the Signature control.
      * @Default {100%}
      */
    var height: js.UndefOr[String] = js.undefined
    
    /** Enables/disables responsive support for the signature control (i.e) maintain the signature drawing during the window resizing time.
      * @Default {false}
      */
    var isResponsive: js.UndefOr[Boolean] = js.undefined
    
    /** Triggered when the pointer is clicked or touched in the signature canvas.
      */
    var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.undefined
    
    /** Triggered when the pointer is moved in the signature canvas.
      */
    var mouseMove: js.UndefOr[js.Function1[/* e */ MouseMoveEventArgs, Unit]] = js.undefined
    
    /** Triggered when the pointer is released after click or touch in the signature canvas.
      */
    var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.undefined
    
    /** Allows the type of the image format to be saved when the signature image is saved.
      */
    var saveImageFormat: js.UndefOr[SaveImageFormat | String] = js.undefined
    
    /** Allows the signature image to be saved along with its background.
      * @Default {false}
      */
    var saveWithBackground: js.UndefOr[Boolean] = js.undefined
    
    /** Enables or disables rounded corner.
      * @Default {true}
      */
    var showRoundedCorner: js.UndefOr[Boolean] = js.undefined
    
    /** Sets the stroke color for the stroke of the signature.
      * @Default {#000000}
      */
    var strokeColor: js.UndefOr[String] = js.undefined
    
    /** Sets the stroke width for the stroke of the signature.
      * @Default {2}
      */
    var strokeWidth: js.UndefOr[Double] = js.undefined
    
    /** Sets the width of the Signature control.
      * @Default {100%}
      */
    var width: js.UndefOr[String] = js.undefined
  }
  object Model {
    
    inline def apply(): typings.ejWebAll.ej.Signature.Model = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.ejWebAll.ej.Signature.Model]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: typings.ejWebAll.ej.Signature.Model] (val x: Self) extends AnyVal {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setBackgroundImage(value: String): Self = StObject.set(x, "backgroundImage", value.asInstanceOf[js.Any])
      
      inline def setBackgroundImageUndefined: Self = StObject.set(x, "backgroundImage", js.undefined)
      
      inline def setChange(value: /* e */ ChangeEventArgs => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setIsResponsive(value: Boolean): Self = StObject.set(x, "isResponsive", value.asInstanceOf[js.Any])
      
      inline def setIsResponsiveUndefined: Self = StObject.set(x, "isResponsive", js.undefined)
      
      inline def setMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = StObject.set(x, "mouseDown", js.Any.fromFunction1(value))
      
      inline def setMouseDownUndefined: Self = StObject.set(x, "mouseDown", js.undefined)
      
      inline def setMouseMove(value: /* e */ MouseMoveEventArgs => Unit): Self = StObject.set(x, "mouseMove", js.Any.fromFunction1(value))
      
      inline def setMouseMoveUndefined: Self = StObject.set(x, "mouseMove", js.undefined)
      
      inline def setMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = StObject.set(x, "mouseUp", js.Any.fromFunction1(value))
      
      inline def setMouseUpUndefined: Self = StObject.set(x, "mouseUp", js.undefined)
      
      inline def setSaveImageFormat(value: SaveImageFormat | String): Self = StObject.set(x, "saveImageFormat", value.asInstanceOf[js.Any])
      
      inline def setSaveImageFormatUndefined: Self = StObject.set(x, "saveImageFormat", js.undefined)
      
      inline def setSaveWithBackground(value: Boolean): Self = StObject.set(x, "saveWithBackground", value.asInstanceOf[js.Any])
      
      inline def setSaveWithBackgroundUndefined: Self = StObject.set(x, "saveWithBackground", js.undefined)
      
      inline def setShowRoundedCorner(value: Boolean): Self = StObject.set(x, "showRoundedCorner", value.asInstanceOf[js.Any])
      
      inline def setShowRoundedCornerUndefined: Self = StObject.set(x, "showRoundedCorner", js.undefined)
      
      inline def setStrokeColor(value: String): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
      
      inline def setStrokeWidth(value: Double): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      inline def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  trait MouseDownEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the signature model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns all the event values
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object MouseDownEventArgs {
    
    inline def apply(): MouseDownEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseDownEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseDownEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MouseMoveEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the signature model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns all the event values
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object MouseMoveEventArgs {
    
    inline def apply(): MouseMoveEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseMoveEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseMoveEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait MouseUpEventArgs extends StObject {
    
    /** Set this option to true to cancel the event.
      */
    var cancel: js.UndefOr[Boolean] = js.undefined
    
    /** Instance of the signature model object.
      */
    var model: js.UndefOr[typings.ejWebAll.ej.Model] = js.undefined
    
    /** Name of the event.
      */
    var `type`: js.UndefOr[String] = js.undefined
    
    /** returns all the event values
      */
    var value: js.UndefOr[Any] = js.undefined
  }
  object MouseUpEventArgs {
    
    inline def apply(): MouseUpEventArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MouseUpEventArgs]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MouseUpEventArgs] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: Boolean): Self = StObject.set(x, "cancel", value.asInstanceOf[js.Any])
      
      inline def setCancelUndefined: Self = StObject.set(x, "cancel", js.undefined)
      
      inline def setModel(value: typings.ejWebAll.ej.Model): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
