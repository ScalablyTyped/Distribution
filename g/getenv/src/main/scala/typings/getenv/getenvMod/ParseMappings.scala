package typings.getenv.getenvMod

import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseMappings extends js.Object {
  var bool: Boolean
  var boolish: Boolean
  var float: Double
  var int: Double
  var string: String
  var url: UrlWithStringQuery
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
    val __obj = js.Dynamic.literal(bool = bool, boolish = boolish, float = float, int = int, string = string, url = url)
  
    __obj.asInstanceOf[ParseMappings]
  }
}

