package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecConfig
import typings.firebaseFirestore.distLitePackagesFirestoreTestUnitSpecsSpecTestRunnerMod.SpecStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigSteps extends StObject {
  
  var config: SpecConfig
  
  var steps: js.Array[SpecStep]
}
object ConfigSteps {
  
  inline def apply(config: SpecConfig, steps: js.Array[SpecStep]): ConfigSteps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigSteps]
  }
  
  extension [Self <: ConfigSteps](x: Self) {
    
    inline def setConfig(value: SpecConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[SpecStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: SpecStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
