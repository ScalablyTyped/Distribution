package typings
package eslintLib.eslintMod.RuleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RuleModule extends js.Object {
  var meta: js.UndefOr[RuleMetaData] = js.undefined
  def create(context: RuleContext): RuleListener
}

