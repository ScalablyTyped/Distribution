package typings.ejs.ejsMod

import typings.ejs.Anon_AsyncClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "compile")
@js.native
object compile extends js.Object {
  def apply(template: String): TemplateFunction | AsyncTemplateFunction = js.native
  def apply(template: String, opts: Options with Anon_AsyncClient): AsyncClientFunction = js.native
}

