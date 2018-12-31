package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITree
  extends extjsLib.ExtNs.utilNs.IObservable {
  /** [Method] Gets a node in this tree by its id
  		* @param id String
  		* @returns Ext.data.NodeInterface The match node.
  		*/
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[java.lang.String], INodeInterface]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  /** [Method] Removes the root node from this tree
  		* @returns Ext.data.NodeInterface The root node
  		*/
  var removeRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  /** [Property] (Ext.data.NodeInterface) */
  var root: js.UndefOr[INodeInterface] = js.undefined
  /** [Method] Sets the root node for this tree
  		* @param node Ext.data.NodeInterface
  		* @returns Ext.data.NodeInterface The root node
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* node */ js.UndefOr[INodeInterface], INodeInterface]] = js.undefined
}

