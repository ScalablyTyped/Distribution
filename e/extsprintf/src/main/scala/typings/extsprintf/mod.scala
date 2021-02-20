package typings.extsprintf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extsprintf", "fprintf")
  @js.native
  def fprintf(stream: Stream, format: String, args: js.Any*): js.Any = js.native
  
  @JSImport("extsprintf", "printf")
  @js.native
  def printf(format: String, args: js.Any*): js.Any = js.native
  
  @JSImport("extsprintf", "sprintf")
  @js.native
  def sprintf(format: String, args: js.Any*): String = js.native
  
  @js.native
  trait Stream extends StObject {
    
    def write(str: String): Unit = js.native
  }
  object Stream {
    
    @scala.inline
    def apply(write: String => Unit): Stream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Stream]
    }
    
    @scala.inline
    implicit class StreamMutableBuilder[Self <: Stream] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
