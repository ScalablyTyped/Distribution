package typings.dustjsDashLinkedin.dustjsDashLinkedinMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("dustjs-linkedin", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def compile(source: String, name: String): String = js.native
  def compile(source: String, name: String, strip: Boolean): String = js.native
  def compileFn(source: String): Template = js.native
  def compileFn(source: String, name: String): Template = js.native
  def escapeHtml(html: String): String = js.native
  def escapeJs(js_ : String): String = js.native
  def loadSource(compiled: String): Template = js.native
  def makeBase(global: js.Any): Context = js.native
  def makeBase(global: Context): Context = js.native
  def register(name: String, tmpl: Template): Unit = js.native
  def render(name: String, context: js.Any, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  def render(name: String, context: Context, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  def renderSource(source: String, context: js.Any): Stream = js.native
  def renderSource(source: String, context: js.Any, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  def renderSource(source: String, context: Context): Stream = js.native
  def renderSource(source: String, context: Context, callback: js.Function2[/* err */ js.Any, /* out */ String, _]): Unit = js.native
  def stream(name: String, context: js.Any): Stream = js.native
  def stream(name: String, context: Context): Stream = js.native
}

