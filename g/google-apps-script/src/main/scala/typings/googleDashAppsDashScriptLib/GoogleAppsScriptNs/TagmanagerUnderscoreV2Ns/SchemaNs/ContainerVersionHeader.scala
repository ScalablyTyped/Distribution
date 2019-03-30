package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.TagmanagerUnderscoreV2Ns.SchemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContainerVersionHeader extends js.Object {
  var accountId: js.UndefOr[java.lang.String] = js.undefined
  var containerId: js.UndefOr[java.lang.String] = js.undefined
  var containerVersionId: js.UndefOr[java.lang.String] = js.undefined
  var deleted: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var numCustomTemplates: js.UndefOr[java.lang.String] = js.undefined
  var numMacros: js.UndefOr[java.lang.String] = js.undefined
  var numRules: js.UndefOr[java.lang.String] = js.undefined
  var numTags: js.UndefOr[java.lang.String] = js.undefined
  var numTriggers: js.UndefOr[java.lang.String] = js.undefined
  var numVariables: js.UndefOr[java.lang.String] = js.undefined
  var numZones: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object ContainerVersionHeader {
  @scala.inline
  def apply(
    accountId: java.lang.String = null,
    containerId: java.lang.String = null,
    containerVersionId: java.lang.String = null,
    deleted: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    numCustomTemplates: java.lang.String = null,
    numMacros: java.lang.String = null,
    numRules: java.lang.String = null,
    numTags: java.lang.String = null,
    numTriggers: java.lang.String = null,
    numVariables: java.lang.String = null,
    numZones: java.lang.String = null,
    path: java.lang.String = null
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

