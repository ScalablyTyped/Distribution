package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecConfig
import typings.firebaseFirestore.distPackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSpecConfig extends StObject {
  
  var config: SpecConfig
  
  var steps: js.Array[SpecStep]
}
object ConfigSpecConfig {
  
  inline def apply(config: SpecConfig, steps: js.Array[SpecStep]): ConfigSpecConfig = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSpecConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ConfigSpecConfig] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: SpecConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[SpecStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: SpecStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
