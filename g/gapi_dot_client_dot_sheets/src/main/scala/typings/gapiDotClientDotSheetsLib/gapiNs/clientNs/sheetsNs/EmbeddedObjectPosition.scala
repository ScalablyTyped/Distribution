package typings
package gapiDotClientDotSheetsLib.gapiNs.clientNs.sheetsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EmbeddedObjectPosition extends js.Object {
  /**
               * If true, the embedded object will be put on a new sheet whose ID
               * is chosen for you. Used only when writing.
               */
  var newSheet: js.UndefOr[scala.Boolean] = js.undefined
  /** The position at which the object is overlaid on top of a grid. */
  var overlayPosition: js.UndefOr[OverlayPosition] = js.undefined
  /**
               * The sheet this is on. Set only if the embedded object
               * is on its own sheet. Must be non-negative.
               */
  var sheetId: js.UndefOr[scala.Double] = js.undefined
}

