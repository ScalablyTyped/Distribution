package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/rules/header-format", JSImport.Namespace)
@js.native
object headerFormatMod extends js.Object {
  
  def default(report: js.Function1[/* e */ LintingError, Unit], node: Element, source: String): Unit = js.native
}
