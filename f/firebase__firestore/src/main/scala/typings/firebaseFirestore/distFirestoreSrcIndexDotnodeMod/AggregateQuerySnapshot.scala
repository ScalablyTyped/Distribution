package typings.firebaseFirestore.distFirestoreSrcIndexDotnodeMod

import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/src/index.node", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
  extends typings.firebaseFirestore.distFirestoreSrcApiMod.AggregateQuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    query: Query[Any],
    _userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    _data: ApiClientObjectMap[Value]
  ) = this()
}
