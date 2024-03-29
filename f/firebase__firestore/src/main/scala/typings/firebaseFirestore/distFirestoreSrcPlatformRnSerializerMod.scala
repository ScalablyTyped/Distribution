package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.distFirestoreSrcRemoteSerializerMod.JsonProtoSerializer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcPlatformRnSerializerMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/platform/rn/serializer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def newSerializer(databaseId: DatabaseId): JsonProtoSerializer = ^.asInstanceOf[js.Dynamic].applyDynamic("newSerializer")(databaseId.asInstanceOf[js.Any]).asInstanceOf[JsonProtoSerializer]
}
