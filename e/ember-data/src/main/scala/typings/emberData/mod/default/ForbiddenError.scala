package typings.emberData.mod.default

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DS.ForbiddenError` equates to a HTTP `403 Forbidden` response status.
  * It is used by an adapter to signal that a request to the external API was
  * valid but the server is refusing to respond to it. If authorization was
  * provided and is valid, then the authenticated user does not have the
  * necessary permissions for the request.
  */
@JSImport("ember-data", "ForbiddenError")
@js.native
class ForbiddenError ()
  extends typings.emberObject.mod.default

