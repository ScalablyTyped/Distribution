package typings.egg.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- scala.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- scala.Any because Inheritance from two classes. Inlined getClass, hashCode, eq, equals, toString, ne, notify, notifyAll, wait, wait, wait, clone, finalize
- js.Any because Inheritance from two classes. Inlined 
- scala.AnyRef because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined 
- js.Any because Inheritance from two classes. Inlined 
- org.scalablytyped.runtime.StObject because Inheritance from two classes. Inlined 
- js.Object because Inheritance from two classes. Inlined hasOwnProperty, propertyIsEnumerable, valueOf, toLocaleString, isPrototypeOf
- typings.egg.mod.PlainObject because Inheritance from two classes. Inlined  */ @js.native
trait IHelper extends BaseContextClass {
  
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
  def pathFor(name: String, params: PlainObject[Any]): String = js.native
  
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
  def urlFor(name: String, params: PlainObject[Any]): String = js.native
}
