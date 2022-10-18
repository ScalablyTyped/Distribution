package typings.firebaseFirestore

import typings.firebaseFirestore.anon.CountAggregateField
import typings.firebaseFirestore.distFirestoreSrcApiMod.Query_
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getCountFromServer(query: Query_[Any]): js.Promise[AggregateQuerySnapshot[CountAggregateField]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCountFromServer")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[CountAggregateField]]]
}
