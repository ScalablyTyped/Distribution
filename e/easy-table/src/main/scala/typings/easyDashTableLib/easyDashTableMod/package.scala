package typings
package easyDashTableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object easyDashTableMod {
  type CellPrinter[T] = js.Function2[/* val */ T, /* width */ scala.Double, java.lang.String]
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type FormatFunction[T] = js.Function2[
    /* obj */ T, 
    /* cell */ js.Function2[/* name */ java.lang.String, /* val */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type FormatObject = org.scalablytyped.runtime.StringDictionary[ColumnFormat[js.Any]]
  type ReduceFunction[T] = js.Function4[/* acc */ T, /* val */ T, /* idx */ scala.Double, /* length */ scala.Double, T]
  type TablePostProcessing = js.Function1[/* result */ EasyTable, java.lang.String]
}
