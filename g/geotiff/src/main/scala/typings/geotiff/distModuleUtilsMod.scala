package typings.geotiff

import org.scalablytyped.runtime.Instantiable2
import typings.geotiff.anon.First
import typings.geotiff.anon.Last
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distModuleUtilsMod {
  
  @JSImport("geotiff/dist-module/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("geotiff/dist-module/utils", "AbortError")
  @js.native
  open class AbortError protected ()
    extends StObject
       with Error {
    def this(params: Any) = this()
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("geotiff/dist-module/utils", "AggregateError")
  @js.native
  open class AggregateError protected () extends CustomAggregateError {
    def this(errors: Any, message: Any) = this()
  }
  @JSImport("geotiff/dist-module/utils", "AggregateError")
  @js.native
  val AggregateError: Instantiable2[/* errors */ Any, /* message */ Any, CustomAggregateError] = js.native
  
  @JSImport("geotiff/dist-module/utils", "CustomAggregateError")
  @js.native
  open class CustomAggregateError protected ()
    extends StObject
       with Error {
    def this(errors: Any, message: Any) = this()
    
    var errors: Any = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  inline def assign(target: Any, source: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def chunk(iterable: Any, length: Any): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("chunk")(iterable.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
  
  inline def endsWith(string: Any, expectedEnding: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("endsWith")(string.asInstanceOf[js.Any], expectedEnding.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def forEach(iterable: Any, func: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(iterable.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def invert(oldObj: Any): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("invert")(oldObj.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def parseContentRange(headerValue: Any): First | Last | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("parseContentRange")(headerValue.asInstanceOf[js.Any]).asInstanceOf[First | Last | Null]
  
  inline def range(n: Any): js.Array[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("range")(n.asInstanceOf[js.Any]).asInstanceOf[js.Array[Double]]
  
  inline def times(numTimes: Any, func: Any): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("times")(numTimes.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def toArray(iterable: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("toArray")(iterable.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def toArrayRecursively(input: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("toArrayRecursively")(input.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def wait_(milliseconds: Any): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("wait")(milliseconds.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
  
  inline def zip(a: Any, b: Any): js.Array[js.Array[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("zip")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Any]]]
}
