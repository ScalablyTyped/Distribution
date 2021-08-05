package typings.ecmarkup

import typings.ecmarkup.specMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectSpellingDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-spelling-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectSpellingDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    mainSource: String,
    imports: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ js.Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectSpellingDiagnostics")(report.asInstanceOf[js.Any], mainSource.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
