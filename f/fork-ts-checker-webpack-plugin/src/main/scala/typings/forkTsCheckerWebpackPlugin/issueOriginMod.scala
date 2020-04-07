package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.eslint
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.internal
import typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.typescript
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueOrigin", JSImport.Namespace)
@js.native
object issueOriginMod extends js.Object {
  /* Inlined { readonly TYPESCRIPT  :'typescript',  readonly ESLINT  :'eslint',  readonly INTERNAL  :'internal'}[keyof { readonly TYPESCRIPT  :'typescript',  readonly ESLINT  :'eslint',  readonly INTERNAL  :'internal'}] */
  /* Rewritten from type alias, can be one of: 
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.typescript
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.eslint
    - typings.forkTsCheckerWebpackPlugin.forkTsCheckerWebpackPluginStrings.internal
  */
  trait IssueOrigin extends js.Object
  
  def compareIssueOrigins(originA: IssueOrigin, originB: IssueOrigin): Double = js.native
  def isIssueOrigin(value: js.Any): /* is fork-ts-checker-webpack-plugin.fork-ts-checker-webpack-plugin/lib/issue/IssueOrigin.IssueOrigin */ Boolean = js.native
  @js.native
  object IssueOrigin extends js.Object {
    val ESLINT: eslint = js.native
    val INTERNAL: internal = js.native
    val TYPESCRIPT: typescript = js.native
  }
  
}

