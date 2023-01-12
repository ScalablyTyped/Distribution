package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IndicesIndexSettingsLifecycleStep extends StObject {
  
  var wait_time_threshold: js.UndefOr[Duration] = js.undefined
}
object IndicesIndexSettingsLifecycleStep {
  
  inline def apply(): IndicesIndexSettingsLifecycleStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IndicesIndexSettingsLifecycleStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IndicesIndexSettingsLifecycleStep] (val x: Self) extends AnyVal {
    
    inline def setWait_time_threshold(value: Duration): Self = StObject.set(x, "wait_time_threshold", value.asInstanceOf[js.Any])
    
    inline def setWait_time_thresholdUndefined: Self = StObject.set(x, "wait_time_threshold", js.undefined)
  }
}
