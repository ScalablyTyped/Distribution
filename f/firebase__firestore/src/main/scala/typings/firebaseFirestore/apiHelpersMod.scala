package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.liteApiReferenceMod.DocumentData
import typings.firebaseFirestore.objectValueMod.JsonObject
import typings.firebaseFirestore.srcMod.CollectionReference
import typings.firebaseFirestore.srcMod.DocumentReference
import typings.firebaseFirestore.srcMod.DocumentSnapshot
import typings.firebaseFirestore.srcMod.Firestore
import typings.firebaseFirestore.srcMod.QuerySnapshot
import typings.firebaseFirestore.srcMod.Query_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiHelpersMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/api_helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/util/api_helpers", "FIRESTORE")
  @js.native
  val FIRESTORE_ : Firestore = js.native
  
  inline def collectionReference(path: String): CollectionReference[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectionReference")(path.asInstanceOf[js.Any]).asInstanceOf[CollectionReference[DocumentData]]
  
  inline def documentReference(path: String): DocumentReference[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("documentReference")(path.asInstanceOf[js.Any]).asInstanceOf[DocumentReference[DocumentData]]
  
  inline def documentSnapshot(path: String, data: Null, fromCache: Boolean): DocumentSnapshot[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("documentSnapshot")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], fromCache.asInstanceOf[js.Any])).asInstanceOf[DocumentSnapshot[DocumentData]]
  inline def documentSnapshot(path: String, data: JsonObject[Any], fromCache: Boolean): DocumentSnapshot[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("documentSnapshot")(path.asInstanceOf[js.Any], data.asInstanceOf[js.Any], fromCache.asInstanceOf[js.Any])).asInstanceOf[DocumentSnapshot[DocumentData]]
  
  inline def firestore(): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("firestore")().asInstanceOf[Firestore]
  
  inline def newTestFirestore(): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")().asInstanceOf[Firestore]
  inline def newTestFirestore(projectId: String): Firestore = ^.asInstanceOf[js.Dynamic].applyDynamic("newTestFirestore")(projectId.asInstanceOf[js.Any]).asInstanceOf[Firestore]
  
  inline def query(path: String): Query_[DocumentData] = ^.asInstanceOf[js.Dynamic].applyDynamic("query")(path.asInstanceOf[js.Any]).asInstanceOf[Query_[DocumentData]]
  
  inline def querySnapshot(
    path: String,
    oldDocs: StringDictionary[JsonObject[Any]],
    docsToAdd: StringDictionary[JsonObject[Any]],
    mutatedKeys: DocumentKeySet_,
    fromCache: Boolean,
    syncStateChanged: Boolean
  ): QuerySnapshot[DocumentData] = (^.asInstanceOf[js.Dynamic].applyDynamic("querySnapshot")(path.asInstanceOf[js.Any], oldDocs.asInstanceOf[js.Any], docsToAdd.asInstanceOf[js.Any], mutatedKeys.asInstanceOf[js.Any], fromCache.asInstanceOf[js.Any], syncStateChanged.asInstanceOf[js.Any])).asInstanceOf[QuerySnapshot[DocumentData]]
}
