package typings.egg.eggMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHelper
  extends BaseContextClass
     with PlainObject[js.Any] {
  /**
    * Generate URL path(without host) for route. Takes the route name and a map of named params.
    * @method Helper#pathFor
    * @param {String} name - Router Name
    * @param {Object} params - Other params
    *
    * @example
    * ```js
    * app.get('home', '/index.htm', 'home.index');
    * ctx.helper.pathFor('home', { by: 'recent', limit: 20 })
    * => /index.htm?by=recent&limit=20
    * ```
    * @return {String} url path(without host)
    */
  def pathFor(name: String): String = js.native
  def pathFor(name: String, params: PlainObject[_]): String = js.native
  /**
    * Generate full URL(with host) for route. Takes the route name and a map of named params.
    * @method Helper#urlFor
    * @param {String} name - Router name
    * @param {Object} params - Other params
    * @example
    * ```js
    * app.get('home', '/index.htm', 'home.index');
    * ctx.helper.urlFor('home', { by: 'recent', limit: 20 })
    * => http://127.0.0.1:7001/index.htm?by=recent&limit=20
    * ```
    * @return {String} full url(with host)
    */
  def urlFor(name: String): String = js.native
  def urlFor(name: String, params: PlainObject[_]): String = js.native
}

