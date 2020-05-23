package typings.fabric.fabricImplMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewBox extends js.Object {
  /**
    * Height of viewbox
    */
  var height: Double
  /**
    * Width of viewbox
    */
  var width: Double
  /**
    * x-cooridnate of viewbox
    */
  var x: Double
  /**
    * y-coordinate of viewbox
    */
  var y: Double
}

object IViewBox {
  @scala.inline
  def apply(height: Double, width: Double, x: Double, y: Double): IViewBox = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[IViewBox]
  }
}

