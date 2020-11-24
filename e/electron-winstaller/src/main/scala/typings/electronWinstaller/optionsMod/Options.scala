package typings.electronWinstaller.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * The folder path of your Electron app
    */
  var appDirectory: String = js.native
  
  /**
    * The authors value for the nuget package metadata.
    *
    * Defaults to the `author` field from your app's package.json file when unspecified.
    */
  var authors: js.UndefOr[String] = js.native
  
  /**
    * The path to an Authenticode Code Signing Certificate
    */
  var certificateFile: js.UndefOr[String] = js.native
  
  /**
    * The password to decrypt the certificate given in `certificateFile`
    */
  var certificatePassword: js.UndefOr[String] = js.native
  
  /**
    * The copyright value for the nuget package metadata.
    *
    * Defaults to a generated copyright with `authors` or `owners`.
    */
  var copyright: js.UndefOr[String] = js.native
  
  /**
    * The description value for the nuget package metadata.
    *
    * Defaults to the `description` field from your app's package.json file when unspecified.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * The name of your app's main `.exe` file.
    *
    * This uses the `name` field in your app's package.json file with an added `.exe` extension when unspecified.
    */
  var exe: js.UndefOr[String] = js.native
  
  var fixUpPaths: js.UndefOr[Boolean] = js.native
  
  var frameworkVersion: js.UndefOr[String] = js.native
  
  /**
    * A publicly accessible, fully qualified HTTP(S) URL to an ICO file, used as the application icon
    * displayed in Control Panel ➡ Programs and Features. The icon is retrieved at install time.
    * Example: http://example.com/favicon.ico
    *
    * Does not accept `file:` URLs.
    *
    * Defaults to the Electron icon.
    */
  var iconUrl: js.UndefOr[String] = js.native
  
  /**
    * The local path to a `.gif` file to display during install.
    */
  var loadingGif: js.UndefOr[String] = js.native
  
  /**
    * Windows Application Model ID (appId).
    *
    * Defaults to the name field in your app's package.json file.
    */
  var name: js.UndefOr[String] = js.native
  
  /**
    * Should Squirrel.Windows delta packages? (disable only if necessary, they are a Good Thing)
    */
  var noDelta: js.UndefOr[Boolean] = js.native
  
  /**
    * Should Squirrel.Windows create an MSI installer?
    */
  var noMsi: js.UndefOr[Boolean] = js.native
  
  /**
    * The folder path to create the .exe installer in.
    *
    * Defaults to the installer folder at the project root.
    */
  var outputDirectory: js.UndefOr[String] = js.native
  
  /**
    * The owners value for the nuget package metadata.
    *
    * Defaults to the `authors` field when unspecified.
    */
  var owners: js.UndefOr[String] = js.native
  
  /**
    * A URL to your existing updates. If given, these will be downloaded to create delta updates
    */
  var remoteReleases: js.UndefOr[String] = js.native
  
  /**
    * Authentication token for remote updates
    */
  var remoteToken: js.UndefOr[String] = js.native
  
  /**
    * The name to use for the generated Setup.exe file
    */
  var setupExe: js.UndefOr[String] = js.native
  
  /**
    * The ICO file to use as the icon for the generated Setup.exe
    */
  var setupIcon: js.UndefOr[String] = js.native
  
  /**
    * The name to use for the generated Setup.msi file
    */
  var setupMsi: js.UndefOr[String] = js.native
  
  /**
    * Params to pass to signtool.
    *
    * Overrides `certificateFile` and `certificatePassword`.
    */
  var signWithParams: js.UndefOr[String] = js.native
  
  var skipUpdateIcon: js.UndefOr[Boolean] = js.native
  
  /**
    * The title value for the nuget package metadata.
    *
    * Defaults to the `productName` field and then the `name` field from your app's package.json file when unspecified.
    */
  var title: js.UndefOr[String] = js.native
  
  var usePackageJson: js.UndefOr[Boolean] = js.native
  
  /**
    * The version value for the nuget package metadata.
    *
    * Defaults to the `version` field from your app's package.json file when unspecified.
    */
  var version: js.UndefOr[String] = js.native
}
object Options {
  
  @scala.inline
  def apply(appDirectory: String): Options = {
    val __obj = js.Dynamic.literal(appDirectory = appDirectory.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAppDirectory(value: String): Self = this.set("appDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthors(value: String): Self = this.set("authors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthors: Self = this.set("authors", js.undefined)
    
    @scala.inline
    def setCertificateFile(value: String): Self = this.set("certificateFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificateFile: Self = this.set("certificateFile", js.undefined)
    
    @scala.inline
    def setCertificatePassword(value: String): Self = this.set("certificatePassword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCertificatePassword: Self = this.set("certificatePassword", js.undefined)
    
    @scala.inline
    def setCopyright(value: String): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setExe(value: String): Self = this.set("exe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExe: Self = this.set("exe", js.undefined)
    
    @scala.inline
    def setFixUpPaths(value: Boolean): Self = this.set("fixUpPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFixUpPaths: Self = this.set("fixUpPaths", js.undefined)
    
    @scala.inline
    def setFrameworkVersion(value: String): Self = this.set("frameworkVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameworkVersion: Self = this.set("frameworkVersion", js.undefined)
    
    @scala.inline
    def setIconUrl(value: String): Self = this.set("iconUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconUrl: Self = this.set("iconUrl", js.undefined)
    
    @scala.inline
    def setLoadingGif(value: String): Self = this.set("loadingGif", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadingGif: Self = this.set("loadingGif", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNoDelta(value: Boolean): Self = this.set("noDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDelta: Self = this.set("noDelta", js.undefined)
    
    @scala.inline
    def setNoMsi(value: Boolean): Self = this.set("noMsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoMsi: Self = this.set("noMsi", js.undefined)
    
    @scala.inline
    def setOutputDirectory(value: String): Self = this.set("outputDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutputDirectory: Self = this.set("outputDirectory", js.undefined)
    
    @scala.inline
    def setOwners(value: String): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOwners: Self = this.set("owners", js.undefined)
    
    @scala.inline
    def setRemoteReleases(value: String): Self = this.set("remoteReleases", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteReleases: Self = this.set("remoteReleases", js.undefined)
    
    @scala.inline
    def setRemoteToken(value: String): Self = this.set("remoteToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRemoteToken: Self = this.set("remoteToken", js.undefined)
    
    @scala.inline
    def setSetupExe(value: String): Self = this.set("setupExe", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupExe: Self = this.set("setupExe", js.undefined)
    
    @scala.inline
    def setSetupIcon(value: String): Self = this.set("setupIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupIcon: Self = this.set("setupIcon", js.undefined)
    
    @scala.inline
    def setSetupMsi(value: String): Self = this.set("setupMsi", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSetupMsi: Self = this.set("setupMsi", js.undefined)
    
    @scala.inline
    def setSignWithParams(value: String): Self = this.set("signWithParams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignWithParams: Self = this.set("signWithParams", js.undefined)
    
    @scala.inline
    def setSkipUpdateIcon(value: Boolean): Self = this.set("skipUpdateIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipUpdateIcon: Self = this.set("skipUpdateIcon", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setUsePackageJson(value: Boolean): Self = this.set("usePackageJson", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUsePackageJson: Self = this.set("usePackageJson", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
