package typings.extjs.Ext

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip
  extends typings.extjs.Ext.tip.ITip {
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var anchorOffset: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Boolean) */
  var anchorToTarget: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var dismissDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number) */
  var hideDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (Number[]) */
  var mouseOffset: js.UndefOr[Array] = js.undefined
  /** [Method] Binds this ToolTip to the specified element
    * @param t String/HTMLElement/Ext.Element The Element, HtmlElement, or ID of an element to bind to
    */
  var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[js.Any], Unit]] = js.undefined
  /** [Config Option] (Number) */
  var showDelay: js.UndefOr[Double] = js.undefined
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackMouse: js.UndefOr[Boolean] = js.undefined
  /** [Property] (HTMLElement) */
  var triggerElement: js.UndefOr[HTMLElement] = js.undefined
}

object IToolTip {
  @scala.inline
  def apply(
    ITip: typings.extjs.Ext.tip.ITip = null,
    anchor: java.lang.String = null,
    anchorOffset: js.UndefOr[Double] = js.undefined,
    anchorToTarget: js.UndefOr[Boolean] = js.undefined,
    autoHide: js.UndefOr[Boolean] = js.undefined,
    delegate: java.lang.String = null,
    dismissDelay: js.UndefOr[Double] = js.undefined,
    hideDelay: js.UndefOr[Double] = js.undefined,
    mouseOffset: Array = null,
    setTarget: /* t */ js.UndefOr[js.Any] => Unit = null,
    showDelay: js.UndefOr[Double] = js.undefined,
    target: js.Any = null,
    trackMouse: js.UndefOr[Boolean] = js.undefined,
    triggerElement: HTMLElement = null
  ): IToolTip = {
    val __obj = js.Dynamic.literal()
    if (ITip != null) js.Dynamic.global.Object.assign(__obj, ITip)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorOffset)) __obj.updateDynamic("anchorOffset")(anchorOffset.get.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorToTarget)) __obj.updateDynamic("anchorToTarget")(anchorToTarget.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide.get.asInstanceOf[js.Any])
    if (delegate != null) __obj.updateDynamic("delegate")(delegate.asInstanceOf[js.Any])
    if (!js.isUndefined(dismissDelay)) __obj.updateDynamic("dismissDelay")(dismissDelay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hideDelay)) __obj.updateDynamic("hideDelay")(hideDelay.get.asInstanceOf[js.Any])
    if (mouseOffset != null) __obj.updateDynamic("mouseOffset")(mouseOffset.asInstanceOf[js.Any])
    if (setTarget != null) __obj.updateDynamic("setTarget")(js.Any.fromFunction1(setTarget))
    if (!js.isUndefined(showDelay)) __obj.updateDynamic("showDelay")(showDelay.get.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse.get.asInstanceOf[js.Any])
    if (triggerElement != null) __obj.updateDynamic("triggerElement")(triggerElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[IToolTip]
  }
}

