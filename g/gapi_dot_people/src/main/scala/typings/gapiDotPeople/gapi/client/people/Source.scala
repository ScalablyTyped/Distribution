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
    val __obj = js.Dynamic.literal(etag = etag, id = id, resourceName = resourceName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Source]
  }
}

