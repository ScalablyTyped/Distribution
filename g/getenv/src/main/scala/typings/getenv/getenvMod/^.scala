package typings.getenv.getenvMod

import org.scalablytyped.runtime.StringDictionary
import typings.getenv.getenvStrings.bool
import typings.getenv.getenvStrings.boolish
import typings.getenv.getenvStrings.float
import typings.getenv.getenvStrings.int
import typings.getenv.getenvStrings.string
import typings.getenv.getenvStrings.url
import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Alias for `env.string(name, [fallback])`
    */
  def apply(name: String): String = js.native
  def apply(name: String, fallback: String): String = js.native
  /**
    * Split value of the environment variable at each comma and return the resulting array
    * where each value has been typecast according to the `type` parameter. An array can be
    * provided as `fallback`.
    */
  def array(name: String): js.Array[String] = js.native
  @JSName("array")
  def array_bool(name: String, `type`: bool): js.Array[Boolean] = js.native
  @JSName("array")
  def array_bool(name: String, `type`: bool, fallback: js.Array[Boolean]): js.Array[Boolean] = js.native
  @JSName("array")
  def array_boolish(name: String, `type`: boolish): js.Array[Boolean] = js.native
  @JSName("array")
  def array_boolish(name: String, `type`: boolish, fallback: js.Array[Boolean]): js.Array[Boolean] = js.native
  @JSName("array")
  def array_float(name: String, `type`: float): js.Array[Double] = js.native
  @JSName("array")
  def array_float(name: String, `type`: float, fallback: js.Array[Double]): js.Array[Double] = js.native
  @JSName("array")
  def array_int(name: String, `type`: int): js.Array[Double] = js.native
  @JSName("array")
  def array_int(name: String, `type`: int, fallback: js.Array[Double]): js.Array[Double] = js.native
  @JSName("array")
  def array_string(name: String, `type`: string): js.Array[String] = js.native
  @JSName("array")
  def array_string(name: String, `type`: string, fallback: js.Array[String]): js.Array[String] = js.native
  @JSName("array")
  def array_url(name: String, `type`: url): js.Array[UrlWithStringQuery] = js.native
  @JSName("array")
  def array_url(name: String, `type`: url, fallback: js.Array[UrlWithStringQuery]): js.Array[UrlWithStringQuery] = js.native
  /**
    * Return as boolean. Only allows true/false as valid values.
    */
  def bool(name: String): Boolean = js.native
  def bool(name: String, fallback: Boolean): Boolean = js.native
  /**
    * Return as boolean. Allows true/false/1/0 as valid values.
    */
  def boolish(name: String): Boolean = js.native
  def boolish(name: String, fallback: Boolean): Boolean = js.native
  /**
    * `getenv` won't throw any error. If a fallback value is provided, that will be returned, else undefined is returned.
    */
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
  def disableFallbacks(): Unit = js.native
  /**
    * Revert the effect of `disableErrors()`.
    */
  def enableErrors(): Unit = js.native
  /**
    * Revert the effect of `disableFallbacks()`.
    */
  def enableFallbacks(): Unit = js.native
  /**
    * Return as float number.
    */
  def float(name: String): Double = js.native
  def float(name: String, fallback: Double): Double = js.native
  /**
    * Return as integer number.
    */
  def int(name: String): Double = js.native
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
  def multi[S /* <: StringDictionary[String | ParseWithFallback | ParseWithEachType] */](spec: S): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof S ]: S[P][2] extends getenv.getenv.ParseTypes? getenv.getenv.ParseMappings[S[P][2]] : string}
    */ typings.getenv.getenvStrings.multi with js.Any = js.native
  /**
    * Return as string.
    */
  def string(name: String): String = js.native
  def string(name: String, fallback: String): String = js.native
  /**
    * Return a parsed URL as per Node's `require("url").parse`. N.B `url` doesn't validate URLs, so be sure it includes a protocol or you'll get deeply weird results.
    */
  def url(name: String): UrlWithStringQuery = js.native
  def url(name: String, fallback: UrlWithStringQuery): UrlWithStringQuery = js.native
}

