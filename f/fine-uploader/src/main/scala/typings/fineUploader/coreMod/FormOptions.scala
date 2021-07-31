package typings.fineUploader.coreMod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FormOptions extends StObject {
  
  /**
    * If Fine Uploader is able to attach to a form, this value takes the place of the base `autoUpload` option
    *
    * @default `false`
    */
  var autoUpload: js.UndefOr[Boolean] = js.undefined
  
  /**
    * This can be the ID of the <form> or a reference to the <form> element
    *
    * @default `'qq-form'`
    */
  var element: js.UndefOr[String | HTMLElement] = js.undefined
  
  /**
    * Set this to `false` if you do not want Fine Uploader to intercept attempts to submit your form.
    *
    * By default, Fine Uploader will intercept submit attempts and instead upload all submitted files, including data from your form in each upload request
    *
    * @default `true`
    */
  var interceptSubmit: js.UndefOr[Boolean] = js.undefined
}
object FormOptions {
  
  @scala.inline
  def apply(): FormOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormOptions]
  }
  
  @scala.inline
  implicit class FormOptionsMutableBuilder[Self <: FormOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpload(value: Boolean): Self = StObject.set(x, "autoUpload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUploadUndefined: Self = StObject.set(x, "autoUpload", js.undefined)
    
    @scala.inline
    def setElement(value: String | HTMLElement): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
    
    @scala.inline
    def setInterceptSubmit(value: Boolean): Self = StObject.set(x, "interceptSubmit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterceptSubmitUndefined: Self = StObject.set(x, "interceptSubmit", js.undefined)
  }
}
