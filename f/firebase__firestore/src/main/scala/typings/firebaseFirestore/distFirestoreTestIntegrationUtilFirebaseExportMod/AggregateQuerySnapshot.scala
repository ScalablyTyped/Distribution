package typings.firebaseFirestore.distFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/firestore/test/integration/util/firebase_export", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
  extends typings.firebaseFirestore.distFirestoreSrcMod.AggregateQuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    query: Query[Any],
    _userDataWriter: typings.firebaseFirestore.distFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    _data: ApiClientObjectMap[Value]
  ) = this()
}
