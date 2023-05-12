package typings.framerMotion.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {[ K in keyof framer-motion.framer-motion.HydratedFeatureDefinition ]: framer-motion.framer-motion.FeatureDefinition} */
trait FeatureDefinitions extends StObject {
  
  var Feature: FeatureDefinition
  
  var MeasureLayout: js.UndefOr[FeatureDefinition] = js.undefined
  
  var ProjectionNode: js.UndefOr[FeatureDefinition] = js.undefined
  
  var isEnabled: FeatureDefinition
}
object FeatureDefinitions {
  
  inline def apply(Feature: FeatureDefinition, isEnabled: FeatureDefinition): FeatureDefinitions = {
    val __obj = js.Dynamic.literal(Feature = Feature.asInstanceOf[js.Any], isEnabled = isEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureDefinitions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureDefinitions] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: FeatureDefinition): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: FeatureDefinition): Self = StObject.set(x, "isEnabled", value.asInstanceOf[js.Any])
    
    inline def setMeasureLayout(value: FeatureDefinition): Self = StObject.set(x, "MeasureLayout", value.asInstanceOf[js.Any])
    
    inline def setMeasureLayoutUndefined: Self = StObject.set(x, "MeasureLayout", js.undefined)
    
    inline def setProjectionNode(value: FeatureDefinition): Self = StObject.set(x, "ProjectionNode", value.asInstanceOf[js.Any])
    
    inline def setProjectionNodeUndefined: Self = StObject.set(x, "ProjectionNode", js.undefined)
  }
}
