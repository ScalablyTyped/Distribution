package typings.expoConfigPlugins

import typings.expoConfigPlugins.expoConfigPluginsNumbers.`-1`
import typings.expoConfigPlugins.expoConfigPluginsNumbers.`0`
import typings.expoConfigPlugins.expoConfigPluginsNumbers.`1`
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sortObjectMod {
  
  @JSImport("@expo/config-plugins/build/utils/sortObject", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def reverseSortString(a: String, b: String): `1` | `0` | `-1` = (^.asInstanceOf[js.Dynamic].applyDynamic("reverseSortString")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[`1` | `0` | `-1`]
  
  inline def sortObjWithOrder[T /* <: Record[String, Any] */](obj: T, order: js.Array[String]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sortObjWithOrder")(obj.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def sortObject[T /* <: Record[String, Any] */](obj: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("sortObject")(obj.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def sortObject[T /* <: Record[String, Any] */](obj: T, compareFn: js.Function2[/* a */ String, /* b */ String, Double]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("sortObject")(obj.asInstanceOf[js.Any], compareFn.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def sortWithOrder(obj: js.Array[String], order: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("sortWithOrder")(obj.asInstanceOf[js.Any], order.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
}
