package typings
package extjsLib.ExtNs.treeNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITreeViewDragDrop
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var allowContainerDrops: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var allowParentInserts: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var appendOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Object/Boolean) */
  var containerScroll: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var ddGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var displayField: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dragGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dragText: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var dropGroup: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrag: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var enableDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var expandDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param view Object
  		*/
  @JSName("init")
  var init_ITreeViewDragDrop: js.UndefOr[js.Function1[/* view */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var nodeHighlightColor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var nodeHighlightOnDrop: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var nodeHighlightOnRepair: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var sortOnDrop: js.UndefOr[scala.Boolean] = js.undefined
}

