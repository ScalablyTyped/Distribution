package typings.dexie.mod

import org.scalablytyped.runtime.StringDictionary
import typings.dexie.mod.^
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def liveQuery[T](querier: js.Function0[T | js.Promise[T]]): Observable[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("liveQuery")(querier.asInstanceOf[js.Any]).asInstanceOf[Observable[T]]

inline def mergeRanges(target: IntervalTree, newSet: IntervalTree): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeRanges")(target.asInstanceOf[js.Any], newSet.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def rangesOverlap(rangeSet1: IntervalTree, rangeSet2: IntervalTree): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rangesOverlap")(rangeSet1.asInstanceOf[js.Any], rangeSet2.asInstanceOf[js.Any])).asInstanceOf[Boolean]

type DbSchema = StringDictionary[TableSchema]

type IndexableType = IndexableTypePart | IndexableTypeArrayReadonly

type IndexableTypeArray = js.Array[IndexableTypePart]

type IndexableTypeArrayReadonly = js.Array[IndexableTypePart]

type IndexableTypePart = String | Double | js.Date | js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | js.typedarray.DataView | js.Array[js.Array[Unit]]

type ObservabilitySet = // `idb:${dbName}/${tableName}/changedRowContents` - keys.
// `idb:${dbName}/${tableName}/changedIndexes/${indexName}` - indexes
StringDictionary[IntervalTree]

type ThenShortcut[T, TResult] = js.Function1[/* value */ T, TResult | PromiseLike[TResult]]

type _Collection[T, TKey] = Collection[T, TKey]

type _Table[T, TKey] = Table[T, TKey]
