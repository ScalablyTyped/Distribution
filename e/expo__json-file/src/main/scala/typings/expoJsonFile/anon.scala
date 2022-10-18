package typings.expoJsonFile

import typings.expoJsonFile.buildJsonFileMod.JSONObject
import typings.expoJsonFile.buildJsonFileMod.Options
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String): TJSONObject = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, options: Options[TJSONObject]): TJSONObject = js.native
  }
  
  @js.native
  trait FnCallFileKeyDefaultValueOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */, K /* <: /* keyof TJSONObject */ String */, DefaultValue](file: String, key: K, defaultValue: DefaultValue): js.Promise[Any] = js.native
    def apply[TJSONObject /* <: JSONObject */, K /* <: /* keyof TJSONObject */ String */, DefaultValue](file: String, key: K, defaultValue: DefaultValue, options: Options[TJSONObject]): js.Promise[Any] = js.native
  }
  
  @js.native
  trait FnCallFileKeyOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String, key: String): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, key: String, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  @js.native
  trait FnCallFileKeyValueOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String, key: String, value: Any): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, key: String, value: Any, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  @js.native
  trait FnCallFileKeysOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String, keys: js.Array[String]): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, keys: js.Array[String], options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  @js.native
  trait FnCallFileObjectOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String, `object`: TJSONObject): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, `object`: TJSONObject, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  @js.native
  trait FnCallFileOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  @js.native
  trait FnCallFileSourcesOptions extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](file: String, sources: js.Array[Partial[TJSONObject]]): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, sources: js.Array[Partial[TJSONObject]], options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, sources: Partial[TJSONObject]): js.Promise[TJSONObject] = js.native
    def apply[TJSONObject /* <: JSONObject */](file: String, sources: Partial[TJSONObject], options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  @js.native
  trait FnCallJsonOptionsFileName extends StObject {
    
    def apply[TJSONObject /* <: JSONObject */](json: String): TJSONObject = js.native
    def apply[TJSONObject /* <: JSONObject */](json: String, options: Unit, fileName: String): TJSONObject = js.native
    def apply[TJSONObject /* <: JSONObject */](json: String, options: Options[TJSONObject]): TJSONObject = js.native
    def apply[TJSONObject /* <: JSONObject */](json: String, options: Options[TJSONObject], fileName: String): TJSONObject = js.native
  }
}
