package typings.firebaseFirestore

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreSrcRegisterMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/src/register", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def registerFirestore(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")().asInstanceOf[Unit]
  inline def registerFirestore(variant: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")(variant.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def registerFirestore(variant: String, useFetchStreams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")(variant.asInstanceOf[js.Any], useFetchStreams.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def registerFirestore(variant: Unit, useFetchStreams: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerFirestore")(variant.asInstanceOf[js.Any], useFetchStreams.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
