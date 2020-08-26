package typings.expoConstants.constantsTypesMod

import org.scalablytyped.runtime.StringDictionary
import typings.expoConstants.anon.Dev
import typings.expoConstants.anon.Dictkey
import typings.expoConstants.anon.Icon
import typings.expoConstants.anon.Tool
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AppManifest
  extends /* key */ StringDictionary[js.Any] {
  var bundleUrl: String = js.native
  var debuggerHost: js.UndefOr[String] = js.native
  var description: js.UndefOr[String] = js.native
  var developer: js.UndefOr[Tool] = js.native
  var entryPoint: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var loading: js.UndefOr[Icon] = js.native
  var logUrl: js.UndefOr[String] = js.native
  var mainModuleName: js.UndefOr[String] = js.native
  var name: js.UndefOr[String] = js.native
  var notification: js.UndefOr[Dictkey] = js.native
  var orientation: js.UndefOr[String] = js.native
  var packagerOpts: js.UndefOr[Dev] = js.native
  var primaryColor: js.UndefOr[String] = js.native
  var releaseChannel: js.UndefOr[String] = js.native
  /** Published Apps Only */
  var releaseId: js.UndefOr[String] = js.native
  var revisionId: js.UndefOr[String] = js.native
  var sdkVersion: js.UndefOr[String] = js.native
  var slug: js.UndefOr[String] = js.native
  var version: js.UndefOr[String] = js.native
  var xde: js.UndefOr[Boolean] = js.native
}

object AppManifest {
  @scala.inline
  def apply(bundleUrl: String): AppManifest = {
    val __obj = js.Dynamic.literal(bundleUrl = bundleUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppManifest]
  }
  @scala.inline
  implicit class AppManifestOps[Self <: AppManifest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBundleUrl(value: String): Self = this.set("bundleUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebuggerHost(value: String): Self = this.set("debuggerHost", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebuggerHost: Self = this.set("debuggerHost", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDeveloper(value: Tool): Self = this.set("developer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeveloper: Self = this.set("developer", js.undefined)
    @scala.inline
    def setEntryPoint(value: String): Self = this.set("entryPoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntryPoint: Self = this.set("entryPoint", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setLoading(value: Icon): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setLogUrl(value: String): Self = this.set("logUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogUrl: Self = this.set("logUrl", js.undefined)
    @scala.inline
    def setMainModuleName(value: String): Self = this.set("mainModuleName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainModuleName: Self = this.set("mainModuleName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotification(value: Dictkey): Self = this.set("notification", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotification: Self = this.set("notification", js.undefined)
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    @scala.inline
    def setPackagerOpts(value: Dev): Self = this.set("packagerOpts", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePackagerOpts: Self = this.set("packagerOpts", js.undefined)
    @scala.inline
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryColor: Self = this.set("primaryColor", js.undefined)
    @scala.inline
    def setReleaseChannel(value: String): Self = this.set("releaseChannel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseChannel: Self = this.set("releaseChannel", js.undefined)
    @scala.inline
    def setReleaseId(value: String): Self = this.set("releaseId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReleaseId: Self = this.set("releaseId", js.undefined)
    @scala.inline
    def setRevisionId(value: String): Self = this.set("revisionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRevisionId: Self = this.set("revisionId", js.undefined)
    @scala.inline
    def setSdkVersion(value: String): Self = this.set("sdkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSdkVersion: Self = this.set("sdkVersion", js.undefined)
    @scala.inline
    def setSlug(value: String): Self = this.set("slug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlug: Self = this.set("slug", js.undefined)
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    @scala.inline
    def setXde(value: Boolean): Self = this.set("xde", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteXde: Self = this.set("xde", js.undefined)
  }
  
}

