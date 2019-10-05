package typings.globalizeDashCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalizeDashCompilerMod {
  import typings.globalize.distGlobalizeMod.Static

  type ExtractFunction = js.Function1[/* globalize */ Static, js.Array[FormatterOrParserFunction]]
  type FormatterOrParserFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
