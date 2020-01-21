package typings.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dojo {
  type NodeList = typings.dojo.dojo.NodeList_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-data.html
    *
    * Adds data() and removeData() methods to NodeList, and returns NodeList constructor.
    *
    */
  type NodeListData = js.Function0[scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-dom.html
    *
    * Adds DOM related methods to NodeList, and returns NodeList constructor.
    *
    */
  type NodeListDom = js.Function0[scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-html.html
    *
    * Adds a chainable html method to dojo/query() / NodeList instances for setting/replacing node content
    *
    */
  type NodeListHtml = js.Function0[scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-manipulate.html
    *
    * Adds chainable methods to dojo.query() / NodeList instances for manipulating HTML
    * and DOM nodes and their properties.
    *
    */
  type NodeListManipulate = js.Function0[scala.Unit]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-traverse.html
    *
    * Adds chainable methods to dojo/query() / NodeList instances for traversing the DOM
    *
    */
  type NodeListTraverse = js.Function0[scala.Unit]
  type currency = typings.dojo.dojo.currency_
  type date = typings.dojo.dojo.date_
  type domProp = typings.dojo.dojo.domProp_
  type gears = typings.dojo.dojo.gears_
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
  type hash = js.Function2[
    /* hash */ js.UndefOr[java.lang.String], 
    /* replace */ js.UndefOr[scala.Boolean], 
    scala.Unit
  ]
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/hccss.html
    *
    * Test if computer is in high contrast mode (i.e. if browser is not displaying background images).
    * Defines has("highcontrast") and sets dj_a11y CSS class on <body> if machine is in high contrast mode.
    * Returns has() method;
    *
    */
  type hccss = js.Function0[scala.Unit]
  type html = typings.dojo.dojo.html_
  type i18n = typings.dojo.dojo.i18n_
  type main = typings.dojo.dojo.main_
  type number = typings.dojo.dojo.number_
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
    /* priority */ js.UndefOr[scala.Double], 
    /* context */ js.UndefOr[js.Any], 
    /* callback */ js.UndefOr[js.Function], 
    scala.Unit
  ]
  type request = typings.dojo.dojo.request_
  type robot = typings.dojo.dojo.robot_
  type robotx = typings.dojo.dojo.robotx_
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/router.html
    *
    * A singleton-style instance of dojo/router/RouterBase. See that
    * module for specifics.
    *
    */
  type router = typings.dojo.dojo.router.RouterBase
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojo/sniff.html
    *
    * This module sets has() flags based on the current browser.
    * It returns the has() function.
    *
    */
  type sniff = js.Function0[scala.Unit]
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
    /* value */ js.Any | typings.dojo.dojo.promise.Promise[js.Any], 
    /* callback */ typings.dojo.dojo.promise.Callback[js.Any, js.Any], 
    /* errback */ js.UndefOr[js.Any], 
    /* progback */ js.UndefOr[js.Any], 
    js.Any | typings.dojo.dojo.promise.Promise[js.Any]
  ]
}
