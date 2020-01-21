package typings.gapiClientAdmin.gapi.client.admin

import typings.gapiClientAdmin.AnonApplicationName
import typings.gapiClientAdmin.AnonCallerType
import typings.gapiClientAdmin.AnonName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Activity extends js.Object {
  /** User doing the action. */
  var actor: js.UndefOr[AnonCallerType] = js.undefined
  /** ETag of the entry. */
  var etag: js.UndefOr[String] = js.undefined
  /** Activity events. */
  var events: js.UndefOr[js.Array[AnonName]] = js.undefined
  /** Unique identifier for each activity record. */
  var id: js.UndefOr[AnonApplicationName] = js.undefined
  /** IP Address of the user doing the action. */
  var ipAddress: js.UndefOr[String] = js.undefined
  /** Kind of resource this is. */
  var kind: js.UndefOr[String] = js.undefined
  /** Domain of source customer. */
  var ownerDomain: js.UndefOr[String] = js.undefined
}

object Activity {
  @scala.inline
  def apply(
    actor: AnonCallerType = null,
    etag: String = null,
    events: js.Array[AnonName] = null,
    id: AnonApplicationName = null,
    ipAddress: String = null,
    kind: String = null,
    ownerDomain: String = null
  ): Activity = {
    val __obj = js.Dynamic.literal()
    if (actor != null) __obj.updateDynamic("actor")(actor.asInstanceOf[js.Any])
    if (etag != null) __obj.updateDynamic("etag")(etag.asInstanceOf[js.Any])
    if (events != null) __obj.updateDynamic("events")(events.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (ipAddress != null) __obj.updateDynamic("ipAddress")(ipAddress.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (ownerDomain != null) __obj.updateDynamic("ownerDomain")(ownerDomain.asInstanceOf[js.Any])
    __obj.asInstanceOf[Activity]
  }
}

