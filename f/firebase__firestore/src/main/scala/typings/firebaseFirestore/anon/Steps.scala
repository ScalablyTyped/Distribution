package typings.firebaseFirestore.anon

import typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.SpecConfig
import typings.firebaseFirestore.distLiteFirestoreTestUnitSpecsSpecTestRunnerMod.SpecStep
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Steps extends StObject {
  
  var config: SpecConfig
  
  var steps: js.Array[SpecStep]
}
object Steps {
  
  inline def apply(config: SpecConfig, steps: js.Array[SpecStep]): Steps = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], steps = steps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Steps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Steps] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: SpecConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setSteps(value: js.Array[SpecStep]): Self = StObject.set(x, "steps", value.asInstanceOf[js.Any])
    
    inline def setStepsVarargs(value: SpecStep*): Self = StObject.set(x, "steps", js.Array(value*))
  }
}
