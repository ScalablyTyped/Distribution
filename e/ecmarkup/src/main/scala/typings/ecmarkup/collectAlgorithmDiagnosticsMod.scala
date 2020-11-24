package typings.ecmarkup

import typings.ecmarkup.anon.Element
import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-algorithm-diagnostics", JSImport.Namespace)
@js.native
object collectAlgorithmDiagnosticsMod extends js.Object {
  
  def collectAlgorithmDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    spec: Spec,
    mainSource: String,
    algorithms: js.Array[Element]
  ): Unit = js.native
}
