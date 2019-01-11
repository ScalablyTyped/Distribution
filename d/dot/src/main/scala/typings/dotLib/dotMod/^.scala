package typings
package dotLib.dotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dot", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var templateSettings: dotLib.dotMod.TemplateSettings = js.native
  val version: java.lang.String = js.native
  def compile(tmpl: java.lang.String): dotLib.dotMod.RenderFunction = js.native
  def compile(tmpl: java.lang.String, `def`: js.Object): dotLib.dotMod.RenderFunction = js.native
  def template(tmpl: java.lang.String): dotLib.dotMod.RenderFunction = js.native
  def template(tmpl: java.lang.String, c: dotLib.dotMod.TemplateSettings): dotLib.dotMod.RenderFunction = js.native
  def template(tmpl: java.lang.String, c: dotLib.dotMod.TemplateSettings, `def`: js.Object): dotLib.dotMod.RenderFunction = js.native
}

