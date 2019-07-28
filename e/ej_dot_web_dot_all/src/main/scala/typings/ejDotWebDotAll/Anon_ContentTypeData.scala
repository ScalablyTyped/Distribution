package typings.ejDotWebDotAll

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeData extends js.Object {
  var contentType: String
  var data: js.Any
  var `type`: String
  var url: String
}

object Anon_ContentTypeData {
  @scala.inline
  def apply(contentType: String, data: js.Any, `type`: String, url: String): Anon_ContentTypeData = {
    val __obj = js.Dynamic.literal(contentType = contentType, data = data, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ContentTypeData]
  }
}

