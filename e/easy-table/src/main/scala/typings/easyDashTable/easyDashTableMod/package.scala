package typings.easyDashTable

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object easyDashTableMod {
  import org.scalablytyped.runtime.StringDictionary

  type CellPrinter[T] = js.Function2[/* val */ T, /* width */ Double, String]
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, Double]
  type FormatFunction[T] = js.Function2[
    /* obj */ T, 
    /* cell */ js.Function2[/* name */ String, /* val */ js.Any, Unit], 
    Unit
  ]
  type FormatObject = StringDictionary[ColumnFormat[js.Any]]
  type ReduceFunction[T] = js.Function4[/* acc */ T, /* val */ T, /* idx */ Double, /* length */ Double, T]
  type TablePostProcessing = js.Function1[/* result */ EasyTable, String]
}
