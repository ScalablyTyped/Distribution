package typings.firebaseFirestore

import typings.firebaseFirestore.anon.CountAggregateField
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typings.firebaseFirestore.distFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distFirestoreSrcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFirestoreSrcLiteApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/firestore/src/lite-api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def getCount(query: Query[Any]): js.Promise[AggregateQuerySnapshot[CountAggregateField]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[CountAggregateField]]]
}
