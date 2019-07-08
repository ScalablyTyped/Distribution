package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TripleSlashAmdModuleDirective extends TripleSlashDirective {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`triple-slash-amd-module`
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object TripleSlashAmdModuleDirective {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.`triple-slash-amd-module`, name: java.lang.String = null): TripleSlashAmdModuleDirective = {
    val __obj = js.Dynamic.literal(kind = kind)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[TripleSlashAmdModuleDirective]
  }
}

