package typings.getenv

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getenvMod {
  type ParseWithEachType = ParseWithType[
    typings.getenv.getenvStrings.string | typings.getenv.getenvStrings.int | typings.getenv.getenvStrings.float | typings.getenv.getenvStrings.bool | typings.getenv.getenvStrings.boolish | typings.getenv.getenvStrings.url
  ]
  type ParseWithFallback = js.Tuple2[String, String]
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    String, 
    /* import warning: importer.ImportType#apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
