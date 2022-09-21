package typings.eggView

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ViewBase extends StObject {
  
  /**
    * Render a file by view engine, then set to body
    * @param {String} name - the file path based on root
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def render(name: String): js.Promise[Null] = js.native
  def render(name: String, locals: Any): js.Promise[Null] = js.native
  def render(name: String, locals: Any, options: RenderOptions): js.Promise[Null] = js.native
  def render(name: String, locals: Unit, options: RenderOptions): js.Promise[Null] = js.native
  
  /**
    * Render a template string by view engine
    * @param {String} tpl - template string
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def renderString(name: String): js.Promise[String] = js.native
  def renderString(name: String, locals: Any): js.Promise[String] = js.native
  def renderString(name: String, locals: Any, options: RenderOptions): js.Promise[String] = js.native
  def renderString(name: String, locals: Unit, options: RenderOptions): js.Promise[String] = js.native
  
  /**
    * Render a file by view engine and return it
    * @param {String} name - the file path based on root
    * @param {Object} [locals] - data used by template
    * @param {Object} [options] - view options, you can use `options.viewEngine` to specify view engine
    * @return {Promise<String>} result - return a promise with a render result
    */
  def renderView(name: String): js.Promise[String] = js.native
  def renderView(name: String, locals: Any): js.Promise[String] = js.native
  def renderView(name: String, locals: Any, options: RenderOptions): js.Promise[String] = js.native
  def renderView(name: String, locals: Unit, options: RenderOptions): js.Promise[String] = js.native
}
