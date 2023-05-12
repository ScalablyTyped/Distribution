package typings.firebaseFirestore.distLitePackagesFirestoreSrcIndexDotnodeMod

import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distLitePackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/packages/firestore/src/index.node", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
  extends typings.firebaseFirestore.distLitePackagesFirestoreSrcApiMod.AggregateQuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    query: Query[Any],
    _userDataWriter: typings.firebaseFirestore.distLitePackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    _data: ApiClientObjectMap[Value]
  ) = this()
}
