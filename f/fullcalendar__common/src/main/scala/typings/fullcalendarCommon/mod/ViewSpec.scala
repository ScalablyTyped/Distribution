package typings.fullcalendarCommon.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ViewSpec extends StObject {
  
  var buttonTextDefault: String
  
  var buttonTextOverride: String
  
  var buttonTitleDefault: String | (js.Function1[/* repeated */ Any, String])
  
  var buttonTitleOverride: String | (js.Function1[/* repeated */ Any, String])
  
  var component: ViewComponentType
  
  var duration: Duration
  
  var durationUnit: String
  
  var optionDefaults: ViewOptions
  
  var optionOverrides: ViewOptions
  
  var singleUnit: String
  
  var `type`: String
}
object ViewSpec {
  
  inline def apply(
    buttonTextDefault: String,
    buttonTextOverride: String,
    buttonTitleDefault: String | (js.Function1[/* repeated */ Any, String]),
    buttonTitleOverride: String | (js.Function1[/* repeated */ Any, String]),
    component: ViewComponentType,
    duration: Duration,
    durationUnit: String,
    optionDefaults: ViewOptions,
    optionOverrides: ViewOptions,
    singleUnit: String,
    `type`: String
  ): ViewSpec = {
    val __obj = js.Dynamic.literal(buttonTextDefault = buttonTextDefault.asInstanceOf[js.Any], buttonTextOverride = buttonTextOverride.asInstanceOf[js.Any], buttonTitleDefault = buttonTitleDefault.asInstanceOf[js.Any], buttonTitleOverride = buttonTitleOverride.asInstanceOf[js.Any], component = component.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], durationUnit = durationUnit.asInstanceOf[js.Any], optionDefaults = optionDefaults.asInstanceOf[js.Any], optionOverrides = optionOverrides.asInstanceOf[js.Any], singleUnit = singleUnit.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ViewSpec]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ViewSpec] (val x: Self) extends AnyVal {
    
    inline def setButtonTextDefault(value: String): Self = StObject.set(x, "buttonTextDefault", value.asInstanceOf[js.Any])
    
    inline def setButtonTextOverride(value: String): Self = StObject.set(x, "buttonTextOverride", value.asInstanceOf[js.Any])
    
    inline def setButtonTitleDefault(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "buttonTitleDefault", value.asInstanceOf[js.Any])
    
    inline def setButtonTitleDefaultFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "buttonTitleDefault", js.Any.fromFunction1(value))
    
    inline def setButtonTitleOverride(value: String | (js.Function1[/* repeated */ Any, String])): Self = StObject.set(x, "buttonTitleOverride", value.asInstanceOf[js.Any])
    
    inline def setButtonTitleOverrideFunction1(value: /* repeated */ Any => String): Self = StObject.set(x, "buttonTitleOverride", js.Any.fromFunction1(value))
    
    inline def setComponent(value: ViewComponentType): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
    
    inline def setDuration(value: Duration): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUnit(value: String): Self = StObject.set(x, "durationUnit", value.asInstanceOf[js.Any])
    
    inline def setOptionDefaults(value: ViewOptions): Self = StObject.set(x, "optionDefaults", value.asInstanceOf[js.Any])
    
    inline def setOptionOverrides(value: ViewOptions): Self = StObject.set(x, "optionOverrides", value.asInstanceOf[js.Any])
    
    inline def setSingleUnit(value: String): Self = StObject.set(x, "singleUnit", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
