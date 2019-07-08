package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofReference extends _Type {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.typeof
  var `type`: NamedTypeReference
}

object TypeofReference {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.typeof, `type`: NamedTypeReference): TypeofReference = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TypeofReference]
  }
}

