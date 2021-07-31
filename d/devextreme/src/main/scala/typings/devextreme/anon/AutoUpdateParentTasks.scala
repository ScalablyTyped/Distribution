package typings.devextreme.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoUpdateParentTasks extends StObject {
  
  var autoUpdateParentTasks: js.UndefOr[Boolean] = js.undefined
  
  var validateDependencies: js.UndefOr[Boolean] = js.undefined
}
object AutoUpdateParentTasks {
  
  @scala.inline
  def apply(): AutoUpdateParentTasks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AutoUpdateParentTasks]
  }
  
  @scala.inline
  implicit class AutoUpdateParentTasksMutableBuilder[Self <: AutoUpdateParentTasks] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoUpdateParentTasks(value: Boolean): Self = StObject.set(x, "autoUpdateParentTasks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoUpdateParentTasksUndefined: Self = StObject.set(x, "autoUpdateParentTasks", js.undefined)
    
    @scala.inline
    def setValidateDependencies(value: Boolean): Self = StObject.set(x, "validateDependencies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateDependenciesUndefined: Self = StObject.set(x, "validateDependencies", js.undefined)
  }
}
