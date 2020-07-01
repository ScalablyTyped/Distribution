package typings.firebaseFirestore

import typings.firebaseAuthInteropTypes.mod.FirebaseAuthInternalName
import typings.firebaseComponent.mod.Provider
import typings.firebaseFirestore.databaseInfoMod.DatabaseId
import typings.firebaseFirestore.datastoreMod.Datastore
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/lite/src/api/database", JSImport.Namespace)
@js.native
object databaseMod extends js.Object {
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore * / any */ @js.native
  class Firestore protected () extends js.Object {
    def this(
      app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any,
      authProvider: Provider[FirebaseAuthInternalName]
    ) = this()
    val _credentials: js.Any = js.native
    val _databaseId: DatabaseId = js.native
    var _datastorePromise: js.UndefOr[js.Any] = js.native
    val _firebaseApp: js.Any = js.native
    var _makeDatabaseInfo: js.Any = js.native
    var _settings: js.UndefOr[js.Any] = js.native
    def _configureClient(
      settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Settings */ js.Any
    ): Unit = js.native
    def _getDatastore(): js.Promise[Datastore] = js.native
    def _getSettings(): js.Any = js.native
    def app: js.Any = js.native
  }
  
  def getFirestore(
    app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any
  ): Firestore = js.native
  def initializeFirestore(
    app: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify FirebaseApp */ js.Any,
    settings: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.Settings */ js.Any
  ): Firestore = js.native
  def terminate(
    firestore: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify firestore.FirebaseFirestore */ js.Any
  ): js.Promise[Unit] = js.native
  /* static members */
  @js.native
  object Firestore extends js.Object {
    var databaseIdFromApp: js.Any = js.native
  }
  
}

