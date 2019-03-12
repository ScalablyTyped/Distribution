package typings
package extjsLib.ExtNs.tipNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IToolTip extends ITip {
  /** [Config Option] (String) */
  var anchor: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var anchorOffset: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Boolean) */
  var anchorToTarget: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var autoHide: js.UndefOr[scala.Boolean] = js.undefined
  /** [Config Option] (String) */
  var delegate: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (Number) */
  var dismissDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number) */
  var hideDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (Number[]) */
  var mouseOffset: js.UndefOr[extjsLib.ExtNs.Array] = js.undefined
  /** [Method] Binds this ToolTip to the specified element
  		* @param t String/HTMLElement/Ext.Element The Element, HtmlElement, or ID of an element to bind to
  		*/
  var setTarget: js.UndefOr[js.Function1[/* t */ js.UndefOr[js.Any], scala.Unit]] = js.undefined
  /** [Config Option] (Number) */
  var showDelay: js.UndefOr[scala.Double] = js.undefined
  /** [Config Option] (HTMLElement/Ext.Element/String) */
  var target: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Boolean) */
  var trackMouse: js.UndefOr[scala.Boolean] = js.undefined
  /** [Property] (HTMLElement) */
  var triggerElement: js.UndefOr[stdLib.HTMLElement] = js.undefined
}

object IToolTip {
  @scala.inline
  def apply(
    ITip: ITip = null,
    anchor: java.lang.String = null,
    anchorOffset: scala.Int | scala.Double = null,
    anchorToTarget: js.UndefOr[scala.Boolean] = js.undefined,
    autoHide: js.UndefOr[scala.Boolean] = js.undefined,
    delegate: java.lang.String = null,
    dismissDelay: scala.Int | scala.Double = null,
    hideDelay: scala.Int | scala.Double = null,
    mouseOffset: extjsLib.ExtNs.Array = null,
    setTarget: /* t */ js.UndefOr[js.Any] => scala.Unit = null,
    showDelay: scala.Int | scala.Double = null,
    target: js.Any = null,
    trackMouse: js.UndefOr[scala.Boolean] = js.undefined,
    triggerElement: stdLib.HTMLElement = null
  ): IToolTip = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, ITip)
    if (anchor != null) __obj.updateDynamic("anchor")(anchor)
    if (anchorOffset != null) __obj.updateDynamic("anchorOffset")(anchorOffset.asInstanceOf[js.Any])
    if (!js.isUndefined(anchorToTarget)) __obj.updateDynamic("anchorToTarget")(anchorToTarget)
    if (!js.isUndefined(autoHide)) __obj.updateDynamic("autoHide")(autoHide)
    if (delegate != null) __obj.updateDynamic("delegate")(delegate)
    if (dismissDelay != null) __obj.updateDynamic("dismissDelay")(dismissDelay.asInstanceOf[js.Any])
    if (hideDelay != null) __obj.updateDynamic("hideDelay")(hideDelay.asInstanceOf[js.Any])
    if (mouseOffset != null) __obj.updateDynamic("mouseOffset")(mouseOffset)
    if (setTarget != null) __obj.updateDynamic("setTarget")(js.Any.fromFunction1(setTarget))
    if (showDelay != null) __obj.updateDynamic("showDelay")(showDelay.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target)
    if (!js.isUndefined(trackMouse)) __obj.updateDynamic("trackMouse")(trackMouse)
    if (triggerElement != null) __obj.updateDynamic("triggerElement")(triggerElement)
    __obj.asInstanceOf[IToolTip]
  }
}

