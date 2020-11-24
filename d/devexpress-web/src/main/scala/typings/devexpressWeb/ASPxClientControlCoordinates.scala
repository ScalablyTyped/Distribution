package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the client-side equivalent of the ControlCoordinates class.
  */
@js.native
trait ASPxClientControlCoordinates extends js.Object {
  
  /**
    * Gets the point's pane.
    */
  var pane: ASPxClientXYDiagramPane = js.native
  
  /**
    * Gets the point's visibility state.
    */
  var visibility: String = js.native
  
  /**
    * Gets the point's X-coordinate, in pixels.
    */
  var x: Double = js.native
  
  /**
    * Gets the point's Y-coordinate, in pixels.
    */
  var y: Double = js.native
}
object ASPxClientControlCoordinates {
  
  @scala.inline
  def apply(pane: ASPxClientXYDiagramPane, visibility: String, x: Double, y: Double): ASPxClientControlCoordinates = {
    val __obj = js.Dynamic.literal(pane = pane.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ASPxClientControlCoordinates]
  }
  
  @scala.inline
  implicit class ASPxClientControlCoordinatesOps[Self <: ASPxClientControlCoordinates] (val x: Self) extends AnyVal {
    
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
    def setPane(value: ASPxClientXYDiagramPane): Self = this.set("pane", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisibility(value: String): Self = this.set("visibility", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
