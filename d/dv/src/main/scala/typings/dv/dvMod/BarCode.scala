package typings.dv.dvMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarCode extends js.Object {
  var buffer: Buffer
  var data: String
  var points: js.Array[Point]
  var `type`: String
}

object BarCode {
  @scala.inline
  def apply(buffer: Buffer, data: String, points: js.Array[Point], `type`: String): BarCode = {
    val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], points = points.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarCode]
  }
}

