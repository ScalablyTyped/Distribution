package typings.firebaseFirestore

import typings.firebaseFirestore.anon.`39`
import typings.firebaseFirestore.distPackagesFirestoreSrcApiMod.Query_
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getCountFromServer(query: Query_[Any]): js.Promise[AggregateQuerySnapshot[`39`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[`39`]]]
}
