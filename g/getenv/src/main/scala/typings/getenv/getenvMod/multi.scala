package typings.getenv.getenvMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("getenv", "multi")
@js.native
object multi extends js.Object {
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
  def apply[S /* <: StringDictionary[String | ParseWithFallback | ParseWithEachType] */](spec: S): /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof S ]: S[P][2] extends getenv.getenv.ParseTypes? getenv.getenv.ParseMappings[S[P][2]] : string}
    */ typings.getenv.getenvStrings.multi with js.Any = js.native
}

