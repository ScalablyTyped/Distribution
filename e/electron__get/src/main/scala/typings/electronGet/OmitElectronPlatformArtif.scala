package typings.electronGet

import typings.electronGet.downloaderMod.Downloader
import typings.electronGet.electronGetBooleans.`false`
import typings.electronGet.typesMod.DownloadOptions
import typings.electronGet.typesMod.ElectronPlatformArtifactDetailsWithDefaults
import typings.electronGet.typesMod.MirrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined @electron/get.@electron/get/dist/cjs/types.Omit<@electron/get.@electron/get/dist/cjs/types.ElectronPlatformArtifactDetails, 'platform' | 'arch'> & {  platform ? :string,   arch ? :string} */
trait OmitElectronPlatformArtif extends ElectronPlatformArtifactDetailsWithDefaults {
  var arch: js.UndefOr[String] = js.undefined
  var artifactName: String
  var artifactSuffix: js.UndefOr[String] = js.undefined
  var cacheRoot: js.UndefOr[String] = js.undefined
  var downloadOptions: js.UndefOr[DownloadOptions] = js.undefined
  var downloader: js.UndefOr[Downloader[_]] = js.undefined
  var force: js.UndefOr[Boolean] = js.undefined
  var isGeneric: js.UndefOr[`false`] = js.undefined
  var mirrorOptions: js.UndefOr[MirrorOptions] = js.undefined
  var platform: js.UndefOr[String] = js.undefined
  var tempDirectory: js.UndefOr[String] = js.undefined
  var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.undefined
  var version: String
}

object OmitElectronPlatformArtif {
  @scala.inline
  def apply(
    artifactName: String,
    version: String,
    arch: String = null,
    artifactSuffix: String = null,
    cacheRoot: String = null,
    downloadOptions: DownloadOptions = null,
    downloader: Downloader[_] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    isGeneric: `false` = null,
    mirrorOptions: MirrorOptions = null,
    platform: String = null,
    tempDirectory: String = null,
    unsafelyDisableChecksums: js.UndefOr[Boolean] = js.undefined
  ): OmitElectronPlatformArtif = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (arch != null) __obj.updateDynamic("arch")(arch.asInstanceOf[js.Any])
    if (artifactSuffix != null) __obj.updateDynamic("artifactSuffix")(artifactSuffix.asInstanceOf[js.Any])
    if (cacheRoot != null) __obj.updateDynamic("cacheRoot")(cacheRoot.asInstanceOf[js.Any])
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions.asInstanceOf[js.Any])
    if (downloader != null) __obj.updateDynamic("downloader")(downloader.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.asInstanceOf[js.Any])
    if (isGeneric != null) __obj.updateDynamic("isGeneric")(isGeneric.asInstanceOf[js.Any])
    if (mirrorOptions != null) __obj.updateDynamic("mirrorOptions")(mirrorOptions.asInstanceOf[js.Any])
    if (platform != null) __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    if (tempDirectory != null) __obj.updateDynamic("tempDirectory")(tempDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafelyDisableChecksums)) __obj.updateDynamic("unsafelyDisableChecksums")(unsafelyDisableChecksums.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitElectronPlatformArtif]
  }
}

