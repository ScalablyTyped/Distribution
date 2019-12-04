package typings.dojo.dojox.NodeList.delegate

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows setting the innerHTML of each node in the NodeList,
  * if there is a value passed in, otherwise, reads the innerHTML value of the first node.
  * This method is simpler than the dojo/NodeList.html() method provided by
  * dojo/NodeList-html. This method just does proper innerHTML insertion of HTML fragments,
  * and it allows for the innerHTML to be read for the first node in the node list.
  * Since dojo/NodeList-html already took the "html" name, this method is called
  * "innerHTML". However, if dojo/NodeList-html has not been loaded yet, this
  * module will define an "html" method that can be used instead. Be careful if you
  * are working in an environment where it is possible that dojo/NodeList-html could
  * have been loaded, since its definition of "html" will take precedence.
  * The nodes represented by the value argument will be cloned if more than one
  * node is in this NodeList. The nodes in this NodeList are returned in the "set"
  * usage of this method, not the HTML that was inserted.
  *
  * @param value               Optional
  */
@js.native
trait html extends js.Object {
  def apply(value: String): js.Any = js.native
  def apply(value: HTMLElement): js.Any = js.native
  def apply(value: typings.std.NodeList): js.Any = js.native
}

