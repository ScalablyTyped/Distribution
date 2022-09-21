package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcUtilObjMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/util/obj", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def forEach[V](obj: Unit, fn: js.Function2[/* key */ String, /* val */ V, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def forEach[V](obj: Dict[V], fn: js.Function2[/* key */ String, /* val */ V, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("forEach")(obj.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def isEmpty[V](obj: Dict[V]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEmpty")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def objectSize(obj: js.Object): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("objectSize")(obj.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  type Dict[V] = StringDictionary[V]
}
