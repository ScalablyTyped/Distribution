package typings.formik.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FormikComputedProps[Values] extends js.Object {
  
  /** True if any input has been touched. False otherwise. */
  val dirty: Boolean = js.native
  
  /** The initial errors of the form */
  val initialErrors: FormikErrors[Values] = js.native
  
  /** The initial status of the form */
  val initialStatus: js.UndefOr[js.Any] = js.native
  
  /** The initial visited fields of the form */
  val initialTouched: FormikTouched[Values] = js.native
  
  /** The initial values of the form */
  val initialValues: Values = js.native
  
  /** True if state.errors is empty */
  val isValid: Boolean = js.native
}
object FormikComputedProps {
  
  @scala.inline
  def apply[Values](
    dirty: Boolean,
    initialErrors: FormikErrors[Values],
    initialTouched: FormikTouched[Values],
    initialValues: Values,
    isValid: Boolean
  ): FormikComputedProps[Values] = {
    val __obj = js.Dynamic.literal(dirty = dirty.asInstanceOf[js.Any], initialErrors = initialErrors.asInstanceOf[js.Any], initialTouched = initialTouched.asInstanceOf[js.Any], initialValues = initialValues.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormikComputedProps[Values]]
  }
  
  @scala.inline
  implicit class FormikComputedPropsOps[Self <: FormikComputedProps[_], Values] (val x: Self with FormikComputedProps[Values]) extends AnyVal {
    
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
    def setDirty(value: Boolean): Self = this.set("dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialErrors(value: FormikErrors[Values]): Self = this.set("initialErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialTouched(value: FormikTouched[Values]): Self = this.set("initialTouched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialValues(value: Values): Self = this.set("initialValues", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialStatus(value: js.Any): Self = this.set("initialStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialStatus: Self = this.set("initialStatus", js.undefined)
  }
}
