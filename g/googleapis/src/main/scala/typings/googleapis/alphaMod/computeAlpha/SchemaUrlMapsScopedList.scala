package typings.googleapis.alphaMod.computeAlpha

import typings.googleapis.AnonCode
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
  var warning: js.UndefOr[AnonCode] = js.native
}

object SchemaUrlMapsScopedList {
  @scala.inline
  def apply(urlMaps: js.Array[SchemaUrlMap] = null, warning: AnonCode = null): SchemaUrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    if (urlMaps != null) __obj.updateDynamic("urlMaps")(urlMaps.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlMapsScopedList]
  }
}

