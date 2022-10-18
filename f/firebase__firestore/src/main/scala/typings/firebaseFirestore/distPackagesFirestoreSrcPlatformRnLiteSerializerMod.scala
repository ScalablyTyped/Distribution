package typings.firebaseFirestore

import typings.firebaseFirestore.distPackagesFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distPackagesFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import typings.std.TextDecoder
import typings.std.TextEncoder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcPlatformRnLiteSerializerMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/platform/rn_lite/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("newSerializer")(databaseId.asInstanceOf[js.Any]).asInstanceOf[JsonProtoSerializer]
  
  inline def newTextDecoder(): TextDecoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextDecoder")().asInstanceOf[TextDecoder]
  
  inline def newTextEncoder(): TextEncoder = ^.asInstanceOf[js.Dynamic].applyDynamic("newTextEncoder")().asInstanceOf[TextEncoder]
}
