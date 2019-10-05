package typings.gapiDotClientDotCompute.gapi.client.compute

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UrlMapTest extends js.Object {
  /** Description of this test case. */
  var description: js.UndefOr[String] = js.undefined
  /** Host portion of the URL. */
  var host: js.UndefOr[String] = js.undefined
  /** Path portion of the URL. */
  var path: js.UndefOr[String] = js.undefined
  /** Expected BackendService resource the given URL should be mapped to. */
  var service: js.UndefOr[String] = js.undefined
}

object UrlMapTest {
  @scala.inline
  def apply(description: String = null, host: String = null, path: String = null, service: String = null): UrlMapTest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (host != null) __obj.updateDynamic("host")(host)
    if (path != null) __obj.updateDynamic("path")(path)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[UrlMapTest]
  }
}

