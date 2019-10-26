package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppPackageOptional extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var isObjectEnabler: js.UndefOr[Boolean] = js.undefined
  var isPublic: js.UndefOr[Boolean] = js.undefined
  var references: js.UndefOr[js.Array[String]] = js.undefined
  var requiredEngineVersion: js.UndefOr[String] = js.undefined
  var resource: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[Double] = js.undefined
}

object AppPackageOptional {
  @scala.inline
  def apply(
    description: String = null,
    id: String = null,
    isObjectEnabler: js.UndefOr[Boolean] = js.undefined,
    isPublic: js.UndefOr[Boolean] = js.undefined,
    references: js.Array[String] = null,
    requiredEngineVersion: String = null,
    resource: String = null,
    version: Int | Double = null
  ): AppPackageOptional = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isObjectEnabler)) __obj.updateDynamic("isObjectEnabler")(isObjectEnabler)
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic)
    if (references != null) __obj.updateDynamic("references")(references)
    if (requiredEngineVersion != null) __obj.updateDynamic("requiredEngineVersion")(requiredEngineVersion)
    if (resource != null) __obj.updateDynamic("resource")(resource)
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppPackageOptional]
  }
}

