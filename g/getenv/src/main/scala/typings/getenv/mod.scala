package typings.getenv

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.getenv.getenvStrings.bool
import typings.getenv.getenvStrings.boolish
import typings.getenv.getenvStrings.float
import typings.getenv.getenvStrings.int
import typings.getenv.getenvStrings.string
import typings.getenv.getenvStrings.url
import typings.node.urlMod.UrlWithStringQuery
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Alias for `env.string(name, [fallback])`
    */
  inline def apply(name: String): String = ^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def apply(name: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].apply(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @JSImport("getenv", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Split value of the environment variable at each comma and return the resulting array
    * where each value has been typecast according to the `type` parameter. An array can be
    * provided as `fallback`.
    */
  inline def array(name: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def array(name: String, `type`: Unit, fallback: js.Array[Boolean | Double | String | UrlWithStringQuery]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def array_bool(name: String, `type`: bool): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  inline def array_bool(name: String, `type`: bool, fallback: js.Array[Boolean]): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  
  inline def array_boolish(name: String, `type`: boolish): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  inline def array_boolish(name: String, `type`: boolish, fallback: js.Array[Boolean]): js.Array[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Boolean]]
  
  inline def array_float(name: String, `type`: float): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def array_float(name: String, `type`: float, fallback: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def array_int(name: String, `type`: int): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  inline def array_int(name: String, `type`: int, fallback: js.Array[Double]): js.Array[Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[Double]]
  
  inline def array_string(name: String, `type`: string): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  inline def array_string(name: String, `type`: string, fallback: js.Array[String]): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  inline def array_url(name: String, `type`: url): js.Array[UrlWithStringQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[js.Array[UrlWithStringQuery]]
  inline def array_url(name: String, `type`: url, fallback: js.Array[UrlWithStringQuery]): js.Array[UrlWithStringQuery] = (^.asInstanceOf[js.Dynamic].applyDynamic("array")(name.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[js.Array[UrlWithStringQuery]]
  
  /**
    * Return as boolean. Only allows true/false as valid values.
    */
  inline def bool(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("bool")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def bool(name: String, fallback: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("bool")(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * Return as boolean. Allows true/false/1/0 as valid values.
    */
  inline def boolish(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("boolish")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  inline def boolish(name: String, fallback: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("boolish")(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  /**
    * `getenv` won't throw any error. If a fallback value is provided, that will be returned, else undefined is returned.
    */
  inline def disableErrors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableErrors")().asInstanceOf[Unit]
  
  /**
    * Disallows fallbacks in environments where you don't want to rely on brittle development
    * defaults (e.g production, integration testing). For example, to disable fallbacks if we
    * indicate production via `NODE_ENV`:
    * ```
    *   if (process.env.NODE_ENV === 'production') {
    *     getenv.disableFallbacks();
    *   }
    * ```
    */
  inline def disableFallbacks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("disableFallbacks")().asInstanceOf[Unit]
  
  /**
    * Revert the effect of `disableErrors()`.
    */
  inline def enableErrors(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableErrors")().asInstanceOf[Unit]
  
  /**
    * Revert the effect of `disableFallbacks()`.
    */
  inline def enableFallbacks(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("enableFallbacks")().asInstanceOf[Unit]
  
  /**
    * Return as float number.
    */
  inline def float(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("float")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def float(name: String, fallback: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("float")(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Return as integer number.
    */
  inline def int(name: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("int")(name.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def int(name: String, fallback: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("int")(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  /**
    * Return a list of environment variables based on a spec:
    * ```
    *  var config = getenv.multi({
    *    foo: "FOO", // throws if FOO doesn't exist
    *    bar: ["BAR", "defaultval"], // set a default value
    *    baz: ["BAZ", "defaultval", "string"], // parse into type
    *    quux: ["QUUX", undefined, "int"] // parse & throw
    *  });
    * ```
    */
  inline def multi[S /* <: StringDictionary[String | ParseWithFallback | ParseWithEachType] */](spec: S): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof S ]: S[P][2] extends getenv.getenv.ParseTypes? getenv.getenv.ParseMappings[S[P][2]] : string}
    */ typings.getenv.getenvStrings.multi & TopLevel[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("multi")(spec.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof S ]: S[P][2] extends getenv.getenv.ParseTypes? getenv.getenv.ParseMappings[S[P][2]] : string}
    */ typings.getenv.getenvStrings.multi & TopLevel[Any]]
  
  /**
    * Return as string.
    */
  inline def string(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("string")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def string(name: String, fallback: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("string")(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[String]
  
  /**
    * Return a parsed URL as per Node's `require("url").parse`. N.B `url` doesn't validate URLs, so be sure it includes a protocol or you'll get deeply weird results.
    */
  inline def url(name: String): UrlWithStringQuery = ^.asInstanceOf[js.Dynamic].applyDynamic("url")(name.asInstanceOf[js.Any]).asInstanceOf[UrlWithStringQuery]
  inline def url(name: String, fallback: UrlWithStringQuery): UrlWithStringQuery = (^.asInstanceOf[js.Dynamic].applyDynamic("url")(name.asInstanceOf[js.Any], fallback.asInstanceOf[js.Any])).asInstanceOf[UrlWithStringQuery]
  
  trait ParseMappings extends StObject {
    
    var bool: Boolean
    
    var boolish: Boolean
    
    var float: Double
    
    var int: Double
    
    var string: String
    
    var url: UrlWithStringQuery
  }
  object ParseMappings {
    
    inline def apply(
      bool: Boolean,
      boolish: Boolean,
      float: Double,
      int: Double,
      string: String,
      url: UrlWithStringQuery
    ): ParseMappings = {
      val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], boolish = boolish.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[ParseMappings]
    }
    
    extension [Self <: ParseMappings](x: Self) {
      
      inline def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      inline def setBoolish(value: Boolean): Self = StObject.set(x, "boolish", value.asInstanceOf[js.Any])
      
      inline def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      inline def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: UrlWithStringQuery): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.getenv.getenvStrings.string
    - typings.getenv.getenvStrings.int
    - typings.getenv.getenvStrings.float
    - typings.getenv.getenvStrings.bool
    - typings.getenv.getenvStrings.boolish
    - typings.getenv.getenvStrings.url
  */
  trait ParseTypes extends StObject
  
  type ParseWithEachType = ParseWithType[string | int | float | bool | boolish | url]
  
  type ParseWithFallback = js.Tuple2[String, String]
  
  type ParseWithType[T /* <: ParseTypes */] = js.Tuple3[
    String, 
    /* import warning: importer.ImportType#apply Failed type conversion: getenv.getenv.ParseMappings[T] */ js.Any, 
    T
  ]
}
