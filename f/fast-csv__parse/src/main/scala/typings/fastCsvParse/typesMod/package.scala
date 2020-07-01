package typings.fastCsvParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesMod {
  type AsyncRowTransform[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */] = js.Function2[
    /* row */ I, 
    /* cb */ typings.fastCsvParse.typesMod.RowTransformCallback[O], 
    scala.Unit
  ]
  type AsyncRowValidate[R /* <: typings.fastCsvParse.typesMod.Row[_] */] = js.Function2[/* row */ R, /* cb */ typings.fastCsvParse.typesMod.RowValidateCallback, scala.Unit]
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  type HeaderTransformFunction = js.Function1[
    /* headers */ typings.fastCsvParse.typesMod.HeaderArray, 
    typings.fastCsvParse.typesMod.HeaderArray
  ]
  type Row[V] = typings.fastCsvParse.typesMod.RowMap[V] | typings.fastCsvParse.typesMod.RowArray[V]
  type RowArray[V] = js.Array[V]
  type RowMap[V] = typings.std.Record[java.lang.String, V]
  type RowTransformCallback[R /* <: typings.fastCsvParse.typesMod.Row[_] */] = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* row */ js.UndefOr[R], 
    scala.Unit
  ]
  type RowTransformFunction[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */] = (typings.fastCsvParse.typesMod.SyncRowTransform[I, O]) | (typings.fastCsvParse.typesMod.AsyncRowTransform[I, O])
  type RowValidate[R /* <: typings.fastCsvParse.typesMod.Row[_] */] = typings.fastCsvParse.typesMod.AsyncRowValidate[R] | typings.fastCsvParse.typesMod.SyncRowValidate[R]
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* isValid */ js.UndefOr[scala.Boolean], 
    /* reason */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type RowValidatorCallback[R /* <: typings.fastCsvParse.typesMod.Row[_] */] = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[typings.fastCsvParse.typesMod.RowValidationResult[R]], 
    scala.Unit
  ]
  type SyncRowTransform[I /* <: typings.fastCsvParse.typesMod.Row[_] */, O /* <: typings.fastCsvParse.typesMod.Row[_] */] = js.Function1[/* row */ I, O]
  type SyncRowValidate[R /* <: typings.fastCsvParse.typesMod.Row[_] */] = js.Function1[/* row */ R, scala.Boolean]
}
