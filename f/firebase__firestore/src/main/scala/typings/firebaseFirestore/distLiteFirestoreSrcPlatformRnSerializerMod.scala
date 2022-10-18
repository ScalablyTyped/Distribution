package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distLiteFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.std.TextDecoder
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcPlatformRnSerializerMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/platform/rn/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("newSerializer")(databaseId.asInstanceOf[js.Any]).asInstanceOf[JsonProtoSerializer]
  
  inline def newTextDecoder(): TextDecoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextDecoder")().asInstanceOf[TextDecoder]
  
  inline def newTextEncoder(): TextEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextEncoder")().asInstanceOf[TextEncoder]
}
