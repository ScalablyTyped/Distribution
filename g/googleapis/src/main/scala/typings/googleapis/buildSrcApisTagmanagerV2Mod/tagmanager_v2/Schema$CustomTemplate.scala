package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a Google Tag Manager Custom Template&#39;s contents.
  */
@js.native
trait Schema$CustomTemplate extends js.Object {
  /**
    * GTM Account ID.
    */
  var accountId: js.UndefOr[String] = js.native
  /**
    * GTM Container ID.
    */
  var containerId: js.UndefOr[String] = js.native
  /**
    * The fingerprint of the GTM Custom Template as computed at storage time.
    * This value is recomputed whenever the template is modified.
    */
  var fingerprint: js.UndefOr[String] = js.native
  /**
    * Custom Template display name.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * GTM Custom Template&#39;s API relative path.
    */
  var path: js.UndefOr[String] = js.native
  /**
    * Auto generated link to the tag manager UI
    */
  var tagManagerUrl: js.UndefOr[String] = js.native
  /**
    * The custom template in text format.
    */
  var templateData: js.UndefOr[String] = js.native
  /**
    * The Custom Template ID uniquely identifies the GTM custom template.
    */
  var templateId: js.UndefOr[String] = js.native
  /**
    * GTM Workspace ID.
    */
  var workspaceId: js.UndefOr[String] = js.native
}

object Schema$CustomTemplate {
  @scala.inline
  def apply(
    accountId: String = null,
    containerId: String = null,
    fingerprint: String = null,
    name: String = null,
    path: String = null,
    tagManagerUrl: String = null,
    templateData: String = null,
    templateId: String = null,
    workspaceId: String = null
  ): Schema$CustomTemplate = {
    val __obj = js.Dynamic.literal()
    if (accountId != null) __obj.updateDynamic("accountId")(accountId.asInstanceOf[js.Any])
    if (containerId != null) __obj.updateDynamic("containerId")(containerId.asInstanceOf[js.Any])
    if (fingerprint != null) __obj.updateDynamic("fingerprint")(fingerprint.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (tagManagerUrl != null) __obj.updateDynamic("tagManagerUrl")(tagManagerUrl.asInstanceOf[js.Any])
    if (templateData != null) __obj.updateDynamic("templateData")(templateData.asInstanceOf[js.Any])
    if (templateId != null) __obj.updateDynamic("templateId")(templateId.asInstanceOf[js.Any])
    if (workspaceId != null) __obj.updateDynamic("workspaceId")(workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CustomTemplate]
  }
}

