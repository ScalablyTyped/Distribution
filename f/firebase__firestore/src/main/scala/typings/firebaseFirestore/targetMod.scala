package typings.firebaseFirestore

import typings.firebaseFirestore.pathMod.ResourcePath
import typings.firebaseFirestore.queryMod.Bound
import typings.firebaseFirestore.queryMod.Filter
import typings.firebaseFirestore.queryMod.OrderBy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@firebase/firestore/dist/packages/firestore/src/core/target", JSImport.Namespace)
@js.native
object targetMod extends js.Object {
  @js.native
  class Target protected () extends js.Object {
    protected def this(path: ResourcePath, collectionGroup: String, orderBy: js.Array[OrderBy], filters: js.Array[Filter]) = this()
    protected def this(path: ResourcePath, collectionGroup: Null, orderBy: js.Array[OrderBy], filters: js.Array[Filter]) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double,
      startAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Null,
      startAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double,
      startAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Null,
      startAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double,
      startAt: Null,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double,
      startAt: Bound,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Null,
      startAt: Null,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: String,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Null,
      startAt: Bound,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double,
      startAt: Null,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Double,
      startAt: Bound,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Null,
      startAt: Null,
      endAt: Bound
    ) = this()
    protected def this(
      path: ResourcePath,
      collectionGroup: Null,
      orderBy: js.Array[OrderBy],
      filters: js.Array[Filter],
      limit: Null,
      startAt: Bound,
      endAt: Bound
    ) = this()
    val collectionGroup: String | Null = js.native
    val endAt: Bound | Null = js.native
    val filters: js.Array[Filter] = js.native
    val limit: Double | Null = js.native
    val orderBy: js.Array[OrderBy] = js.native
    val path: ResourcePath = js.native
    val startAt: Bound | Null = js.native
  }
  
  def canonifyTarget(target: Target): String = js.native
  def isDocumentTarget(target: Target): Boolean = js.native
  def newTarget(
    path: ResourcePath,
    collectionGroup: js.UndefOr[Null | String],
    orderBy: js.UndefOr[js.Array[OrderBy]],
    filters: js.UndefOr[js.Array[Filter]],
    limit: js.UndefOr[Double | Null],
    startAt: js.UndefOr[Bound | Null],
    endAt: js.UndefOr[Bound | Null]
  ): Target = js.native
  def stringifyTarget(target: Target): String = js.native
  def targetEquals(left: Target, right: Target): Boolean = js.native
}

