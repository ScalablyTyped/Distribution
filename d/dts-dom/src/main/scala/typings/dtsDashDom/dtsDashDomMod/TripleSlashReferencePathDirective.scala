package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`triple-slash-reference-path`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleSlashReferencePathDirective extends TripleSlashDirective {
  var kind: `triple-slash-reference-path`
  var path: String
}

object TripleSlashReferencePathDirective {
  @scala.inline
  def apply(kind: `triple-slash-reference-path`, path: String): TripleSlashReferencePathDirective = {
    val __obj = js.Dynamic.literal(kind = kind, path = path)
  
    __obj.asInstanceOf[TripleSlashReferencePathDirective]
  }
}

