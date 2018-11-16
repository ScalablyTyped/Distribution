package typings
package electronLib.ElectronNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait SegmentedControlSegment extends js.Object {
  // Docs: http://electron.atom.io/docs/api/structures/segmented-control-segment
  /**
       * Whether this segment is selectable. Default: true
       */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * The image to appear in this segment
       */
  var icon: js.UndefOr[NativeImage] = js.undefined
  /**
       * The text to appear in this segment
       */
  var label: js.UndefOr[java.lang.String] = js.undefined
}

