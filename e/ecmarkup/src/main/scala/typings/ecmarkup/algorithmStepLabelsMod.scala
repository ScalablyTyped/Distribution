package typings.ecmarkup

import typings.ecmarkup.algorithmErrorReporterTypeMod.Reporter
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object algorithmStepLabelsMod {
  
  @JSImport("ecmarkup/lib/lint/rules/algorithm-step-labels", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(report: Reporter, node: Element, algorithmSource: String): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(report.asInstanceOf[js.Any], node.asInstanceOf[js.Any], algorithmSource.asInstanceOf[js.Any])).asInstanceOf[js.Any]
}
