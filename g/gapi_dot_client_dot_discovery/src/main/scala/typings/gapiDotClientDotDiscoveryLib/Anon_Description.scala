package typings
package gapiDotClientDotDiscoveryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Description extends js.Object {
  /** The description of this API. */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /** A link to the discovery document. */
  var discoveryLink: js.UndefOr[java.lang.String] = js.undefined
  /** The URL for the discovery REST document. */
  var discoveryRestUrl: js.UndefOr[java.lang.String] = js.undefined
  /** A link to human readable documentation for the API. */
  var documentationLink: js.UndefOr[java.lang.String] = js.undefined
  /** Links to 16x16 and 32x32 icons representing the API. */
  var icons: js.UndefOr[Anon_X16] = js.undefined
  /** The id of this API. */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /** The kind for this response. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** Labels for the status of this API, such as labs or deprecated. */
  var labels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /** The name of the API. */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /** True if this version is the preferred version to use. */
  var preferred: js.UndefOr[scala.Boolean] = js.undefined
  /** The title of this API. */
  var title: js.UndefOr[java.lang.String] = js.undefined
  /** The version of the API. */
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Description {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    discoveryLink: java.lang.String = null,
    discoveryRestUrl: java.lang.String = null,
    documentationLink: java.lang.String = null,
    icons: Anon_X16 = null,
    id: java.lang.String = null,
    kind: java.lang.String = null,
    labels: js.Array[java.lang.String] = null,
    name: java.lang.String = null,
    preferred: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String = null,
    version: java.lang.String = null
  ): Anon_Description = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (discoveryLink != null) __obj.updateDynamic("discoveryLink")(discoveryLink)
    if (discoveryRestUrl != null) __obj.updateDynamic("discoveryRestUrl")(discoveryRestUrl)
    if (documentationLink != null) __obj.updateDynamic("documentationLink")(documentationLink)
    if (icons != null) __obj.updateDynamic("icons")(icons)
    if (id != null) __obj.updateDynamic("id")(id)
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (labels != null) __obj.updateDynamic("labels")(labels)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(preferred)) __obj.updateDynamic("preferred")(preferred)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_Description]
  }
}

