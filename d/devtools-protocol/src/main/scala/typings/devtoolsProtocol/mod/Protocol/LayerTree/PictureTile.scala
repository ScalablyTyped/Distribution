package typings.devtoolsProtocol.mod.Protocol.LayerTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PictureTile extends js.Object {
  /**
    * Base64-encoded snapshot data.
    */
  var picture: String = js.native
  /**
    * Offset from owning layer left boundary
    */
  var x: Double = js.native
  /**
    * Offset from owning layer top boundary
    */
  var y: Double = js.native
}

object PictureTile {
  @scala.inline
  def apply(picture: String, x: Double, y: Double): PictureTile = {
    val __obj = js.Dynamic.literal(picture = picture.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PictureTile]
  }
  @scala.inline
  implicit class PictureTileOps[Self <: PictureTile] (val x: Self) extends AnyVal {
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
    def setPicture(value: String): Self = this.set("picture", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

