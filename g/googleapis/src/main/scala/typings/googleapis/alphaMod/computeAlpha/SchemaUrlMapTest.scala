package typings.googleapis.alphaMod.computeAlpha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Message for the expected URL mappings.
  */
@js.native
trait SchemaUrlMapTest extends js.Object {
  /**
    * The weight to use for the supplied host and path when using advanced
    * routing rules that involve traffic splitting.
    */
  var backendServiceWeight: js.UndefOr[Double] = js.native
  /**
    * Description of this test case.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The expected URL that should be redirected to for the host and path being
    * tested.
    */
  var expectedUrlRedirect: js.UndefOr[String] = js.native
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

object SchemaUrlMapTest {
  @scala.inline
  def apply(
    backendServiceWeight: Int | Double = null,
    description: String = null,
    expectedUrlRedirect: String = null,
    host: String = null,
    path: String = null,
    service: String = null
  ): SchemaUrlMapTest = {
    val __obj = js.Dynamic.literal()
    if (backendServiceWeight != null) __obj.updateDynamic("backendServiceWeight")(backendServiceWeight.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expectedUrlRedirect != null) __obj.updateDynamic("expectedUrlRedirect")(expectedUrlRedirect.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUrlMapTest]
  }
}

