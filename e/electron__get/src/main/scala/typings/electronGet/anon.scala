package typings.electronGet

import typings.electronGet.downloaderMod.Downloader
import typings.electronGet.electronGetBooleans.`false`
import typings.electronGet.typesMod.DownloadOptions
import typings.electronGet.typesMod.ElectronPlatformArtifactDetailsWithDefaults
import typings.electronGet.typesMod.MirrorOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined @electron/get.@electron/get/dist/cjs/types.Omit<@electron/get.@electron/get/dist/cjs/types.ElectronPlatformArtifactDetails, 'platform' | 'arch'> & {  platform :string | undefined,   arch :string | undefined} */
  trait OmitElectronPlatformArtif
    extends StObject
       with ElectronPlatformArtifactDetailsWithDefaults {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var artifactName: String
    
    var artifactSuffix: js.UndefOr[String] = js.undefined
    
    var cacheRoot: js.UndefOr[String] = js.undefined
    
    var downloadOptions: js.UndefOr[DownloadOptions] = js.undefined
    
    var downloader: js.UndefOr[Downloader[js.Any]] = js.undefined
    
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
    def apply(artifactName: String, version: String): OmitElectronPlatformArtif = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitElectronPlatformArtif]
    }
    
    @scala.inline
    implicit class OmitElectronPlatformArtifMutableBuilder[Self <: OmitElectronPlatformArtif] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffix(value: String): Self = StObject.set(x, "artifactSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffixUndefined: Self = StObject.set(x, "artifactSuffix", js.undefined)
      
      @scala.inline
      def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      @scala.inline
      def setDownloadOptions(value: DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      @scala.inline
      def setDownloader(value: Downloader[js.Any]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setIsGeneric(value: `false`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGenericUndefined: Self = StObject.set(x, "isGeneric", js.undefined)
      
      @scala.inline
      def setMirrorOptions(value: MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      @scala.inline
      def setUnsafelyDisableChecksums(value: Boolean): Self = StObject.set(x, "unsafelyDisableChecksums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafelyDisableChecksumsUndefined: Self = StObject.set(x, "unsafelyDisableChecksums", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined @electron/get.@electron/get/dist/esm/types.Omit<@electron/get.@electron/get/dist/esm/types.ElectronPlatformArtifactDetails, 'platform' | 'arch'> & {  platform :string | undefined,   arch :string | undefined} */
  trait OmitElectronPlatformArtifArch
    extends StObject
       with typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetailsWithDefaults {
    
    var arch: js.UndefOr[String] = js.undefined
    
    var artifactName: String
    
    var artifactSuffix: js.UndefOr[String] = js.undefined
    
    var cacheRoot: js.UndefOr[String] = js.undefined
    
    var downloadOptions: js.UndefOr[typings.electronGet.esmTypesMod.DownloadOptions] = js.undefined
    
    var downloader: js.UndefOr[typings.electronGet.esmDownloaderMod.Downloader[js.Any]] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var isGeneric: js.UndefOr[`false`] = js.undefined
    
    var mirrorOptions: js.UndefOr[typings.electronGet.esmTypesMod.MirrorOptions] = js.undefined
    
    var platform: js.UndefOr[String] = js.undefined
    
    var tempDirectory: js.UndefOr[String] = js.undefined
    
    var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.undefined
    
    var version: String
  }
  object OmitElectronPlatformArtifArch {
    
    @scala.inline
    def apply(artifactName: String, version: String): OmitElectronPlatformArtifArch = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[OmitElectronPlatformArtifArch]
    }
    
    @scala.inline
    implicit class OmitElectronPlatformArtifArchMutableBuilder[Self <: OmitElectronPlatformArtifArch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArchUndefined: Self = StObject.set(x, "arch", js.undefined)
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffix(value: String): Self = StObject.set(x, "artifactSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArtifactSuffixUndefined: Self = StObject.set(x, "artifactSuffix", js.undefined)
      
      @scala.inline
      def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      @scala.inline
      def setDownloadOptions(value: typings.electronGet.esmTypesMod.DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      @scala.inline
      def setDownloader(value: typings.electronGet.esmDownloaderMod.Downloader[js.Any]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setIsGeneric(value: `false`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsGenericUndefined: Self = StObject.set(x, "isGeneric", js.undefined)
      
      @scala.inline
      def setMirrorOptions(value: typings.electronGet.esmTypesMod.MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
      @scala.inline
      def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      @scala.inline
      def setUnsafelyDisableChecksums(value: Boolean): Self = StObject.set(x, "unsafelyDisableChecksums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafelyDisableChecksumsUndefined: Self = StObject.set(x, "unsafelyDisableChecksums", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
