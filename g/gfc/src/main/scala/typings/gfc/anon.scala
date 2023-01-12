package typings.gfc

import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Contents extends StObject {
    
    var contents: js.UndefOr[String] = js.undefined
    
    var path: String
  }
  object Contents {
    
    inline def apply(path: String): Contents = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Stderr extends StObject {
    
    var stderr: String | Buffer
    
    var stdout: String | Buffer
  }
  object Stderr {
    
    inline def apply(stderr: String | Buffer, stdout: String | Buffer): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Stderr] (val x: Self) extends AnyVal {
      
      inline def setStderr(value: String | Buffer): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      inline def setStdout(value: String | Buffer): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
