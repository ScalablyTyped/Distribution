package typings
package extjsLib.ExtNs.layoutNs.componentNs.fieldNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IField
  extends extjsLib.ExtNs.layoutNs.componentNs.IAuto {
  /** [Method] Called before any calculation cycles to reset DOM values and prepare for calculation
  		* @param ownerContext Object
  		*/
  @JSName("beginLayoutCycle")
  var beginLayoutCycle_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Called before any calculation cycles to prepare for layout
  		* @param ownerContext Object
  		*/
  @JSName("beginLayout")
  var beginLayout_IField: js.UndefOr[js.Function1[/* ownerContext */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var elementId: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var errorStrategies: js.UndefOr[js.Any] = js.undefined
  /** [Method] Return the set of strategy functions from the errorStrategies collection that is appropriate for the field s msgTarge  */
  var getErrorStrategy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Method] Return the set of strategy functions from the labelStrategies collection that is appropriate for the field s labelAli  */
  var getLabelStrategy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /** [Property] (Object) */
  var labelStrategies: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var left: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var qtip: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var right: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var side: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var title: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var top: js.UndefOr[js.Any] = js.undefined
  /** [Property] (Object) */
  var under: js.UndefOr[js.Any] = js.undefined
}

