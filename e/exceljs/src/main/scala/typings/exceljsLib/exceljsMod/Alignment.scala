package typings
package exceljsLib.exceljsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Alignment extends js.Object {
  var horizontal: js.UndefOr[
    exceljsLib.exceljsLibStrings.left | exceljsLib.exceljsLibStrings.center | exceljsLib.exceljsLibStrings.right | exceljsLib.exceljsLibStrings.fill | exceljsLib.exceljsLibStrings.justify | exceljsLib.exceljsLibStrings.centerContinuous | exceljsLib.exceljsLibStrings.distributed
  ] = js.undefined
  var indent: js.UndefOr[scala.Double] = js.undefined
  var readingOrder: js.UndefOr[exceljsLib.exceljsLibStrings.rtl | exceljsLib.exceljsLibStrings.ltr] = js.undefined
  var textRotation: js.UndefOr[scala.Double | exceljsLib.exceljsLibStrings.vertical] = js.undefined
  var vertical: js.UndefOr[
    exceljsLib.exceljsLibStrings.top | exceljsLib.exceljsLibStrings.middle | exceljsLib.exceljsLibStrings.bottom | exceljsLib.exceljsLibStrings.distributed | exceljsLib.exceljsLibStrings.justify
  ] = js.undefined
  var wrapText: js.UndefOr[scala.Boolean] = js.undefined
}

