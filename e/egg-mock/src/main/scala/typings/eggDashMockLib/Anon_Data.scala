package typings
package eggDashMockLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: nodeLib.Buffer | java.lang.String | stdLib.JSON
  var headers: js.Any
  var status: scala.Double
}

object Anon_Data {
  @scala.inline
  def apply(data: nodeLib.Buffer | java.lang.String | stdLib.JSON, headers: js.Any, status: scala.Double): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], headers = headers, status = status)
  
    __obj.asInstanceOf[Anon_Data]
  }
}

