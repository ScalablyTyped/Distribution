package typings.firebaseFirestore

import typings.firebaseFirestore.distLitePackagesFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexManagerMod.IndexManager
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalIndexManagerMod.IndexType
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLocalPersistenceMod.Persistence
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelCollectionsMod.DocumentMap_
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelDocumentKeyMod.DocumentKey
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelFieldIndexMod.FieldIndex
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelFieldIndexMod.IndexOffset
import typings.firebaseFirestore.distLitePackagesFirestoreSrcModelPathMod.ResourcePath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLitePackagesFirestoreTestUnitLocalTestIndexManagerMod {
  
  @JSImport("@firebase/firestore/dist/lite/packages/firestore/test/unit/local/test_index_manager", "TestIndexManager")
  @js.native
  open class TestIndexManager protected () extends StObject {
    def this(persistence: Persistence, indexManager: IndexManager) = this()
    
    def addFieldIndex(index: FieldIndex): js.Promise[Unit] = js.native
    
    def addToCollectionParentIndex(collectionPath: ResourcePath): js.Promise[Unit] = js.native
    
    def deleteFieldIndex(index: FieldIndex): js.Promise[Unit] = js.native
    
    def getCollectionParents(collectionId: String): js.Promise[js.Array[ResourcePath]] = js.native
    
    def getDocumentsMatchingTarget(target: Target): js.Promise[js.Array[DocumentKey] | Null] = js.native
    
    def getFieldIndexes(): js.Promise[js.Array[FieldIndex]] = js.native
    def getFieldIndexes(collectionGroup: String): js.Promise[js.Array[FieldIndex]] = js.native
    
    def getIndexType(target: Target): js.Promise[IndexType] = js.native
    
    def getNextCollectionGroupToUpdate(): js.Promise[String | Null] = js.native
    
    var indexManager: IndexManager = js.native
    
    var persistence: Persistence = js.native
    
    def updateCollectionGroup(collectionGroup: String, offset: IndexOffset): js.Promise[Unit] = js.native
    
    def updateIndexEntries(documents: DocumentMap_): js.Promise[Unit] = js.native
  }
}
