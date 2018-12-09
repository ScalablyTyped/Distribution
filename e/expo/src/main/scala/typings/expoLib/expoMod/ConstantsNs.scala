package typings
package expoLib.expoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "Constants")
@js.native
object ConstantsNs extends js.Object {
  
  trait Manifest
    extends /* propName */ ScalablyTyped.runtime.StringDictionary[js.Any] {
    var android: js.UndefOr[expoLib.Anon_Config] = js.undefined
    var androidShowExponentNotificationInShellApp: js.UndefOr[scala.Boolean] = js.undefined
    var androidStatusBar: js.UndefOr[expoLib.Anon_BarStyle] = js.undefined
    var appKey: js.UndefOr[java.lang.String] = js.undefined
    var assetBundlePatterns: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var description: js.UndefOr[java.lang.String] = js.undefined
    var entryPoint: js.UndefOr[java.lang.String] = js.undefined
    var extra: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
    var facebookAppId: js.UndefOr[java.lang.String] = js.undefined
    var facebookDisplayName: js.UndefOr[java.lang.String] = js.undefined
    var facebookScheme: js.UndefOr[js.Any] = js.undefined
    var githubUrl: js.UndefOr[java.lang.String] = js.undefined
    var icon: js.UndefOr[java.lang.String] = js.undefined
    var ignoreNodeModulesValidation: js.UndefOr[js.Any] = js.undefined
    var ios: js.UndefOr[expoLib.Anon_SupportsTablet] = js.undefined
    var loading: js.UndefOr[expoLib.Anon_ExponentIconGrayscale] = js.undefined
    var name: java.lang.String
    var nodeModulesPath: js.UndefOr[java.lang.String] = js.undefined
    var notification: js.UndefOr[expoLib.Anon_AndroidCollapsedTitle] = js.undefined
    var orientation: js.UndefOr[expoLib.expoMod.Orientation] = js.undefined
    var packagerOpts: js.UndefOr[expoLib.Anon_PropName] = js.undefined
    var platforms: js.UndefOr[js.Array[java.lang.String]] = js.undefined
    var primaryColor: js.UndefOr[java.lang.String] = js.undefined
    var privacy: js.UndefOr[expoLib.expoLibStrings.public | expoLib.expoLibStrings.unlisted] = js.undefined
    var releaseChannel: java.lang.String
    var rnCliPath: js.UndefOr[js.Any] = js.undefined
    var scheme: js.UndefOr[java.lang.String] = js.undefined
    var sdkVersion: js.UndefOr[java.lang.String] = js.undefined
    var slug: js.UndefOr[java.lang.String] = js.undefined
    var splash: js.UndefOr[expoLib.Anon_ResizeMode] = js.undefined
    var version: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait Platform extends js.Object {
    var android: js.UndefOr[expoLib.Anon_VersionCode] = js.undefined
    var ios: js.UndefOr[expoLib.Anon_Platform] = js.undefined
  }
  
  val appOwnership: expoLib.expoLibStrings.expo | expoLib.expoLibStrings.standalone | expoLib.expoLibStrings.guest = js.native
  val deviceId: java.lang.String = js.native
  val deviceName: java.lang.String = js.native
  val deviceYearClass: scala.Double = js.native
  val expoVersion: java.lang.String = js.native
  val installationId: java.lang.String = js.native
  val isDevice: scala.Boolean = js.native
  val linkingUri: java.lang.String = js.native
  val manifest: Manifest = js.native
  val platform: Platform = js.native
  val sessionId: java.lang.String = js.native
  val statusBarHeight: scala.Double = js.native
  val systemFonts: js.Array[java.lang.String] = js.native
  def getWebViewUserAgentAsync(): js.Promise[java.lang.String] = js.native
}

