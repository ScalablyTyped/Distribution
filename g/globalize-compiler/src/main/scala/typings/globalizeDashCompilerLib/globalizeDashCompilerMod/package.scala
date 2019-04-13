package typings
package globalizeDashCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object globalizeDashCompilerMod {
  type ExtractFunction = js.Function1[
    /* globalize */ globalizeLib.distGlobalizeMessageMod.distGlobalizeMod.Static, 
    js.Array[FormatterOrParserFunction]
  ]
  type FormatterOrParserFunction = js.Function1[/* repeated */ js.Any, js.Any]
}
