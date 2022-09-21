package typings.firebaseFirestore

import typings.firebaseFirestore.protosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serializerDotNodeTestMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/test/unit/remote/serializer.node.test", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def verifyProtobufJsRoundTrip(jsonValue: Value): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("verifyProtobufJsRoundTrip")(jsonValue.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
