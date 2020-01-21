package typings.diff.mod

import typings.diff.AnonStrict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("diff", "parsePatch")
@js.native
object parsePatch extends js.Object {
  def apply(diffStr: String): js.Array[ParsedDiff] = js.native
  def apply(diffStr: String, options: AnonStrict): js.Array[ParsedDiff] = js.native
}

