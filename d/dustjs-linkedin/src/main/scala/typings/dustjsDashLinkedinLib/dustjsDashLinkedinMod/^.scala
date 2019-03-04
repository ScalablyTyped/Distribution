package typings
package dustjsDashLinkedinLib.dustjsDashLinkedinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dustjs-linkedin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(source: java.lang.String, name: java.lang.String): java.lang.String = js.native
  def compile(source: java.lang.String, name: java.lang.String, strip: scala.Boolean): java.lang.String = js.native
  def compileFn(source: java.lang.String): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Template = js.native
  def compileFn(source: java.lang.String, name: java.lang.String): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Template = js.native
  def escapeHtml(html: java.lang.String): java.lang.String = js.native
  def escapeJs(js_ : java.lang.String): java.lang.String = js.native
  def loadSource(compiled: java.lang.String): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Template = js.native
  def makeBase(global: dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context = js.native
  def makeBase(global: js.Any): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context = js.native
  def register(name: java.lang.String, tmpl: dustjsDashLinkedinLib.dustjsDashLinkedinMod.Template): scala.Unit = js.native
  def render(
    name: java.lang.String,
    context: dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context,
    callback: js.Function2[/* err */ js.Any, /* out */ java.lang.String, _]
  ): scala.Unit = js.native
  def render(
    name: java.lang.String,
    context: js.Any,
    callback: js.Function2[/* err */ js.Any, /* out */ java.lang.String, _]
  ): scala.Unit = js.native
  def renderSource(source: java.lang.String, context: dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Stream = js.native
  def renderSource(
    source: java.lang.String,
    context: dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context,
    callback: js.Function2[/* err */ js.Any, /* out */ java.lang.String, _]
  ): scala.Unit = js.native
  def renderSource(source: java.lang.String, context: js.Any): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Stream = js.native
  def renderSource(
    source: java.lang.String,
    context: js.Any,
    callback: js.Function2[/* err */ js.Any, /* out */ java.lang.String, _]
  ): scala.Unit = js.native
  def stream(name: java.lang.String, context: dustjsDashLinkedinLib.dustjsDashLinkedinMod.Context): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Stream = js.native
  def stream(name: java.lang.String, context: js.Any): dustjsDashLinkedinLib.dustjsDashLinkedinMod.Stream = js.native
}

