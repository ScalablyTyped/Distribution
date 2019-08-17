package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberDashMocha {
  import typings.mocha.MochaNs.HookFunction

  type mochaAfter = HookFunction
  type mochaAfterEach = HookFunction
  // these globals are re-exported as named exports by ember-mocha
  type mochaBefore = HookFunction
  type mochaBeforeEach = HookFunction
  type mochaSetup = HookFunction
  type mochaSuiteSetup = HookFunction
  type mochaSuiteTeardown = HookFunction
  type mochaTeardown = HookFunction
}
