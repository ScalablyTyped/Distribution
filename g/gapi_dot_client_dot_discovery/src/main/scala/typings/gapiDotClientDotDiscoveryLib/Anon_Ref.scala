package typings
package gapiDotClientDotDiscoveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ref extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[java.lang.String] = js.undefined
  var type_value: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Ref {
  @scala.inline
  def apply($ref: java.lang.String = null, type_value: java.lang.String = null): Anon_Ref = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (type_value != null) __obj.updateDynamic("type_value")(type_value)
    __obj.asInstanceOf[Anon_Ref]
  }
}

