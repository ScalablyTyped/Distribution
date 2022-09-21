package typings.firebaseFirestore

import typings.firebaseFirestore.firestoreSrcAuthUserMod.User
import typings.firebaseFirestore.firestoreSrcCoreDatabaseInfoMod.DatabaseId
import typings.firebaseFirestore.firestoreSrcLocalIndexManagerMod.IndexManager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object firestoreSrcLocalIndexeddbIndexManagerMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/local/indexeddb_index_manager", "IndexedDbIndexManager")
  @js.native
  open class IndexedDbIndexManager protected ()
    extends StObject
       with IndexManager {
    def this(user: User, databaseId: DatabaseId) = this()
    
    /* private */ var addIndexEntry: Any = js.native
    
    /**
      * An in-memory copy of the index entries we've already written since the SDK
      * launched. Used to avoid re-writing the same entry repeatedly.
      *
      * This is *NOT* a complete cache of what's in persistence and so can never be
      * used to satisfy reads.
      */
    /* private */ var collectionParentsCache: Any = js.native
    
    /** Creates the index entries for the given document. */
    /* private */ var computeIndexEntries: Any = js.native
    
    /**
      * Returns a new set of IDB ranges that splits the existing range and excludes
      * any values that match the `notInValue` from these ranges. As an example,
      * '[foo > 2 && foo != 3]` becomes  `[foo > 2 && < 3, foo > 3]`.
      */
    /* private */ var createRange: Any = js.native
    
    /* private */ val databaseId: Any = js.native
    
    /* private */ var deleteIndexEntry: Any = js.native
    
    /**
      * Encodes the given bounds according to the specification in `target`. For IN
      * queries, a list of possible values is returned.
      */
    /* private */ var encodeBound: Any = js.native
    
    /**
      * Returns the byte encoded form of the directional values in the field index.
      * Returns `null` if the document does not have all fields specified in the
      * index.
      */
    /* private */ var encodeDirectionalElements: Any = js.native
    
    /**
      * Returns an encoded form of the document key that sorts based on the key
      * ordering of the field index.
      */
    /* private */ var encodeDirectionalKey: Any = js.native
    
    /** Encodes a single value to the ascending index format. */
    /* private */ var encodeSingleElement: Any = js.native
    
    /**
      * Encodes the given field values according to the specification in `target`.
      * For IN queries, a list of possible values is returned.
      */
    /* private */ var encodeValues: Any = js.native
    
    /**
      * Creates a separate encoder for each element of an array.
      *
      * The method appends each value to all existing encoders (e.g. filter("a",
      * "==", "a1").filter("b", "in", ["b1", "b2"]) becomes ["a1,b1", "a1,b2"]). A
      * list of new encoders is returned.
      */
    /* private */ var expandIndexValues: Any = js.native
    
    /**
      * Constructs a key range query on `DbIndexEntryStore` that unions all
      * bounds.
      */
    /* private */ var generateIndexRanges: Any = js.native
    
    /** Generates the lower bound for `arrayValue` and `directionalValue`. */
    /* private */ var generateLowerBound: Any = js.native
    
    /** Generates the upper bound for `arrayValue` and `directionalValue`. */
    /* private */ var generateUpperBound: Any = js.native
    
    /** Returns the byte representation for the provided encoders. */
    /* private */ var getEncodedBytes: Any = js.native
    
    /* private */ var getExistingIndexEntries: Any = js.native
    
    /* private */ var getFieldIndex: Any = js.native
    
    /* private */ var getNextSequenceNumber: Any = js.native
    
    /* private */ var getSubTargets: Any = js.native
    
    /* private */ var isInFilter: Any = js.native
    
    /**
      * Maps from a target to its equivalent list of sub-targets. Each sub-target
      * contains only one term from the target's disjunctive normal form (DNF).
      */
    /* private */ var targetToDnfSubTargets: Any = js.native
    
    /* private */ var uid: Any = js.native
    
    /**
      * Updates the index entries for the provided document by deleting entries
      * that are no longer referenced in `newEntries` and adding all newly added
      * entries.
      */
    /* private */ var updateEntries: Any = js.native
    
    /* private */ var user: Any = js.native
  }
}
