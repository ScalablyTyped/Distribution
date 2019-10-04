package typings.fastDashGlob

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object outTypesPatternsMod {
  import typings.std.Record
  import typings.std.RegExp

  type Pattern = String
  type PatternRe = RegExp
  type PatternsGroup = Record[String, js.Array[Pattern]]
}
