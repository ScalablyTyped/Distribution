package typings.gfc

import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Contents extends StObject {
    
    var contents: js.UndefOr[String] = js.native
    
    var path: String = js.native
  }
  object Contents {
    
    @scala.inline
    def apply(path: String): Contents = {
      val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contents]
    }
    
    @scala.inline
    implicit class ContentsMutableBuilder[Self <: Contents] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentsUndefined: Self = StObject.set(x, "contents", js.undefined)
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Stderr extends StObject {
    
    var stderr: String | Buffer = js.native
    
    var stdout: String | Buffer = js.native
  }
  object Stderr {
    
    @scala.inline
    def apply(stderr: String | Buffer, stdout: String | Buffer): Stderr = {
      val __obj = js.Dynamic.literal(stderr = stderr.asInstanceOf[js.Any], stdout = stdout.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stderr]
    }
    
    @scala.inline
    implicit class StderrMutableBuilder[Self <: Stderr] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStderr(value: String | Buffer): Self = StObject.set(x, "stderr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStdout(value: String | Buffer): Self = StObject.set(x, "stdout", value.asInstanceOf[js.Any])
    }
  }
}
