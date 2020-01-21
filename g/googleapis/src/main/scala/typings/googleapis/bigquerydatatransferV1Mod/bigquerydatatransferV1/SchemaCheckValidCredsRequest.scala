package typings.googleapis.bigquerydatatransferV1Mod.bigquerydatatransferV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A request to determine whether the user has valid credentials. This method
  * is used to limit the number of OAuth popups in the user interface. The user
  * id is inferred from the API call context. If the data source has the
  * Google+ authorization type, this method returns false, as it cannot be
  * determined whether the credentials are already valid merely based on the
  * user id.
  */
@js.native
trait SchemaCheckValidCredsRequest extends js.Object

