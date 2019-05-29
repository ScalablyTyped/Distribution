package typings
package getenvLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getenvMod {
  type ParseWithEachType = ParseWithType[
    getenvLib.getenvLibStrings.string | getenvLib.getenvLibStrings.int | getenvLib.getenvLibStrings.float | getenvLib.getenvLibStrings.bool | getenvLib.getenvLibStrings.boolish | getenvLib.getenvLibStrings.url
  ]
  type ParseWithFallback = js.Tuple2[java.lang.String, java.lang.String]
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    java.lang.String, 
    /* import warning: ImportType.apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
