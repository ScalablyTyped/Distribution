package typings.formol.mod

import typings.react.mod.ComponentType
import typings.react.mod.ReactNode
import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldProps[V] extends js.Object {
  var TypeField: js.UndefOr[ComponentType[js.Object]] = js.native
  var children: js.UndefOr[js.Any] = js.native
  var choices: js.UndefOr[js.Array[_]] = js.native
  var className: js.UndefOr[String] = js.native
  var classNameModifiers: js.UndefOr[js.Any] = js.native
  var dangerousRawHTMLLabels: js.UndefOr[Boolean] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var error: js.UndefOr[ReactNode] = js.native
  var extras: js.UndefOr[ReactNode] = js.native
  var formatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.native
  var handleChange: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.native
  var handleEntered: js.UndefOr[js.Function2[/* name */ String, /* v */ V, Unit]] = js.native
  var i18n: js.UndefOr[js.Any] = js.native
  var max: js.UndefOr[Double] = js.native
  var minLength: js.UndefOr[Double] = js.native
  var modified: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
  var normalizer: js.UndefOr[js.Function1[/* v */ V, V]] = js.native
  var readOnly: js.UndefOr[Boolean] = js.native
  var register: js.UndefOr[
    js.Function4[
      /* name */ String, 
      /* element */ Ref[_], 
      /* validator */ js.Any, 
      /* validityErrors */ js.Any, 
      Unit
    ]
  ] = js.native
  var required: js.UndefOr[Boolean] = js.native
  var size: js.UndefOr[Double] = js.native
  var title: js.UndefOr[String] = js.native
  var `type`: js.UndefOr[String] = js.native
  var unformatter: js.UndefOr[js.Function1[/* v */ V, V]] = js.native
  var unit: js.UndefOr[ReactNode] = js.native
  var unregister: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  var validator: js.UndefOr[js.Function1[/* v */ V, String]] = js.native
  var validityErrors: js.UndefOr[js.Any] = js.native
  var value: js.UndefOr[V] = js.native
}

object FieldProps {
  @scala.inline
  def apply[V](): FieldProps[V] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldProps[V]]
  }
  @scala.inline
  implicit class FieldPropsOps[Self <: FieldProps[_], V] (val x: Self with FieldProps[V]) extends AnyVal {
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
    def setTypeField(value: ComponentType[js.Object]): Self = this.set("TypeField", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTypeField: Self = this.set("TypeField", js.undefined)
    @scala.inline
    def setChildren(value: js.Any): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setChoicesVarargs(value: js.Any*): Self = this.set("choices", js.Array(value :_*))
    @scala.inline
    def setChoices(value: js.Array[_]): Self = this.set("choices", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChoices: Self = this.set("choices", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setClassNameModifiers(value: js.Any): Self = this.set("classNameModifiers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNameModifiers: Self = this.set("classNameModifiers", js.undefined)
    @scala.inline
    def setDangerousRawHTMLLabels(value: Boolean): Self = this.set("dangerousRawHTMLLabels", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDangerousRawHTMLLabels: Self = this.set("dangerousRawHTMLLabels", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setError(value: ReactNode): Self = this.set("error", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setExtras(value: ReactNode): Self = this.set("extras", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtras: Self = this.set("extras", js.undefined)
    @scala.inline
    def setFormatter(value: /* v */ V => V): Self = this.set("formatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFormatter: Self = this.set("formatter", js.undefined)
    @scala.inline
    def setHandleChange(value: (/* name */ String, /* v */ V) => Unit): Self = this.set("handleChange", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleChange: Self = this.set("handleChange", js.undefined)
    @scala.inline
    def setHandleEntered(value: (/* name */ String, /* v */ V) => Unit): Self = this.set("handleEntered", js.Any.fromFunction2(value))
    @scala.inline
    def deleteHandleEntered: Self = this.set("handleEntered", js.undefined)
    @scala.inline
    def setI18n(value: js.Any): Self = this.set("i18n", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMinLength(value: Double): Self = this.set("minLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinLength: Self = this.set("minLength", js.undefined)
    @scala.inline
    def setModified(value: Boolean): Self = this.set("modified", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteModified: Self = this.set("modified", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNormalizer(value: /* v */ V => V): Self = this.set("normalizer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteNormalizer: Self = this.set("normalizer", js.undefined)
    @scala.inline
    def setReadOnly(value: Boolean): Self = this.set("readOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadOnly: Self = this.set("readOnly", js.undefined)
    @scala.inline
    def setRegister(
      value: (/* name */ String, /* element */ Ref[_], /* validator */ js.Any, /* validityErrors */ js.Any) => Unit
    ): Self = this.set("register", js.Any.fromFunction4(value))
    @scala.inline
    def deleteRegister: Self = this.set("register", js.undefined)
    @scala.inline
    def setRequired(value: Boolean): Self = this.set("required", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequired: Self = this.set("required", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUnformatter(value: /* v */ V => V): Self = this.set("unformatter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnformatter: Self = this.set("unformatter", js.undefined)
    @scala.inline
    def setUnit(value: ReactNode): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUnit: Self = this.set("unit", js.undefined)
    @scala.inline
    def setUnregister(value: /* name */ String => Unit): Self = this.set("unregister", js.Any.fromFunction1(value))
    @scala.inline
    def deleteUnregister: Self = this.set("unregister", js.undefined)
    @scala.inline
    def setValidator(value: /* v */ V => String): Self = this.set("validator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteValidator: Self = this.set("validator", js.undefined)
    @scala.inline
    def setValidityErrors(value: js.Any): Self = this.set("validityErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidityErrors: Self = this.set("validityErrors", js.undefined)
    @scala.inline
    def setValue(value: V): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

