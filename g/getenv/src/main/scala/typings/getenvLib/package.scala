package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getenvLib {
  type ParseTypes = java.lang.String
  type ParseWithEachType = ParseWithType[getenvLib.getenvLibStrings.string] | ParseWithType[getenvLib.getenvLibStrings.int] | ParseWithType[getenvLib.getenvLibStrings.float] | ParseWithType[getenvLib.getenvLibStrings.bool] | ParseWithType[getenvLib.getenvLibStrings.boolish] | ParseWithType[getenvLib.getenvLibStrings.url]
  type ParseWithFallback = js.Tuple2[java.lang.String, js.Any]
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: any[T] */ js.Any, 
    T
  ]
}
