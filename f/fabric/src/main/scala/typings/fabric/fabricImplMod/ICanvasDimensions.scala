package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

///////////////////////////////////////////////////////////////////////////////
// Canvas Interfaces
//////////////////////////////////////////////////////////////////////////////
@js.native
trait ICanvasDimensions extends js.Object {
  /**
    * Height of canvas element
    */
  var height: Double | String = js.native
  /**
    * Width of canvas element
    */
  var width: Double | String = js.native
}

object ICanvasDimensions {
  @scala.inline
  def apply(height: Double | String, width: Double | String): ICanvasDimensions = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICanvasDimensions]
  }
  @scala.inline
  implicit class ICanvasDimensionsOps[Self <: ICanvasDimensions] (val x: Self) extends AnyVal {
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
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

