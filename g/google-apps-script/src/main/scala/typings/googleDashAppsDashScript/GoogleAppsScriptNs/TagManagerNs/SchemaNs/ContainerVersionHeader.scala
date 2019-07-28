package typings.googleDashAppsDashScript.GoogleAppsScriptNs.TagManagerNs.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVersionHeader extends js.Object {
  var accountId: js.UndefOr[String] = js.undefined
  var containerId: js.UndefOr[String] = js.undefined
  var containerVersionId: js.UndefOr[String] = js.undefined
  var deleted: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numCustomTemplates: js.UndefOr[String] = js.undefined
  var numMacros: js.UndefOr[String] = js.undefined
  var numRules: js.UndefOr[String] = js.undefined
  var numTags: js.UndefOr[String] = js.undefined
  var numTriggers: js.UndefOr[String] = js.undefined
  var numVariables: js.UndefOr[String] = js.undefined
  var numZones: js.UndefOr[String] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object ContainerVersionHeader {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    containerVersionId: String = null,
    deleted: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    numCustomTemplates: String = null,
    numMacros: String = null,
    numRules: String = null,
    numTags: String = null,
    numTriggers: String = null,
    numVariables: String = null,
    numZones: String = null,
    path: String = null
  ): ContainerVersionHeader = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId)
    if (containerId != null) __obj.updateDynamic("containerId")(containerId)
    if (containerVersionId != null) __obj.updateDynamic("containerVersionId")(containerVersionId)
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted)
    if (name != null) __obj.updateDynamic("name")(name)
    if (numCustomTemplates != null) __obj.updateDynamic("numCustomTemplates")(numCustomTemplates)
    if (numMacros != null) __obj.updateDynamic("numMacros")(numMacros)
    if (numRules != null) __obj.updateDynamic("numRules")(numRules)
    if (numTags != null) __obj.updateDynamic("numTags")(numTags)
    if (numTriggers != null) __obj.updateDynamic("numTriggers")(numTriggers)
    if (numVariables != null) __obj.updateDynamic("numVariables")(numVariables)
    if (numZones != null) __obj.updateDynamic("numZones")(numZones)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[ContainerVersionHeader]
  }
}

