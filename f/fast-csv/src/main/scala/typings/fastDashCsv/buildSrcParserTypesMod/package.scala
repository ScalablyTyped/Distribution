package typings.fastDashCsv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object buildSrcParserTypesMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.std.Error

  type AsyncRowTransform = js.Function2[/* row */ Row, /* cb */ RowTransformCallback, Unit]
  type AsyncRowValidate = js.Function2[/* row */ Row, /* cb */ RowValidateCallback, Unit]
  type Row = js.Array[String] | js.Object
  type RowArray = js.Array[String]
  type RowMap = StringDictionary[String]
  type RowTransformCallback = js.Function2[/* error */ js.UndefOr[Error | Null], /* row */ js.UndefOr[Row], Unit]
  type RowTransformFunction = SyncRowTransform | AsyncRowTransform
  type RowValidate = AsyncRowValidate | SyncRowValidate
  type RowValidateCallback = js.Function3[
    /* error */ js.UndefOr[Error | Null], 
    /* isValid */ js.UndefOr[Boolean], 
    /* reason */ js.UndefOr[String], 
    Unit
  ]
  type RowValidatorCallback = js.Function2[/* error */ Error | Null, /* result */ js.UndefOr[RowValidationResult], Unit]
  type SyncRowTransform = js.Function1[/* row */ Row, Row]
  type SyncRowValidate = js.Function1[/* row */ Row, Boolean]
}
