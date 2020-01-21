package typings.getenv.mod

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
    val __obj = js.Dynamic.literal(bool = bool.asInstanceOf[js.Any], boolish = boolish.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], int = int.asInstanceOf[js.Any], string = string.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ParseMappings]
  }
}

