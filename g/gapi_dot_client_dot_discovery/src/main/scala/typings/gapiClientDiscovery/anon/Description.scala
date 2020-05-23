package typings.gapiClientDiscovery.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  /** The description of this API. */
  var description: js.UndefOr[String] = js.undefined
  /** A link to the discovery document. */
  var discoveryLink: js.UndefOr[String] = js.undefined
  /** The URL for the discovery REST document. */
  var discoveryRestUrl: js.UndefOr[String] = js.undefined
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[String] = js.undefined
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[X16] = js.undefined
  /** The id of this API. */
  var id: js.UndefOr[String] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[String] = js.undefined
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[String]] = js.undefined
  /** The name of the API. */
  var name: js.UndefOr[String] = js.undefined
  /** True if this version is the preferred version to use. */
  var preferred: js.UndefOr[Boolean] = js.undefined
  /** The title of this API. */
  var title: js.UndefOr[String] = js.undefined
  /** The version of the API. */
  var version: js.UndefOr[String] = js.undefined
}

object Description {
  @scala.inline
  def apply(
    description: String = null,
    discoveryLink: String = null,
    discoveryRestUrl: String = null,
    documentationLink: String = null,
    icons: X16 = null,
    id: String = null,
    kind: String = null,
    labels: js.Array[String] = null,
    name: String = null,
    preferred: js.UndefOr[Boolean] = js.undefined,
    title: String = null,
    version: String = null
  ): Description = {
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
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred.get.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

