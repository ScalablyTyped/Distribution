package typings
package getenvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getenvMod {
  type ParseWithEachType = ParseWithType[getenvLib.getenvLibStrings.string] | ParseWithType[getenvLib.getenvLibStrings.int] | ParseWithType[getenvLib.getenvLibStrings.float] | ParseWithType[getenvLib.getenvLibStrings.bool] | ParseWithType[getenvLib.getenvLibStrings.boolish] | ParseWithType[getenvLib.getenvLibStrings.url]
  type ParseWithFallback = js.Tuple2[java.lang.String, java.lang.String]
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
