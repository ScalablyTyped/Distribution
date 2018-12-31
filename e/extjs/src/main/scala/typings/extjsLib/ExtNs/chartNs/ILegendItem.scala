package typings
package extjsLib.ExtNs.chartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILegendItem
  extends extjsLib.ExtNs.drawNs.ICompositeSprite {
  /** [Method] Creates all the individual sprites for this legend item
  		* @param config Object
  		*/
  var createLegend: js.UndefOr[js.Function1[/* config */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Method] Update the positions of all this item s sprites to match the root position of the legend box
  		* @param relativeTo Object If specified, this object's 'x' and 'y' values will be used as the reference point for the relative positioning. Defaults to the Legend.
  		*/
  var updatePosition: js.UndefOr[js.Function1[/* relativeTo */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
}

