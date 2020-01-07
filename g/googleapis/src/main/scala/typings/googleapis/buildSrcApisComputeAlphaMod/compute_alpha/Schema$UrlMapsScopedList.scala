package typings.googleapis.buildSrcApisComputeAlphaMod.compute_alpha

import typings.googleapis.Anon_Code
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schema$UrlMapsScopedList extends js.Object {
  /**
    * A list of UrlMaps contained in this scope.
    */
  var urlMaps: js.UndefOr[js.Array[Schema$UrlMap]] = js.native
  /**
    * Informational warning which replaces the list of backend services when
    * the list is empty.
    */
  var warning: js.UndefOr[Anon_Code] = js.native
}

object Schema$UrlMapsScopedList {
  @scala.inline
  def apply(urlMaps: js.Array[Schema$UrlMap] = null, warning: Anon_Code = null): Schema$UrlMapsScopedList = {
    val __obj = js.Dynamic.literal()
    if (urlMaps != null) __obj.updateDynamic("urlMaps")(urlMaps.asInstanceOf[js.Any])
    if (warning != null) __obj.updateDynamic("warning")(warning.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlMapsScopedList]
  }
}

