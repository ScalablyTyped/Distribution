package typings.ecmarkup

import typings.ecmarkup.anon.Alg
import typings.ecmarkup.anon.Contents
import typings.ecmarkup.anon.Element
import typings.ecmarkup.anon.Grammar
import typings.ecmarkup.anon.Source
import typings.ecmarkup.ecmarkupBooleans.`false`
import typings.ecmarkup.ecmarkupBooleans.`true`
import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import typings.std.Document
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object collectNodesMod {
  
  @JSImport("ecmarkup/lib/lint/collect-nodes", "collectNodes")
  @js.native
  def collectNodes(report: js.Function1[/* e */ Warning, Unit], mainSource: String, spec: Spec, document: Document): CollectNodesReturnType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.Algorithms
    - typings.ecmarkup.anon.Success
  */
  trait CollectNodesReturnType extends StObject
  object CollectNodesReturnType {
    
    @scala.inline
    def Algorithms(
      algorithms: js.Array[Element],
      earlyErrors: js.Array[Grammar],
      headers: js.Array[Contents],
      mainGrammar: js.Array[Source],
      sdos: js.Array[Alg],
      success: `true`
    ): typings.ecmarkup.anon.Algorithms = {
      val __obj = js.Dynamic.literal(algorithms = algorithms.asInstanceOf[js.Any], earlyErrors = earlyErrors.asInstanceOf[js.Any], headers = headers.asInstanceOf[js.Any], mainGrammar = mainGrammar.asInstanceOf[js.Any], sdos = sdos.asInstanceOf[js.Any], success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Algorithms]
    }
    
    @scala.inline
    def Success(success: `false`): typings.ecmarkup.anon.Success = {
      val __obj = js.Dynamic.literal(success = success.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.Success]
    }
  }
}
