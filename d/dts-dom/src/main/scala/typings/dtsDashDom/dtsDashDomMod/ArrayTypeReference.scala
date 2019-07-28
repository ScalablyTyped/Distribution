package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayTypeReference extends TypeReference {
  var kind: array
  var `type`: Type
}

object ArrayTypeReference {
  @scala.inline
  def apply(kind: array, `type`: Type): ArrayTypeReference = {
    val __obj = js.Dynamic.literal(kind = kind)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayTypeReference]
  }
}

