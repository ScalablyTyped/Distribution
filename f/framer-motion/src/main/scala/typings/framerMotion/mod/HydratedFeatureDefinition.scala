package typings.framerMotion.mod

import typings.framerMotion.anon.MotionPropsvisualElementV
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HydratedFeatureDefinition extends StObject {
  
  var Feature: FeatureClass[Any]
  
  var MeasureLayout: js.UndefOr[js.Function1[/* props */ MotionPropsvisualElementV, Element]] = js.undefined
  
  var ProjectionNode: js.UndefOr[Any] = js.undefined
  
  def isEnabled(props: MotionProps): Boolean
}
object HydratedFeatureDefinition {
  
  inline def apply(Feature: FeatureClass[Any], isEnabled: MotionProps => Boolean): HydratedFeatureDefinition = {
    val __obj = js.Dynamic.literal(Feature = Feature.asInstanceOf[js.Any], isEnabled = js.Any.fromFunction1(isEnabled))
    __obj.asInstanceOf[HydratedFeatureDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HydratedFeatureDefinition] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: FeatureClass[Any]): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
    
    inline def setIsEnabled(value: MotionProps => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
    
    inline def setMeasureLayout(value: /* props */ MotionPropsvisualElementV => Element): Self = StObject.set(x, "MeasureLayout", js.Any.fromFunction1(value))
    
    inline def setMeasureLayoutUndefined: Self = StObject.set(x, "MeasureLayout", js.undefined)
    
    inline def setProjectionNode(value: Any): Self = StObject.set(x, "ProjectionNode", value.asInstanceOf[js.Any])
    
    inline def setProjectionNodeUndefined: Self = StObject.set(x, "ProjectionNode", js.undefined)
  }
}
