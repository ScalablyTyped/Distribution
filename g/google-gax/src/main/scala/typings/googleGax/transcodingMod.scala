package typings.googleGax

import typings.googleGax.anon.httpOptionNameIHttpRuleun
import typings.googleGax.googleGaxStrings.delete_
import typings.googleGax.googleGaxStrings.get_
import typings.googleGax.googleGaxStrings.patch_
import typings.googleGax.googleGaxStrings.post_
import typings.googleGax.googleGaxStrings.put_
import typings.googleGax.httpMod.google.api.IHttpRule
import typings.proto3JsonSerializer.typesMod.JSONObject
import typings.proto3JsonSerializer.typesMod.JSONValue
import typings.protobufjs.mod.Field
import typings.protobufjs.mod.Root
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transcodingMod {
  
  @JSImport("google-gax/build/src/transcoding", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def applyPattern(pattern: String, fieldValue: String): js.UndefOr[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("applyPattern")(pattern.asInstanceOf[js.Any], fieldValue.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[String]]
  
  inline def buildQueryStringComponents(request: JSONObject): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryStringComponents")(request.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def buildQueryStringComponents(request: JSONObject, prefix: String): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("buildQueryStringComponents")(request.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def deepCopyWithoutMatchedFields(request: JSONObject, fieldsToSkip: Set[String]): JSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCopyWithoutMatchedFields")(request.asInstanceOf[js.Any], fieldsToSkip.asInstanceOf[js.Any])).asInstanceOf[JSONObject]
  inline def deepCopyWithoutMatchedFields(request: JSONObject, fieldsToSkip: Set[String], fullNamePrefix: String): JSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("deepCopyWithoutMatchedFields")(request.asInstanceOf[js.Any], fieldsToSkip.asInstanceOf[js.Any], fullNamePrefix.asInstanceOf[js.Any])).asInstanceOf[JSONObject]
  
  inline def deleteField(request: JSONObject, field: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteField")(request.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def encodeWithSlashes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWithSlashes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def encodeWithoutSlashes(str: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("encodeWithoutSlashes")(str.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def flattenObject(request: JSONObject): JSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("flattenObject")(request.asInstanceOf[js.Any]).asInstanceOf[JSONObject]
  
  inline def getField(request: JSONObject, field: String): js.UndefOr[JSONValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(request.asInstanceOf[js.Any], field.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JSONValue]]
  inline def getField(request: JSONObject, field: String, allowObjects: Boolean): js.UndefOr[JSONValue] = (^.asInstanceOf[js.Dynamic].applyDynamic("getField")(request.asInstanceOf[js.Any], field.asInstanceOf[js.Any], allowObjects.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[JSONValue]]
  
  inline def isProto3OptionalField(field: Field): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("isProto3OptionalField")(field.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def `match`(request: JSONObject, pattern: String): js.UndefOr[MatchResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("match")(request.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[MatchResult]]
  
  inline def overrideHttpRules(httpRules: js.Array[IHttpRule], protoJson: Root): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("overrideHttpRules")(httpRules.asInstanceOf[js.Any], protoJson.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def transcode(request: JSONObject, parsedOptions: ParsedOptionsType): js.UndefOr[TranscodedRequest] = (^.asInstanceOf[js.Dynamic].applyDynamic("transcode")(request.asInstanceOf[js.Any], parsedOptions.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[TranscodedRequest]]
  
  trait MatchResult extends StObject {
    
    var matchedFields: js.Array[String]
    
    var url: String
  }
  object MatchResult {
    
    inline def apply(matchedFields: js.Array[String], url: String): MatchResult = {
      val __obj = js.Dynamic.literal(matchedFields = matchedFields.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[MatchResult]
    }
    
    extension [Self <: MatchResult](x: Self) {
      
      inline def setMatchedFields(value: js.Array[String]): Self = StObject.set(x, "matchedFields", value.asInstanceOf[js.Any])
      
      inline def setMatchedFieldsVarargs(value: String*): Self = StObject.set(x, "matchedFields", js.Array(value*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type ParsedOptionsType = js.Array[httpOptionNameIHttpRuleun]
  
  trait TranscodedRequest extends StObject {
    
    var data: String | js.Object
    
    var httpMethod: get_ | post_ | put_ | patch_ | delete_
    
    var queryString: String
    
    var url: String
  }
  object TranscodedRequest {
    
    inline def apply(
      data: String | js.Object,
      httpMethod: get_ | post_ | put_ | patch_ | delete_,
      queryString: String,
      url: String
    ): TranscodedRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], queryString = queryString.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[TranscodedRequest]
    }
    
    extension [Self <: TranscodedRequest](x: Self) {
      
      inline def setData(value: String | js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHttpMethod(value: get_ | post_ | put_ | patch_ | delete_): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      inline def setQueryString(value: String): Self = StObject.set(x, "queryString", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  type allowedOptions = String
}
