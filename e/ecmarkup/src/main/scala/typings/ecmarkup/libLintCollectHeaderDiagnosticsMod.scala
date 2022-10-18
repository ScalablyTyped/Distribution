package typings.ecmarkup

import typings.ecmarkup.anon.ContentsElement
import typings.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintCollectHeaderDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-header-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectHeaderDiagnostics(report: js.Function1[/* e */ Warning, Unit], headers: js.Array[ContentsElement]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectHeaderDiagnostics")(report.asInstanceOf[js.Any], headers.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
