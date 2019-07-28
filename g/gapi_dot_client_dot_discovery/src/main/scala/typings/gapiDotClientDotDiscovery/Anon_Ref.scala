package typings.gapiDotClientDotDiscovery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ref extends js.Object {
  @JSName("$ref")
  var $ref: js.UndefOr[String] = js.undefined
  var type_value: js.UndefOr[String] = js.undefined
}

object Anon_Ref {
  @scala.inline
  def apply($ref: String = null, type_value: String = null): Anon_Ref = {
    val __obj = js.Dynamic.literal()
    if ($ref != null) __obj.updateDynamic("$ref")($ref)
    if (type_value != null) __obj.updateDynamic("type_value")(type_value)
    __obj.asInstanceOf[Anon_Ref]
  }
}

