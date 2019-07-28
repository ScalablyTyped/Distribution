package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NamedTypeReference extends TypeReference {
  var kind: name
  var name: String
}

object NamedTypeReference {
  @scala.inline
  def apply(kind: name, name: String): NamedTypeReference = {
    val __obj = js.Dynamic.literal(kind = kind, name = name)
  
    __obj.asInstanceOf[NamedTypeReference]
  }
}

