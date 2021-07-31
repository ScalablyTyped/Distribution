package typings.extsprintf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extsprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def fprintf(stream: Stream, format: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fprintf")(stream.asInstanceOf[js.Any], format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def printf(format: String, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("printf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def sprintf(format: String, args: js.Any*): String = (^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(format.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait Stream extends StObject {
    
    def write(str: String): Unit
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
