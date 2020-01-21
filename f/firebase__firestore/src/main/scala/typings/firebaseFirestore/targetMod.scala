package typings.firebaseFirestore

import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.queryMod.Bound
import typings.firebaseFirestore.queryMod.Filter
import typings.firebaseFirestore.queryMod.OrderBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/lib/src/core/target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  @js.native
  class Target protected () extends js.Object {
    /**
      * Initializes a Target with a path and optional additional query constraints.
      * Path must currently be empty if this is a collection group query.
      *
      * NOTE: you should always construct `Target` from `Query.toTarget` instead of
      * using this constructor, because `Query` provides an implicit `orderBy`
      * property.
      */
    def this(
      path: ResourcePath,
      collectionGroup: js.UndefOr[Null | String],
      orderBy: js.UndefOr[js.Array[OrderBy]],
      filters: js.UndefOr[js.Array[Filter]],
      limit: js.UndefOr[Double | Null],
      startAt: js.UndefOr[Bound | Null],
      endAt: js.UndefOr[Bound | Null]
    ) = this()
    val collectionGroup: String | Null = js.native
    val endAt: Bound | Null = js.native
    val filters: js.Array[Filter] = js.native
    val limit: Double | Null = js.native
    var memoizedCanonicalId: js.Any = js.native
    val orderBy: js.Array[OrderBy] = js.native
    val path: ResourcePath = js.native
    val startAt: Bound | Null = js.native
    def canonicalId(): String = js.native
    def isDocumentQuery(): Boolean = js.native
    def isEqual(other: Target): Boolean = js.native
  }
  
}

