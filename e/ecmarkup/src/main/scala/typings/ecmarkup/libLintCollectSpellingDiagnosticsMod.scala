package typings.ecmarkup

import typings.ecmarkup.libSpecMod.Warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintCollectSpellingDiagnosticsMod {
  
  @JSImport("ecmarkup/lib/lint/collect-spelling-diagnostics", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def collectSpellingDiagnostics(
    report: js.Function1[/* e */ Warning, Unit],
    mainSource: String,
    imports: js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Import */ Any
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("collectSpellingDiagnostics")(report.asInstanceOf[js.Any], mainSource.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
