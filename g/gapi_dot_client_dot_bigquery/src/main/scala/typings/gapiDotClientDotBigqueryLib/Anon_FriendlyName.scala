package typings
package gapiDotClientDotBigqueryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FriendlyName extends js.Object {
  /** A descriptive name for this project. */
  var friendlyName: js.UndefOr[java.lang.String] = js.undefined
  /** An opaque ID of this project. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The resource type. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The numeric ID of this project. */
  var numericId: js.UndefOr[java.lang.String] = js.undefined
  /** A unique reference to this project. */
  var projectReference: js.UndefOr[gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.ProjectReference] = js.undefined
}

object Anon_FriendlyName {
  @scala.inline
  def apply(
    friendlyName: java.lang.String = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    numericId: java.lang.String = null,
    projectReference: gapiDotClientDotBigqueryLib.gapiNs.clientNs.bigqueryNs.ProjectReference = null
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

