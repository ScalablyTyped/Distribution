package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.del
import typings.ecmarkup.ecmarkupStrings.ins
import typings.ecmarkup.ecmarkupStrings.mark
import typings.ecmarkup.libHeaderParserMod.Param
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  type :null} & ecmarkup.ecmarkup/lib/header-parser.BaseParam */
trait typenullBaseParam
  extends StObject
     with Param {
  
  var name: String
  
  var `type`: Null
  
  var wrappingTag: ins | del | mark | Null
}
object typenullBaseParam {
  
  inline def apply(name: String, `type`: Null): typenullBaseParam = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], wrappingTag = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typenullBaseParam]
  }
  
  extension [Self <: typenullBaseParam](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: Null): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrappingTag(value: ins | del | mark): Self = StObject.set(x, "wrappingTag", value.asInstanceOf[js.Any])
    
    inline def setWrappingTagNull: Self = StObject.set(x, "wrappingTag", null)
  }
}
