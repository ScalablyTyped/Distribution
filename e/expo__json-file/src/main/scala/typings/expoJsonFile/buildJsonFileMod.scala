package typings.expoJsonFile

import org.scalablytyped.runtime.StringDictionary
import typings.expoJsonFile.anon.FnCall
import typings.expoJsonFile.anon.FnCallFileKeyDefaultValueOptions
import typings.expoJsonFile.anon.FnCallFileKeyOptions
import typings.expoJsonFile.anon.FnCallFileKeyValueOptions
import typings.expoJsonFile.anon.FnCallFileKeysOptions
import typings.expoJsonFile.anon.FnCallFileObjectOptions
import typings.expoJsonFile.anon.FnCallFileOptions
import typings.expoJsonFile.anon.FnCallFileSourcesOptions
import typings.expoJsonFile.anon.FnCallJsonOptionsFileName
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildJsonFileMod {
  
  @JSImport("@expo/json-file/build/JsonFile", JSImport.Default)
  @js.native
  open class default[TJSONObject /* <: JSONObject */] protected ()
    extends StObject
       with JsonFile[TJSONObject] {
    def this(file: String) = this()
    def this(file: String, options: Options[TJSONObject]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@expo/json-file/build/JsonFile", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@expo/json-file/build/JsonFile", "default.deleteKeyAsync")
    @js.native
    def deleteKeyAsync: FnCallFileKeyOptions = js.native
    inline def deleteKeyAsync[TJSONObject /* <: JSONObject */](file: String, key: String): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteKeyAsync")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def deleteKeyAsync[TJSONObject /* <: JSONObject */](file: String, key: String, options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteKeyAsync")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def deleteKeyAsync_=(x: FnCallFileKeyOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteKeyAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.deleteKeysAsync")
    @js.native
    def deleteKeysAsync: FnCallFileKeysOptions = js.native
    inline def deleteKeysAsync[TJSONObject /* <: JSONObject */](file: String, keys: js.Array[String]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteKeysAsync")(file.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def deleteKeysAsync[TJSONObject /* <: JSONObject */](file: String, keys: js.Array[String], options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteKeysAsync")(file.asInstanceOf[js.Any], keys.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def deleteKeysAsync_=(x: FnCallFileKeysOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("deleteKeysAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.getAsync")
    @js.native
    def getAsync: FnCallFileKeyDefaultValueOptions = js.native
    inline def getAsync[TJSONObject /* <: JSONObject */, K /* <: /* keyof TJSONObject */ String */, DefaultValue](file: String, key: K, defaultValue: DefaultValue): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def getAsync[TJSONObject /* <: JSONObject */, K /* <: /* keyof TJSONObject */ String */, DefaultValue](file: String, key: K, defaultValue: DefaultValue, options: Options[TJSONObject]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAsync")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    inline def getAsync_=(x: FnCallFileKeyDefaultValueOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.mergeAsync")
    @js.native
    def mergeAsync: FnCallFileSourcesOptions = js.native
    inline def mergeAsync[TJSONObject /* <: JSONObject */](file: String, sources: js.Array[Partial[TJSONObject]]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAsync")(file.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def mergeAsync[TJSONObject /* <: JSONObject */](file: String, sources: js.Array[Partial[TJSONObject]], options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAsync")(file.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def mergeAsync[TJSONObject /* <: JSONObject */](file: String, sources: Partial[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAsync")(file.asInstanceOf[js.Any], sources.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def mergeAsync[TJSONObject /* <: JSONObject */](file: String, sources: Partial[TJSONObject], options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("mergeAsync")(file.asInstanceOf[js.Any], sources.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def mergeAsync_=(x: FnCallFileSourcesOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("mergeAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.parseJsonString")
    @js.native
    def parseJsonString: FnCallJsonOptionsFileName = js.native
    inline def parseJsonString[TJSONObject /* <: JSONObject */](json: String): TJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonString")(json.asInstanceOf[js.Any]).asInstanceOf[TJSONObject]
    inline def parseJsonString[TJSONObject /* <: JSONObject */](json: String, options: Unit, fileName: String): TJSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonString")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[TJSONObject]
    inline def parseJsonString[TJSONObject /* <: JSONObject */](json: String, options: Options[TJSONObject]): TJSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonString")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TJSONObject]
    inline def parseJsonString[TJSONObject /* <: JSONObject */](json: String, options: Options[TJSONObject], fileName: String): TJSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("parseJsonString")(json.asInstanceOf[js.Any], options.asInstanceOf[js.Any], fileName.asInstanceOf[js.Any])).asInstanceOf[TJSONObject]
    inline def parseJsonString_=(x: FnCallJsonOptionsFileName): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("parseJsonString")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.read")
    @js.native
    def read: FnCall = js.native
    inline def read[TJSONObject /* <: JSONObject */](file: String): TJSONObject = ^.asInstanceOf[js.Dynamic].applyDynamic("read")(file.asInstanceOf[js.Any]).asInstanceOf[TJSONObject]
    inline def read[TJSONObject /* <: JSONObject */](file: String, options: Options[TJSONObject]): TJSONObject = (^.asInstanceOf[js.Dynamic].applyDynamic("read")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[TJSONObject]
    
    @JSImport("@expo/json-file/build/JsonFile", "default.readAsync")
    @js.native
    def readAsync: FnCallFileOptions = js.native
    inline def readAsync[TJSONObject /* <: JSONObject */](file: String): js.Promise[TJSONObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("readAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TJSONObject]]
    inline def readAsync[TJSONObject /* <: JSONObject */](file: String, options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("readAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def readAsync_=(x: FnCallFileOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("readAsync")(x.asInstanceOf[js.Any])
    
    inline def read_=(x: FnCall): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("read")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.rewriteAsync")
    @js.native
    def rewriteAsync: FnCallFileOptions = js.native
    inline def rewriteAsync[TJSONObject /* <: JSONObject */](file: String): js.Promise[TJSONObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("rewriteAsync")(file.asInstanceOf[js.Any]).asInstanceOf[js.Promise[TJSONObject]]
    inline def rewriteAsync[TJSONObject /* <: JSONObject */](file: String, options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("rewriteAsync")(file.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def rewriteAsync_=(x: FnCallFileOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("rewriteAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.setAsync")
    @js.native
    def setAsync: FnCallFileKeyValueOptions = js.native
    inline def setAsync[TJSONObject /* <: JSONObject */](file: String, key: String, value: Any): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAsync")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def setAsync[TJSONObject /* <: JSONObject */](file: String, key: String, value: Any, options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("setAsync")(file.asInstanceOf[js.Any], key.asInstanceOf[js.Any], value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def setAsync_=(x: FnCallFileKeyValueOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setAsync")(x.asInstanceOf[js.Any])
    
    @JSImport("@expo/json-file/build/JsonFile", "default.writeAsync")
    @js.native
    def writeAsync: FnCallFileObjectOptions = js.native
    inline def writeAsync[TJSONObject /* <: JSONObject */](file: String, `object`: TJSONObject): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def writeAsync[TJSONObject /* <: JSONObject */](file: String, `object`: TJSONObject, options: Options[TJSONObject]): js.Promise[TJSONObject] = (^.asInstanceOf[js.Dynamic].applyDynamic("writeAsync")(file.asInstanceOf[js.Any], `object`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[TJSONObject]]
    inline def writeAsync_=(x: FnCallFileObjectOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("writeAsync")(x.asInstanceOf[js.Any])
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends undefined ? never : T
    }}}
    */
  @js.native
  trait Defined[T] extends StObject
  
  type JSONArray = js.Array[JSONValue]
  
  trait JSONObject
    extends StObject
       with /* key */ StringDictionary[js.UndefOr[JSONValue]]
  object JSONObject {
    
    inline def apply(): JSONObject = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[JSONObject]
    }
  }
  
  type JSONValue = Boolean | Double | String | Null | Any | JSONObject
  
  @js.native
  trait JsonFile[TJSONObject /* <: JSONObject */] extends StObject {
    
    def _getOptions(): Options[TJSONObject] = js.native
    def _getOptions(options: Options[TJSONObject]): Options[TJSONObject] = js.native
    
    def deleteKeyAsync(key: String): js.Promise[TJSONObject] = js.native
    def deleteKeyAsync(key: String, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    
    def deleteKeysAsync(keys: js.Array[String]): js.Promise[TJSONObject] = js.native
    def deleteKeysAsync(keys: js.Array[String], options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    
    var file: String = js.native
    
    def getAsync[K /* <: /* keyof TJSONObject */ String */, TDefault /* <: (/* import warning: importer.ImportType#apply Failed type conversion: TJSONObject[K] */ js.Any) | Null */](key: K, defaultValue: TDefault): js.Promise[
        (Defined[
          /* import warning: importer.ImportType#apply Failed type conversion: TJSONObject[K] */ js.Any
        ]) | TDefault
      ] = js.native
    def getAsync[K /* <: /* keyof TJSONObject */ String */, TDefault /* <: (/* import warning: importer.ImportType#apply Failed type conversion: TJSONObject[K] */ js.Any) | Null */](key: K, defaultValue: TDefault, options: Options[TJSONObject]): js.Promise[
        (Defined[
          /* import warning: importer.ImportType#apply Failed type conversion: TJSONObject[K] */ js.Any
        ]) | TDefault
      ] = js.native
    
    def mergeAsync(sources: js.Array[Partial[TJSONObject]]): js.Promise[TJSONObject] = js.native
    def mergeAsync(sources: js.Array[Partial[TJSONObject]], options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    def mergeAsync(sources: Partial[TJSONObject]): js.Promise[TJSONObject] = js.native
    def mergeAsync(sources: Partial[TJSONObject], options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    
    var options: Options[TJSONObject] = js.native
    
    def parseJsonString(json: String): TJSONObject = js.native
    def parseJsonString(json: String, options: Options[TJSONObject]): TJSONObject = js.native
    
    def read(): TJSONObject = js.native
    def read(options: Options[TJSONObject]): TJSONObject = js.native
    
    def readAsync(): js.Promise[TJSONObject] = js.native
    def readAsync(options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    
    def rewriteAsync(): js.Promise[TJSONObject] = js.native
    def rewriteAsync(options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    
    def setAsync(key: String, value: Any): js.Promise[TJSONObject] = js.native
    def setAsync(key: String, value: Any, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
    
    def writeAsync(`object`: TJSONObject): js.Promise[TJSONObject] = js.native
    def writeAsync(`object`: TJSONObject, options: Options[TJSONObject]): js.Promise[TJSONObject] = js.native
  }
  
  trait Options[TJSONObject /* <: JSONObject */] extends StObject {
    
    var default: js.UndefOr[TJSONObject] = js.undefined
    
    var addNewLineAtEOF: js.UndefOr[Boolean] = js.undefined
    
    var badJsonDefault: js.UndefOr[TJSONObject] = js.undefined
    
    var cantReadFileDefault: js.UndefOr[TJSONObject] = js.undefined
    
    var ensureDir: js.UndefOr[Boolean] = js.undefined
    
    var json5: js.UndefOr[Boolean] = js.undefined
    
    var jsonParseErrorDefault: js.UndefOr[TJSONObject] = js.undefined
    
    var space: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply[TJSONObject /* <: JSONObject */](): Options[TJSONObject] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[TJSONObject]]
    }
    
    extension [Self <: Options[?], TJSONObject /* <: JSONObject */](x: Self & Options[TJSONObject]) {
      
      inline def setAddNewLineAtEOF(value: Boolean): Self = StObject.set(x, "addNewLineAtEOF", value.asInstanceOf[js.Any])
      
      inline def setAddNewLineAtEOFUndefined: Self = StObject.set(x, "addNewLineAtEOF", js.undefined)
      
      inline def setBadJsonDefault(value: TJSONObject): Self = StObject.set(x, "badJsonDefault", value.asInstanceOf[js.Any])
      
      inline def setBadJsonDefaultUndefined: Self = StObject.set(x, "badJsonDefault", js.undefined)
      
      inline def setCantReadFileDefault(value: TJSONObject): Self = StObject.set(x, "cantReadFileDefault", value.asInstanceOf[js.Any])
      
      inline def setCantReadFileDefaultUndefined: Self = StObject.set(x, "cantReadFileDefault", js.undefined)
      
      inline def setDefault(value: TJSONObject): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      inline def setEnsureDir(value: Boolean): Self = StObject.set(x, "ensureDir", value.asInstanceOf[js.Any])
      
      inline def setEnsureDirUndefined: Self = StObject.set(x, "ensureDir", js.undefined)
      
      inline def setJson5(value: Boolean): Self = StObject.set(x, "json5", value.asInstanceOf[js.Any])
      
      inline def setJson5Undefined: Self = StObject.set(x, "json5", js.undefined)
      
      inline def setJsonParseErrorDefault(value: TJSONObject): Self = StObject.set(x, "jsonParseErrorDefault", value.asInstanceOf[js.Any])
      
      inline def setJsonParseErrorDefaultUndefined: Self = StObject.set(x, "jsonParseErrorDefault", js.undefined)
      
      inline def setSpace(value: Double): Self = StObject.set(x, "space", value.asInstanceOf[js.Any])
      
      inline def setSpaceUndefined: Self = StObject.set(x, "space", js.undefined)
    }
  }
}
