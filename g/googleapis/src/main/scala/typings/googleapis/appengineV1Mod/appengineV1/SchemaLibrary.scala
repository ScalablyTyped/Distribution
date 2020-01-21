package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Third-party Python runtime library that is required by the application.
  */
@js.native
trait SchemaLibrary extends js.Object {
  /**
    * Name of the library. Example: &quot;django&quot;.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Version of the library to select, or &quot;latest&quot;.
    */
  var version: js.UndefOr[String] = js.native
}

object SchemaLibrary {
  @scala.inline
  def apply(name: String = null, version: String = null): SchemaLibrary = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaLibrary]
  }
}

