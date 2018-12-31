package typings
package extjsLib.ExtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITreePanel
  extends extjsLib.ExtNs.panelNs.ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_ITreePanel: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Collapse all nodes
  		* @param callback Function A function to execute when the collapse finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var collapseAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Collapses a record that is loaded in the tree
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapseNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Expand all nodes
  		* @param callback Function A function to execute when the expand finishes.
  		* @param scope Object The scope of the callback function
  		*/
  var expandAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Method] Expands a record that is loaded in the tree
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expandNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expand the tree to the path of a particular node
  		* @param path String The path to expand. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the expand finishes. The callback will be called with (success, lastNode) where success is if the expand was successful and lastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var expandPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Retrieve an array of checked records
  		* @returns Ext.data.NodeInterface[] An array containing the checked records
  		*/
  var getChecked: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Returns the root node for this tree
  		* @returns Ext.data.NodeInterface
  		*/
  var getRootNode: js.UndefOr[js.Function0[extjsLib.ExtNs.dataNs.INodeInterface]] = js.undefined
  /** [Config Option] (Boolean) */
  var lines: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Expand the tree to the path of a particular node then select it
  		* @param path String The path to select. The path should include a leading separator.
  		* @param field String The field to get the data from. Defaults to the model idProperty.
  		* @param separator String A separator to use.
  		* @param callback Function A function to execute when the select finishes. The callback will be called with (bSuccess, oLastNode) where bSuccess is if the select was successful and oLastNode is the last node that was expanded.
  		* @param scope Object The scope of the callback function
  		*/
  var selectPath: js.UndefOr[
    js.Function5[
      /* path */ js.UndefOr[java.lang.String], 
      /* field */ js.UndefOr[java.lang.String], 
      /* separator */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets root node of this tree
  		* @param root Ext.data.Model/Ext.data.NodeInterface/Object
  		* @returns Ext.data.NodeInterface The new root
  		*/
  var setRootNode: js.UndefOr[
    js.Function1[/* root */ js.UndefOr[js.Any], extjsLib.ExtNs.dataNs.INodeInterface]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var singleExpand: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Ext.data.TreeStore) */
  @JSName("store")
  var store_ITreePanel: js.UndefOr[extjsLib.ExtNs.dataNs.ITreeStore] = js.undefined
  /** [Config Option] (Boolean) */
  var useArrows: js.UndefOr[scala.Boolean] = js.undefined
}

