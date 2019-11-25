package typings.gapiDotPeople.gapi.client.people

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var etag: String
  var id: String
  var resourceName: String
  var `type`: SourceType
}

object Source {
  @scala.inline
  def apply(etag: String, id: String, resourceName: String, `type`: SourceType): Source = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], resourceName = resourceName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Source]
  }
}

