package typings.ejs.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "render")
@js.native
object render extends js.Object {
  def apply(template: String): String | js.Promise[String] = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Options with js.Object): String = js.native
  def apply(template: String, data: Data): String | js.Promise[String] = js.native
  def apply(template: String, data: Data, opts: Options): String | js.Promise[String] = js.native
}

