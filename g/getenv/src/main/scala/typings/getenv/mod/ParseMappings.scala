package typings.getenv.mod

import typings.node.urlMod.UrlWithStringQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ParseMappings extends js.Object {
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
  implicit class ParseMappingsOps[Self <: ParseMappings] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBool(value: Boolean): Self = this.set("bool", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoolish(value: Boolean): Self = this.set("boolish", value.asInstanceOf[js.Any])
    @scala.inline
    def setFloat(value: Double): Self = this.set("float", value.asInstanceOf[js.Any])
    @scala.inline
    def setInt(value: Double): Self = this.set("int", value.asInstanceOf[js.Any])
    @scala.inline
    def setString(value: String): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: UrlWithStringQuery): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

