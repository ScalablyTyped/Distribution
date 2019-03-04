package typings
package ejDotWebDotAllLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ContentTypeData extends js.Object {
  var contentType: java.lang.String
  var data: js.Any
  var `type`: java.lang.String
  var url: java.lang.String
}

object Anon_ContentTypeData {
  @scala.inline
  def apply(contentType: java.lang.String, data: js.Any, `type`: java.lang.String, url: java.lang.String): Anon_ContentTypeData = {
    val __obj = js.Dynamic.literal(contentType = contentType, data = data, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Anon_ContentTypeData]
  }
}

