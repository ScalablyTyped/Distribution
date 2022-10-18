package typings.fbjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPartitionArrayMod {
  
  inline def apply[Tv](
    array: js.Array[Tv],
    predicate: js.Function3[/* value */ Tv, /* index */ Double, /* array */ js.Array[Tv], Boolean]
  ): js.Tuple2[js.Array[Tv], js.Array[Tv]] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Tv], js.Array[Tv]]]
  inline def apply[Tv](
    array: js.Array[Tv],
    predicate: js.Function3[/* value */ Tv, /* index */ Double, /* array */ js.Array[Tv], Boolean],
    context: Any
  ): js.Tuple2[js.Array[Tv], js.Array[Tv]] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], predicate.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[js.Array[Tv], js.Array[Tv]]]
  
  @JSImport("fbjs/lib/partitionArray", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
