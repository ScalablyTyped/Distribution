package typings
package gijgoLib.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dialog
trait DialogSettings extends js.Object {
  var autoOpen: js.UndefOr[scala.Boolean] = js.undefined
  var closeButtonInHeader: js.UndefOr[scala.Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[scala.Boolean] = js.undefined
  //Events
  var closed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var closing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dragStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var draggable: js.UndefOr[scala.Boolean] = js.undefined
  var height: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var locale: js.UndefOr[java.lang.String] = js.undefined
  var maxHeight: js.UndefOr[scala.Double] = js.undefined
  var maxWidth: js.UndefOr[scala.Double] = js.undefined
  var minHeight: js.UndefOr[scala.Double] = js.undefined
  var minWidth: js.UndefOr[scala.Double] = js.undefined
  var modal: js.UndefOr[scala.Boolean] = js.undefined
  var opened: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var opening: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var resizable: js.UndefOr[scala.Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var resizeStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var resizeStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var scrollable: js.UndefOr[scala.Boolean] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var uiLibrary: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

