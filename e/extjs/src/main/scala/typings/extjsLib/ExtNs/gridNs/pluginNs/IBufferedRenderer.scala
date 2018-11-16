package typings
package extjsLib.ExtNs.gridNs.pluginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IBufferedRenderer
  extends extjsLib.ExtNs.IAbstractPlugin {
  /** [Method] Initialize this as a plugin
  		* @param grid Object
  		*/
  @JSName("init")
  var init_IBufferedRenderer: js.UndefOr[js.Function1[/* grid */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var leadingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var numFromEdge: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var percentageFromEdge: js.UndefOr[scala.Double] = js.undefined
  /** [Property] (Number) */
  var position: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Scrolls to and optionlly selects the specified row index in the total dataset
  		* @param recordIdx Number The zero-based position in the dataset to scroll to.
  		* @param doSelect Boolean Pass as true to select the specified row.
  		* @param callback Function A function to call when the row has been scrolled to.
  		* @param scope Object The scope (this reference) in which to execute the callback. Defaults to this BufferedRenderer.
  		*/
  var scrollTo: js.UndefOr[
    js.Function4[
      /* recordIdx */ js.UndefOr[scala.Double], 
      /* doSelect */ js.UndefOr[scala.Boolean], 
      /* callback */ js.UndefOr[js.Any], 
      /* scope */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Config Option] (Number) */
  var scrollToLoadBuffer: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var synchronousRender: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Number) */
  var trailingBufferZone: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var variableRowHeight: js.UndefOr[scala.Boolean] = js.undefined
}

