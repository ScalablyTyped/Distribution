package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DataTypeUrlAny extends js.Object {
  var data: js.Any
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_DataTypeUrlAny {
  @scala.inline
  def apply(data: js.Any, `type`: java.lang.String, url: java.lang.String): Anon_DataTypeUrlAny = {
    val __obj = js.Dynamic.literal(data = data, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_DataTypeUrlAny]
  }
}

