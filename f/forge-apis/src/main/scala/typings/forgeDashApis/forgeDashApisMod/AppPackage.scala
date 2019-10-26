package typings.forgeDashApis.forgeDashApisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AppPackage extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var id: String
  var isObjectEnabler: js.UndefOr[Boolean] = js.undefined
  var isPublic: js.UndefOr[Boolean] = js.undefined
  var references: js.Array[String]
  var requiredEngineVersion: String
  var resource: String
  var version: Double
}

object AppPackage {
  @scala.inline
  def apply(
    id: String,
    references: js.Array[String],
    requiredEngineVersion: String,
    resource: String,
    version: Double,
    description: String = null,
    isObjectEnabler: js.UndefOr[Boolean] = js.undefined,
    isPublic: js.UndefOr[Boolean] = js.undefined
  ): AppPackage = {
    val __obj = js.Dynamic.literal(id = id, references = references, requiredEngineVersion = requiredEngineVersion, resource = resource, version = version)
    if (description != null) __obj.updateDynamic("description")(description)
    if (!js.isUndefined(isObjectEnabler)) __obj.updateDynamic("isObjectEnabler")(isObjectEnabler)
    if (!js.isUndefined(isPublic)) __obj.updateDynamic("isPublic")(isPublic)
    __obj.asInstanceOf[AppPackage]
  }
}

