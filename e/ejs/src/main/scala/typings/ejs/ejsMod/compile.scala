package typings.ejs.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "compile")
@js.native
object compile extends js.Object {
  def apply(template: String): TemplateFunction | AsyncTemplateFunction = js.native
  def apply(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = js.native
}

