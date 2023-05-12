package typings.glimmerUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibArrayUtilsMod {
  
  @JSImport("@glimmer/util/dist/types/lib/array-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/array-utils", "EMPTY_ARRAY")
  @js.native
  val EMPTY_ARRAY: js.Array[Any] = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/array-utils", "EMPTY_NUMBER_ARRAY")
  @js.native
  val EMPTY_NUMBER_ARRAY: js.Array[Double] = js.native
  
  @JSImport("@glimmer/util/dist/types/lib/array-utils", "EMPTY_STRING_ARRAY")
  @js.native
  val EMPTY_STRING_ARRAY: js.Array[String] = js.native
  
  inline def emptyArray[T /* <: Any */](): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("emptyArray")().asInstanceOf[js.Array[T]]
  
  inline def isEmptyArray(input: js.Array[Any]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmptyArray")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
