package typings.gitParse

import typings.gitParse.distGitLogStreamMod.GitLogStreamErrorHandler
import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AddErrorHandler extends StObject {
    
    def addErrorHandler(fn: GitLogStreamErrorHandler): Double
    
    var stream: Readable
  }
  object AddErrorHandler {
    
    inline def apply(addErrorHandler: GitLogStreamErrorHandler => Double, stream: Readable): AddErrorHandler = {
      val __obj = js.Dynamic.literal(addErrorHandler = js.Any.fromFunction1(addErrorHandler), stream = stream.asInstanceOf[js.Any])
      __obj.asInstanceOf[AddErrorHandler]
    }
    
    extension [Self <: AddErrorHandler](x: Self) {
      
      inline def setAddErrorHandler(value: GitLogStreamErrorHandler => Double): Self = StObject.set(x, "addErrorHandler", js.Any.fromFunction1(value))
      
      inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stderr extends StObject {
    
    var stderr: String
    
    var stdout: String
  }
  object Stderr {
    
    inline def apply(stderr: String, stdout: String): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    extension [Self <: Stderr](x: Self) {
      
      inline def setStderr(value: String): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
