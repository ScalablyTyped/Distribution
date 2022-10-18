package typings.firebaseDatabase.distInternalMod

import typings.firebaseApp.mod.FirebaseApp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify _FirebaseService * / any */ @JSImport("@firebase/database/dist/internal", "Database")
@js.native
open class Database protected () extends StObject {
  /** @hideconstructor */
  def this(
    _repoInternal: Repo,
    /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
  app: FirebaseApp
  ) = this()
  
  def _checkNotDeleted(apiName: String): Unit = js.native
  
  def _delete(): js.Promise[Unit] = js.native
  
  /** Track if the instance has been used (root or repo accessed) */
  var _instanceStarted: Boolean = js.native
  
  def _repo: Repo = js.native
  
  var _repoInternal: Repo = js.native
  
  def _root: ReferenceImpl = js.native
  
  /** Backing state for root_ */
  /* private */ var _rootInternal: Any = js.native
  
  /** The {@link @firebase/app#FirebaseApp} associated with this Realtime Database instance. */
  val app: FirebaseApp = js.native
  
  /** Represents a `Database` instance. */
  val `type`: /* "database" */ String = js.native
}
