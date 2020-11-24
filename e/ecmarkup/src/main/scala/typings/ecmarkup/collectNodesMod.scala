package typings.ecmarkup

import typings.ecmarkup.specMod.Spec
import typings.ecmarkup.specMod.Warning
import typings.std.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ecmarkup/lib/lint/collect-nodes", JSImport.Namespace)
@js.native
object collectNodesMod extends js.Object {
  
  def collectNodes(report: js.Function1[/* e */ Warning, Unit], mainSource: String, spec: Spec, document: Document): CollectNodesReturnType = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.Algorithms
    - typings.ecmarkup.anon.Success
  */
  trait CollectNodesReturnType extends js.Object
}
