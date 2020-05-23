package typings.gapiClientBigquery.anon

import typings.gapiClientBigquery.gapi.client.bigquery.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FriendlyName extends js.Object {
  /** A descriptive name for this project. */
  var friendlyName: js.UndefOr[String] = js.undefined
  /** An opaque ID of this project. */
  var id: js.UndefOr[String] = js.undefined
  /** The resource type. */
  var kind: js.UndefOr[String] = js.undefined
  /** The numeric ID of this project. */
  var numericId: js.UndefOr[String] = js.undefined
  /** A unique reference to this project. */
  var projectReference: js.UndefOr[ProjectReference] = js.undefined
}

object FriendlyName {
  @scala.inline
  def apply(
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    numericId: String = null,
    projectReference: ProjectReference = null
  ): FriendlyName = {
    val __obj = js.Dynamic.literal()
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numericId != null) __obj.updateDynamic("numericId")(numericId.asInstanceOf[js.Any])
    if (projectReference != null) __obj.updateDynamic("projectReference")(projectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[FriendlyName]
  }
}

