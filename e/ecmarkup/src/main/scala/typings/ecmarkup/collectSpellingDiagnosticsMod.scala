package typings.ecmarkup

import typings.ecmarkup.specMod.Warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-spelling-diagnostics", JSImport.Namespace)
@js.native
object collectSpellingDiagnosticsMod extends js.Object {
  
  def collectSpellingDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    mainSource: String,
    imports: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
    ]
  ): Unit = js.native
}
