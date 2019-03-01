package typings
package gapiDotClientDotComputeLib.gapiNs.clientNs.computeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapTest extends js.Object {
  /** Description of this test case. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** Host portion of the URL. */
  var host: js.UndefOr[java.lang.String] = js.undefined
  /** Path portion of the URL. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** Expected BackendService resource the given URL should be mapped to. */
  var service: js.UndefOr[java.lang.String] = js.undefined
}

object UrlMapTest {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    host: java.lang.String = null,
    path: java.lang.String = null,
    service: java.lang.String = null
  ): UrlMapTest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[UrlMapTest]
  }
}

