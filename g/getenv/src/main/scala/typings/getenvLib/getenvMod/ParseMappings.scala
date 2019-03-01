package typings
package getenvLib.getenvMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMappings extends js.Object {
  var bool: scala.Boolean
  var boolish: scala.Boolean
  var float: scala.Double
  var int: scala.Double
  var string: java.lang.String
  var url: nodeLib.urlMod.UrlWithStringQuery
}

object ParseMappings {
  @scala.inline
  def apply(
    bool: scala.Boolean,
    boolish: scala.Boolean,
    float: scala.Double,
    int: scala.Double,
    string: java.lang.String,
    url: nodeLib.urlMod.UrlWithStringQuery
  ): ParseMappings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("bool")(bool)
    __obj.updateDynamic("boolish")(boolish)
    __obj.updateDynamic("float")(float)
    __obj.updateDynamic("int")(int)
    __obj.updateDynamic("string")(string)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ParseMappings]
  }
}

