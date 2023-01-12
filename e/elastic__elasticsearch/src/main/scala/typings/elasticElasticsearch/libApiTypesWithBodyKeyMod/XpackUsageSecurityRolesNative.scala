package typings.elasticElasticsearch.libApiTypesWithBodyKeyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSecurityRolesNative extends StObject {
  
  var dls: Boolean
  
  var fls: Boolean
  
  var size: long
}
object XpackUsageSecurityRolesNative {
  
  inline def apply(dls: Boolean, fls: Boolean, size: long): XpackUsageSecurityRolesNative = {
    val __obj = js.Dynamic.literal(dls = dls.asInstanceOf[js.Any], fls = fls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSecurityRolesNative]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XpackUsageSecurityRolesNative] (val x: Self) extends AnyVal {
    
    inline def setDls(value: Boolean): Self = StObject.set(x, "dls", value.asInstanceOf[js.Any])
    
    inline def setFls(value: Boolean): Self = StObject.set(x, "fls", value.asInstanceOf[js.Any])
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
