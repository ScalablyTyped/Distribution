package typings
package extjsLib.ExtNs.gridNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IActionColumn
  extends extjsLib.ExtNs.gridNs.columnNs.IColumn {
  /** [Config Option] (String) */
  var altText: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Cascades down the component container heirarchy from this component passed in the first call  calling the specified
  		* @param fn Object
  		* @param scope Object
  		* @returns Ext.Container this
  		*/
  @JSName("cascade")
  var cascade_IActionColumn: js.UndefOr[
    js.Function2[
      /* fn */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      extjsLib.ExtNs.IContainer
    ]
  ] = js.undefined
  /** [Method] Renderer closure iterates through items creating an element for each and tagging with an identifying class name x ac
  		* @param v Object
  		* @param meta Object
  		* @param record Object
  		* @param rowIdx Object
  		* @param colIdx Object
  		* @param store Object
  		* @param view Object
  		*/
  @JSName("defaultRenderer")
  var defaultRenderer_IActionColumn: js.UndefOr[
    js.Function7[
      /* v */ js.UndefOr[js.Any], 
      /* meta */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* colIdx */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Disables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var disableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Method] Enables this ActionColumn s action at the specified index
  		* @param index Number/Ext.grid.column.Action
  		* @param silent Boolean
  		*/
  var enableAction: js.UndefOr[
    js.Function2[/* index */ js.UndefOr[js.Any], /* silent */ js.UndefOr[scala.Boolean], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Function) */
  @JSName("getClass")
  var getClass_FIActionColumn: js.UndefOr[js.Any] = js.undefined
  /** [Method] Private override because this cannot function as a Container and it has an items property which is an Array NOT a M  */
  @JSName("getRefItems")
  var getRefItems_IActionColumn: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Function) */
  var getTip: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Function) */
  var handler: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (String) */
  var icon: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var iconCls: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Object[]) */
  @JSName("items")
  var items_IActionColumn: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Config Option] (Boolean) */
  var stopSelection: js.UndefOr[scala.Boolean] = js.undefined
}

