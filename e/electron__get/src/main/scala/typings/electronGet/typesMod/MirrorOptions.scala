package typings.electronGet.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MirrorOptions extends js.Object {
  /**
    * The name of the directory to download from,
    * often scoped by version number e.g 'v4.0.4'
    */
  var customDir: js.UndefOr[String] = js.native
  /**
    * The name of the asset to download,
    * e.g 'electron-v4.0.4-linux-x64.zip'
    */
  var customFilename: js.UndefOr[String] = js.native
  /**
    * The base URL of the mirror to download from,
    * e.g https://github.com/electron/electron/releases/download
    */
  var mirror: js.UndefOr[String] = js.native
  /**
    * The Electron nightly-specific mirror URL.
    */
  var nightlyMirror: js.UndefOr[String] = js.native
  /**
    * DEPRECATED - see nightlyMirror.
    */
  var nightly_mirror: js.UndefOr[String] = js.native
  /**
    * A function allowing customization of the url returned
    * from getArtifactRemoteURL().
    */
  var resolveAssetURL: js.UndefOr[js.Function1[/* opts */ DownloadOptions, js.Promise[String]]] = js.native
}

object MirrorOptions {
  @scala.inline
  def apply(): MirrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MirrorOptions]
  }
  @scala.inline
  implicit class MirrorOptionsOps[Self <: MirrorOptions] (val x: Self) extends AnyVal {
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
    def setCustomDir(value: String): Self = this.set("customDir", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomDir: Self = this.set("customDir", js.undefined)
    @scala.inline
    def setCustomFilename(value: String): Self = this.set("customFilename", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomFilename: Self = this.set("customFilename", js.undefined)
    @scala.inline
    def setMirror(value: String): Self = this.set("mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    @scala.inline
    def setNightlyMirror(value: String): Self = this.set("nightlyMirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNightlyMirror: Self = this.set("nightlyMirror", js.undefined)
    @scala.inline
    def setNightly_mirror(value: String): Self = this.set("nightly_mirror", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNightly_mirror: Self = this.set("nightly_mirror", js.undefined)
    @scala.inline
    def setResolveAssetURL(value: /* opts */ DownloadOptions => js.Promise[String]): Self = this.set("resolveAssetURL", js.Any.fromFunction1(value))
    @scala.inline
    def deleteResolveAssetURL: Self = this.set("resolveAssetURL", js.undefined)
  }
  
}

