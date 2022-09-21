package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerHelperMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/unit/remote/serializer.helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def serializerTest(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serializerTest")().asInstanceOf[Unit]
  inline def serializerTest(protobufJsVerifier: js.Function1[/* jsonValue */ Value, Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("serializerTest")(protobufJsVerifier.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
