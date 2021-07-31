package typings.ecmarkup

import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lintMod {
  
  @JSImport("ecmarkup/lib/lint/lint", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def lint(report: js.Function1[/* err */ Warning, Unit], sourceText: String, spec: Spec, document: Document): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("lint")(report.asInstanceOf[js.Any], sourceText.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], document.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
