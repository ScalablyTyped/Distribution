package typings.electronDashWinstaller.electronDashWinstallerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The folder path of your Electron app
    */
  var appDirectory: String
  /**
    * The authors value for the nuget package metadata.
    *
    * Defaults to the `author` field from your app's package.json file when unspecified.
    */
  var authors: js.UndefOr[String] = js.undefined
  /**
    * The path to an Authenticode Code Signing Certificate
    */
  var certificateFile: js.UndefOr[String] = js.undefined
  /**
    * The password to decrypt the certificate given in `certificateFile`
    */
  var certificatePassword: js.UndefOr[String] = js.undefined
  /**
    * The copyright value for the nuget package metadata.
    *
    * Defaults to a generated copyright with `authors` or `owners`.
    */
  var copyright: js.UndefOr[String] = js.undefined
  /**
    * The description value for the nuget package metadata.
    *
    * Defaults to the `description` field from your app's package.json file when unspecified.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of your app's main `.exe` file.
    *
    * This uses the `name` field in your app's package.json file with an added `.exe` extension when unspecified.
    */
  var exe: js.UndefOr[String] = js.undefined
  /**
    * A URL to an ICO file to use as the application icon (displayed in Control Panel > Programs and Features).
    *
    * Defaults to the Atom icon.
    */
  var iconUrl: js.UndefOr[String] = js.undefined
  /**
    * The local path to a `.gif` file to display during install.
    */
  var loadingGif: js.UndefOr[String] = js.undefined
  /**
    * Windows Application Model ID (appId).
    *
    * Defaults to the name field in your app's package.json file.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Should Squirrel.Windows delta packages? (disable only if necessary, they are a Good Thing)
    */
  var noDelta: js.UndefOr[Boolean] = js.undefined
  /**
    * Should Squirrel.Windows create an MSI installer?
    */
  var noMsi: js.UndefOr[Boolean] = js.undefined
  /**
    * The folder path to create the .exe installer in.
    *
    * Defaults to the installer folder at the project root.
    */
  var outputDirectory: js.UndefOr[String] = js.undefined
  /**
    * The owners value for the nuget package metadata.
    *
    * Defaults to the `authors` field when unspecified.
    */
  var owners: js.UndefOr[String] = js.undefined
  /**
    * A URL to your existing updates. If given, these will be downloaded to create delta updates
    */
  var remoteReleases: js.UndefOr[String] = js.undefined
  /**
    * Authentication token for remote updates
    */
  var remoteToken: js.UndefOr[String] = js.undefined
  /**
    * The name to use for the generated Setup.exe file
    */
  var setupExe: js.UndefOr[String] = js.undefined
  /**
    * The ICO file to use as the icon for the generated Setup.exe
    */
  var setupIcon: js.UndefOr[String] = js.undefined
  /**
    * The name to use for the generated Setup.msi file
    */
  var setupMsi: js.UndefOr[String] = js.undefined
  /**
    * Params to pass to signtool.
    *
    * Overrides `certificateFile` and `certificatePassword`.
    */
  var signWithParams: js.UndefOr[String] = js.undefined
  /**
    * The title value for the nuget package metadata.
    *
    * Defaults to the `productName` field and then the `name` field from your app's package.json file when unspecified.
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * The version value for the nuget package metadata.
    *
    * Defaults to the `version` field from your app's package.json file when unspecified.
    */
  var version: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    appDirectory: String,
    authors: String = null,
    certificateFile: String = null,
    certificatePassword: String = null,
    copyright: String = null,
    description: String = null,
    exe: String = null,
    iconUrl: String = null,
    loadingGif: String = null,
    name: String = null,
    noDelta: js.UndefOr[Boolean] = js.undefined,
    noMsi: js.UndefOr[Boolean] = js.undefined,
    outputDirectory: String = null,
    owners: String = null,
    remoteReleases: String = null,
    remoteToken: String = null,
    setupExe: String = null,
    setupIcon: String = null,
    setupMsi: String = null,
    signWithParams: String = null,
    title: String = null,
    version: String = null
  ): Options = {
    val __obj = js.Dynamic.literal(appDirectory = appDirectory)
    if (authors != null) __obj.updateDynamic("authors")(authors)
    if (certificateFile != null) __obj.updateDynamic("certificateFile")(certificateFile)
    if (certificatePassword != null) __obj.updateDynamic("certificatePassword")(certificatePassword)
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (description != null) __obj.updateDynamic("description")(description)
    if (exe != null) __obj.updateDynamic("exe")(exe)
    if (iconUrl != null) __obj.updateDynamic("iconUrl")(iconUrl)
    if (loadingGif != null) __obj.updateDynamic("loadingGif")(loadingGif)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noDelta)) __obj.updateDynamic("noDelta")(noDelta)
    if (!js.isUndefined(noMsi)) __obj.updateDynamic("noMsi")(noMsi)
    if (outputDirectory != null) __obj.updateDynamic("outputDirectory")(outputDirectory)
    if (owners != null) __obj.updateDynamic("owners")(owners)
    if (remoteReleases != null) __obj.updateDynamic("remoteReleases")(remoteReleases)
    if (remoteToken != null) __obj.updateDynamic("remoteToken")(remoteToken)
    if (setupExe != null) __obj.updateDynamic("setupExe")(setupExe)
    if (setupIcon != null) __obj.updateDynamic("setupIcon")(setupIcon)
    if (setupMsi != null) __obj.updateDynamic("setupMsi")(setupMsi)
    if (signWithParams != null) __obj.updateDynamic("signWithParams")(signWithParams)
    if (title != null) __obj.updateDynamic("title")(title)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Options]
  }
}

