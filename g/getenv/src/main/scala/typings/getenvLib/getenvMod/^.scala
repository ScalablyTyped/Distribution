package typings
package getenvLib.getenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Alias for `env.string(name, [fallback])`
    */
  def apply(name: java.lang.String): java.lang.String = js.native
  def apply(name: java.lang.String, fallback: java.lang.String): java.lang.String = js.native
  /**
    * Split value of the environment variable at each comma and return the resulting array
    * where each value has been typecast according to the `type` parameter. An array can be
    * provided as `fallback`.
    */
  def array(name: java.lang.String): js.Array[java.lang.String] = js.native
  @JSName("array")
  def array_bool(name: java.lang.String, `type`: getenvLib.getenvLibStrings.bool): js.Array[scala.Boolean] = js.native
  @JSName("array")
  def array_bool(name: java.lang.String, `type`: getenvLib.getenvLibStrings.bool, fallback: js.Array[scala.Boolean]): js.Array[scala.Boolean] = js.native
  @JSName("array")
  def array_boolish(name: java.lang.String, `type`: getenvLib.getenvLibStrings.boolish): js.Array[scala.Boolean] = js.native
  @JSName("array")
  def array_boolish(
    name: java.lang.String,
    `type`: getenvLib.getenvLibStrings.boolish,
    fallback: js.Array[scala.Boolean]
  ): js.Array[scala.Boolean] = js.native
  @JSName("array")
  def array_float(name: java.lang.String, `type`: getenvLib.getenvLibStrings.float): js.Array[scala.Double] = js.native
  @JSName("array")
  def array_float(name: java.lang.String, `type`: getenvLib.getenvLibStrings.float, fallback: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  @JSName("array")
  def array_int(name: java.lang.String, `type`: getenvLib.getenvLibStrings.int): js.Array[scala.Double] = js.native
  @JSName("array")
  def array_int(name: java.lang.String, `type`: getenvLib.getenvLibStrings.int, fallback: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  @JSName("array")
  def array_string(name: java.lang.String, `type`: getenvLib.getenvLibStrings.string): js.Array[java.lang.String] = js.native
  @JSName("array")
  def array_string(
    name: java.lang.String,
    `type`: getenvLib.getenvLibStrings.string,
    fallback: js.Array[java.lang.String]
  ): js.Array[java.lang.String] = js.native
  @JSName("array")
  def array_url(name: java.lang.String, `type`: getenvLib.getenvLibStrings.url): js.Array[nodeLib.urlMod.UrlWithStringQuery] = js.native
  @JSName("array")
  def array_url(
    name: java.lang.String,
    `type`: getenvLib.getenvLibStrings.url,
    fallback: js.Array[nodeLib.urlMod.UrlWithStringQuery]
  ): js.Array[nodeLib.urlMod.UrlWithStringQuery] = js.native
  /**
    * Return as boolean. Only allows true/false as valid values.
    */
  def bool(name: java.lang.String): scala.Boolean = js.native
  def bool(name: java.lang.String, fallback: scala.Boolean): scala.Boolean = js.native
  /**
    * Return as boolean. Allows true/false/1/0 as valid values.
    */
  def boolish(name: java.lang.String): scala.Boolean = js.native
  def boolish(name: java.lang.String, fallback: scala.Boolean): scala.Boolean = js.native
  /**
    * `getenv` won't throw any error. If a fallback value is provided, that will be returned, else undefined is returned.
    */
  def disableErrors(): scala.Unit = js.native
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
  def disableFallbacks(): scala.Unit = js.native
  /**
    * Revert the effect of `disableErrors()`.
    */
  def enableErrors(): scala.Unit = js.native
  /**
    * Revert the effect of `disableFallbacks()`.
    */
  def enableFallbacks(): scala.Unit = js.native
  /**
    * Return as float number.
    */
  def float(name: java.lang.String): scala.Double = js.native
  def float(name: java.lang.String, fallback: scala.Double): scala.Double = js.native
  /**
    * Return as integer number.
    */
  def int(name: java.lang.String): scala.Double = js.native
  def int(name: java.lang.String, fallback: scala.Double): scala.Double = js.native
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
  def multi[S /* <: org.scalablytyped.runtime.StringDictionary[java.lang.String | ParseWithFallback | ParseWithEachType] */](spec: S): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof S ]: string | getenv.getenv.ParseMappings[S[P][2]]}
    */ getenvLib.getenvLibStrings.multi with js.Any = js.native
  /**
    * Return as string.
    */
  def string(name: java.lang.String): java.lang.String = js.native
  def string(name: java.lang.String, fallback: java.lang.String): java.lang.String = js.native
  /**
    * Return a parsed URL as per Node's `require("url").parse`. N.B `url` doesn't validate URLs, so be sure it includes a protocol or you'll get deeply weird results.
    */
  def url(name: java.lang.String): nodeLib.urlMod.UrlWithStringQuery = js.native
  def url(name: java.lang.String, fallback: nodeLib.urlMod.UrlWithStringQuery): nodeLib.urlMod.UrlWithStringQuery = js.native
}

