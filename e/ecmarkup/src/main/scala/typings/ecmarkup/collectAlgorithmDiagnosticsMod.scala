package typings.ecmarkup

import typings.ecmarkup.anon.Element
import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectAlgorithmDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-algorithm-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectAlgorithmDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    algorithms: js.Array[Element]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectAlgorithmDiagnostics")(report.asInstanceOf[js.Any], spec.asInstanceOf[js.Any], mainSource.asInstanceOf[js.Any], algorithms.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
