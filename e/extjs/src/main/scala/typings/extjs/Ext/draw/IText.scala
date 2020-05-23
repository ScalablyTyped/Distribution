package typings.extjs.Ext.draw

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IText extends IComponent {
  /** [Config Option] (Number) */
  var degrees: js.UndefOr[Double] = js.undefined
  /** [Method] Sets the clockwise rotation angle relative to the horizontal axis
    * @param degrees Number The clockwise angle (in degrees) from the horizontal axis by which the text should be rotated.
    */
  var setAngle: js.UndefOr[js.Function1[/* degrees */ js.UndefOr[Double], Unit]] = js.undefined
  /** [Method] Updates this item s text
    * @param t String The text to display (html not accepted).
    */
  var setText: js.UndefOr[js.Function1[/* t */ js.UndefOr[String], Unit]] = js.undefined
  /** [Config Option] (String) */
  var styleSelector: js.UndefOr[String] = js.undefined
  /** [Config Option] (String) */
  var text: js.UndefOr[String] = js.undefined
}

object IText {
  @scala.inline
  def apply(
    IComponent: IComponent = null,
    degrees: js.UndefOr[Double] = js.undefined,
    setAngle: /* degrees */ js.UndefOr[Double] => Unit = null,
    setText: /* t */ js.UndefOr[String] => Unit = null,
    styleSelector: String = null,
    text: String = null
  ): IText = {
    val __obj = js.Dynamic.literal()
    if (IComponent != null) js.Dynamic.global.Object.assign(__obj, IComponent)
    if (!js.isUndefined(degrees)) __obj.updateDynamic("degrees")(degrees.get.asInstanceOf[js.Any])
    if (setAngle != null) __obj.updateDynamic("setAngle")(js.Any.fromFunction1(setAngle))
    if (setText != null) __obj.updateDynamic("setText")(js.Any.fromFunction1(setText))
    if (styleSelector != null) __obj.updateDynamic("styleSelector")(styleSelector.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[IText]
  }
}

