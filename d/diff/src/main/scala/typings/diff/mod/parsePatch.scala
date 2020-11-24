package typings.diff.mod

import typings.diff.anon.Strict
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("diff", "parsePatch")
@js.native
object parsePatch extends js.Object {
  
  def apply(diffStr: String): js.Array[ParsedDiff] = js.native
  def apply(diffStr: String, options: Strict): js.Array[ParsedDiff] = js.native
}
