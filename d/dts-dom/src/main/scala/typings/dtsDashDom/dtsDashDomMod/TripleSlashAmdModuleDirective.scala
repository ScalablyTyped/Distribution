package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`triple-slash-amd-module`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleSlashAmdModuleDirective extends TripleSlashDirective {
  var kind: `triple-slash-amd-module`
  var name: js.UndefOr[String] = js.undefined
}

object TripleSlashAmdModuleDirective {
  @scala.inline
  def apply(kind: `triple-slash-amd-module`, name: String = null): TripleSlashAmdModuleDirective = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TripleSlashAmdModuleDirective]
  }
}

