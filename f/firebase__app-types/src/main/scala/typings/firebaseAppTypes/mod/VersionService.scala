package typings.firebaseAppTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionService extends js.Object {
  var library: String
  var version: String
}

object VersionService {
  @scala.inline
  def apply(library: String, version: String): VersionService = {
    val __obj = js.Dynamic.literal(library = library.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionService]
  }
}

