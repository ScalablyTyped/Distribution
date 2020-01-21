package typings.formol.mod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldSetProps[V] extends js.Object {
  var choices: js.UndefOr[js.Array[_]] = js.undefined
  var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined
  var elementRef: js.UndefOr[Ref[_]] = js.undefined
  var isChecked: js.UndefOr[Boolean] = js.undefined
  var onChange: js.UndefOr[js.Function0[Unit]] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[V] = js.undefined
}

object FieldSetProps {
  @scala.inline
  def apply[V](
    choices: js.Array[_] = null,
    dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.undefined,
    elementRef: Ref[_] = null,
    isChecked: js.UndefOr[Boolean] = js.undefined,
    onChange: () => Unit = null,
    `type`: String = null,
    value: V = null
  ): FieldSetProps[V] = {
    val __obj = js.Dynamic.literal()
    if (choices != null) __obj.updateDynamic("choices")(choices.asInstanceOf[js.Any])
    if (!js.isUndefined(dangerousRawHTMLLabels)) __obj.updateDynamic("dangerousRawHTMLLabels")(dangerousRawHTMLLabels.asInstanceOf[js.Any])
    if (elementRef != null) __obj.updateDynamic("elementRef")(elementRef.asInstanceOf[js.Any])
    if (!js.isUndefined(isChecked)) __obj.updateDynamic("isChecked")(isChecked.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction0(onChange))
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldSetProps[V]]
  }
}

