package typings.firebaseFirestore.distPackagesFirestoreTestIntegrationUtilFirebaseExportMod

import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.ApiClientObjectMap
import typings.firebaseFirestore.distPackagesFirestoreSrcProtosFirestoreProtoApiMod.Value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@firebase/firestore/dist/packages/firestore/test/integration/util/firebase_export", "AggregateQuerySnapshot")
@js.native
open class AggregateQuerySnapshot[T /* <: AggregateSpec */] protected ()
  extends typings.firebaseFirestore.distPackagesFirestoreSrcMod.AggregateQuerySnapshot[T] {
  /** @hideconstructor */
  def this(
    query: Query[Any],
    _userDataWriter: typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiUserDataWriterMod.AbstractUserDataWriter,
    _data: ApiClientObjectMap[Value]
  ) = this()
}
