package typings.extsprintf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("extsprintf", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fprintf(stream: Stream, format: String, args: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fprintf")((List(stream.asInstanceOf[js.Any], format.asInstanceOf[js.Any])).`++`(args.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def printf(format: String, args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("printf")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  
  inline def sprintf(format: String, args: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sprintf")(List(format.asInstanceOf[js.Any]).`++`(args.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]
  
  trait Stream extends StObject {
    
    def write(str: String): Unit
  }
  object Stream {
    
    inline def apply(write: String => Unit): Stream = {
      val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
      __obj.asInstanceOf[Stream]
    }
    
    extension [Self <: Stream](x: Self) {
      
      inline def setWrite(value: String => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
    }
  }
}
