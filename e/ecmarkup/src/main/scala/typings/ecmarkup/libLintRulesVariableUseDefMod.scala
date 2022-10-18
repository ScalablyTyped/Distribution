package typings.ecmarkup

import typings.ecmarkup.libLintAlgorithmErrorReporterTypeMod.Reporter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libLintRulesVariableUseDefMod {
  
  @JSImport("ecmarkup/lib/lint/rules/variable-use-def", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkVariableUsage(
    containingAlgorithm: Element,
    steps: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OrderedListNode */ Any,
    report: Reporter
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkVariableUsage")(containingAlgorithm.asInstanceOf[js.Any], steps.asInstanceOf[js.Any], report.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
