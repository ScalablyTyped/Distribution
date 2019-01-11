package typings
package ejsLib.ejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var cache: ejsLib.ejsMod.Cache = js.native
  var delimiter: java.lang.String = js.native
  var localsName: java.lang.String = js.native
  val name: /* ejs */ java.lang.String = js.native
  def clearCache(): scala.Unit = js.native
  def compile(template: java.lang.String): ejsLib.ejsMod.TemplateFunction | ejsLib.ejsMod.AsyncTemplateFunction = js.native
  def compile(template: java.lang.String, opts: ejsLib.ejsMod.Options): ejsLib.ejsMod.TemplateFunction | ejsLib.ejsMod.AsyncTemplateFunction = js.native
  @JSName("compile")
  def compile_AsyncTemplateFunction(template: java.lang.String, opts: ejsLib.ejsMod.Options with ejsLib.Anon_AsyncTrue): ejsLib.ejsMod.AsyncTemplateFunction = js.native
  @JSName("compile")
  def compile_TemplateFunction(template: java.lang.String): ejsLib.ejsMod.TemplateFunction = js.native
  @JSName("compile")
  def compile_TemplateFunction(
    template: java.lang.String,
    opts: ejsLib.ejsMod.Options with (ejsLib.Anon_Async | ejsLib.Anon_AsyncNever)
  ): ejsLib.ejsMod.TemplateFunction = js.native
  def escapeRegexChars(s: java.lang.String): java.lang.String = js.native
  def escapeXML(markup: java.lang.String): java.lang.String = js.native
  def fileLoader(filePath: java.lang.String): java.lang.String = js.native
  def render(template: java.lang.String): java.lang.String | js.Promise[java.lang.String] = js.native
  def render(template: java.lang.String, data: ejsLib.ejsMod.Data): java.lang.String | js.Promise[java.lang.String] = js.native
  def render(template: java.lang.String, data: ejsLib.ejsMod.Data, opts: ejsLib.ejsMod.Options): java.lang.String | js.Promise[java.lang.String] = js.native
  def render(
    template: java.lang.String,
    data: js.UndefOr[scala.Nothing],
    opts: ejsLib.ejsMod.Options with ejsLib.Anon_AsyncTrue
  ): js.Promise[java.lang.String] = js.native
  def renderFile[T](path: java.lang.String): js.Promise[T] = js.native
  def renderFile[T](path: java.lang.String, cb: ejsLib.ejsMod.RenderFileCallback[T]): T = js.native
  def renderFile[T](path: java.lang.String, data: ejsLib.ejsMod.Data): js.Promise[T] = js.native
  def renderFile[T](path: java.lang.String, data: ejsLib.ejsMod.Data, cb: ejsLib.ejsMod.RenderFileCallback[T]): T = js.native
  def renderFile[T](path: java.lang.String, data: ejsLib.ejsMod.Data, opts: ejsLib.ejsMod.Options): js.Promise[T] = js.native
  def renderFile[T](
    path: java.lang.String,
    data: ejsLib.ejsMod.Data,
    opts: ejsLib.ejsMod.Options,
    cb: ejsLib.ejsMod.RenderFileCallback[T]
  ): T = js.native
  @JSName("render")
  def render_Promise(
    template: java.lang.String,
    data: ejsLib.ejsMod.Data,
    opts: ejsLib.ejsMod.Options with ejsLib.Anon_AsyncTrue
  ): js.Promise[java.lang.String] = js.native
  @JSName("render")
  def render_String(template: java.lang.String): java.lang.String = js.native
  @JSName("render")
  def render_String(template: java.lang.String, data: ejsLib.ejsMod.Data): java.lang.String = js.native
  @JSName("render")
  def render_String(
    template: java.lang.String,
    data: ejsLib.ejsMod.Data,
    opts: ejsLib.ejsMod.Options with (ejsLib.Anon_Async | ejsLib.Anon_AsyncNever)
  ): java.lang.String = js.native
  @JSName("render")
  def render_String(
    template: java.lang.String,
    data: js.UndefOr[scala.Nothing],
    opts: ejsLib.ejsMod.Options with ejsLib.Anon_AsyncNever
  ): java.lang.String = js.native
  def resolveInclude(name: java.lang.String, filename: java.lang.String, isDir: scala.Boolean): java.lang.String = js.native
}

