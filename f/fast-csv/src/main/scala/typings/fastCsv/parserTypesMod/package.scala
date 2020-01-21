package typings.fastCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object parserTypesMod {
  type AsyncRowTransform = js.Function2[
    /* row */ typings.fastCsv.parserTypesMod.Row, 
    /* cb */ typings.fastCsv.parserTypesMod.RowTransformCallback, 
    scala.Unit
  ]
  type AsyncRowValidate = js.Function2[
    /* row */ typings.fastCsv.parserTypesMod.Row, 
    /* cb */ typings.fastCsv.parserTypesMod.RowValidateCallback, 
    scala.Unit
  ]
  type HeaderArray = js.Array[js.UndefOr[java.lang.String | scala.Null]]
  type HeaderTransformFunction = js.Function1[
    /* headers */ typings.fastCsv.parserTypesMod.HeaderArray, 
    typings.fastCsv.parserTypesMod.HeaderArray
  ]
  type Row = typings.fastCsv.parserTypesMod.RowMap | typings.fastCsv.parserTypesMod.RowArray
  type RowArray = js.Array[java.lang.String]
  type RowMap = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  type RowTransformCallback = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* row */ js.UndefOr[typings.fastCsv.parserTypesMod.Row], 
    scala.Unit
  ]
  type RowTransformFunction = typings.fastCsv.parserTypesMod.SyncRowTransform | typings.fastCsv.parserTypesMod.AsyncRowTransform
  type RowValidate = typings.fastCsv.parserTypesMod.AsyncRowValidate | typings.fastCsv.parserTypesMod.SyncRowValidate
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[typings.std.Error | scala.Null], 
    /* isValid */ js.UndefOr[scala.Boolean], 
    /* reason */ js.UndefOr[java.lang.String], 
    scala.Unit
  ]
  type RowValidatorCallback = js.Function2[
    /* error */ typings.std.Error | scala.Null, 
    /* result */ js.UndefOr[typings.fastCsv.parserTypesMod.RowValidationResult], 
    scala.Unit
  ]
  type SyncRowTransform = js.Function1[/* row */ typings.fastCsv.parserTypesMod.Row, typings.fastCsv.parserTypesMod.Row]
  type SyncRowValidate = js.Function1[/* row */ typings.fastCsv.parserTypesMod.Row, scala.Boolean]
}
