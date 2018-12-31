package typings
package extjsLib.ExtNs.layoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClassList
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds a single class to the class list
  		* @param cls Object
  		*/
  var add: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Adds one or more classes in an array or space delimited string to the class list
  		* @param classes Object
  		*/
  var addMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes a single class from the class list
  		* @param cls Object
  		*/
  var remove: js.UndefOr[js.Function1[/* cls */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Removes one or more classes in an array or space delimited string from the class list
  		* @param classes Object
  		*/
  var removeMany: js.UndefOr[js.Function1[/* classes */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

