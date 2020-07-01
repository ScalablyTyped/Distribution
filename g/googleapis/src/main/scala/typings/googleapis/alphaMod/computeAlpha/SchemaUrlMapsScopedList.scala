package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.anon.Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaUrlMapsScopedList extends js.Object {
  /**
    * A list of UrlMaps contained in this scope.
    */
  var urlMaps: js.UndefOr[js.Array[SchemaUrlMap]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Code] = js.native
}

object SchemaUrlMapsScopedList {
  @scala.inline
  def apply(urlMaps: js.Array[SchemaUrlMap] = null, warning: Code = null): SchemaUrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    if (urlMaps != null) __obj.updateDynamic("urlMaps")(urlMaps.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlMapsScopedList]
  }
}

