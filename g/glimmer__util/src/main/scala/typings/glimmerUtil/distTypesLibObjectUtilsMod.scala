package typings.glimmerUtil

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLibObjectUtilsMod {
  
  @JSImport("@glimmer/util/dist/types/lib/object-utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Object, sources: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(scala.List(target.asInstanceOf[js.Any]).`++`(sources.asInstanceOf[Seq[js.Any]])*).asInstanceOf[Any]
  inline def assign[T, U](target: T, source: U): T & U = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T & U]
  inline def assign[T_1, U_1, V](target: T_1, source1: U_1, source2: V): T_1 & U_1 & V = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any])).asInstanceOf[T_1 & U_1 & V]
  inline def assign[T_2, U_2, V_1, W](target: T_2, source1: U_2, source2: V_1, source3: W): T_2 & U_2 & V_1 & W = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], source1.asInstanceOf[js.Any], source2.asInstanceOf[js.Any], source3.asInstanceOf[js.Any])).asInstanceOf[T_2 & U_2 & V_1 & W]
  
  inline def fillNulls[T](count: Double): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fillNulls")(count.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def values[T](obj: StringDictionary[T]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
