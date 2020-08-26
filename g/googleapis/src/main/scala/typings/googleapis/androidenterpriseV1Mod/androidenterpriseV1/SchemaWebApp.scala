package typings.googleapis.androidenterpriseV1Mod.androidenterpriseV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A WebApps resource represents a web app created for an enterprise. Web apps
  * are published to managed Google Play and can be distributed like other
  * Android apps. On a user&#39;s device, a web app opens its specified URL.
  */
@js.native
trait SchemaWebApp extends js.Object {
  /**
    * The display mode of the web app.  Possible values include:  -
    * &quot;minimalUi&quot;, the device&#39;s status bar, navigation bar, the
    * app&#39;s URL, and a refresh button are visible when the app is open. For
    * HTTP URLs, you can only select this option. - &quot;standalone&quot;, the
    * device&#39;s status bar and navigation bar are visible when the app is
    * open. - &quot;fullScreen&quot;, the app opens in full screen mode, hiding
    * the device&#39;s status and navigation bars. All browser UI elements,
    * page URL, system status bar and back button are not visible, and the web
    * app takes up the entirety of the available display area.
    */
  var displayMode: js.UndefOr[String] = js.native
  /**
    * A list of icons representing this website. If absent, a default icon (for
    * create) or the current icon (for update) will be used.
    */
  var icons: js.UndefOr[js.Array[SchemaWebAppIcon]] = js.native
  /**
    * A flag whether the app has been published to the Play store yet.
    */
  var isPublished: js.UndefOr[Boolean] = js.native
  /**
    * The start URL, i.e. the URL that should load when the user opens the
    * application.
    */
  var startUrl: js.UndefOr[String] = js.native
  /**
    * The title of the web app as displayed to the user (e.g., amongst a list
    * of other applications, or as a label for an icon).
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The current version of the app.   Note that the version can automatically
    * increase during the lifetime of the web app, while Google does internal
    * housekeeping to keep the web app up-to-date.
    */
  var versionCode: js.UndefOr[String] = js.native
  /**
    * The ID of the application. A string of the form &quot;app:&lt;package
    * name&gt;&quot; where the package name always starts with the prefix
    * &quot;com.google.enterprise.webapp.&quot; followed by a random id.
    */
  var webAppId: js.UndefOr[String] = js.native
}

object SchemaWebApp {
  @scala.inline
  def apply(): SchemaWebApp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaWebApp]
  }
  @scala.inline
  implicit class SchemaWebAppOps[Self <: SchemaWebApp] (val x: Self) extends AnyVal {
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
    def setDisplayMode(value: String): Self = this.set("displayMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisplayMode: Self = this.set("displayMode", js.undefined)
    @scala.inline
    def setIconsVarargs(value: SchemaWebAppIcon*): Self = this.set("icons", js.Array(value :_*))
    @scala.inline
    def setIcons(value: js.Array[SchemaWebAppIcon]): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setIsPublished(value: Boolean): Self = this.set("isPublished", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPublished: Self = this.set("isPublished", js.undefined)
    @scala.inline
    def setStartUrl(value: String): Self = this.set("startUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartUrl: Self = this.set("startUrl", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setVersionCode(value: String): Self = this.set("versionCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionCode: Self = this.set("versionCode", js.undefined)
    @scala.inline
    def setWebAppId(value: String): Self = this.set("webAppId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebAppId: Self = this.set("webAppId", js.undefined)
  }
  
}

