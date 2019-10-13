package typings.emberDashData.emberDashDataMod.DS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `DS.ConflictError` equates to a HTTP `409 Conflict` response status.
  * It is used by an adapter to indicate that the request could not be processed
  * because of a conflict in the request. An example scenario would be when
  * creating a record with a client generated id but that id is already known
  * to the external API.
  */
@JSImport("ember-data", "DS.ConflictError")
@js.native
class ConflictError ()
  extends typings.atEmberObject.atEmberObjectMod.default

