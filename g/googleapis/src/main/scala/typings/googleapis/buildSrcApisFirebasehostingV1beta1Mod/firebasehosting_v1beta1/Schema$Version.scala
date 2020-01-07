package typings.googleapis.buildSrcApisFirebasehostingV1beta1Mod.firebasehosting_v1beta1

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A `Version` is the collection of configuration and [static
  * files](sites.versions.files) that determine how a site is displayed.
  */
@js.native
trait Schema$Version extends js.Object {
  /**
    * The configuration for the behavior of the site. This configuration exists
    * in the [`firebase.json`](/docs/cli/#the_firebasejson_file) file.
    */
  var config: js.UndefOr[Schema$ServingConfig] = js.native
  /**
    * Output only. The time at which the version was created.
    */
  var createTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who created the version.
    */
  var createUser: js.UndefOr[Schema$ActingUser] = js.native
  /**
    * Output only. The time at which the version was `DELETED`.
    */
  var deleteTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who `DELETED` the version.
    */
  var deleteUser: js.UndefOr[Schema$ActingUser] = js.native
  /**
    * Output only. The total number of files associated with the version.
    * &lt;br&gt;This value is calculated after a version is `FINALIZED`.
    */
  var fileCount: js.UndefOr[String] = js.native
  /**
    * Output only. The time at which the version was `FINALIZED`.
    */
  var finalizeTime: js.UndefOr[String] = js.native
  /**
    * Output only. Identifies the user who `FINALIZED` the version.
    */
  var finalizeUser: js.UndefOr[Schema$ActingUser] = js.native
  /**
    * The labels used for extra metadata and/or filtering.
    */
  var labels: js.UndefOr[StringDictionary[String]] = js.native
  /**
    * The unique identifier for a version, in the format:
    * &lt;code&gt;sites/&lt;var&gt;site-name&lt;/var&gt;/versions/&lt;var&gt;versionID&lt;/var&gt;&lt;/code&gt;
    * This name is provided in the response body when you call the
    * [`CreateVersion`](../sites.versions/create) endpoint.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The deploy status of a version. &lt;br&gt; &lt;br&gt;For a successful
    * deploy, call the [`CreateVersion`](sites.versions/create) endpoint to
    * make a new version (`CREATED` status), [upload all desired
    * files](sites.versions/populateFiles) to the version, then
    * [update](sites.versions/patch) the version to the `FINALIZED` status.
    * &lt;br&gt; &lt;br&gt;Note that if you leave the version in the `CREATED`
    * state for more than 12&amp;nbsp;hours, the system will automatically mark
    * the version as `ABANDONED`. &lt;br&gt; &lt;br&gt;You can also change the
    * status of a version to `DELETED` by calling the
    * [`DeleteVersion`](sites.versions/delete) endpoint.
    */
  var status: js.UndefOr[String] = js.native
  /**
    * Output only. The total stored bytesize of the version. &lt;br&gt;This
    * value is calculated after a version is `FINALIZED`.
    */
  var versionBytes: js.UndefOr[String] = js.native
}

object Schema$Version {
  @scala.inline
  def apply(
    config: Schema$ServingConfig = null,
    createTime: String = null,
    createUser: Schema$ActingUser = null,
    deleteTime: String = null,
    deleteUser: Schema$ActingUser = null,
    fileCount: String = null,
    finalizeTime: String = null,
    finalizeUser: Schema$ActingUser = null,
    labels: StringDictionary[String] = null,
    name: String = null,
    status: String = null,
    versionBytes: String = null
  ): Schema$Version = {
    val __obj = js.Dynamic.literal()
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (createUser != null) __obj.updateDynamic("createUser")(createUser.asInstanceOf[js.Any])
    if (deleteTime != null) __obj.updateDynamic("deleteTime")(deleteTime.asInstanceOf[js.Any])
    if (deleteUser != null) __obj.updateDynamic("deleteUser")(deleteUser.asInstanceOf[js.Any])
    if (fileCount != null) __obj.updateDynamic("fileCount")(fileCount.asInstanceOf[js.Any])
    if (finalizeTime != null) __obj.updateDynamic("finalizeTime")(finalizeTime.asInstanceOf[js.Any])
    if (finalizeUser != null) __obj.updateDynamic("finalizeUser")(finalizeUser.asInstanceOf[js.Any])
    if (labels != null) __obj.updateDynamic("labels")(labels.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (versionBytes != null) __obj.updateDynamic("versionBytes")(versionBytes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Version]
  }
}

