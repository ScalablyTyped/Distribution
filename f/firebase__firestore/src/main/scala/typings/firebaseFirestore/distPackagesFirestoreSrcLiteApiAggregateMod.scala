package typings.firebaseFirestore

import typings.firebaseFirestore.anon.`39`
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateField
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateQuerySnapshot
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiAggregateTypesMod.AggregateSpec
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiFieldPathMod.FieldPath
import typings.firebaseFirestore.distPackagesFirestoreSrcLiteApiReferenceMod.Query
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distPackagesFirestoreSrcLiteApiAggregateMod {
  
  @JSImport("@firebase/firestore/dist/packages/firestore/src/lite-api/aggregate", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def aggregateFieldEqual(left: AggregateField[Any], right: AggregateField[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateFieldEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def aggregateQuerySnapshotEqual[T /* <: AggregateSpec */](left: AggregateQuerySnapshot[T], right: AggregateQuerySnapshot[T]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("aggregateQuerySnapshotEqual")(left.asInstanceOf[js.Any], right.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def average(field: String): AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double | Null]]
  inline def average(field: FieldPath): AggregateField[Double | Null] = ^.asInstanceOf[js.Dynamic].applyDynamic("average")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double | Null]]
  
  inline def count(): AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("count")().asInstanceOf[AggregateField[Double]]
  
  inline def getAggregate[T /* <: AggregateSpec */](query: Query[Any], aggregateSpec: T): js.Promise[AggregateQuerySnapshot[T]] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAggregate")(query.asInstanceOf[js.Any], aggregateSpec.asInstanceOf[js.Any])).asInstanceOf[js.Promise[AggregateQuerySnapshot[T]]]
  
  inline def getCount(query: Query[Any]): js.Promise[AggregateQuerySnapshot[`39`]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getCount")(query.asInstanceOf[js.Any]).asInstanceOf[js.Promise[AggregateQuerySnapshot[`39`]]]
  
  inline def sum(field: String): AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double]]
  inline def sum(field: FieldPath): AggregateField[Double] = ^.asInstanceOf[js.Dynamic].applyDynamic("sum")(field.asInstanceOf[js.Any]).asInstanceOf[AggregateField[Double]]
}
