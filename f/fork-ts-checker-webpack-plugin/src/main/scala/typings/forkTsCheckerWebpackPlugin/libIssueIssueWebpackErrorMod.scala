package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.libIssueIssueMod.Issue
import typings.webpack.anon.Read
import typings.webpack.anon.Write
import typings.webpack.mod.Chunk
import typings.webpack.mod.DependencyLocation
import typings.webpack.mod.Module
import typings.webpack.mod.WebpackError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libIssueIssueWebpackErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/issue-webpack-error", "IssueWebpackError")
  @js.native
  open class IssueWebpackError protected ()
    extends StObject
       with WebpackError {
    def this(message: String, issue: Issue) = this()
    
    /* CompleteClass */
    var chunk: Chunk = js.native
    
    /* CompleteClass */
    override def deserialize(__0: Read): Unit = js.native
    
    /* CompleteClass */
    var details: Any = js.native
    
    /* CompleteClass */
    var file: String = js.native
    
    /* CompleteClass */
    var hideStack: Boolean = js.native
    
    val issue: Issue = js.native
    
    /* CompleteClass */
    var loc: DependencyLocation = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var module: Module = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    
    /* CompleteClass */
    override def serialize(__0: Write): Unit = js.native
  }
}
