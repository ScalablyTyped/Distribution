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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Alias for `env.string(name, [fallback])`
    */
  @JSImport("getenv", JSImport.Namespace)
  @js.native
  def apply(name: String): String = js.native
  @JSImport("getenv", JSImport.Namespace)
  @js.native
  def apply(name: String, fallback: String): String = js.native
  
  /**
    * Split value of the environment variable at each comma and return the resulting array
    * where each value has been typecast according to the `type` parameter. An array can be
    * provided as `fallback`.
    */
  @JSImport("getenv", "array")
  @js.native
  def array(name: String): js.Array[String] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array(
    name: String,
    `type`: js.UndefOr[scala.Nothing],
    fallback: js.Array[Boolean | Double | String | UrlWithStringQuery]
  ): js.Array[String] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_bool(name: String, `type`: bool): js.Array[Boolean] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_bool(name: String, `type`: bool, fallback: js.Array[Boolean]): js.Array[Boolean] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_boolish(name: String, `type`: boolish): js.Array[Boolean] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_boolish(name: String, `type`: boolish, fallback: js.Array[Boolean]): js.Array[Boolean] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_float(name: String, `type`: float): js.Array[Double] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_float(name: String, `type`: float, fallback: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_int(name: String, `type`: int): js.Array[Double] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_int(name: String, `type`: int, fallback: js.Array[Double]): js.Array[Double] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_string(name: String, `type`: string): js.Array[String] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_string(name: String, `type`: string, fallback: js.Array[String]): js.Array[String] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_url(name: String, `type`: url): js.Array[UrlWithStringQuery] = js.native
  @JSImport("getenv", "array")
  @js.native
  def array_url(name: String, `type`: url, fallback: js.Array[UrlWithStringQuery]): js.Array[UrlWithStringQuery] = js.native
  
  /**
    * Return as boolean. Only allows true/false as valid values.
    */
  @JSImport("getenv", "bool")
  @js.native
  def bool(name: String): Boolean = js.native
  @JSImport("getenv", "bool")
  @js.native
  def bool(name: String, fallback: Boolean): Boolean = js.native
  
  /**
    * Return as boolean. Allows true/false/1/0 as valid values.
    */
  @JSImport("getenv", "boolish")
  @js.native
  def boolish(name: String): Boolean = js.native
  @JSImport("getenv", "boolish")
  @js.native
  def boolish(name: String, fallback: Boolean): Boolean = js.native
  
  /**
    * `getenv` won't throw any error. If a fallback value is provided, that will be returned, else undefined is returned.
    */
  @JSImport("getenv", "disableErrors")
  @js.native
  def disableErrors(): Unit = js.native
  
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
  @JSImport("getenv", "disableFallbacks")
  @js.native
  def disableFallbacks(): Unit = js.native
  
  /**
    * Revert the effect of `disableErrors()`.
    */
  @JSImport("getenv", "enableErrors")
  @js.native
  def enableErrors(): Unit = js.native
  
  /**
    * Revert the effect of `disableFallbacks()`.
    */
  @JSImport("getenv", "enableFallbacks")
  @js.native
  def enableFallbacks(): Unit = js.native
  
  /**
    * Return as float number.
    */
  @JSImport("getenv", "float")
  @js.native
  def float(name: String): Double = js.native
  @JSImport("getenv", "float")
  @js.native
  def float(name: String, fallback: Double): Double = js.native
  
  /**
    * Return as integer number.
    */
  @JSImport("getenv", "int")
  @js.native
  def int(name: String): Double = js.native
  @JSImport("getenv", "int")
  @js.native
  def int(name: String, fallback: Double): Double = js.native
  
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
  @JSImport("getenv", "multi")
  @js.native
  def multi[S /* <: StringDictionary[String | ParseWithFallback | ParseWithEachType] */](spec: S): /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof S ]: S[P][2] extends getenv.getenv.ParseTypes? getenv.getenv.ParseMappings[S[P][2]] : string}
    */ typings.getenv.getenvStrings.multi with TopLevel[js.Any] = js.native
  
  /**
    * Return as string.
    */
  @JSImport("getenv", "string")
  @js.native
  def string(name: String): String = js.native
  @JSImport("getenv", "string")
  @js.native
  def string(name: String, fallback: String): String = js.native
  
  /**
    * Return a parsed URL as per Node's `require("url").parse`. N.B `url` doesn't validate URLs, so be sure it includes a protocol or you'll get deeply weird results.
    */
  @JSImport("getenv", "url")
  @js.native
  def url(name: String): UrlWithStringQuery = js.native
  @JSImport("getenv", "url")
  @js.native
  def url(name: String, fallback: UrlWithStringQuery): UrlWithStringQuery = js.native
  
  @js.native
  trait ParseMappings extends StObject {
    
    var bool: Boolean = js.native
    
    var boolish: Boolean = js.native
    
    var float: Double = js.native
    
    var int: Double = js.native
    
    var string: String = js.native
    
    var url: UrlWithStringQuery = js.native
  }
  object ParseMappings {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class ParseMappingsMutableBuilder[Self <: ParseMappings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBool(value: Boolean): Self = StObject.set(x, "bool", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoolish(value: Boolean): Self = StObject.set(x, "boolish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFloat(value: Double): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInt(value: Double): Self = StObject.set(x, "int", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setString(value: String): Self = StObject.set(x, "string", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: UrlWithStringQuery): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
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
