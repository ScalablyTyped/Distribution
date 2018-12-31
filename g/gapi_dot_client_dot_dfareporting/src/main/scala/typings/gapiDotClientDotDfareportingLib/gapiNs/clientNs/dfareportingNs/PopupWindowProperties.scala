package typings
package gapiDotClientDotDfareportingLib.gapiNs.clientNs.dfareportingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopupWindowProperties extends js.Object {
  /** Popup dimension for a creative. This is a read-only field. Applicable to the following creative types: all RICH_MEDIA and all VPAID */
  var dimension: js.UndefOr[Size] = js.undefined
  /** Upper-left corner coordinates of the popup window. Applicable if positionType is COORDINATES. */
  var offset: js.UndefOr[OffsetPosition] = js.undefined
  /** Popup window position either centered or at specific coordinate. */
  var positionType: js.UndefOr[java.lang.String] = js.undefined
  /** Whether to display the browser address bar. */
  var showAddressBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to display the browser menu bar. */
  var showMenuBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to display the browser scroll bar. */
  var showScrollBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to display the browser status bar. */
  var showStatusBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Whether to display the browser tool bar. */
  var showToolBar: js.UndefOr[scala.Boolean] = js.undefined
  /** Title of popup window. */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

