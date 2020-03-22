package typings.googleapis

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonDiscoveryLink extends js.Object {
  var description: js.UndefOr[String] = js.native
  var discoveryLink: js.UndefOr[String] = js.native
  var discoveryRestUrl: js.UndefOr[String] = js.native
  var documentationLink: js.UndefOr[String] = js.native
  var icons: js.UndefOr[AnonX16] = js.native
  var id: js.UndefOr[String] = js.native
  var kind: js.UndefOr[String] = js.native
  var labels: js.UndefOr[js.Array[String]] = js.native
  var name: js.UndefOr[String] = js.native
  var preferred: js.UndefOr[Boolean] = js.native
  var title: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
}

object AnonDiscoveryLink {
  @scala.inline
  def apply(
    description: String = null,
    discoveryLink: String = null,
    discoveryRestUrl: String = null,
    documentationLink: String = null,
    icons: AnonX16 = null,
    id: String = null,
    kind: String = null,
    labels: js.Array[String] = null,
    name: String = null,
    preferred: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    version: String = null
  ): AnonDiscoveryLink = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (discoveryLink != null) __obj.updateDynamic("discoveryLink")(discoveryLink.asInstanceOf[js.Any])
    if (discoveryRestUrl != null) __obj.updateDynamic("discoveryRestUrl")(discoveryRestUrl.asInstanceOf[js.Any])
    if (documentationLink != null) __obj.updateDynamic("documentationLink")(documentationLink.asInstanceOf[js.Any])
    if (icons != null) __obj.updateDynamic("icons")(icons.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDiscoveryLink]
  }
}

