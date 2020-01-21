package typings.globalizeCompiler

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ExtractFunction = js.Function1[
    /* globalize */ typings.globalize.globalizeMod.Static, 
    js.Array[typings.globalizeCompiler.mod.FormatterOrParserFunction]
  ]
  type FormatterOrParserFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
