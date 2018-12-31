package typings
package gestaltLib.gestaltMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MasonryProps extends js.Object {
  var columnWidth: js.UndefOr[scala.Double] = js.undefined
  var comp: reactLib.reactMod.ReactNs.ComponentType[js.Object]
  var flexible: js.UndefOr[scala.Boolean] = js.undefined
  var gutterWidth: js.UndefOr[scala.Double] = js.undefined
  var items: js.Array[_]
  var layout: js.UndefOr[
    gestaltLib.gestaltLibStrings.MasonryDefaultLayout | gestaltLib.gestaltLibStrings.MasonryUniformRowLayout
  ] = js.undefined
  var loadItems: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var measurementStore: js.UndefOr[js.Any] = js.undefined
  var minCols: js.UndefOr[scala.Double] = js.undefined
  var scrollContainer: js.UndefOr[js.Function0[reactLib.HTMLElement]] = js.undefined
  var virtualize: js.UndefOr[scala.Boolean] = js.undefined
}

