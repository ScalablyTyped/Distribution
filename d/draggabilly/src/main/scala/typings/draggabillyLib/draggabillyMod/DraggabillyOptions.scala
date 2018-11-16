package typings
package draggabillyLib.draggabillyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DraggabillyOptions extends js.Object {
  var axis: js.UndefOr[draggabillyLib.draggabillyLibStrings.x | draggabillyLib.draggabillyLibStrings.y] = js.undefined
  var containment: js.UndefOr[stdLib.Element | java.lang.String | scala.Boolean] = js.undefined
  var grid: js.UndefOr[js.Tuple2[scala.Double, scala.Double]] = js.undefined
  var handle: js.UndefOr[java.lang.String] = js.undefined
}

