package typings.enhancedDashResolve.libConcordMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConcordContext extends js.Object {
  var environments: js.UndefOr[js.Array[String]] = js.undefined
  var referrer: js.UndefOr[String] = js.undefined
  var supportedResourceTypes: js.UndefOr[js.Array[String]] = js.undefined
}

object ConcordContext {
  @scala.inline
  def apply(
    environments: js.Array[String] = null,
    referrer: String = null,
    supportedResourceTypes: js.Array[String] = null
  ): ConcordContext = {
    val __obj = js.Dynamic.literal()
    if (environments != null) __obj.updateDynamic("environments")(environments.asInstanceOf[js.Any])
    if (referrer != null) __obj.updateDynamic("referrer")(referrer.asInstanceOf[js.Any])
    if (supportedResourceTypes != null) __obj.updateDynamic("supportedResourceTypes")(supportedResourceTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConcordContext]
  }
}

