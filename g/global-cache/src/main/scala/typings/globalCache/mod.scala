package typings.globalCache

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("global-cache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def _delete(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("_delete")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
  
  inline def delete(key: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("delete")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def get(key: Primitive): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(key.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def has(key: Primitive): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("has")(key.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def set(key: Primitive, value: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def setIfMissingThenGet[T](key: Primitive, valueThunk: js.Function0[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("setIfMissingThenGet")(key.asInstanceOf[js.Any], valueThunk.asInstanceOf[js.Any])).asInstanceOf[T]
  
  type Primitive = js.UndefOr[Double | String | Boolean | js.BigInt | js.Symbol | Null]
}
