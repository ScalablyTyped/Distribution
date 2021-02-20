package typings.gaeaModel.FitGaea

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __React.ComponentClass<any> * / any */ @js.native
trait Plugin extends StObject {
  
  var Action: js.UndefOr[js.Any] = js.native
  
  var Store: js.UndefOr[js.Any] = js.native
  
  // 插件安放位置
  var position: String = js.native
}
object Plugin {
  
  @scala.inline
  def apply(position: String): Plugin = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Plugin]
  }
  
  @scala.inline
  implicit class PluginMutableBuilder[Self <: Plugin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Any): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStore(value: js.Any): Self = StObject.set(x, "Store", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoreUndefined: Self = StObject.set(x, "Store", js.undefined)
  }
}
