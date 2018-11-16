package typings
package extjsLib.ExtNs.treeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IView
  extends extjsLib.ExtNs.viewNs.ITable {
  /** [Config Option] (Boolean) */
  @JSName("animate")
  var animate_IView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Collapses a record that is loaded in the view
  		* @param record Ext.data.Model The record to collapse
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var collapse: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Expands a record that is loaded in the view
  		* @param record Ext.data.Model The record to expand
  		* @param deep Boolean True to expand nodes all the way down the tree hierarchy.
  		* @param callback Function The function to run after the expand is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var expand: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Gets the base TreeStore from the bound TreePanel  */
  var getTreeStore: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Boolean) */
  var isTreeView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  @JSName("loadMask")
  var loadMask_IView: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Template method it is called when a new store is bound to the current instance  */
  @JSName("onBindStore")
  var onBindStore_IView: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Template method it is called when an existing store is unbound from the current instance  */
  @JSName("onUnbindStore")
  var onUnbindStore_IView: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var rootVisible: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Toggles a record between expanded and collapsed
  		* @param record Ext.data.Model
  		* @param deep Boolean True to collapse nodes all the way up the tree hierarchy.
  		* @param callback Function The function to run after the expand/collapse is completed
  		* @param scope Object The scope of the callback function.
  		*/
  var toggle: js.UndefOr[
    js.Function4[
      /* record */ js.UndefOr[extjsLib.ExtNs.dataNs.IModel], 
      /* deep */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
}

