package typings.dojo.dojox.dtl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object ext_dojo {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/dtl/ext-dojo/NodeList.html
    *
    * Array-like object which adds syntactic
    * sugar for chaining, common iteration operations, animation, and
    * node manipulation. NodeLists are most often returned as the
    * result of dojo/query() calls.
    * NodeList instances provide many utilities that reflect
    * core Dojo APIs for Array iteration and manipulation, DOM
    * manipulation, and event handling. Instead of needing to dig up
    * functions in the dojo package, NodeLists generally make the
    * full power of Dojo available for DOM manipulation tasks in a
    * simple, chainable way.
    *
    * @param array
    */
  type NodeList = js.Function1[/* array */ js.Any, Unit]
}
