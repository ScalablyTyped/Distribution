package typings.forkTsCheckerWebpackPlugin

import typings.forkTsCheckerWebpackPlugin.issueIssueMod.Issue
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object issueWebpackErrorMod {
  
  @JSImport("fork-ts-checker-webpack-plugin/lib/issue/IssueWebpackError", "IssueWebpackError")
  @js.native
  class IssueWebpackError protected ()
    extends StObject
       with Error {
    def this(message: String, issue: Issue) = this()
    
    val file: js.UndefOr[String] = js.native
    
    val hideStack: /* true */ Boolean = js.native
    
    val issue: Issue = js.native
    
    /* CompleteClass */
    var message: String = js.native
    
    /* CompleteClass */
    var name: String = js.native
  }
}
