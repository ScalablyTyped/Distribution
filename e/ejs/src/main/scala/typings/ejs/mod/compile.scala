package typings.ejs.mod

import typings.ejs.anon.Optionsasyncfalseundefine
import typings.ejs.anon.OptionsasyncfalseundefineAsync
import typings.ejs.anon.Optionsasynctrueclientfal
import typings.ejs.anon.Optionsasynctrueclienttru
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ejs", "compile")
@js.native
object compile extends js.Object {
  def apply(template: String): TemplateFunction | AsyncTemplateFunction = js.native
  def apply(template: String, opts: Optionsasyncfalseundefine): TemplateFunction = js.native
  def apply(template: String, opts: OptionsasyncfalseundefineAsync): ClientFunction = js.native
  def apply(template: String, opts: Optionsasynctrueclientfal): AsyncTemplateFunction = js.native
  def apply(template: String, opts: Optionsasynctrueclienttru): AsyncClientFunction = js.native
  def apply(template: String, opts: Options): TemplateFunction | AsyncTemplateFunction = js.native
}

