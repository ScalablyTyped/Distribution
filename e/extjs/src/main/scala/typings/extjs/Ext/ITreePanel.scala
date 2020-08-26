package typings.extjs.Ext

import typings.extjs.Ext.data.IModel
import typings.extjs.Ext.data.INodeInterface
import typings.extjs.Ext.data.ITreeStore
import typings.extjs.Ext.panel.ITable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITreePanel extends ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_ITreePanel: js.UndefOr[Boolean] = js.native
  /** [Method] Collapse all nodes
    * @param callback Function A function to execute when the collapse finishes.
    * @param scope Object The scope of the callback function
    */
  var collapseAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Collapses a record that is loaded in the tree
    * @param record Ext.data.Model The record to collapse
    * @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
    * @param callback Function The function to run after the collapse is completed
    * @param scope Object The scope of the callback function.
    */
  var collapseNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.native
  /** [Method] Expand all nodes
    * @param callback Function A function to execute when the expand finishes.
    * @param scope Object The scope of the callback function
    */
  var expandAll: js.UndefOr[
    js.Function2[/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], Unit]
  ] = js.native
  /** [Method] Expands a record that is loaded in the tree
    * @param record Ext.data.Model The record to expand
    * @param deep Boolean True to expand nodes all the way down the tree hierarchy.
    * @param callback Function The function to run after the expand is completed
    * @param scope Object The scope of the callback function.
    */
  var expandNode: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[IModel], 
      /* deep */ js.UndefOr[Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
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
      Unit
    ]
  ] = js.native
  /** [Config Option] (Boolean) */
  var folderSort: js.UndefOr[Boolean] = js.native
  /** [Method] Retrieve an array of checked records
    * @returns Ext.data.NodeInterface[] An array containing the checked records
    */
  var getChecked: js.UndefOr[js.Function0[Array]] = js.native
  /** [Method] Returns the root node for this tree
    * @returns Ext.data.NodeInterface
    */
  var getRootNode: js.UndefOr[js.Function0[INodeInterface]] = js.native
  /** [Config Option] (Boolean) */
  var lines: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.Model/Ext.data.NodeInterface/Object) */
  var root: js.UndefOr[js.Any] = js.native
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[Boolean] = js.native
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
      Unit
    ]
  ] = js.native
  /** [Method] Sets root node of this tree
    * @param root Ext.data.Model/Ext.data.NodeInterface/Object
    * @returns Ext.data.NodeInterface The new root
    */
  var setRootNode: js.UndefOr[js.Function1[/* root */ js.UndefOr[js.Any], INodeInterface]] = js.native
  /** [Config Option] (Boolean) */
  var singleExpand: js.UndefOr[Boolean] = js.native
  /** [Config Option] (Ext.data.TreeStore) */
  @JSName("store")
  var store_ITreePanel: js.UndefOr[ITreeStore] = js.native
  /** [Config Option] (Boolean) */
  var useArrows: js.UndefOr[Boolean] = js.native
}

object ITreePanel {
  @scala.inline
  def apply(): ITreePanel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ITreePanel]
  }
  @scala.inline
  implicit class ITreePanelOps[Self <: ITreePanel] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setCollapseAll(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("collapseAll", js.Any.fromFunction2(value))
    @scala.inline
    def deleteCollapseAll: Self = this.set("collapseAll", js.undefined)
    @scala.inline
    def setCollapseNode(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("collapseNode", js.Any.fromFunction4(value))
    @scala.inline
    def deleteCollapseNode: Self = this.set("collapseNode", js.undefined)
    @scala.inline
    def setDisplayField(value: java.lang.String): Self = this.set("displayField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayField: Self = this.set("displayField", js.undefined)
    @scala.inline
    def setExpandAll(value: (/* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit): Self = this.set("expandAll", js.Any.fromFunction2(value))
    @scala.inline
    def deleteExpandAll: Self = this.set("expandAll", js.undefined)
    @scala.inline
    def setExpandNode(
      value: (/* record */ js.UndefOr[IModel], /* deep */ js.UndefOr[Boolean], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("expandNode", js.Any.fromFunction4(value))
    @scala.inline
    def deleteExpandNode: Self = this.set("expandNode", js.undefined)
    @scala.inline
    def setExpandPath(
      value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("expandPath", js.Any.fromFunction5(value))
    @scala.inline
    def deleteExpandPath: Self = this.set("expandPath", js.undefined)
    @scala.inline
    def setFolderSort(value: Boolean): Self = this.set("folderSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFolderSort: Self = this.set("folderSort", js.undefined)
    @scala.inline
    def setGetChecked(value: () => Array): Self = this.set("getChecked", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetChecked: Self = this.set("getChecked", js.undefined)
    @scala.inline
    def setGetRootNode(value: () => INodeInterface): Self = this.set("getRootNode", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetRootNode: Self = this.set("getRootNode", js.undefined)
    @scala.inline
    def setLines(value: Boolean): Self = this.set("lines", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLines: Self = this.set("lines", js.undefined)
    @scala.inline
    def setRoot(value: js.Any): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    @scala.inline
    def setRootVisible(value: Boolean): Self = this.set("rootVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRootVisible: Self = this.set("rootVisible", js.undefined)
    @scala.inline
    def setSelectPath(
      value: (/* path */ js.UndefOr[java.lang.String], /* field */ js.UndefOr[java.lang.String], /* separator */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("selectPath", js.Any.fromFunction5(value))
    @scala.inline
    def deleteSelectPath: Self = this.set("selectPath", js.undefined)
    @scala.inline
    def setSetRootNode(value: /* root */ js.UndefOr[js.Any] => INodeInterface): Self = this.set("setRootNode", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSetRootNode: Self = this.set("setRootNode", js.undefined)
    @scala.inline
    def setSingleExpand(value: Boolean): Self = this.set("singleExpand", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleExpand: Self = this.set("singleExpand", js.undefined)
    @scala.inline
    def setStore(value: ITreeStore): Self = this.set("store", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStore: Self = this.set("store", js.undefined)
    @scala.inline
    def setUseArrows(value: Boolean): Self = this.set("useArrows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseArrows: Self = this.set("useArrows", js.undefined)
  }
  
}

