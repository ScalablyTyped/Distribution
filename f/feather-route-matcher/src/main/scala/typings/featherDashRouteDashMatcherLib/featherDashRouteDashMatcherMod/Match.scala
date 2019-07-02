package typings
package featherDashRouteDashMatcherLib.featherDashRouteDashMatcherMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Match[T] extends js.Object {
  var page: T
  var params: org.scalablytyped.runtime.StringDictionary[java.lang.String] | scala.Null
  var url: java.lang.String
}

object Match {
  @scala.inline
  def apply[T](
    page: T,
    url: java.lang.String,
    params: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null
  ): Match[T] = {
    val __obj = js.Dynamic.literal(page = page.asInstanceOf[js.Any], url = url)
    if (params != null) __obj.updateDynamic("params")(params)
    __obj.asInstanceOf[Match[T]]
  }
}

