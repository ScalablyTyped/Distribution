package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormikSharedConfig[Props] extends js.Object {
  /** Should Formik reset the form when new initialValues change */
  var enableReinitialize: js.UndefOr[Boolean] = js.native
  /** Tell Formik if initial form values are valid or not on first render */
  var isInitialValid: js.UndefOr[Boolean | (js.Function1[/* props */ Props, Boolean])] = js.native
  /** Tells Formik to validate the form on each input's onBlur event */
  var validateOnBlur: js.UndefOr[Boolean] = js.native
  /** Tells Formik to validate the form on each input's onChange event */
  var validateOnChange: js.UndefOr[Boolean] = js.native
  /** Tells Formik to validate upon mount */
  var validateOnMount: js.UndefOr[Boolean] = js.native
}

object FormikSharedConfig {
  @scala.inline
  def apply[Props](): FormikSharedConfig[Props] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormikSharedConfig[Props]]
  }
  @scala.inline
  implicit class FormikSharedConfigOps[Self <: FormikSharedConfig[_], Props] (val x: Self with FormikSharedConfig[Props]) extends AnyVal {
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
    def setEnableReinitialize(value: Boolean): Self = this.set("enableReinitialize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableReinitialize: Self = this.set("enableReinitialize", js.undefined)
    @scala.inline
    def setIsInitialValidFunction1(value: /* props */ Props => Boolean): Self = this.set("isInitialValid", js.Any.fromFunction1(value))
    @scala.inline
    def setIsInitialValid(value: Boolean | (js.Function1[/* props */ Props, Boolean])): Self = this.set("isInitialValid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsInitialValid: Self = this.set("isInitialValid", js.undefined)
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = this.set("validateOnBlur", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnBlur: Self = this.set("validateOnBlur", js.undefined)
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnChange: Self = this.set("validateOnChange", js.undefined)
    @scala.inline
    def setValidateOnMount(value: Boolean): Self = this.set("validateOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidateOnMount: Self = this.set("validateOnMount", js.undefined)
  }
  
}

