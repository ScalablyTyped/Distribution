package typings
package gapiDotPeopleLib.gapiNs.clientNs.peopleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Source extends js.Object {
  var etag: java.lang.String
  var id: java.lang.String
  var resourceName: java.lang.String
  var `type`: SourceType
}

object Source {
  @scala.inline
  def apply(etag: java.lang.String, id: java.lang.String, resourceName: java.lang.String, `type`: SourceType): Source = {
    val __obj = js.Dynamic.literal(etag = etag, id = id, resourceName = resourceName)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Source]
  }
}

