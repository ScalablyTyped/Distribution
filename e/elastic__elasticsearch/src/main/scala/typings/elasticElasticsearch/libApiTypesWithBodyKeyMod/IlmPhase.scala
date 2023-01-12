package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IlmPhase extends StObject {
  
  var actions: js.UndefOr[IlmActions] = js.undefined
  
  var configurations: js.UndefOr[IlmConfigurations] = js.undefined
  
  var min_age: js.UndefOr[Duration | long] = js.undefined
}
object IlmPhase {
  
  inline def apply(): IlmPhase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IlmPhase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IlmPhase] (val x: Self) extends AnyVal {
    
    inline def setActions(value: IlmActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsUndefined: Self = StObject.set(x, "actions", js.undefined)
    
    inline def setConfigurations(value: IlmConfigurations): Self = StObject.set(x, "configurations", value.asInstanceOf[js.Any])
    
    inline def setConfigurationsUndefined: Self = StObject.set(x, "configurations", js.undefined)
    
    inline def setMin_age(value: Duration | long): Self = StObject.set(x, "min_age", value.asInstanceOf[js.Any])
    
    inline def setMin_ageUndefined: Self = StObject.set(x, "min_age", js.undefined)
  }
}
