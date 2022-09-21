package typings.flutterwaveNode.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Metaname extends StObject {
  
  var metaname: String
  
  var metavalue: String
}
object Metaname {
  
  inline def apply(metaname: String, metavalue: String): Metaname = {
    val __obj = js.Dynamic.literal(metaname = metaname.asInstanceOf[js.Any], metavalue = metavalue.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metaname]
  }
  
  extension [Self <: Metaname](x: Self) {
    
    inline def setMetaname(value: String): Self = StObject.set(x, "metaname", value.asInstanceOf[js.Any])
    
    inline def setMetavalue(value: String): Self = StObject.set(x, "metavalue", value.asInstanceOf[js.Any])
  }
}
