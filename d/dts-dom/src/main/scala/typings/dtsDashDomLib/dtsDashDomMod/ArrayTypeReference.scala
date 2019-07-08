package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeReference extends TypeReference {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.array
  var `type`: Type
}

object ArrayTypeReference {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.array, `type`: Type): ArrayTypeReference = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeReference]
  }
}

