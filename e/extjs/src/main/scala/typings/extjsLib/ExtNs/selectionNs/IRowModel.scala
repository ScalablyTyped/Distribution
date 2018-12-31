package typings
package extjsLib.ExtNs.selectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRowModel extends IModel {
  /** [Config Option] (Boolean) */
  var enableKeyNav: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Returns position of the first selected cell in the selection in the format row row column column  */
  var getCurrentPosition: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreRightMouseSelection: js.UndefOr[scala.Boolean] = js.undefined
  /** [Method] Selects the record immediately following the currently selected record
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		* @returns Boolean true if there is a next record, else false
  		*/
  var selectNext: js.UndefOr[
    js.Function2[
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ]
  ] = js.undefined
  /** [Method] Selects the record that precedes the currently selected record
  		* @param keepExisting Boolean True to retain existing selections
  		* @param suppressEvent Boolean Set to false to not fire a select event
  		* @returns Boolean true if there is a previous record, else false
  		*/
  var selectPrevious: js.UndefOr[
    js.Function2[
      /* keepExisting */ js.UndefOr[scala.Boolean], 
      /* suppressEvent */ js.UndefOr[scala.Boolean], 
      scala.Boolean
    ]
  ] = js.undefined
}

