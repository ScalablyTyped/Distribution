package typings
package dvLib.dvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BarCode extends js.Object {
  var buffer: nodeLib.Buffer
  var data: java.lang.String
  var points: js.Array[Point]
  var `type`: java.lang.String
}

object BarCode {
  @scala.inline
  def apply(buffer: nodeLib.Buffer, data: java.lang.String, points: js.Array[Point], `type`: java.lang.String): BarCode = {
    val __obj = js.Dynamic.literal(buffer = buffer, data = data, points = points)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BarCode]
  }
}

