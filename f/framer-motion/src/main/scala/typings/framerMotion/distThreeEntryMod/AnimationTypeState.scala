package typings.framerMotion.distThreeEntryMod

import org.scalablytyped.runtime.StringDictionary
import typings.framerMotion.framerMotionBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationTypeState extends StObject {
  
  var isActive: Boolean
  
  var needsAnimating: StringDictionary[Boolean]
  
  var prevProp: js.UndefOr[VariantLabels | TargetAndTransition] = js.undefined
  
  var prevResolvedValues: StringDictionary[Any]
  
  var protectedKeys: StringDictionary[`true`]
}
object AnimationTypeState {
  
  inline def apply(
    isActive: Boolean,
    needsAnimating: StringDictionary[Boolean],
    prevResolvedValues: StringDictionary[Any],
    protectedKeys: StringDictionary[`true`]
  ): AnimationTypeState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], needsAnimating = needsAnimating.asInstanceOf[js.Any], prevResolvedValues = prevResolvedValues.asInstanceOf[js.Any], protectedKeys = protectedKeys.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationTypeState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnimationTypeState] (val x: Self) extends AnyVal {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setNeedsAnimating(value: StringDictionary[Boolean]): Self = StObject.set(x, "needsAnimating", value.asInstanceOf[js.Any])
    
    inline def setPrevProp(value: VariantLabels | TargetAndTransition): Self = StObject.set(x, "prevProp", value.asInstanceOf[js.Any])
    
    inline def setPrevPropUndefined: Self = StObject.set(x, "prevProp", js.undefined)
    
    inline def setPrevPropVarargs(value: String*): Self = StObject.set(x, "prevProp", js.Array(value*))
    
    inline def setPrevResolvedValues(value: StringDictionary[Any]): Self = StObject.set(x, "prevResolvedValues", value.asInstanceOf[js.Any])
    
    inline def setProtectedKeys(value: StringDictionary[`true`]): Self = StObject.set(x, "protectedKeys", value.asInstanceOf[js.Any])
  }
}
