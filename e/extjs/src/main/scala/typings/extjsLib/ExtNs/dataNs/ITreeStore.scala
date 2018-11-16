package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITreeStore extends IAbstractStore {
  /** [Config Option] (Boolean) */
  var clearOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var clearRemovedOnLoad: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var defaultRootId: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootProperty: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var defaultRootText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the record node by id
  		* @param id Object
  		* @returns Ext.data.NodeInterface
  		*/
  var getNodeById: js.UndefOr[js.Function1[/* id */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.undefined
  /** [Config Option] (String) */
  var nodeParam: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  /** [Method] Sets the root node for this store
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.undefined
}

