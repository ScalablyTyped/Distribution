package typings.firebaseFirestore

import typings.firebaseFirestore.distFirestoreSrcLiteApiDatabaseMod.Firestore
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.CollectionReference
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentData
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.DocumentReference
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.PartialWithFieldValue
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.SetOptions
import typings.firebaseFirestore.distFirestoreSrcLiteApiSettingsMod.FirestoreSettings
import typings.firebaseFirestore.distFirestoreSrcLiteApiSnapshotMod.QueryDocumentSnapshot
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreTestLiteHelpersMod {
  
  @JSImport("@firebase/firestore/dist/firestore/test/lite/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/test/lite/helpers", "Post")
  @js.native
  open class Post protected () extends StObject {
    def this(title: String, author: String) = this()
    def this(title: String, author: String, id: Double) = this()
    
    val author: String = js.native
    
    def byline(): String = js.native
    
    val id: Double = js.native
    
    val title: String = js.native
  }
  
  object postConverter {
    
    @JSImport("@firebase/firestore/dist/firestore/test/lite/helpers", "postConverter")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): Post = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFirestore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[Post]
    
    inline def toFirestore(post: Post): DocumentData = ^.asInstanceOf[js.Dynamic].applyDynamic("toFirestore")(post.asInstanceOf[js.Any]).asInstanceOf[DocumentData]
  }
  
  object postConverterMerge {
    
    @JSImport("@firebase/firestore/dist/firestore/test/lite/helpers", "postConverterMerge")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromFirestore(snapshot: QueryDocumentSnapshot[DocumentData]): Post = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFirestore")(snapshot.asInstanceOf[js.Any]).asInstanceOf[Post]
    
    inline def toFirestore(post: PartialWithFieldValue[Post]): DocumentData = ^.asInstanceOf[js.Dynamic].applyDynamic("toFirestore")(post.asInstanceOf[js.Any]).asInstanceOf[DocumentData]
    inline def toFirestore(post: PartialWithFieldValue[Post], options: SetOptions): DocumentData = (^.asInstanceOf[js.Dynamic].applyDynamic("toFirestore")(post.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[DocumentData]
  }
  
  inline def withTestCollection(fn: js.Function1[/* collRef */ CollectionReference[DocumentData], Unit | js.Promise[Unit]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestCollection")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestCollectionAndInitialData(
    data: js.Array[DocumentData],
    fn: js.Function1[/* collRef */ CollectionReference[DocumentData], Unit | js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestCollectionAndInitialData")(data.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDb(fn: js.Function1[/* db */ Firestore, Unit | js.Promise[Unit]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestDb")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDbSettings(
    projectId: String,
    settings: FirestoreSettings,
    fn: js.Function1[/* db */ Firestore, Unit | js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDbSettings")(projectId.asInstanceOf[js.Any], settings.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDoc(fn: js.Function1[/* doc */ DocumentReference[DocumentData], Unit | js.Promise[Unit]]): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("withTestDoc")(fn.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  inline def withTestDocAndInitialData(
    data: DocumentData,
    fn: js.Function1[/* doc */ DocumentReference[DocumentData], Unit | js.Promise[Unit]]
  ): js.Promise[Unit] = (^.asInstanceOf[js.Dynamic].applyDynamic("withTestDocAndInitialData")(data.asInstanceOf[js.Any], fn.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Unit]]
}
