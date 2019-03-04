package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data extends js.Object {
  var data: java.lang.String
  var `type`: java.lang.String
}

object Anon_Data {
  @scala.inline
  def apply(data: java.lang.String, `type`: java.lang.String): Anon_Data = {
    val __obj = js.Dynamic.literal(data = data)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_Data]
  }
}

