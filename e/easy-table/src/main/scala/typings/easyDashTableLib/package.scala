package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object easyDashTableLib {
  type CellPrinter[T] = js.Function2[/* val */ T, /* width */ scala.Double, java.lang.String]
  type CompareFunction[T] = js.Function2[/* a */ T, /* b */ T, scala.Double]
  type FormatFunction[T] = js.Function2[
    /* obj */ T, 
    /* cell */ js.Function2[/* name */ java.lang.String, /* val */ js.Any, scala.Unit], 
    scala.Unit
  ]
  type ReduceFunction[T] = js.Function4[/* acc */ T, /* val */ T, /* idx */ scala.Double, /* length */ scala.Double, T]
  type TablePostProcessing = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify EasyTable */ /* result */ js.Any, 
    java.lang.String
  ]
}
