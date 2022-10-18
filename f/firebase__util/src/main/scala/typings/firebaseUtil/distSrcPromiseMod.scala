package typings.firebaseUtil

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcPromiseMod {
  
  @JSImport("@firebase/util/dist/src/promise", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def promiseWithTimeout[T](promise: js.Promise[T]): js.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("promiseWithTimeout")(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[T]]
  inline def promiseWithTimeout[T](promise: js.Promise[T], timeInMS: Double): js.Promise[T] = (^.asInstanceOf[js.Dynamic].applyDynamic("promiseWithTimeout")(promise.asInstanceOf[js.Any], timeInMS.asInstanceOf[js.Any])).asInstanceOf[js.Promise[T]]
}
