package typings.framerMotion.mod

import typings.framerMotion.anon.MotionPropsvisualElementV
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeaturePackage extends StObject {
  
  var Feature: js.UndefOr[FeatureClass[Any]] = js.undefined
  
  var MeasureLayout: js.UndefOr[js.Function1[/* props */ MotionPropsvisualElementV, Element]] = js.undefined
  
  var ProjectionNode: js.UndefOr[Any] = js.undefined
}
object FeaturePackage {
  
  inline def apply(): FeaturePackage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FeaturePackage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeaturePackage] (val x: Self) extends AnyVal {
    
    inline def setFeature(value: FeatureClass[Any]): Self = StObject.set(x, "Feature", value.asInstanceOf[js.Any])
    
    inline def setFeatureUndefined: Self = StObject.set(x, "Feature", js.undefined)
    
    inline def setMeasureLayout(value: /* props */ MotionPropsvisualElementV => Element): Self = StObject.set(x, "MeasureLayout", js.Any.fromFunction1(value))
    
    inline def setMeasureLayoutUndefined: Self = StObject.set(x, "MeasureLayout", js.undefined)
    
    inline def setProjectionNode(value: Any): Self = StObject.set(x, "ProjectionNode", value.asInstanceOf[js.Any])
    
    inline def setProjectionNodeUndefined: Self = StObject.set(x, "ProjectionNode", js.undefined)
  }
}
