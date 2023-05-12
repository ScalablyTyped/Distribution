package typings.firebaseFirestore.distPackagesFirestoreDistIndexDotesm2017Mod

import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * An implementation of `SyncEngine` coordinating with other parts of SDK.
  *
  * The parts of SyncEngine that act as a callback to RemoteStore need to be
  * registered individually. This is done in `syncEngineWrite()` and
  * `syncEngineListen()` (as well as `applyPrimaryState()`) as these methods
  * serve as entry points to RemoteStore's functionality.
  *
  * Note: some field defined in this class might have public access level, but
  * the class is not exported so they are only accessible from this module.
  * This is useful to implement optional features (like bundles) in free
  * functions, such that they are tree-shakeable.
  */ @js.native
trait Kc extends StObject {
  
  var Ec: lo = js.native
  
  /** Stores user callbacks waiting for all pending writes to be acknowledged. */
  var Tc: Map[Any, Any] = js.native
  
  var _c: Map[Any, Any] = js.native
  
  var currentUser: Any = js.native
  
  var dc: os = js.native
  
  var eventManager: Any = js.native
  
  /**
    * Keeps track of the information about an active limbo resolution for each
    * active target ID that was started for the purpose of limbo resolution.
    */
  var gc: Map[Any, Any] = js.native
  
  def isPrimaryClient: Boolean = js.native
  
  var localStore: Any = js.native
  
  var maxConcurrentLimboResolutions: Any = js.native
  
  /**
    * Keeps track of the target ID for each document that is in limbo with an
    * active target.
    */
  var mc: pe = js.native
  
  var onlineState: String = js.native
  
  var remoteStore: Any = js.native
  
  var sharedClientState: Any = js.native
  
  /**
    * The keys of documents that are in limbo for which we haven't yet started a
    * limbo resolution query. The strings in this set are the result of calling
    * `key.path.canonicalString()` where `key` is a `DocumentKey` object.
    *
    * The `Set` type was chosen because it provides efficient lookup and removal
    * of arbitrary elements and it also maintains insertion order, providing the
    * desired queue-like FIFO semantics.
    */
  var wc: Set[Any] = js.native
  
  var yc: o = js.native
}
