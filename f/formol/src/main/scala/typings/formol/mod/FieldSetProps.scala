package typings.formol.mod

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldSetProps[V] extends js.Object {
  var choices: js.UndefOr[js.Array[_]] = js.native
  var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.native
  var elementRef: js.UndefOr[Ref[_]] = js.native
  var isChecked: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function0[Unit]] = js.native
  var `type`: js.UndefOr[String] = js.native
  var value: js.UndefOr[V] = js.native
}

object FieldSetProps {
  @scala.inline
  def apply[V](): FieldSetProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldSetProps[V]]
  }
  @scala.inline
  implicit class FieldSetPropsOps[Self <: FieldSetProps[_], V] (val x: Self with FieldSetProps[V]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setChoicesVarargs(value: js.Any*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[_]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    @scala.inline
    def setDangerousRawHTMLLabels(value: Boolean): Self = this.set("dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerousRawHTMLLabels: Self = this.set("dangerousRawHTMLLabels", js.undefined)
    @scala.inline
    def setElementRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("elementRef", js.Any.fromFunction1(value))
    @scala.inline
    def setElementRef(value: Ref[_]): Self = this.set("elementRef", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElementRef: Self = this.set("elementRef", js.undefined)
    @scala.inline
    def setElementRefNull: Self = this.set("elementRef", null)
    @scala.inline
    def setIsChecked(value: Boolean): Self = this.set("isChecked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsChecked: Self = this.set("isChecked", js.undefined)
    @scala.inline
    def setOnChange(value: () => Unit): Self = this.set("onChange", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

