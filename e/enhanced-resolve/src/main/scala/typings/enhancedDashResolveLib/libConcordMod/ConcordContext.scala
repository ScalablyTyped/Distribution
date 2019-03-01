package typings
package enhancedDashResolveLib.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordContext extends js.Object {
  var environments: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var referrer: js.UndefOr[java.lang.String] = js.undefined
  var supportedResourceTypes: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ConcordContext {
  @scala.inline
  def apply(
    environments: js.Array[java.lang.String] = null,
    referrer: java.lang.String = null,
    supportedResourceTypes: js.Array[java.lang.String] = null
  ): ConcordContext = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments)
    if (referrer != null) __obj.updateDynamic("referrer")(referrer)
    if (supportedResourceTypes != null) __obj.updateDynamic("supportedResourceTypes")(supportedResourceTypes)
    __obj.asInstanceOf[ConcordContext]
  }
}

