package typings.ecmarkup

import typings.ecmarkup.anon.Contents
import typings.ecmarkup.specMod.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-header-diagnostics", JSImport.Namespace)
@js.native
object collectHeaderDiagnosticsMod extends js.Object {
  
  def collectHeaderDiagnostics(report: js.Function1[/* e */ Warning, Unit], headers: js.Array[Contents]): Unit = js.native
}
