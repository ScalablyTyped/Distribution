package typings.fireo.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Fireo {
  
  @JSImport("fireo", "Fireo")
  @js.native
  val ^ : js.Any = js.native
  
  inline def GeoPoint(latitude: Double, longitude: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("GeoPoint")(latitude.asInstanceOf[js.Any], longitude.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def batch(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("batch")().asInstanceOf[Any]
  
  @JSImport("fireo", "Fireo.connection")
  @js.native
  def connection: Any = js.native
  inline def connection_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("connection")(x.asInstanceOf[js.Any])
  
  inline def increment(number: Double): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("increment")(number.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def listRemove(element: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("listRemove")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def listUnion(element: js.Array[Any]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("listUnion")(element.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def runTransaction(callback: js.Function0[Any]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("runTransaction")(callback.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
}
