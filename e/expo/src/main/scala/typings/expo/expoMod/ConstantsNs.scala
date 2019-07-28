package typings.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.Anon_0
import typings.expo.Anon_AndroidCollapsedTitle
import typings.expo.Anon_BackgroundColor
import typings.expo.Anon_BackgroundColorImage
import typings.expo.Anon_BuildNumber
import typings.expo.Anon_BuildNumberBundleIdentifier
import typings.expo.Anon_Config
import typings.expo.Anon_Dev
import typings.expo.Anon_VersionCode
import typings.expo.expoMod.ConstantsNs.Manifest
import typings.expo.expoMod.ConstantsNs.Platform
import typings.expo.expoStrings.guest
import typings.expo.expoStrings.public
import typings.expo.expoStrings.standalone
import typings.expo.expoStrings.unlisted
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Constants")
@js.native
object ConstantsNs extends js.Object {
  trait Manifest
    extends /* propName */ StringDictionary[js.Any] {
    var android: js.UndefOr[Anon_Config] = js.undefined
    var androidShowExponentNotificationInShellApp: js.UndefOr[Boolean] = js.undefined
    var androidStatusBar: js.UndefOr[Anon_BackgroundColor] = js.undefined
    var appKey: js.UndefOr[String] = js.undefined
    var assetBundlePatterns: js.UndefOr[js.Array[String]] = js.undefined
    var description: js.UndefOr[String] = js.undefined
    var entryPoint: js.UndefOr[String] = js.undefined
    var extra: js.UndefOr[StringDictionary[js.Any]] = js.undefined
    var facebookAppId: js.UndefOr[String] = js.undefined
    var facebookDisplayName: js.UndefOr[String] = js.undefined
    var facebookScheme: js.UndefOr[js.Any] = js.undefined
    var githubUrl: js.UndefOr[String] = js.undefined
    var icon: js.UndefOr[String] = js.undefined
    var ignoreNodeModulesValidation: js.UndefOr[js.Any] = js.undefined
    var ios: js.UndefOr[Anon_BuildNumberBundleIdentifier] = js.undefined
    var loading: js.UndefOr[Anon_0] = js.undefined
    var name: String
    var nodeModulesPath: js.UndefOr[String] = js.undefined
    var notification: js.UndefOr[Anon_AndroidCollapsedTitle] = js.undefined
    var orientation: js.UndefOr[Orientation] = js.undefined
    var packagerOpts: js.UndefOr[Anon_Dev] = js.undefined
    var platforms: js.UndefOr[js.Array[String]] = js.undefined
    var primaryColor: js.UndefOr[String] = js.undefined
    var privacy: js.UndefOr[public | unlisted] = js.undefined
    var releaseChannel: String
    var rnCliPath: js.UndefOr[js.Any] = js.undefined
    var scheme: js.UndefOr[String] = js.undefined
    var sdkVersion: js.UndefOr[String] = js.undefined
    var slug: js.UndefOr[String] = js.undefined
    var splash: js.UndefOr[Anon_BackgroundColorImage] = js.undefined
    var version: js.UndefOr[String] = js.undefined
  }
  
  trait Platform extends js.Object {
    var android: js.UndefOr[Anon_VersionCode] = js.undefined
    var ios: js.UndefOr[Anon_BuildNumber] = js.undefined
  }
  
  val appOwnership: typings.expo.expoStrings.expo | standalone | guest = js.native
  val deviceId: String = js.native
  val deviceName: String = js.native
  val deviceYearClass: Double = js.native
  val expoVersion: String = js.native
  val installationId: String = js.native
  val isDevice: Boolean = js.native
  val linkingUri: String = js.native
  val manifest: Manifest = js.native
  val platform: Platform = js.native
  val sessionId: String = js.native
  val statusBarHeight: Double = js.native
  val systemFonts: js.Array[String] = js.native
  def getWebViewUserAgentAsync(): js.Promise[String] = js.native
}

