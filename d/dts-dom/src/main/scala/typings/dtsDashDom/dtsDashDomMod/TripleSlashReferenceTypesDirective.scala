package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`triple-slash-reference-types`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleSlashReferenceTypesDirective extends TripleSlashDirective {
  var kind: `triple-slash-reference-types`
  var types: String
}

object TripleSlashReferenceTypesDirective {
  @scala.inline
  def apply(kind: `triple-slash-reference-types`, types: String): TripleSlashReferenceTypesDirective = {
    val __obj = js.Dynamic.literal(kind = kind, types = types)
  
    __obj.asInstanceOf[TripleSlashReferenceTypesDirective]
  }
}

