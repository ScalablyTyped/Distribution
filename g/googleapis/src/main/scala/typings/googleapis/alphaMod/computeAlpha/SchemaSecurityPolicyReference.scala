package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaSecurityPolicyReference extends StObject {
  
  var securityPolicy: js.UndefOr[String] = js.undefined
}
object SchemaSecurityPolicyReference {
  
  @scala.inline
  def apply(): SchemaSecurityPolicyReference = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaSecurityPolicyReference]
  }
  
  @scala.inline
  implicit class SchemaSecurityPolicyReferenceMutableBuilder[Self <: SchemaSecurityPolicyReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSecurityPolicy(value: String): Self = StObject.set(x, "securityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityPolicyUndefined: Self = StObject.set(x, "securityPolicy", js.undefined)
  }
}
