package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity", JSImport.Namespace)
@js.native
object issueSeverityMod extends js.Object {
  /* Inlined { readonly ERROR  :'error',  readonly WARNING  :'warning'}[keyof { readonly ERROR  :'error',  readonly WARNING  :'warning'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.error
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.warning
  */
  trait IssueSeverity extends js.Object
  
  def compareIssueSeverities(severityA: IssueSeverity, severityB: IssueSeverity): Double = js.native
  def isIssueSeverity(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueSeverity.IssueSeverity */ Boolean = js.native
  @js.native
  object IssueSeverity extends js.Object {
    val ERROR: error = js.native
    val WARNING: warning = js.native
  }
  
}

