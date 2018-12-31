package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICellModel extends IModel {
  /** [Method] Deselects a record instance by record instance or index
  		* @param record Object
  		* @param suppressEvent Object
  		*/
  @JSName("deselect")
  var deselect_ICellModel: js.UndefOr[
    js.Function2[/* record */ js.UndefOr[js.Any], /* suppressEvent */ js.UndefOr[js.Any], scala.Unit]
  ] = js.undefined
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns the current position in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] ("SINGLE") */
  @JSName("mode")
  var mode_ICellModel: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Boolean) */
  var preventWrap: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Selects a record instance by record instance or index
  		* @param pos Object
  		* @param keepExisting Object
  		* @param suppressEvent Object
  		*/
  @JSName("select")
  var select_ICellModel: js.UndefOr[
    js.Function3[
      /* pos */ js.UndefOr[js.Any], 
      /* keepExisting */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[js.Any], 
      scala.Unit
    ]
  ] = js.undefined
  /** [Method] Sets the current position
  		* @param position Object The position to set.
  		* @param suppressEvent Boolean True to suppress selection events
  		*/
  var setCurrentPosition: js.UndefOr[
    js.Function2[
      /* position */ js.UndefOr[js.Any], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Unit
    ]
  ] = js.undefined
}

