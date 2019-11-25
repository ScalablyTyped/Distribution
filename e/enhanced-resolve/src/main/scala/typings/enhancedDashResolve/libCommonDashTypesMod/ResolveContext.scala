package typings.enhancedDashResolve.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveContext extends js.Object {
  var issuer: js.UndefOr[String] = js.undefined
}

object ResolveContext {
  @scala.inline
  def apply(issuer: String = null): ResolveContext = {
    val __obj = js.Dynamic.literal()
    if (issuer != null) __obj.updateDynamic("issuer")(issuer.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolveContext]
  }
}

