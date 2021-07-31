package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.LintingError
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerFormatMod {
  
  @JSImport("ecmarkup/lib/lint/rules/header-format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(report: js.Function1[/* e */ LintingError, Unit], node: Element, source: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(report.asInstanceOf[js.Any], node.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
