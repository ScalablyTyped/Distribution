package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object emberMocha {
  type mochaAfter = typings.mocha.Mocha_.HookFunction
  type mochaAfterEach = typings.mocha.Mocha_.HookFunction
  // these globals are re-exported as named exports by ember-mocha
  type mochaBefore = typings.mocha.Mocha_.HookFunction
  type mochaBeforeEach = typings.mocha.Mocha_.HookFunction
  type mochaSetup = typings.mocha.Mocha_.HookFunction
  type mochaSuiteSetup = typings.mocha.Mocha_.HookFunction
  type mochaSuiteTeardown = typings.mocha.Mocha_.HookFunction
  type mochaTeardown = typings.mocha.Mocha_.HookFunction
}
