package typings.firebaseFirestore

import typings.firebaseFirestore.documentKeyMod.DocumentKey
import typings.firebaseFirestore.objectValueMod.ObjectValue
import typings.firebaseFirestore.pathMod.FieldPath
import typings.firebaseFirestore.snapshotVersionMod.SnapshotVersion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/document", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@firebase/firestore/dist/firestore/src/model/document", "MutableDocument")
  @js.native
  /* private */ open class MutableDocument ()
    extends StObject
       with Document {
    
    /**
      * Changes the document type to indicate that it exists and that its version
      * and data are known.
      */
    def convertToFoundDocument(version: SnapshotVersion, value: ObjectValue): MutableDocument = js.native
    
    /**
      * Changes the document type to indicate that it doesn't exist at the given
      * version.
      */
    def convertToNoDocument(version: SnapshotVersion): MutableDocument = js.native
    
    /**
      * Changes the document type to indicate that it exists at a given version but
      * that its data is not known (e.g. a document that was updated without a known
      * base document).
      */
    def convertToUnknownDocument(version: SnapshotVersion): MutableDocument = js.native
    
    /* private */ var documentState: Any = js.native
    
    /* private */ var documentType: Any = js.native
    
    @JSName("hasCommittedMutations")
    def hasCommittedMutations_MMutableDocument: Boolean = js.native
    
    @JSName("hasLocalMutations")
    def hasLocalMutations_MMutableDocument: Boolean = js.native
    
    @JSName("hasPendingWrites")
    def hasPendingWrites_MMutableDocument: Boolean = js.native
    
    def setHasCommittedMutations(): MutableDocument = js.native
    
    def setHasLocalMutations(): MutableDocument = js.native
    
    def setReadTime(readTime: SnapshotVersion): MutableDocument = js.native
  }
  /* static members */
  object MutableDocument {
    
    @JSImport("@firebase/firestore/dist/firestore/src/model/document", "MutableDocument")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new document that is known to exist with the given data at the
      * given version.
      */
    inline def newFoundDocument(documentKey: DocumentKey, version: SnapshotVersion, value: ObjectValue): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("newFoundDocument")(documentKey.asInstanceOf[js.Any], version.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
    
    /**
      * Creates a document with no known version or data, but which can serve as
      * base document for mutations.
      */
    inline def newInvalidDocument(documentKey: DocumentKey): MutableDocument = ^.asInstanceOf[js.Dynamic].applyDynamic("newInvalidDocument")(documentKey.asInstanceOf[js.Any]).asInstanceOf[MutableDocument]
    
    /** Creates a new document that is known to not exist at the given version. */
    inline def newNoDocument(documentKey: DocumentKey, version: SnapshotVersion): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("newNoDocument")(documentKey.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
    
    /**
      * Creates a new document that is known to exist at the given version but
      * whose data is not known (e.g. a document that was updated without a known
      * base document).
      */
    inline def newUnknownDocument(documentKey: DocumentKey, version: SnapshotVersion): MutableDocument = (^.asInstanceOf[js.Dynamic].applyDynamic("newUnknownDocument")(documentKey.asInstanceOf[js.Any], version.asInstanceOf[js.Any])).asInstanceOf[MutableDocument]
  }
  
  inline def compareDocumentsByField(field: FieldPath, d1: Document, d2: Document): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("compareDocumentsByField")(field.asInstanceOf[js.Any], d1.asInstanceOf[js.Any], d2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @js.native
  trait Document extends StObject {
    
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
    def isEqual(other: Document): Boolean = js.native
    
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
    val key: DocumentKey = js.native
    
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
}
