package typings.expressFormData

import typings.connect.mod.NextHandleFunction
import typings.multiparty.mod.FormOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("express-form-data", "format")
  @js.native
  def format(): NextHandleFunction = js.native
  
  @JSImport("express-form-data", "parse")
  @js.native
  def parse(): NextHandleFunction = js.native
  @JSImport("express-form-data", "parse")
  @js.native
  def parse(options: FormDataOptions): NextHandleFunction = js.native
  
  @JSImport("express-form-data", "stream")
  @js.native
  def stream(): NextHandleFunction = js.native
  
  @JSImport("express-form-data", "union")
  @js.native
  def union(): NextHandleFunction = js.native
  
  @js.native
  trait FormDataOptions extends FormOptions {
    
    var autoClean: js.UndefOr[Boolean] = js.native
  }
  object FormDataOptions {
    
    @scala.inline
    def apply(): FormDataOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FormDataOptions]
    }
    
    @scala.inline
    implicit class FormDataOptionsMutableBuilder[Self <: FormDataOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoClean(value: Boolean): Self = StObject.set(x, "autoClean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCleanUndefined: Self = StObject.set(x, "autoClean", js.undefined)
    }
  }
}
