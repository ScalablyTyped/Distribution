package typings.gatsbyPluginUtils.pluginOptionsSchemaJoiTypeMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddRuleOptions extends StObject {
  
  var args: js.UndefOr[StringDictionary[js.Any]] = js.native
  
  var name: String = js.native
}
object AddRuleOptions {
  
  @scala.inline
  def apply(name: String): AddRuleOptions = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddRuleOptions]
  }
  
  @scala.inline
  implicit class AddRuleOptionsMutableBuilder[Self <: AddRuleOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArgs(value: StringDictionary[js.Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArgsUndefined: Self = StObject.set(x, "args", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
