package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ICheckboxModel extends IRowModel {
  /** [Config Option] (Boolean) */
  var checkOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var checkSelector: js.UndefOr[java.lang.String] = js.undefined
  /** [Method] Retrieve a configuration to be used in a HeaderContainer  */
  var getHeaderConfig: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Number/String) */
  var injectCheckbox: js.UndefOr[js.Any] = js.undefined
  /** [Method] Toggle between selecting all and deselecting all when clicking on a checkbox header
  		* @param headerCt Object
  		* @param header Object
  		* @param e Object
  		*/
  var onHeaderClick: js.UndefOr[
    js.Function3[
      /* headerCt */ js.UndefOr[js.Any], 
      /* header */ js.UndefOr[js.Any], 
      /* e */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Generates the HTML to be rendered in the injected checkbox column for each row
  		* @param value Object
  		* @param metaData Object
  		* @param record Object
  		* @param rowIndex Object
  		* @param colIndex Object
  		* @param store Object
  		* @param view Object
  		*/
  var renderer: js.UndefOr[
    js.Function7[
      /* value */ js.UndefOr[js.Any], 
      /* metaData */ js.UndefOr[js.Any], 
      /* record */ js.UndefOr[js.Any], 
      /* rowIndex */ js.UndefOr[js.Any], 
      /* colIndex */ js.UndefOr[js.Any], 
      /* store */ js.UndefOr[js.Any], 
      /* view */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var showHeaderCheckbox: js.UndefOr[scala.Boolean] = js.undefined
}

