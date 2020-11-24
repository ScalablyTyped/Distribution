package typings.electronGet.anon

import typings.electronGet.downloaderMod.Downloader
import typings.electronGet.electronGetBooleans.`false`
import typings.electronGet.typesMod.DownloadOptions
import typings.electronGet.typesMod.ElectronPlatformArtifactDetailsWithDefaults
import typings.electronGet.typesMod.MirrorOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @electron/get.@electron/get/dist/cjs/types.Omit<@electron/get.@electron/get/dist/cjs/types.ElectronPlatformArtifactDetails, 'platform' | 'arch'> & {  platform :string | undefined,   arch :string | undefined} */
@js.native
trait OmitElectronPlatformArtif extends ElectronPlatformArtifactDetailsWithDefaults {
  
  var arch: js.UndefOr[String] = js.native
  
  var artifactName: String = js.native
  
  var artifactSuffix: js.UndefOr[String] = js.native
  
  var cacheRoot: js.UndefOr[String] = js.native
  
  var downloadOptions: js.UndefOr[DownloadOptions] = js.native
  
  var downloader: js.UndefOr[Downloader[_]] = js.native
  
  var force: js.UndefOr[Boolean] = js.native
  
  var isGeneric: js.UndefOr[`false`] = js.native
  
  var mirrorOptions: js.UndefOr[MirrorOptions] = js.native
  
  var platform: js.UndefOr[String] = js.native
  
  var tempDirectory: js.UndefOr[String] = js.native
  
  var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
  
  var version: String = js.native
}
object OmitElectronPlatformArtif {
  
  @scala.inline
  def apply(artifactName: String, version: String): OmitElectronPlatformArtif = {
    val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitElectronPlatformArtif]
  }
  
  @scala.inline
  implicit class OmitElectronPlatformArtifOps[Self <: OmitElectronPlatformArtif] (val x: Self) extends AnyVal {
    
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
    def setArtifactName(value: String): Self = this.set("artifactName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArch(value: String): Self = this.set("arch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArch: Self = this.set("arch", js.undefined)
    
    @scala.inline
    def setArtifactSuffix(value: String): Self = this.set("artifactSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArtifactSuffix: Self = this.set("artifactSuffix", js.undefined)
    
    @scala.inline
    def setCacheRoot(value: String): Self = this.set("cacheRoot", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheRoot: Self = this.set("cacheRoot", js.undefined)
    
    @scala.inline
    def setDownloadOptions(value: DownloadOptions): Self = this.set("downloadOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloadOptions: Self = this.set("downloadOptions", js.undefined)
    
    @scala.inline
    def setDownloader(value: Downloader[_]): Self = this.set("downloader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDownloader: Self = this.set("downloader", js.undefined)
    
    @scala.inline
    def setForce(value: Boolean): Self = this.set("force", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForce: Self = this.set("force", js.undefined)
    
    @scala.inline
    def setIsGeneric(value: `false`): Self = this.set("isGeneric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsGeneric: Self = this.set("isGeneric", js.undefined)
    
    @scala.inline
    def setMirrorOptions(value: MirrorOptions): Self = this.set("mirrorOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirrorOptions: Self = this.set("mirrorOptions", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setTempDirectory(value: String): Self = this.set("tempDirectory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempDirectory: Self = this.set("tempDirectory", js.undefined)
    
    @scala.inline
    def setUnsafelyDisableChecksums(value: Boolean): Self = this.set("unsafelyDisableChecksums", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnsafelyDisableChecksums: Self = this.set("unsafelyDisableChecksums", js.undefined)
  }
}
