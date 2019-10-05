package typings.gapiDotClientDotBigquery

import typings.gapiDotClientDotBigquery.gapi.client.bigquery.ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FriendlyName extends js.Object {
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

object Anon_FriendlyName {
  @scala.inline
  def apply(
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    numericId: String = null,
    projectReference: ProjectReference = null
  ): Anon_FriendlyName = {
    val __obj = js.Dynamic.literal()
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numericId != null) __obj.updateDynamic("numericId")(numericId)
    if (projectReference != null) __obj.updateDynamic("projectReference")(projectReference)
    __obj.asInstanceOf[Anon_FriendlyName]
  }
}

