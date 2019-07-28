package typings.globalizeDashCompiler

import typings.globalize.distGlobalizeMessageMod.distGlobalizeMod.Static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalizeDashCompilerMod {
  type ExtractFunction = js.Function1[/* globalize */ Static, js.Array[FormatterOrParserFunction]]
  type FormatterOrParserFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
