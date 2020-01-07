package typings.googleapis.buildSrcApisAdminReportsUnderscoreV1Mod.admin_reports_v1

import typings.googleapis.Anon_ApplicationName
import typings.googleapis.Anon_CallerType
import typings.googleapis.Anon_Name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * JSON template for the activity resource.
  */
@js.native
trait Schema$Activity extends js.Object {
  /**
    * User doing the action.
    */
  var actor: js.UndefOr[Anon_CallerType] = js.native
  /**
    * ETag of the entry.
    */
  var etag: js.UndefOr[String] = js.native
  /**
    * Activity events.
    */
  var events: js.UndefOr[js.Array[Anon_Name]] = js.native
  /**
    * Unique identifier for each activity record.
    */
  var id: js.UndefOr[Anon_ApplicationName] = js.native
  /**
    * IP Address of the user doing the action.
    */
  var ipAddress: js.UndefOr[String] = js.native
  /**
    * Kind of resource this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * Domain of source customer.
    */
  var ownerDomain: js.UndefOr[String] = js.native
}

object Schema$Activity {
  @scala.inline
  def apply(
    actor: Anon_CallerType = null,
    etag: String = null,
    events: js.Array[Anon_Name] = null,
    id: Anon_ApplicationName = null,
    ipAddress: String = null,
    kind: String = null,
    ownerDomain: String = null
  ): Schema$Activity = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (ownerDomain != null) __obj.updateDynamic("ownerDomain")(ownerDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Activity]
  }
}

