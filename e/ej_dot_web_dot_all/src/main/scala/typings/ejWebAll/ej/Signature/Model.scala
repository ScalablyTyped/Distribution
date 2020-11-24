package typings.ejWebAll.ej.Signature

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends js.Object {
  
  /** This property is used to set the background color for the signature.
    * @Default {#ffffff}
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /** This property is used to set the background image for the signature.
    */
  var backgroundImage: js.UndefOr[String] = js.native
  
  /** Triggers when the stroke is changed.
    */
  var change: js.UndefOr[js.Function1[/* e */ ChangeEventArgs, Unit]] = js.native
  
  /** Enables or disables the Signature textbox widget.
    * @Default {true}
    */
  var enabled: js.UndefOr[Boolean] = js.native
  
  /** Sets the height of the Signature control.
    * @Default {100%}
    */
  var height: js.UndefOr[String] = js.native
  
  /** Enables/disables responsive support for the signature control (i.e) maintain the signature drawing during the window resizing time.
    * @Default {false}
    */
  var isResponsive: js.UndefOr[Boolean] = js.native
  
  /** Triggered when the pointer is clicked or touched in the signature canvas.
    */
  var mouseDown: js.UndefOr[js.Function1[/* e */ MouseDownEventArgs, Unit]] = js.native
  
  /** Triggered when the pointer is moved in the signature canvas.
    */
  var mouseMove: js.UndefOr[js.Function1[/* e */ MouseMoveEventArgs, Unit]] = js.native
  
  /** Triggered when the pointer is released after click or touch in the signature canvas.
    */
  var mouseUp: js.UndefOr[js.Function1[/* e */ MouseUpEventArgs, Unit]] = js.native
  
  /** Allows the type of the image format to be saved when the signature image is saved.
    */
  var saveImageFormat: js.UndefOr[SaveImageFormat | String] = js.native
  
  /** Allows the signature image to be saved along with its background.
    * @Default {false}
    */
  var saveWithBackground: js.UndefOr[Boolean] = js.native
  
  /** Enables or disables rounded corner.
    * @Default {true}
    */
  var showRoundedCorner: js.UndefOr[Boolean] = js.native
  
  /** Sets the stroke color for the stroke of the signature.
    * @Default {#000000}
    */
  var strokeColor: js.UndefOr[String] = js.native
  
  /** Sets the stroke width for the stroke of the signature.
    * @Default {2}
    */
  var strokeWidth: js.UndefOr[Double] = js.native
  
  /** Sets the width of the Signature control.
    * @Default {100%}
    */
  var width: js.UndefOr[String] = js.native
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setBackgroundImage(value: String): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    
    @scala.inline
    def setChange(value: /* e */ ChangeEventArgs => Unit): Self = this.set("change", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setHeight(value: String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setIsResponsive(value: Boolean): Self = this.set("isResponsive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsResponsive: Self = this.set("isResponsive", js.undefined)
    
    @scala.inline
    def setMouseDown(value: /* e */ MouseDownEventArgs => Unit): Self = this.set("mouseDown", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseDown: Self = this.set("mouseDown", js.undefined)
    
    @scala.inline
    def setMouseMove(value: /* e */ MouseMoveEventArgs => Unit): Self = this.set("mouseMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseMove: Self = this.set("mouseMove", js.undefined)
    
    @scala.inline
    def setMouseUp(value: /* e */ MouseUpEventArgs => Unit): Self = this.set("mouseUp", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteMouseUp: Self = this.set("mouseUp", js.undefined)
    
    @scala.inline
    def setSaveImageFormat(value: SaveImageFormat | String): Self = this.set("saveImageFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveImageFormat: Self = this.set("saveImageFormat", js.undefined)
    
    @scala.inline
    def setSaveWithBackground(value: Boolean): Self = this.set("saveWithBackground", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveWithBackground: Self = this.set("saveWithBackground", js.undefined)
    
    @scala.inline
    def setShowRoundedCorner(value: Boolean): Self = this.set("showRoundedCorner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowRoundedCorner: Self = this.set("showRoundedCorner", js.undefined)
    
    @scala.inline
    def setStrokeColor(value: String): Self = this.set("strokeColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeColor: Self = this.set("strokeColor", js.undefined)
    
    @scala.inline
    def setStrokeWidth(value: Double): Self = this.set("strokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrokeWidth: Self = this.set("strokeWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
