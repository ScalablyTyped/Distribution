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
    val __obj = js.Dynamic.literal(bool = bool, boolish = boolish, float = float, int = int, string = string, url = url)
  
    __obj.asInstanceOf[ParseMappings]
  }
}

