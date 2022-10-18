package typings.ecmarkup.anon

import typings.ecmarkup.ecmarkupStrings.`multi-line`
import typings.ecmarkup.ecmarkupStrings.`single-line`
import typings.ecmarkup.ecmarkupStrings.del
import typings.ecmarkup.ecmarkupStrings.ins
import typings.ecmarkup.ecmarkupStrings.mark
import typings.ecmarkup.libHeaderParserMod.Param
import typings.ecmarkup.libHeaderParserMod.ParseError
import typings.ecmarkup.libHeaderParserMod.ParsedHeader
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  returnType :null} & ecmarkup.ecmarkup/lib/header-parser.ParsedHeaderWithoutReturn */
trait returnTypenullParsedHeade
  extends StObject
     with ParsedHeader {
  
  var errors: js.Array[ParseError]
  
  var name: String
  
  var optionalParams: js.Array[Param]
  
  var params: js.Array[Param]
  
  var prefix: String | Null
  
  var returnType: Null & (String | Null)
  
  var `type`: `single-line` | `multi-line`
  
  var wrappingTag: ins | del | mark | Null
}
object returnTypenullParsedHeade {
  
  inline def apply(
    errors: js.Array[ParseError],
    name: String,
    optionalParams: js.Array[Param],
    params: js.Array[Param],
    returnType: Null & (String | Null),
    `type`: `single-line` | `multi-line`
  ): returnTypenullParsedHeade = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], prefix = null, wrappingTag = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[returnTypenullParsedHeade]
  }
  
  extension [Self <: returnTypenullParsedHeade](x: Self) {
    
    inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOptionalParams(value: js.Array[Param]): Self = StObject.set(x, "optionalParams", value.asInstanceOf[js.Any])
    
    inline def setOptionalParamsVarargs(value: Param*): Self = StObject.set(x, "optionalParams", js.Array(value*))
    
    inline def setParams(value: js.Array[Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsVarargs(value: Param*): Self = StObject.set(x, "params", js.Array(value*))
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
    
    inline def setReturnType(value: Null & (String | Null)): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
    
    inline def setType(value: `single-line` | `multi-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setWrappingTag(value: ins | del | mark): Self = StObject.set(x, "wrappingTag", value.asInstanceOf[js.Any])
    
    inline def setWrappingTagNull: Self = StObject.set(x, "wrappingTag", null)
  }
}
