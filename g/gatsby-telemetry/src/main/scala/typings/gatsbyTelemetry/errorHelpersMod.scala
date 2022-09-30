package typings.gatsbyTelemetry

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorHelpersMod {
  
  @JSImport("gatsby-telemetry/lib/error-helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def cleanPaths(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("cleanPaths")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def cleanPaths(str: String, separator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("cleanPaths")(str.asInstanceOf[js.Any], separator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def sanitizeError(error: IErrorWithStdErrAndStdOut): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeError")(error.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def sanitizeError(error: IErrorWithStdErrAndStdOut, pathSeparator: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sanitizeError")(error.asInstanceOf[js.Any], pathSeparator.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait IErrorWithStdErrAndStdOut
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    var stderr: js.UndefOr[Buffer | String] = js.undefined
    
    var stdout: js.UndefOr[Buffer | String] = js.undefined
  }
  object IErrorWithStdErrAndStdOut {
    
    inline def apply(): IErrorWithStdErrAndStdOut = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IErrorWithStdErrAndStdOut]
    }
    
    extension [Self <: IErrorWithStdErrAndStdOut](x: Self) {
      
      inline def setStderr(value: Buffer | String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStderrUndefined: Self = StObject.set(x, "stderr", js.undefined)
      
      inline def setStdout(value: Buffer | String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
      
      inline def setStdoutUndefined: Self = StObject.set(x, "stdout", js.undefined)
    }
  }
}
