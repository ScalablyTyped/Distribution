package typings
package extjsLib.ExtNs.layoutNs.componentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IAuto extends IComponent {
  /** [Method] Called to perform the calculations for this layout
  		* @param ownerContext Object
  		*/
  @JSName("calculate")
  var calculate_IAuto: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var setHeightInDom: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var setWidthInDom: js.UndefOr[scala.Boolean] = js.undefined
}

