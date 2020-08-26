package typings.ejs.mod

import typings.ejs.anon.Optionsasyncfalse
import typings.ejs.anon.Optionsasyncneverundefine
import typings.ejs.anon.Optionsasynctrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "render")
@js.native
object render extends js.Object {
  def apply(template: String): String = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Optionsasyncfalse): String = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Optionsasyncneverundefine): String = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Optionsasynctrue): js.Promise[String] = js.native
  def apply(template: String, data: js.UndefOr[scala.Nothing], opts: Options): String | js.Promise[String] = js.native
  def apply(template: String, data: Data): String = js.native
  def apply(template: String, data: Data, opts: Optionsasyncfalse): String = js.native
  def apply(template: String, data: Data, opts: Optionsasyncneverundefine): String = js.native
  def apply(template: String, data: Data, opts: Optionsasynctrue): js.Promise[String] = js.native
  def apply(template: String, data: Data, opts: Options): String | js.Promise[String] = js.native
}

