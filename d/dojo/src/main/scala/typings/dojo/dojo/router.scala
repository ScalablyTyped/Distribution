package typings.dojo.dojo

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojo.router")
@js.native
object router extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/router/RouterBase.html
    *
    * A module that allows one to easily map hash-based structures into
    * callbacks. The router module is a singleton, offering one central
    * point for all registrations of this type.
    *
    * @param kwArgs
    */
  @js.native
  class RouterBase protected () extends js.Object {
    def this(kwArgs: js.Any) = this()
    /**
      *
      */
    var globMatch: RegExp = js.native
    /**
      *
      */
    var globReplacement: String = js.native
    /**
      *
      */
    var idMatch: RegExp = js.native
    /**
      *
      */
    var idReplacement: String = js.native
    /**
      *
      */
    def destroy(): Unit = js.native
    /**
      * A simple pass-through to make changing the hash easy,
      * without having to require dojo/hash directly. It also
      * synchronously fires off any routes that match.
      *
      * @param path
      * @param replace
      */
    def go(path: String): js.Any = js.native
    def go(path: String, replace: Boolean): js.Any = js.native
    /**
      * Registers a route to a handling callback
      * Given either a string or a regular expression, the router
      * will monitor the page's hash and respond to changes that
      * match the string or regex as provided.
      *
      * When provided a regex for the route:
      *
      * Matching is performed, and the resulting capture groups
      * are passed through to the callback as an array.
      * When provided a string for the route:
      *
      * The string is parsed as a URL-like structure, like
      * "/foo/bar"
      * If any portions of that URL are prefixed with a colon
      * (:), they will be parsed out and provided to the callback
      * as properties of an object.
      * If the last piece of the URL-like structure is prefixed
      * with a star (*) instead of a colon, it will be replaced in
      * the resulting regex with a greedy (.+) match and
      * anything remaining on the hash will be provided as a
      * property on the object passed into the callback. Think of
      * it like a basic means of globbing the end of a route.
      *
      * @param route A string or regular expression which will be used whenmonitoring hash changes.
      * @param callback When the hash matches a pattern as described in the route,this callback will be executed. It will receive an eventobject that will have several properties:params: Either an array or object of properties pulledfrom the new hasholdPath: The hash in its state before the changenewPath: The new hash being shifted topreventDefault: A method that will stop hash changesfrom being actually applied to the active hash. This onlyworks if the hash change was initiated using router.go,as changes initiated more directly to the location.hashproperty will already be in placestopImmediatePropagation: When called, will stop anyfurther bound callbacks on this particular route frombeing executed. If two distinct routes are bound that aredifferent, but both happen to match the current hash insome way, this will not keep other routes from receivingnotice of the change.
      */
    def register(route: String, callback: js.Function): js.Any = js.native
    /**
      * Registers a route to a handling callback
      * Given either a string or a regular expression, the router
      * will monitor the page's hash and respond to changes that
      * match the string or regex as provided.
      *
      * When provided a regex for the route:
      *
      * Matching is performed, and the resulting capture groups
      * are passed through to the callback as an array.
      * When provided a string for the route:
      *
      * The string is parsed as a URL-like structure, like
      * "/foo/bar"
      * If any portions of that URL are prefixed with a colon
      * (:), they will be parsed out and provided to the callback
      * as properties of an object.
      * If the last piece of the URL-like structure is prefixed
      * with a star (*) instead of a colon, it will be replaced in
      * the resulting regex with a greedy (.+) match and
      * anything remaining on the hash will be provided as a
      * property on the object passed into the callback. Think of
      * it like a basic means of globbing the end of a route.
      *
      * @param route A string or regular expression which will be used whenmonitoring hash changes.
      * @param callback When the hash matches a pattern as described in the route,this callback will be executed. It will receive an eventobject that will have several properties:params: Either an array or object of properties pulledfrom the new hasholdPath: The hash in its state before the changenewPath: The new hash being shifted topreventDefault: A method that will stop hash changesfrom being actually applied to the active hash. This onlyworks if the hash change was initiated using router.go,as changes initiated more directly to the location.hashproperty will already be in placestopImmediatePropagation: When called, will stop anyfurther bound callbacks on this particular route frombeing executed. If two distinct routes are bound that aredifferent, but both happen to match the current hash insome way, this will not keep other routes from receivingnotice of the change.
      */
    def register(route: RegExp, callback: js.Function): js.Any = js.native
    /**
      * Registers a route to a handling callback, except before
      * any previously registered callbacks
      * Much like the register method, registerBefore allows
      * us to register route callbacks to happen before any
      * previously registered callbacks. See the documentation for
      * register for more details and examples.
      *
      * @param route
      * @param callback
      */
    def registerBefore(route: String, callback: js.Function): js.Any = js.native
    /**
      * Registers a route to a handling callback, except before
      * any previously registered callbacks
      * Much like the register method, registerBefore allows
      * us to register route callbacks to happen before any
      * previously registered callbacks. See the documentation for
      * register for more details and examples.
      *
      * @param route
      * @param callback
      */
    def registerBefore(route: RegExp, callback: js.Function): js.Any = js.native
    /**
      * This method must be called to activate the router. Until
      * startup is called, no hash changes will trigger route
      * callbacks.
      *
      * @param defaultPath
      */
    def startup(defaultPath: js.Any): Unit = js.native
  }
  
}

