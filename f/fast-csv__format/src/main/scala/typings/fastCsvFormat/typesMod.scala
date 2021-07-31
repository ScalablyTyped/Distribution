package typings.fastCsvFormat

import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  @JSImport("@fast-csv/format/build/src/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isSyncTransform[I /* <: Row */, O /* <: Row */](transform: RowTransformFunction[I, O]): /* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSyncTransform")(transform.asInstanceOf[js.Any]).asInstanceOf[/* is @fast-csv/format.@fast-csv/format/build/src/types.SyncRowTransform<I, O> */ Boolean]
  
  type AsyncRowTransform[I /* <: Row */, O /* <: Row */] = js.Function2[/* row */ I, /* cb */ RowTransformCallback[O], Unit]
  
  type Row = RowArray | RowHashArray[js.Any] | RowMap[js.Any]
  
  type RowArray = js.Array[String]
  
  type RowHashArray[V] = js.Array[js.Tuple2[String, V]]
  
  type RowMap[V] = Record[String, V]
  
  type RowTransformCallback[R /* <: Row */] = js.Function2[/* error */ js.UndefOr[Error | Null], /* row */ js.UndefOr[R], Unit]
  
  type RowTransformFunction[I /* <: Row */, O /* <: Row */] = (SyncRowTransform[I, O]) | (AsyncRowTransform[I, O])
  
  type SyncRowTransform[I /* <: Row */, O /* <: Row */] = js.Function1[/* row */ I, O]
}
