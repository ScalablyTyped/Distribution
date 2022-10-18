package typings.firebaseFirestore

import typings.firebaseFirestore.distLiteFirestoreSrcCoreTargetMod.Target
import typings.firebaseFirestore.distLiteFirestoreSrcModelFieldIndexMod.FieldIndex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLiteFirestoreSrcModelTargetIndexMatcherMod {
  
  @JSImport("@firebase/firestore/dist/lite/firestore/src/model/target_index_matcher", "TargetIndexMatcher")
  @js.native
  open class TargetIndexMatcher protected () extends StObject {
    def this(target: Target) = this()
    
    /* private */ val collectionId: Any = js.native
    
    /* private */ val equalityFilters: Any = js.native
    
    /* private */ var hasMatchingEqualityFilter: Any = js.native
    
    /* private */ val inequalityFilter: Any = js.native
    
    /* private */ var matchesFilter: Any = js.native
    
    /* private */ var matchesOrderBy: Any = js.native
    
    /* private */ val orderBys: Any = js.native
    
    /**
      * Returns whether the index can be used to serve the TargetIndexMatcher's
      * target.
      *
      * An index is considered capable of serving the target when:
      * - The target uses all index segments for its filters and orderBy clauses.
      *   The target can have additional filter and orderBy clauses, but not
      *   fewer.
      * - If an ArrayContains/ArrayContainsAnyfilter is used, the index must also
      *   have a corresponding `CONTAINS` segment.
      * - All directional index segments can be mapped to the target as a series of
      *   equality filters, a single inequality filter and a series of orderBy
      *   clauses.
      * - The segments that represent the equality filters may appear out of order.
      * - The optional segment for the inequality filter must appear after all
      *   equality segments.
      * - The segments that represent that orderBy clause of the target must appear
      *   in order after all equality and inequality segments. Single orderBy
      *   clauses cannot be skipped, but a continuous orderBy suffix may be
      *   omitted.
      */
    def servedByIndex(index: FieldIndex): Boolean = js.native
  }
}
