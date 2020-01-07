package typings.googleapis.buildSrcApisAppengineV1Mod.appengine_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VPC access connector specification.
  */
@js.native
trait Schema$VpcAccessConnector extends js.Object {
  /**
    * Full Serverless VPC Access Connector name e.g.
    * /projects/my-project/locations/us-central1/connectors/c1.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$VpcAccessConnector {
  @scala.inline
  def apply(name: String = null): Schema$VpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VpcAccessConnector]
  }
}

