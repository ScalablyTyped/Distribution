package typings
package eqDotJsLib.eqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EqjsStatic extends js.Object {
  /**
  		 * List of all nodes.
  		 */
  var nodes: EqjsNodesTable = js.native
  /**
  		 * Number of nodes in eqjs.nodes.
  		 */
  var nodesLength: scala.Double = js.native
  /**
  		 * Runs through all nodes and writes their eq status.
  		 * @param nodes An array or NodeList of nodes to query
  		 * @returns {}
  		 */
  def nodeWrites(): scala.Unit = js.native
  /**
  		 * Runs through all nodes and writes their eq status.
  		 * @param nodes An array or NodeList of nodes to query
  		 * @returns {}
  		 */
  def nodeWrites(nodes: AvailableElementType): scala.Unit = js.native
  /**
  		 * Runs through all nodes and finds their widths and points
  		 * @param nodes
  		 * @param callback function to use as a callback once query and nodeWrites have finished
  		 */
  def query(nodes: AvailableElementType): scala.Unit = js.native
  /**
  		 * Runs through all nodes and finds their widths and points
  		 * @param nodes
  		 * @param callback function to use as a callback once query and nodeWrites have finished
  		 */
  def query(nodes: AvailableElementType, callback: js.Function): scala.Unit = js.native
  /**
  		 *  Refreshes the list of nodes for eqjs to work with
  		 */
  def refreshNodes(): scala.Unit = js.native
  /**
  		 * Sorts a simple object (key: value) by value and returns a sorted object.
  		 * @param obj e.g. "small: 380, medium: 490, large: 600"
  		 * @returns {}
  		 */
  def sortObj(obj: java.lang.String): js.Array[EqjsKeyValuePair] = js.native
}

