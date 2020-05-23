package typings.electronGet.typesMod

import typings.electronGet.downloaderMod.Downloader
import typings.electronGet.electronGetBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  platform  :string,   arch  :string,   artifactSuffix ? :string,   isGeneric ? :false} & @electron/get.@electron/get/dist/cjs/types.ElectronDownloadRequest & @electron/get.@electron/get/dist/cjs/types.ElectronDownloadRequestOptions */
trait ElectronPlatformArtifactDetails extends ElectronArtifactDetails {
  /**
    * The target artifact architecture. These are Node-style architecture names, for example:
    * * `ia32`
    * * `x64`
    * * `armv7l`
    */
  var arch: String
  /**
    * The type of artifact. For example:
    * * `electron`
    * * `ffmpeg`
    */
  var artifactName: String
  var artifactSuffix: js.UndefOr[String] = js.undefined
  /**
    * The directory that caches Electron artifact downloads.
    *
    * The default value is dependent upon the host platform:
    *
    * * Linux: `$XDG_CACHE_HOME` or `~/.cache/electron/`
    * * MacOS: `~/Library/Caches/electron/`
    * * Windows: `%LOCALAPPDATA%/electron/Cache` or `~/AppData/Local/electron/Cache/`
    */
  var cacheRoot: js.UndefOr[String] = js.undefined
  /**
    * Options passed to the downloader module.
    */
  var downloadOptions: js.UndefOr[DownloadOptions] = js.undefined
  /**
    * The custom [[Downloader]] class used to download artifacts. Defaults to the
    * built-in [[GotDownloader]].
    */
  var downloader: js.UndefOr[Downloader[_]] = js.undefined
  /**
    * Whether to download an artifact regardless of whether it's in the cache directory.
    *
    * Defaults to `false`.
    */
  var force: js.UndefOr[Boolean] = js.undefined
  var isGeneric: js.UndefOr[`false`] = js.undefined
  /**
    * Options related to specifying an artifact mirror.
    */
  var mirrorOptions: js.UndefOr[MirrorOptions] = js.undefined
  /**
    * The target artifact platform. These are Node-style platform names, for example:
    * * `win32`
    * * `darwin`
    * * `linux`
    */
  var platform: String
  /**
    * A temporary directory for downloads.
    * It is used before artifacts are put into cache.
    */
  var tempDirectory: js.UndefOr[String] = js.undefined
  /**
    * When set to `true`, disables checking that the artifact download completed successfully
    * with the correct payload.
    *
    * Defaults to `false`.
    */
  var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.undefined
  /**
    * The version of Electron associated with the artifact.
    */
  var version: String
}

object ElectronPlatformArtifactDetails {
  @scala.inline
  def apply(
    arch: String,
    artifactName: String,
    platform: String,
    version: String,
    artifactSuffix: String = null,
    cacheRoot: String = null,
    downloadOptions: DownloadOptions = null,
    downloader: Downloader[_] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    isGeneric: `false` = null,
    mirrorOptions: MirrorOptions = null,
    tempDirectory: String = null,
    unsafelyDisableChecksums: js.UndefOr[Boolean] = js.undefined
  ): ElectronPlatformArtifactDetails = {
    val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (artifactSuffix != null) __obj.updateDynamic("artifactSuffix")(artifactSuffix.asInstanceOf[js.Any])
    if (cacheRoot != null) __obj.updateDynamic("cacheRoot")(cacheRoot.asInstanceOf[js.Any])
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions.asInstanceOf[js.Any])
    if (downloader != null) __obj.updateDynamic("downloader")(downloader.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (isGeneric != null) __obj.updateDynamic("isGeneric")(isGeneric.asInstanceOf[js.Any])
    if (mirrorOptions != null) __obj.updateDynamic("mirrorOptions")(mirrorOptions.asInstanceOf[js.Any])
    if (tempDirectory != null) __obj.updateDynamic("tempDirectory")(tempDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafelyDisableChecksums)) __obj.updateDynamic("unsafelyDisableChecksums")(unsafelyDisableChecksums.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronPlatformArtifactDetails]
  }
}

