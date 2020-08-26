package typings.eggView.mod

import typings.eggView.ContextView
import typings.eggView.RenderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * View instance that is created every request
    */
  var view: ContextView = js.native
  /**
    * Render a file by view engine
    * @param {String} name - the file path based on root
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def render(name: String): js.Promise[String] = js.native
  def render(name: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions): js.Promise[String] = js.native
  def render(name: String, locals: js.Any): js.Promise[String] = js.native
  def render(name: String, locals: js.Any, options: RenderOptions): js.Promise[String] = js.native
  /**
    * Render a template string by view engine
    * @param {String} tpl - template string
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def renderString(name: String): js.Promise[String] = js.native
  def renderString(name: String, locals: js.UndefOr[scala.Nothing], options: RenderOptions): js.Promise[String] = js.native
  def renderString(name: String, locals: js.Any): js.Promise[String] = js.native
  def renderString(name: String, locals: js.Any, options: RenderOptions): js.Promise[String] = js.native
}

