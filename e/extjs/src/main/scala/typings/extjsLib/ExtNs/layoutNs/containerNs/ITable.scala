package typings
package extjsLib.ExtNs.layoutNs.containerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITable extends IContainer {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_ITable: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var columns: js.UndefOr[scala.Double] = js.undefined
  /** [Method] This method if implemented is called after all layouts have completed  */
  @JSName("finalizeLayout")
  var finalizeLayout_ITable: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Validates item is in the proper place in the dom
  		* @param item Object
  		* @param target Object
  		* @param rowIdx Object
  		* @param cellIdx Object
  		*/
  @JSName("isValidParent")
  var isValidParent_ITable: js.UndefOr[
    js.Function4[
      /* item */ js.UndefOr[js.Any], 
      /* target */ js.UndefOr[js.Any], 
      /* rowIdx */ js.UndefOr[js.Any], 
      /* cellIdx */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Object) */
  var tableAttrs: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var tdAttrs: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var trAttrs: js.UndefOr[js.Any] = js.undefined
}

