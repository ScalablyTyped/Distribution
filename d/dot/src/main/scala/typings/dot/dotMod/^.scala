package typings.dot.dotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var templateSettings: TemplateSettings = js.native
  val version: String = js.native
  def compile(tmpl: String): RenderFunction = js.native
  def compile(tmpl: String, `def`: js.Object): RenderFunction = js.native
  def template(tmpl: String): RenderFunction = js.native
  def template(tmpl: String, c: TemplateSettings): RenderFunction = js.native
  def template(tmpl: String, c: TemplateSettings, `def`: js.Object): RenderFunction = js.native
}

