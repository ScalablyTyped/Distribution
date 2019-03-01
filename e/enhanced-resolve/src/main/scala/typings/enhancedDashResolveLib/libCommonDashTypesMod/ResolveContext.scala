package typings
package enhancedDashResolveLib.libCommonDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResolveContext extends js.Object {
  var issuer: js.UndefOr[java.lang.String] = js.undefined
}

object ResolveContext {
  @scala.inline
  def apply(issuer: java.lang.String = null): ResolveContext = {
    val __obj = js.Dynamic.literal()
    if (issuer != null) __obj.updateDynamic("issuer")(issuer)
    __obj.asInstanceOf[ResolveContext]
  }
}

