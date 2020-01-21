package typings.googleapis.appengineV1Mod.appengineV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * VPC access connector specification.
  */
@js.native
trait SchemaVpcAccessConnector extends js.Object {
  /**
    * Full Serverless VPC Access Connector name e.g.
    * /projects/my-project/locations/us-central1/connectors/c1.
    */
  var name: js.UndefOr[String] = js.native
}

object SchemaVpcAccessConnector {
  @scala.inline
  def apply(name: String = null): SchemaVpcAccessConnector = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaVpcAccessConnector]
  }
}

