package typings
package extjsLib.ExtNs.dataNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPageMap
  extends extjsLib.ExtNs.utilNs.ILruCache {
  /** [Method] Returns the first record in this page map which elicits a true return value from the passed selection function
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this PageMap.
  		* @returns Object The first record in this page map which returned true from the selection function, or null if none was found.
  		*/
  var findBy: js.UndefOr[js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], _]] = js.undefined
  /** [Method] Returns the index in the whole dataset of the first record in this page map which elicits a true return value from th
  		* @param fn Function The selection function to execute for each item.
  		* @param scope Object The scope (this reference) in which the function is executed. Defaults to this PageMap.
  		* @returns Number The index first record in this page map which returned true from the selection function, or -1 if none was found.
  		*/
  var findIndexBy: js.UndefOr[
    js.Function2[/* fn */ js.UndefOr[js.Any], /* scope */ js.UndefOr[js.Any], scala.Double]
  ] = js.undefined
  /** [Method] Remove an item from the hash
  		* @returns Boolean True if the item was successfully removed.
  		*/
  @JSName("remove")
  var remove_IPageMap: js.UndefOr[js.Function0[scala.Boolean]] = js.undefined
}

