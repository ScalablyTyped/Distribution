package typings.googleapis

import typings.googleapis.buildSrcApisBigqueryV2Mod.bigquery_v2.Schema$ProjectReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FriendlyName extends js.Object {
  var friendlyName: js.UndefOr[String] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var numericId: js.UndefOr[String] = js.native
  var projectReference: js.UndefOr[Schema$ProjectReference] = js.native
}

object Anon_FriendlyName {
  @scala.inline
  def apply(
    friendlyName: String = null,
    id: String = null,
    kind: String = null,
    numericId: String = null,
    projectReference: Schema$ProjectReference = null
  ): Anon_FriendlyName = {
    val __obj = js.Dynamic.literal()
    if (friendlyName != null) __obj.updateDynamic("friendlyName")(friendlyName.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (numericId != null) __obj.updateDynamic("numericId")(numericId.asInstanceOf[js.Any])
    if (projectReference != null) __obj.updateDynamic("projectReference")(projectReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_FriendlyName]
  }
}

