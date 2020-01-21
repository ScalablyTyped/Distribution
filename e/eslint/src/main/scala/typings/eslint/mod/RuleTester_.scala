package typings.eslint.mod

import typings.eslint.AnonInvalid
import typings.eslint.mod.Rule.RuleModule
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("eslint", "RuleTester")
@js.native
class RuleTester_ () extends js.Object {
  def this(config: js.Any) = this()
  def run(name: String, rule: RuleModule, tests: AnonInvalid): Unit = js.native
}

