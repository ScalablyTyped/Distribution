package typings.ecmarkup

import typings.ecmarkup.anon.Effects
import typings.ecmarkup.anon.FormattedHeader
import typings.ecmarkup.ecmarkupStrings.`multi-line`
import typings.ecmarkup.ecmarkupStrings.`single-line`
import typings.ecmarkup.ecmarkupStrings.del
import typings.ecmarkup.ecmarkupStrings.ins
import typings.ecmarkup.ecmarkupStrings.mark
import typings.ecmarkup.libSpecMod.Spec
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libHeaderParserMod {
  
  @JSImport("ecmarkup/lib/header-parser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def formatEnglishList(list: js.Array[String]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("formatEnglishList")(list.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def formatEnglishList(list: js.Array[String], conjuction: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatEnglishList")(list.asInstanceOf[js.Any], conjuction.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def formatHeader(spec: Spec, header: Element, parseResult: ParsedHeaderOrFailure): FormattedHeader = (^.asInstanceOf[js.Dynamic].applyDynamic("formatHeader")(spec.asInstanceOf[js.Any], header.asInstanceOf[js.Any], parseResult.asInstanceOf[js.Any])).asInstanceOf[FormattedHeader]
  
  inline def formatPreamble(spec: Spec, clause: Element, dl: Element, `type`: String, name: String, formattedParams: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: String
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: String,
    _for: Null,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: String,
    _for: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: String,
    _for: Element,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: Null,
    _for: Null,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: Null,
    _for: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: String,
    name: String,
    formattedParams: String,
    formattedReturnType: Null,
    _for: Element,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(spec: Spec, clause: Element, dl: Element, `type`: Null, name: String, formattedParams: String): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: String
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: String,
    _for: Null,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: String,
    _for: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: String,
    _for: Element,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: Null,
    _for: Null,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: Null,
    _for: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  inline def formatPreamble(
    spec: Spec,
    clause: Element,
    dl: Element,
    `type`: Null,
    name: String,
    formattedParams: String,
    formattedReturnType: Null,
    _for: Element,
    description: Element
  ): js.Array[Element] = (^.asInstanceOf[js.Dynamic].applyDynamic("formatPreamble")(spec.asInstanceOf[js.Any], clause.asInstanceOf[js.Any], dl.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], name.asInstanceOf[js.Any], formattedParams.asInstanceOf[js.Any], formattedReturnType.asInstanceOf[js.Any], _for.asInstanceOf[js.Any], description.asInstanceOf[js.Any])).asInstanceOf[js.Array[Element]]
  
  inline def parseH1(headerText: String): ParsedHeaderOrFailure = ^.asInstanceOf[js.Dynamic].applyDynamic("parseH1")(headerText.asInstanceOf[js.Any]).asInstanceOf[ParsedHeaderOrFailure]
  
  inline def parseStructuredHeaderDl(spec: Spec, `type`: String, dl: Element): Effects = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStructuredHeaderDl")(spec.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], dl.asInstanceOf[js.Any])).asInstanceOf[Effects]
  inline def parseStructuredHeaderDl(spec: Spec, `type`: Null, dl: Element): Effects = (^.asInstanceOf[js.Dynamic].applyDynamic("parseStructuredHeaderDl")(spec.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], dl.asInstanceOf[js.Any])).asInstanceOf[Effects]
  
  inline def printParam(p: Param): String = ^.asInstanceOf[js.Dynamic].applyDynamic("printParam")(p.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def printSimpleParamList(params: js.Array[Param], optionalParams: js.Array[Param]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("printSimpleParamList")(params.asInstanceOf[js.Any], optionalParams.asInstanceOf[js.Any])).asInstanceOf[String]
  
  trait BaseParam extends StObject {
    
    var name: String
    
    var wrappingTag: ins | del | mark | Null
  }
  object BaseParam {
    
    inline def apply(name: String): BaseParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], wrappingTag = null)
      __obj.asInstanceOf[BaseParam]
    }
    
    extension [Self <: BaseParam](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWrappingTag(value: ins | del | mark): Self = StObject.set(x, "wrappingTag", value.asInstanceOf[js.Any])
      
      inline def setWrappingTagNull: Self = StObject.set(x, "wrappingTag", null)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.typenullBaseParam
    - typings.ecmarkup.anon.typestringtypeOffsetnumbe
  */
  trait Param extends StObject
  object Param {
    
    inline def typenullBaseParam(name: String, `type`: Null): typings.ecmarkup.anon.typenullBaseParam = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.typenullBaseParam]
    }
    
    inline def typestringtypeOffsetnumbe(name: String, `type`: String, typeOffset: Double): typings.ecmarkup.anon.typestringtypeOffsetnumbe = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeOffset = typeOffset.asInstanceOf[js.Any], wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.typestringtypeOffsetnumbe]
    }
  }
  
  trait ParseError extends StObject {
    
    var message: String
    
    var offset: Double
  }
  object ParseError {
    
    inline def apply(message: String, offset: Double): ParseError = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseError]
    }
    
    extension [Self <: ParseError](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.anon.returnTypenullParsedHeade
    - typings.ecmarkup.anon.returnTypestringreturnOff
  */
  trait ParsedHeader
    extends StObject
       with ParsedHeaderOrFailure
  object ParsedHeader {
    
    inline def returnTypenullParsedHeade(
      errors: js.Array[ParseError],
      name: String,
      optionalParams: js.Array[Param],
      params: js.Array[Param],
      returnType: Null & (String | Null),
      `type`: `single-line` | `multi-line`
    ): typings.ecmarkup.anon.returnTypenullParsedHeade = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], prefix = null, wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.returnTypenullParsedHeade]
    }
    
    inline def returnTypestringreturnOff(
      errors: js.Array[ParseError],
      name: String,
      optionalParams: js.Array[Param],
      params: js.Array[Param],
      returnOffset: Double,
      returnType: String & (String | Null),
      `type`: `single-line` | `multi-line`
    ): typings.ecmarkup.anon.returnTypestringreturnOff = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnOffset = returnOffset.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], prefix = null, wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.returnTypestringreturnOff]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ecmarkup.libHeaderParserMod.ParsedHeader
    - typings.ecmarkup.anon.Errors
  */
  trait ParsedHeaderOrFailure extends StObject
  object ParsedHeaderOrFailure {
    
    inline def Errors(errors: js.Array[ParseError]): typings.ecmarkup.anon.Errors = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("failure")
      __obj.asInstanceOf[typings.ecmarkup.anon.Errors]
    }
    
    inline def returnTypenullParsedHeade(
      errors: js.Array[ParseError],
      name: String,
      optionalParams: js.Array[Param],
      params: js.Array[Param],
      returnType: Null & (String | Null),
      `type`: `single-line` | `multi-line`
    ): typings.ecmarkup.anon.returnTypenullParsedHeade = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], prefix = null, wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.returnTypenullParsedHeade]
    }
    
    inline def returnTypestringreturnOff(
      errors: js.Array[ParseError],
      name: String,
      optionalParams: js.Array[Param],
      params: js.Array[Param],
      returnOffset: Double,
      returnType: String & (String | Null),
      `type`: `single-line` | `multi-line`
    ): typings.ecmarkup.anon.returnTypestringreturnOff = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], returnOffset = returnOffset.asInstanceOf[js.Any], returnType = returnType.asInstanceOf[js.Any], prefix = null, wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ecmarkup.anon.returnTypestringreturnOff]
    }
  }
  
  trait ParsedHeaderWithoutReturn extends StObject {
    
    var errors: js.Array[ParseError]
    
    var name: String
    
    var optionalParams: js.Array[Param]
    
    var params: js.Array[Param]
    
    var prefix: String | Null
    
    var returnType: String | Null
    
    var `type`: `single-line` | `multi-line`
    
    var wrappingTag: ins | del | mark | Null
  }
  object ParsedHeaderWithoutReturn {
    
    inline def apply(
      errors: js.Array[ParseError],
      name: String,
      optionalParams: js.Array[Param],
      params: js.Array[Param],
      `type`: `single-line` | `multi-line`
    ): ParsedHeaderWithoutReturn = {
      val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], optionalParams = optionalParams.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], prefix = null, returnType = null, wrappingTag = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParsedHeaderWithoutReturn]
    }
    
    extension [Self <: ParsedHeaderWithoutReturn](x: Self) {
      
      inline def setErrors(value: js.Array[ParseError]): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
      
      inline def setErrorsVarargs(value: ParseError*): Self = StObject.set(x, "errors", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptionalParams(value: js.Array[Param]): Self = StObject.set(x, "optionalParams", value.asInstanceOf[js.Any])
      
      inline def setOptionalParamsVarargs(value: Param*): Self = StObject.set(x, "optionalParams", js.Array(value*))
      
      inline def setParams(value: js.Array[Param]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsVarargs(value: Param*): Self = StObject.set(x, "params", js.Array(value*))
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixNull: Self = StObject.set(x, "prefix", null)
      
      inline def setReturnType(value: String): Self = StObject.set(x, "returnType", value.asInstanceOf[js.Any])
      
      inline def setReturnTypeNull: Self = StObject.set(x, "returnType", null)
      
      inline def setType(value: `single-line` | `multi-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setWrappingTag(value: ins | del | mark): Self = StObject.set(x, "wrappingTag", value.asInstanceOf[js.Any])
      
      inline def setWrappingTagNull: Self = StObject.set(x, "wrappingTag", null)
    }
  }
}
