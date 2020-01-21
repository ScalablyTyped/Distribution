package typings.googleCloudTasks.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Policy extends js.Object {
  var bindings: js.Array[Binding]
  var etag: String
  var version: Double
}

object Policy {
  @scala.inline
  def apply(bindings: js.Array[Binding], etag: String, version: Double): Policy = {
    val __obj = js.Dynamic.literal(bindings = bindings.asInstanceOf[js.Any], etag = etag.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Policy]
  }
}

