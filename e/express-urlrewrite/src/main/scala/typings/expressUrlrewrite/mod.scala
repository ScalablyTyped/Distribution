package typings.expressUrlrewrite

import typings.express.mod.Handler
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("express-urlrewrite", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def apply(s: String): Handler = js.native
  def apply(s: String, t: String): Handler = js.native
  def apply(s: RegExp, t: String): Handler = js.native
}

