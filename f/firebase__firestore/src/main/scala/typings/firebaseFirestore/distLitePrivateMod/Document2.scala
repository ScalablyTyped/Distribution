package typings.firebaseFirestore.distLitePrivateMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a document in Firestore with a key, version, data and whether the
  * data has local mutations applied to it.
  */
@js.native
trait Document2 extends StObject {
  
  /** The underlying data of this document or an empty value if no data exists. */
  val data: ObjectValue = js.native
  
  /** Returns whether mutations were applied based on a write acknowledgment. */
  val hasCommittedMutations: Boolean = js.native
  
  /** Returns whether local mutations were applied via the mutation queue. */
  val hasLocalMutations: Boolean = js.native
  
  /**
    * Whether this document had a local mutation applied that has not yet been
    * acknowledged by Watch.
    */
  val hasPendingWrites: Boolean = js.native
  
  def isEqual(): Boolean = js.native
  def isEqual(other: Document2): Boolean = js.native
  
  /**
    * Returns whether the document exists and its data is known at the current
    * version.
    */
  def isFoundDocument(): Boolean = js.native
  
  /**
    * Returns whether the document is known to not exist at the current version.
    */
  def isNoDocument(): Boolean = js.native
  
  /**
    * Returns whether the document exists and its data is unknown at the current
    * version.
    */
  def isUnknownDocument(): Boolean = js.native
  
  /**
    * Returns whether this document is valid (i.e. it is an entry in the
    * RemoteDocumentCache, was created by a mutation or read from the backend).
    */
  def isValidDocument(): Boolean = js.native
  
  /** The key for this document */
  val key: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DocumentKey */ Any = js.native
  
  /** Creates a mutable copy of this document. */
  def mutableCopy(): MutableDocument = js.native
  
  /**
    * The timestamp at which this document was read from the remote server. Uses
    * `SnapshotVersion.min()` for documents created by the user.
    */
  val readTime: SnapshotVersion = js.native
  
  /**
    * The version of this document if it exists or a version at which this
    * document was guaranteed to not exist.
    */
  val version: SnapshotVersion = js.native
}
