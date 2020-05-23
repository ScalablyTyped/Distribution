package typings.firebaseFirestore

import org.scalablytyped.runtime.StringDictionary
import typings.firebaseFirestore.collectionsMod.DocumentKeySet_
import typings.firebaseFirestore.databaseMod.CollectionReference
import typings.firebaseFirestore.databaseMod.DocumentReference
import typings.firebaseFirestore.databaseMod.DocumentSnapshot
import typings.firebaseFirestore.databaseMod.Firestore
import typings.firebaseFirestore.databaseMod.Query
import typings.firebaseFirestore.databaseMod.QuerySnapshot
import typings.firebaseFirestore.objectValueMod.JsonObject
import typings.firebaseFirestoreTypes.mod.DocumentData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/test/util/api_helpers", JSImport.Namespace)
@js.native
object apiHelpersMod extends js.Object {
  @JSName("FIRESTORE")
  val FIRESTORE_ : Firestore = js.native
  def collectionReference(path: String): CollectionReference[DocumentData] = js.native
  def documentReference(path: String): DocumentReference[DocumentData] = js.native
  def documentSnapshot(path: String, data: Null, fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def documentSnapshot(path: String, data: JsonObject[_], fromCache: Boolean): DocumentSnapshot[DocumentData] = js.native
  def firestore(): Firestore = js.native
  def query(path: String): Query[DocumentData] = js.native
  def querySnapshot(
    path: String,
    oldDocs: StringDictionary[JsonObject[_]],
    docsToAdd: StringDictionary[JsonObject[_]],
    mutatedKeys: DocumentKeySet_,
    fromCache: Boolean,
    syncStateChanged: Boolean
  ): QuerySnapshot[DocumentData] = js.native
}

