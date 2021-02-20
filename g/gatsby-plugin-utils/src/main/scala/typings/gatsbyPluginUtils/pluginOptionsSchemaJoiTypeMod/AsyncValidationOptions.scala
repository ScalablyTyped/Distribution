package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidationOptions extends ValidationOptions {
  
  /**
    * when true, warnings are returned alongside the value (i.e. `{ value, warning }`).
    *
    * @default false
    */
  var warnings: js.UndefOr[Boolean] = js.native
}
object AsyncValidationOptions {
  
  @scala.inline
  def apply(): AsyncValidationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncValidationOptions]
  }
  
  @scala.inline
  implicit class AsyncValidationOptionsMutableBuilder[Self <: AsyncValidationOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWarnings(value: Boolean): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
  }
}
