package typings.ecmarkup

import typings.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectSpellingDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-spelling-diagnostics", "collectSpellingDiagnostics")
  @js.native
  def collectSpellingDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    mainSource: String,
    imports: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ _
    ]
  ): Unit = js.native
}
