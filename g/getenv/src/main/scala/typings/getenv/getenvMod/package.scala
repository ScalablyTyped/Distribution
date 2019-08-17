package typings.getenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getenvMod {
  import typings.getenv.getenvStrings.bool
  import typings.getenv.getenvStrings.boolish
  import typings.getenv.getenvStrings.float
  import typings.getenv.getenvStrings.int
  import typings.getenv.getenvStrings.string
  import typings.getenv.getenvStrings.url

  type ParseWithEachType = ParseWithType[string | int | float | bool | boolish | url]
  type ParseWithFallback = js.Tuple2[String, String]
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    String, 
    /* import warning: ImportType.apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
