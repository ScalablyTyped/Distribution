package typings.devtoolsProtocol.mod.Protocol.Page

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PermissionsPolicyFeatureState extends StObject {
  
  var allowed: Boolean
  
  var feature: PermissionsPolicyFeature
  
  var locator: js.UndefOr[PermissionsPolicyBlockLocator] = js.undefined
}
object PermissionsPolicyFeatureState {
  
  inline def apply(allowed: Boolean, feature: PermissionsPolicyFeature): PermissionsPolicyFeatureState = {
    val __obj = js.Dynamic.literal(allowed = allowed.asInstanceOf[js.Any], feature = feature.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionsPolicyFeatureState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PermissionsPolicyFeatureState] (val x: Self) extends AnyVal {
    
    inline def setAllowed(value: Boolean): Self = StObject.set(x, "allowed", value.asInstanceOf[js.Any])
    
    inline def setFeature(value: PermissionsPolicyFeature): Self = StObject.set(x, "feature", value.asInstanceOf[js.Any])
    
    inline def setLocator(value: PermissionsPolicyBlockLocator): Self = StObject.set(x, "locator", value.asInstanceOf[js.Any])
    
    inline def setLocatorUndefined: Self = StObject.set(x, "locator", js.undefined)
  }
}
