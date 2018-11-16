package typings
package extjsLib.ExtNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IElementContainer
  extends extjsLib.ExtNs.IBase {
  /** [Method] Adds each argument passed to this method to the childEls array  */
  var addChildEls: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Removes items in the childEls array based on the return value of a supplied test function
  		* @param testFn Function The test function.
  		*/
  var removeChildEls: js.UndefOr[js.Function1[/* testFn */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

