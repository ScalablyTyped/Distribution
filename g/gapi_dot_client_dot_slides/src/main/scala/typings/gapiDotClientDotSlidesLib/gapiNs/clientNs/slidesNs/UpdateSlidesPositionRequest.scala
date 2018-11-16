package typings
package gapiDotClientDotSlidesLib.gapiNs.clientNs.slidesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait UpdateSlidesPositionRequest extends js.Object {
  /**
               * The index where the slides should be inserted, based on the slide
               * arrangement before the move takes place. Must be between zero and the
               * number of slides in the presentation, inclusive.
               */
  var insertionIndex: js.UndefOr[scala.Double] = js.undefined
  /**
               * The IDs of the slides in the presentation that should be moved.
               * The slides in this list must be in existing presentation order, without
               * duplicates.
               */
  var slideObjectIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

