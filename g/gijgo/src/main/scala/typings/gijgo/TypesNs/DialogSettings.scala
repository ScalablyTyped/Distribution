package typings.gijgo.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Dialog
trait DialogSettings extends js.Object {
  var autoOpen: js.UndefOr[Boolean] = js.undefined
  var closeButtonInHeader: js.UndefOr[Boolean] = js.undefined
  var closeOnEscape: js.UndefOr[Boolean] = js.undefined
  //Events
  var closed: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var closing: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var drag: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dragStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var dragStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var initialized: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var maxHeight: js.UndefOr[Double] = js.undefined
  var maxWidth: js.UndefOr[Double] = js.undefined
  var minHeight: js.UndefOr[Double] = js.undefined
  var minWidth: js.UndefOr[Double] = js.undefined
  var modal: js.UndefOr[Boolean] = js.undefined
  var opened: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var opening: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var resizable: js.UndefOr[Boolean] = js.undefined
  var resize: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var resizeStart: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var resizeStop: js.UndefOr[js.Function1[/* e */ js.Any, _]] = js.undefined
  var scrollable: js.UndefOr[Boolean] = js.undefined
  var title: js.UndefOr[String] = js.undefined
  var uiLibrary: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object DialogSettings {
  @scala.inline
  def apply(
    autoOpen: js.UndefOr[Boolean] = js.undefined,
    closeButtonInHeader: js.UndefOr[Boolean] = js.undefined,
    closeOnEscape: js.UndefOr[Boolean] = js.undefined,
    closed: /* e */ js.Any => _ = null,
    closing: /* e */ js.Any => _ = null,
    drag: /* e */ js.Any => _ = null,
    dragStart: /* e */ js.Any => _ = null,
    dragStop: /* e */ js.Any => _ = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    initialized: /* e */ js.Any => _ = null,
    locale: String = null,
    maxHeight: Int | Double = null,
    maxWidth: Int | Double = null,
    minHeight: Int | Double = null,
    minWidth: Int | Double = null,
    modal: js.UndefOr[Boolean] = js.undefined,
    opened: /* e */ js.Any => _ = null,
    opening: /* e */ js.Any => _ = null,
    resizable: js.UndefOr[Boolean] = js.undefined,
    resize: /* e */ js.Any => _ = null,
    resizeStart: /* e */ js.Any => _ = null,
    resizeStop: /* e */ js.Any => _ = null,
    scrollable: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    uiLibrary: String = null,
    width: Int | Double = null
  ): DialogSettings = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoOpen)) __obj.updateDynamic("autoOpen")(autoOpen)
    if (!js.isUndefined(closeButtonInHeader)) __obj.updateDynamic("closeButtonInHeader")(closeButtonInHeader)
    if (!js.isUndefined(closeOnEscape)) __obj.updateDynamic("closeOnEscape")(closeOnEscape)
    if (closed != null) __obj.updateDynamic("closed")(js.Any.fromFunction1(closed))
    if (closing != null) __obj.updateDynamic("closing")(js.Any.fromFunction1(closing))
    if (drag != null) __obj.updateDynamic("drag")(js.Any.fromFunction1(drag))
    if (dragStart != null) __obj.updateDynamic("dragStart")(js.Any.fromFunction1(dragStart))
    if (dragStop != null) __obj.updateDynamic("dragStop")(js.Any.fromFunction1(dragStop))
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialized != null) __obj.updateDynamic("initialized")(js.Any.fromFunction1(initialized))
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (maxHeight != null) __obj.updateDynamic("maxHeight")(maxHeight.asInstanceOf[js.Any])
    if (maxWidth != null) __obj.updateDynamic("maxWidth")(maxWidth.asInstanceOf[js.Any])
    if (minHeight != null) __obj.updateDynamic("minHeight")(minHeight.asInstanceOf[js.Any])
    if (minWidth != null) __obj.updateDynamic("minWidth")(minWidth.asInstanceOf[js.Any])
    if (!js.isUndefined(modal)) __obj.updateDynamic("modal")(modal)
    if (opened != null) __obj.updateDynamic("opened")(js.Any.fromFunction1(opened))
    if (opening != null) __obj.updateDynamic("opening")(js.Any.fromFunction1(opening))
    if (!js.isUndefined(resizable)) __obj.updateDynamic("resizable")(resizable)
    if (resize != null) __obj.updateDynamic("resize")(js.Any.fromFunction1(resize))
    if (resizeStart != null) __obj.updateDynamic("resizeStart")(js.Any.fromFunction1(resizeStart))
    if (resizeStop != null) __obj.updateDynamic("resizeStop")(js.Any.fromFunction1(resizeStop))
    if (!js.isUndefined(scrollable)) __obj.updateDynamic("scrollable")(scrollable)
    if (title != null) __obj.updateDynamic("title")(title)
    if (uiLibrary != null) __obj.updateDynamic("uiLibrary")(uiLibrary)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogSettings]
  }
}

