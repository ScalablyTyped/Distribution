package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StringDictionary
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorHelpersMod {
  
  @JSImport("gatsby-telemetry/lib/error-helpers", "cleanPaths")
  @js.native
  def cleanPaths(str: String): String = js.native
  @JSImport("gatsby-telemetry/lib/error-helpers", "cleanPaths")
  @js.native
  def cleanPaths(str: String, separator: String): String = js.native
  
  @JSImport("gatsby-telemetry/lib/error-helpers", "sanitizeError")
  @js.native
  def sanitizeError(error: IErrorWithStdErrAndStdOut): String = js.native
  @JSImport("gatsby-telemetry/lib/error-helpers", "sanitizeError")
  @js.native
  def sanitizeError(error: IErrorWithStdErrAndStdOut, pathSeparator: String): String = js.native
  
  @js.native
  trait IErrorWithStdErrAndStdOut
    extends /* key */ StringDictionary[js.Any] {
    
    var stderr: js.UndefOr[Buffer | String] = js.native
    
    var stdout: js.UndefOr[Buffer | String] = js.native
  }
  object IErrorWithStdErrAndStdOut {
    
    @scala.inline
    def apply(): IErrorWithStdErrAndStdOut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IErrorWithStdErrAndStdOut]
    }
    
    @scala.inline
    implicit class IErrorWithStdErrAndStdOutMutableBuilder[Self <: IErrorWithStdErrAndStdOut] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: Buffer | String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      @scala.inline
      def setStdout(value: Buffer | String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
