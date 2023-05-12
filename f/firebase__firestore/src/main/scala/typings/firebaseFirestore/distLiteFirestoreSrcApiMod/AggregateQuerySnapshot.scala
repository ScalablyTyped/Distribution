package typings.firebaseFirestore.distLiteFirestoreSrcApiMod

import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distLiteFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distLiteFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/lite/firestore/src/api", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
  extends typings.firebaseFirestore.distLiteFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    query: Query[Any],
    _userDataWriter: typings.firebaseFirestore.distLiteFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    _data: ApiClientObjectMap[Value]
  ) = this()
}
