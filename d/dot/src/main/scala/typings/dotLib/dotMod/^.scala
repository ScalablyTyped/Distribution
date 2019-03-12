package typings
package dotLib.dotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var templateSettings: TemplateSettings = js.native
  val version: java.lang.String = js.native
  def compile(tmpl: java.lang.String): RenderFunction = js.native
  def compile(tmpl: java.lang.String, `def`: js.Object): RenderFunction = js.native
  def template(tmpl: java.lang.String): RenderFunction = js.native
  def template(tmpl: java.lang.String, c: TemplateSettings): RenderFunction = js.native
  def template(tmpl: java.lang.String, c: TemplateSettings, `def`: js.Object): RenderFunction = js.native
}

