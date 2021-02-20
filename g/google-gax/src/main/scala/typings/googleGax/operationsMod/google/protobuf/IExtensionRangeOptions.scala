package typings.googleGax.operationsMod.google.protobuf

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of an ExtensionRangeOptions. */
@js.native
trait IExtensionRangeOptions extends StObject {
  
  /** ExtensionRangeOptions uninterpretedOption */
  var uninterpretedOption: js.UndefOr[js.Array[IUninterpretedOption] | Null] = js.native
}
object IExtensionRangeOptions {
  
  @scala.inline
  def apply(): IExtensionRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExtensionRangeOptions]
  }
  
  @scala.inline
  implicit class IExtensionRangeOptionsMutableBuilder[Self <: IExtensionRangeOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUninterpretedOption(value: js.Array[IUninterpretedOption]): Self = StObject.set(x, "uninterpretedOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUninterpretedOptionNull: Self = StObject.set(x, "uninterpretedOption", null)
    
    @scala.inline
    def setUninterpretedOptionUndefined: Self = StObject.set(x, "uninterpretedOption", js.undefined)
    
    @scala.inline
    def setUninterpretedOptionVarargs(value: IUninterpretedOption*): Self = StObject.set(x, "uninterpretedOption", js.Array(value :_*))
  }
}
