package typings.electronGet.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MirrorOptions extends js.Object {
  /**
    * The name of the directory to download from,
    * often scoped by version number e.g 'v4.0.4'
    */
  var customDir: js.UndefOr[String] = js.undefined
  /**
    * The name of the asset to download,
    * e.g 'electron-v4.0.4-linux-x64.zip'
    */
  var customFilename: js.UndefOr[String] = js.undefined
  /**
    * The base URL of the mirror to download from,
    * e.g https://github.com/electron/electron/releases/download
    */
  var mirror: js.UndefOr[String] = js.undefined
  /**
    * The Electron nightly-specific mirror URL.
    */
  var nightlyMirror: js.UndefOr[String] = js.undefined
  /**
    * DEPRECATED - see nightlyMirror.
    */
  var nightly_mirror: js.UndefOr[String] = js.undefined
  /**
    * A function allowing customization of the url returned
    * from getArtifactRemoteURL().
    */
  var resolveAssetURL: js.UndefOr[js.Function1[/* opts */ DownloadOptions, js.Promise[String]]] = js.undefined
}

object MirrorOptions {
  @scala.inline
  def apply(
    customDir: String = null,
    customFilename: String = null,
    mirror: String = null,
    nightlyMirror: String = null,
    nightly_mirror: String = null,
    resolveAssetURL: /* opts */ DownloadOptions => js.Promise[String] = null
  ): MirrorOptions = {
    val __obj = js.Dynamic.literal()
    if (customDir != null) __obj.updateDynamic("customDir")(customDir.asInstanceOf[js.Any])
    if (customFilename != null) __obj.updateDynamic("customFilename")(customFilename.asInstanceOf[js.Any])
    if (mirror != null) __obj.updateDynamic("mirror")(mirror.asInstanceOf[js.Any])
    if (nightlyMirror != null) __obj.updateDynamic("nightlyMirror")(nightlyMirror.asInstanceOf[js.Any])
    if (nightly_mirror != null) __obj.updateDynamic("nightly_mirror")(nightly_mirror.asInstanceOf[js.Any])
    if (resolveAssetURL != null) __obj.updateDynamic("resolveAssetURL")(js.Any.fromFunction1(resolveAssetURL))
    __obj.asInstanceOf[MirrorOptions]
  }
}

