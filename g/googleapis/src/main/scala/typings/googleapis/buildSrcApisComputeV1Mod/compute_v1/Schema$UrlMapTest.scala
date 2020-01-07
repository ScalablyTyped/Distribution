package typings.googleapis.buildSrcApisComputeV1Mod.compute_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for the expected URL mappings.
  */
@js.native
trait Schema$UrlMapTest extends js.Object {
  /**
    * Description of this test case.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * Host portion of the URL.
    */
  var host: js.UndefOr[String] = js.native
  /**
    * Path portion of the URL.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Expected BackendService resource the given URL should be mapped to.
    */
  var service: js.UndefOr[String] = js.native
}

object Schema$UrlMapTest {
  @scala.inline
  def apply(description: String = null, host: String = null, path: String = null, service: String = null): Schema$UrlMapTest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$UrlMapTest]
  }
}

