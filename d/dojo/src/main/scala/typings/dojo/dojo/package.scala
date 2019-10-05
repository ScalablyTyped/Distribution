package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dojo {
  import typings.dojo.dojo.promise.Callback
  import typings.dojo.dojo.promise.Promise
  import typings.dojo.dojo.router.RouterBase

  type NodeList = NodeList_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-data.html
    *
    * Adds data() and removeData() methods to NodeList, and returns NodeList constructor.
    *
    */
  type NodeList_data = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-dom.html
    *
    * Adds DOM related methods to NodeList, and returns NodeList constructor.
    *
    */
  type NodeList_dom = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-html.html
    *
    * Adds a chainable html method to dojo/query() / NodeList instances for setting/replacing node content
    *
    */
  type NodeList_html = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-manipulate.html
    *
    * Adds chainable methods to dojo.query() / NodeList instances for manipulating HTML
    * and DOM nodes and their properties.
    *
    */
  type NodeList_manipulate = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-traverse.html
    *
    * Adds chainable methods to dojo/query() / NodeList instances for traversing the DOM
    *
    */
  type NodeList_traverse = js.Function0[Unit]
  type dom_prop = dom_prop_
  type gears = gears_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/hash.html
    *
    * Gets or sets the hash string in the browser URL.
    * Handles getting and setting of location.hash.
    *
    * If no arguments are passed, acts as a getter.
    * If a string is passed, acts as a setter.
    *
    * @param hash       Optionalthe hash is set - #string.
    * @param replace       OptionalIf true, updates the hash value in the current historystate instead of creating a new history state.
    */
  type hash = js.Function2[/* hash */ js.UndefOr[String], /* replace */ js.UndefOr[Boolean], Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/hccss.html
    *
    * Test if computer is in high contrast mode (i.e. if browser is not displaying background images).
    * Defines has("highcontrast") and sets dj_a11y CSS class on <body> if machine is in high contrast mode.
    * Returns has() method;
    *
    */
  type hccss = js.Function0[Unit]
  type i18n = i18n_
  type main = main_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/ready.html
    *
    * Add a function to execute on DOM content loaded and all requested modules have arrived and been evaluated.
    * In most cases, the domReady plug-in should suffice and this method should not be needed.
    *
    * When called in a non-browser environment, just checks that all requested modules have arrived and been
    * evaluated.
    *
    * @param priority       OptionalThe order in which to exec this callback relative to other callbacks, defaults to 1000
    * @param context The context in which to run execute callback, or a callback if not using context
    * @param callback       OptionalThe function to execute.
    */
  type ready = js.Function3[
    /* priority */ js.UndefOr[Double], 
    /* context */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[js.Function], 
    Unit
  ]
  type request = request_
  type robot = robot_
  type robotx = robotx_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/router.html
    *
    * A singleton-style instance of dojo/router/RouterBase. See that
    * module for specifics.
    *
    */
  type router = RouterBase
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/sniff.html
    *
    * This module sets has() flags based on the current browser.
    * It returns the has() function.
    *
    */
  type sniff = js.Function0[Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/when.html
    *
    * Transparently applies callbacks to values and/or promises.
    * Accepts promises but also transparently handles non-promises. If no
    * callbacks are provided returns a promise, regardless of the initial
    * value. Foreign promises are converted.
    *
    * If callbacks are provided and the initial value is not a promise,
    * the callback is executed immediately with no error handling. Returns
    * a promise if the initial value is a promise, or the result of the
    * callback otherwise.
    *
    * @param valueOrPromise Either a regular value or an object with a then() method thatfollows the Promises/A specification.
    * @param callback       OptionalCallback to be invoked when the promise is resolved, or a non-promiseis received.
    * @param errback       OptionalCallback to be invoked when the promise is rejected.
    * @param progback       OptionalCallback to be invoked when the promise emits a progress update.
    */
  type when = js.Function4[
    /* value */ js.Any | Promise[js.Any], 
    /* callback */ Callback[js.Any, js.Any], 
    /* errback */ js.UndefOr[js.Any], 
    /* progback */ js.UndefOr[js.Any], 
    js.Any | Promise[js.Any]
  ]
}
