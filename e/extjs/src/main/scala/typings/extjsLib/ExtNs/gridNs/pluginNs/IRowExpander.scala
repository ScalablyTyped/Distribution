package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRowExpander
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Config Option] (Boolean) */
  var expandOnDblClick: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var expandOnEnter: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] The init method is invoked after initComponent method has been run for the client Component
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IRowExpander: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var selectRowOnExpand: js.UndefOr[scala.Boolean] = js.undefined
}

