package typings.dojo.dojo

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojo/NodeList-fx.html
  *
  * Adds dojo.fx animation support to dojo.query() by extending the NodeList class
  * with additional FX functions.  NodeList is the array-like object used to hold query results.
  *
  */
@js.native
trait NodeListFx extends js.Object {
  def apply(): Unit = js.native
  /**
    * fade all elements of the node list to a specified opacity
    *
    * @param args
    */
  def fadeTo(args: js.Any): js.Any = js.native
  /**
    * highlight all elements of the node list.
    * Returns an instance of dojo.Animation
    *
    * @param args
    */
  def highlight(args: js.Any): js.Any = js.native
  /**
    * size all elements of this NodeList. Returns an instance of dojo.Animation
    *
    * @param args
    */
  def sizeTo(args: js.Any): js.Any = js.native
  /**
    * slide all elements of this NodeList. Returns an instance of dojo.Animation
    *
    * @param args
    */
  def slideBy(args: js.Any): js.Any = js.native
  /**
    * Wipe all elements of the NodeList to a specified width: or height:
    *
    * @param args
    */
  def wipeTo(args: js.Any): js.Any = js.native
}

