package typings
package extjsLib.ExtNs.gridNs.lockingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderContainer
  extends extjsLib.ExtNs.gridNs.headerNs.IContainer {
  /** [Method] This is the function which all other column access methods are based upon Return the full column set for the whole Lo
  		* @returns Array
  		*/
  @JSName("getGridColumns")
  var getGridColumns_IHeaderContainer: js.UndefOr[js.Function0[extjsLib.ExtNs.Array]] = js.undefined
  /** [Method] Used by ComponentQuery child and down to retrieve all of the items which can potentially be considered a child of th  */
  @JSName("getRefItems")
  var getRefItems_IHeaderContainer: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
}

object IHeaderContainer {
  @scala.inline
  def apply(
    IContainer: extjsLib.ExtNs.gridNs.headerNs.IContainer = null,
    getGridColumns: () => extjsLib.ExtNs.Array = null,
    getRefItems: () => scala.Unit = null
  ): IHeaderContainer = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IContainer)
    if (getGridColumns != null) __obj.updateDynamic("getGridColumns")(js.Any.fromFunction0(getGridColumns))
    if (getRefItems != null) __obj.updateDynamic("getRefItems")(js.Any.fromFunction0(getRefItems))
    __obj.asInstanceOf[IHeaderContainer]
  }
}

