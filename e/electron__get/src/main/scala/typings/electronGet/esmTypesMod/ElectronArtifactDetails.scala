package typings.electronGet.esmTypesMod

import typings.electronGet.electronGetBooleans.`false`
import typings.electronGet.electronGetBooleans.`true`
import typings.electronGet.esmDownloaderMod.Downloader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetails
  - typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails
*/
trait ElectronArtifactDetails extends js.Object

object ElectronArtifactDetails {
  @scala.inline
  def ElectronPlatformArtifactDetails(
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
  ): ElectronArtifactDetails = {
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
    __obj.asInstanceOf[ElectronArtifactDetails]
  }
  @scala.inline
  def ElectronGenericArtifactDetails(
    artifactName: String,
    isGeneric: `true`,
    version: String,
    cacheRoot: String = null,
    downloadOptions: DownloadOptions = null,
    downloader: Downloader[_] = null,
    force: js.UndefOr[Boolean] = js.undefined,
    mirrorOptions: MirrorOptions = null,
    tempDirectory: String = null,
    unsafelyDisableChecksums: js.UndefOr[Boolean] = js.undefined
  ): ElectronArtifactDetails = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    if (cacheRoot != null) __obj.updateDynamic("cacheRoot")(cacheRoot.asInstanceOf[js.Any])
    if (downloadOptions != null) __obj.updateDynamic("downloadOptions")(downloadOptions.asInstanceOf[js.Any])
    if (downloader != null) __obj.updateDynamic("downloader")(downloader.asInstanceOf[js.Any])
    if (!js.isUndefined(force)) __obj.updateDynamic("force")(force.get.asInstanceOf[js.Any])
    if (mirrorOptions != null) __obj.updateDynamic("mirrorOptions")(mirrorOptions.asInstanceOf[js.Any])
    if (tempDirectory != null) __obj.updateDynamic("tempDirectory")(tempDirectory.asInstanceOf[js.Any])
    if (!js.isUndefined(unsafelyDisableChecksums)) __obj.updateDynamic("unsafelyDisableChecksums")(unsafelyDisableChecksums.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElectronArtifactDetails]
  }
}

