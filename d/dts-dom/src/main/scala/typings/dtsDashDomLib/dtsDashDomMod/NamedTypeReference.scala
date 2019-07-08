package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypeReference extends TypeReference {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.name
  var name: java.lang.String
}

object NamedTypeReference {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.name, name: java.lang.String): NamedTypeReference = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[NamedTypeReference]
  }
}

