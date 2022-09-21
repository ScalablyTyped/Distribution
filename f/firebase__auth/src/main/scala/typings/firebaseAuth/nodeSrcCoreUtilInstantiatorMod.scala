package typings.firebaseAuth

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nodeSrcCoreUtilInstantiatorMod {
  
  @JSImport("@firebase/auth/dist/node/src/core/util/instantiator", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearInstanceMap(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("_clearInstanceMap")().asInstanceOf[Unit]
  
  inline def getInstance[T](cls: Any): T = ^.asInstanceOf[js.Dynamic].applyDynamic("_getInstance")(cls.asInstanceOf[js.Any]).asInstanceOf[T]
  
  @js.native
  trait SingletonInstantiator[T]
    extends StObject
       with Instantiable0[T]
}
