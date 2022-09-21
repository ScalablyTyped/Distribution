package typings.emotionNative.anon

import typings.react.mod.Context
import typings.react.mod.GetDerivedStateFromError
import typings.react.mod.GetDerivedStateFromProps
import typings.react.mod.ValidationMap
import typings.react.mod.WeakValidationMap
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofYellowBox extends StObject {
  
  var childContextTypes: js.UndefOr[ValidationMap[Any]] = js.undefined
  
  var contextType: js.UndefOr[Context[Any]] = js.undefined
  
  var contextTypes: js.UndefOr[ValidationMap[Any]] = js.undefined
  
  var defaultProps: js.UndefOr[Partial[Any]] = js.undefined
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var getDerivedStateFromError: js.UndefOr[GetDerivedStateFromError[Any, Any]] = js.undefined
  
  var getDerivedStateFromProps: js.UndefOr[GetDerivedStateFromProps[Any, Any]] = js.undefined
  
  def ignoreWarnings(warnings: js.Array[String]): Unit
  
  var propTypes: js.UndefOr[WeakValidationMap[Any]] = js.undefined
}
object TypeofYellowBox {
  
  inline def apply(ignoreWarnings: js.Array[String] => Unit): TypeofYellowBox = {
    val __obj = js.Dynamic.literal(ignoreWarnings = js.Any.fromFunction1(ignoreWarnings))
    __obj.asInstanceOf[TypeofYellowBox]
  }
  
  extension [Self <: TypeofYellowBox](x: Self) {
    
    inline def setChildContextTypes(value: ValidationMap[Any]): Self = StObject.set(x, "childContextTypes", value.asInstanceOf[js.Any])
    
    inline def setChildContextTypesUndefined: Self = StObject.set(x, "childContextTypes", js.undefined)
    
    inline def setContextType(value: Context[Any]): Self = StObject.set(x, "contextType", value.asInstanceOf[js.Any])
    
    inline def setContextTypeUndefined: Self = StObject.set(x, "contextType", js.undefined)
    
    inline def setContextTypes(value: ValidationMap[Any]): Self = StObject.set(x, "contextTypes", value.asInstanceOf[js.Any])
    
    inline def setContextTypesUndefined: Self = StObject.set(x, "contextTypes", js.undefined)
    
    inline def setDefaultProps(value: Partial[Any]): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
    
    inline def setDefaultPropsUndefined: Self = StObject.set(x, "defaultProps", js.undefined)
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setGetDerivedStateFromError(value: /* error */ Any => Partial[Any] | Null): Self = StObject.set(x, "getDerivedStateFromError", js.Any.fromFunction1(value))
    
    inline def setGetDerivedStateFromErrorUndefined: Self = StObject.set(x, "getDerivedStateFromError", js.undefined)
    
    inline def setGetDerivedStateFromProps(value: (Any, Any) => Partial[Any] | Null): Self = StObject.set(x, "getDerivedStateFromProps", js.Any.fromFunction2(value))
    
    inline def setGetDerivedStateFromPropsUndefined: Self = StObject.set(x, "getDerivedStateFromProps", js.undefined)
    
    inline def setIgnoreWarnings(value: js.Array[String] => Unit): Self = StObject.set(x, "ignoreWarnings", js.Any.fromFunction1(value))
    
    inline def setPropTypes(value: WeakValidationMap[Any]): Self = StObject.set(x, "propTypes", value.asInstanceOf[js.Any])
    
    inline def setPropTypesUndefined: Self = StObject.set(x, "propTypes", js.undefined)
  }
}
