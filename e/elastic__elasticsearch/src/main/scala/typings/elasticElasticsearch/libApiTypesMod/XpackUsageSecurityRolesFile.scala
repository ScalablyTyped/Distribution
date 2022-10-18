package typings.elasticElasticsearch.libApiTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait XpackUsageSecurityRolesFile extends StObject {
  
  var dls: Boolean
  
  var fls: Boolean
  
  var size: long
}
object XpackUsageSecurityRolesFile {
  
  inline def apply(dls: Boolean, fls: Boolean, size: long): XpackUsageSecurityRolesFile = {
    val __obj = js.Dynamic.literal(dls = dls.asInstanceOf[js.Any], fls = fls.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[XpackUsageSecurityRolesFile]
  }
  
  extension [Self <: XpackUsageSecurityRolesFile](x: Self) {
    
    inline def setDls(value: Boolean): Self = StObject.set(x, "dls", value.asInstanceOf[js.Any])
    
    inline def setFls(value: Boolean): Self = StObject.set(x, "fls", value.asInstanceOf[js.Any])
    
    inline def setSize(value: long): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
  }
}
