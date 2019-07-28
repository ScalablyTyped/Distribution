package typings.ejs.ejsMod

import typings.ejs.Anon_Async
import typings.ejs.Anon_AsyncTrue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var cache: Cache = js.native
  var delimiter: String = js.native
  var localsName: String = js.native
  val name: typings.ejs.ejsStrings.ejs = js.native
  def clearCache(): Unit = js.native
  def compile(template: String): TemplateFunction | AsyncTemplateFunction = js.native
  def compile(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = js.native
  @JSName("compile")
  def compile_AsyncTemplateFunction(template: String, opts: Options with Anon_AsyncTrue): AsyncTemplateFunction = js.native
  @JSName("compile")
  def compile_TemplateFunction(template: String): TemplateFunction = js.native
  @JSName("compile")
  def compile_TemplateFunction(template: String, opts: Options with (Anon_Async | js.Object)): TemplateFunction = js.native
  def escapeRegexChars(s: String): String = js.native
  def escapeXML(markup: String): String = js.native
  def fileLoader(filePath: String): String = js.native
  def render(template: String): String | js.Promise[String] = js.native
  def render(template: String, data: js.UndefOr[scala.Nothing], opts: Options with Anon_AsyncTrue): js.Promise[String] = js.native
  def render(template: String, data: Data): String | js.Promise[String] = js.native
  def render(template: String, data: Data, opts: Options): String | js.Promise[String] = js.native
  def renderFile[T](path: String): js.Promise[T] = js.native
  def renderFile[T](path: String, cb: RenderFileCallback[T]): T = js.native
  def renderFile[T](path: String, data: Data): js.Promise[T] = js.native
  def renderFile[T](path: String, data: Data, cb: RenderFileCallback[T]): T = js.native
  def renderFile[T](path: String, data: Data, opts: Options): js.Promise[T] = js.native
  def renderFile[T](path: String, data: Data, opts: Options, cb: RenderFileCallback[T]): T = js.native
  @JSName("render")
  def render_Promise(template: String, data: Data, opts: Options with Anon_AsyncTrue): js.Promise[String] = js.native
  @JSName("render")
  def render_String(template: String): String = js.native
  @JSName("render")
  def render_String(template: String, data: js.UndefOr[scala.Nothing], opts: Options with js.Object): String = js.native
  @JSName("render")
  def render_String(template: String, data: Data): String = js.native
  @JSName("render")
  def render_String(template: String, data: Data, opts: Options with (Anon_Async | js.Object)): String = js.native
  def resolveInclude(name: String, filename: String, isDir: Boolean): String = js.native
}

