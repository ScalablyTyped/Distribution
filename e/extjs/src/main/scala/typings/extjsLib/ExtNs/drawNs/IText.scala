package typings
package extjsLib.ExtNs.drawNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText extends IComponent {
  /** [Config Option] (Number) */
  var degrees: js.UndefOr[scala.Double] = js.undefined
  /** [Method] Sets the clockwise rotation angle relative to the horizontal axis
  		* @param degrees Number The clockwise angle (in degrees) from the horizontal axis by which the text should be rotated.
  		*/
  var setAngle: js.UndefOr[js.Function1[/* degrees */ js.UndefOr[scala.Double], scala.Unit]] = js.undefined
  /** [Method] Updates this item s text
  		* @param t String The text to display (html not accepted).
  		*/
  var setText: js.UndefOr[js.Function1[/* t */ js.UndefOr[java.lang.String], scala.Unit]] = js.undefined
  /** [Config Option] (String) */
  var styleSelector: js.UndefOr[java.lang.String] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    autoSize: js.UndefOr[scala.Boolean] = js.undefined,
    baseCls: java.lang.String = null,
    degrees: scala.Int | scala.Double = null,
    initComponent: js.Function0[scala.Unit] = null,
    setAngle: js.Function1[/* degrees */ js.UndefOr[scala.Double], scala.Unit] = null,
    setText: js.Function1[/* t */ js.UndefOr[java.lang.String], scala.Unit] = null,
    styleSelector: java.lang.String = null,
    text: java.lang.String = null,
    viewBox: js.UndefOr[scala.Boolean] = js.undefined
  ): IText = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(autoSize)) __obj.updateDynamic("autoSize")(autoSize)
    if (baseCls != null) __obj.updateDynamic("baseCls")(baseCls)
    if (degrees != null) __obj.updateDynamic("degrees")(degrees.asInstanceOf[js.Any])
    if (initComponent != null) __obj.updateDynamic("initComponent")(initComponent)
    if (setAngle != null) __obj.updateDynamic("setAngle")(setAngle)
    if (setText != null) __obj.updateDynamic("setText")(setText)
    if (styleSelector != null) __obj.updateDynamic("styleSelector")(styleSelector)
    if (text != null) __obj.updateDynamic("text")(text)
    if (!js.isUndefined(viewBox)) __obj.updateDynamic("viewBox")(viewBox)
    __obj.asInstanceOf[IText]
  }
}

