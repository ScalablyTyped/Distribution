package typings.formsyReact.formsyMod

import typings.formsyReact.interfacesMod.IModel
import typings.formsyReact.interfacesMod.IResetModel
import typings.formsyReact.interfacesMod.IUpdateInputsWithError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormsyProps extends FormHTMLAttributesCleaned {
  var disabled: Boolean = js.native
  var mapping: Null | (js.Function1[/* model */ IModel, IModel]) = js.native
  @JSName("onReset")
  var onReset_FormsyProps: js.UndefOr[js.Function0[Unit]] = js.native
  var onSubmit: js.UndefOr[
    js.Function3[
      /* model */ IModel, 
      /* resetModel */ IResetModel, 
      /* updateInputsWithError */ IUpdateInputsWithError, 
      Unit
    ]
  ] = js.native
  var onValidSubmit: js.UndefOr[
    js.Function3[
      /* model */ IModel, 
      /* resetModel */ IResetModel, 
      /* updateInputsWithError */ IUpdateInputsWithError, 
      Unit
    ]
  ] = js.native
  var preventDefaultSubmit: js.UndefOr[Boolean] = js.native
  var preventExternalInvalidation: js.UndefOr[Boolean] = js.native
  var validationErrors: js.UndefOr[Null | js.Object] = js.native
  def onChange(model: IModel, isChanged: Boolean): Unit = js.native
  def onInvalidSubmit(model: IModel, resetModel: IResetModel, updateInputsWithError: IUpdateInputsWithError): Unit = js.native
  @JSName("onInvalid")
  def onInvalid_MFormsyProps(): Unit = js.native
  def onValid(): Unit = js.native
}

object FormsyProps {
  @scala.inline
  def apply(
    disabled: Boolean,
    onChange: (IModel, Boolean) => Unit,
    onInvalid: () => Unit,
    onInvalidSubmit: (IModel, IResetModel, IUpdateInputsWithError) => Unit,
    onValid: () => Unit
  ): FormsyProps = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], onChange = js.Any.fromFunction2(onChange), onInvalid = js.Any.fromFunction0(onInvalid), onInvalidSubmit = js.Any.fromFunction3(onInvalidSubmit), onValid = js.Any.fromFunction0(onValid))
    __obj.asInstanceOf[FormsyProps]
  }
  @scala.inline
  implicit class FormsyPropsOps[Self <: FormsyProps] (val x: Self) extends AnyVal {
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnChange(value: (IModel, Boolean) => Unit): Self = this.set("onChange", js.Any.fromFunction2(value))
    @scala.inline
    def setOnInvalid(value: () => Unit): Self = this.set("onInvalid", js.Any.fromFunction0(value))
    @scala.inline
    def setOnInvalidSubmit(value: (IModel, IResetModel, IUpdateInputsWithError) => Unit): Self = this.set("onInvalidSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def setOnValid(value: () => Unit): Self = this.set("onValid", js.Any.fromFunction0(value))
    @scala.inline
    def setMapping(value: /* model */ IModel => IModel): Self = this.set("mapping", js.Any.fromFunction1(value))
    @scala.inline
    def setMappingNull: Self = this.set("mapping", null)
    @scala.inline
    def setOnReset(value: () => Unit): Self = this.set("onReset", js.Any.fromFunction0(value))
    @scala.inline
    def deleteOnReset: Self = this.set("onReset", js.undefined)
    @scala.inline
    def setOnSubmit(
      value: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError) => Unit
    ): Self = this.set("onSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnSubmit: Self = this.set("onSubmit", js.undefined)
    @scala.inline
    def setOnValidSubmit(
      value: (/* model */ IModel, /* resetModel */ IResetModel, /* updateInputsWithError */ IUpdateInputsWithError) => Unit
    ): Self = this.set("onValidSubmit", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnValidSubmit: Self = this.set("onValidSubmit", js.undefined)
    @scala.inline
    def setPreventDefaultSubmit(value: Boolean): Self = this.set("preventDefaultSubmit", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventDefaultSubmit: Self = this.set("preventDefaultSubmit", js.undefined)
    @scala.inline
    def setPreventExternalInvalidation(value: Boolean): Self = this.set("preventExternalInvalidation", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreventExternalInvalidation: Self = this.set("preventExternalInvalidation", js.undefined)
    @scala.inline
    def setValidationErrors(value: js.Object): Self = this.set("validationErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidationErrors: Self = this.set("validationErrors", js.undefined)
    @scala.inline
    def setValidationErrorsNull: Self = this.set("validationErrors", null)
  }
  
}

