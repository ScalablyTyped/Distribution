package typings
package eggDashViewLib.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Context extends js.Object {
  /**
    * View instance that is created every request
    */
  var view: eggDashViewLib.ContextView = js.native
  /**
    * Render a file by view engine
    * @param {String} name - the file path based on root
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def render(name: java.lang.String): js.Promise[java.lang.String] = js.native
  def render(name: java.lang.String, locals: js.Any): js.Promise[java.lang.String] = js.native
  def render(name: java.lang.String, locals: js.Any, options: eggDashViewLib.RenderOptions): js.Promise[java.lang.String] = js.native
  /**
    * Render a template string by view engine
    * @param {String} tpl - template string
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def renderString(name: java.lang.String): js.Promise[java.lang.String] = js.native
  def renderString(name: java.lang.String, locals: js.Any): js.Promise[java.lang.String] = js.native
  def renderString(name: java.lang.String, locals: js.Any, options: eggDashViewLib.RenderOptions): js.Promise[java.lang.String] = js.native
}

