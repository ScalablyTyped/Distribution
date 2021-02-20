package typings.electronGet

import typings.electronGet.electronGetBooleans.`false`
import typings.electronGet.electronGetBooleans.`true`
import typings.electronGet.esmDownloaderMod.Downloader
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmTypesMod {
  
  type DownloadOptions = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetails
    - typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails
  */
  trait ElectronArtifactDetails extends StObject
  object ElectronArtifactDetails {
    
    @scala.inline
    def ElectronGenericArtifactDetails(artifactName: String, isGeneric: `true`, version: String): typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails]
    }
    
    @scala.inline
    def ElectronPlatformArtifactDetails(arch: String, artifactName: String, platform: String, version: String): typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetails = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.esmTypesMod.ElectronPlatformArtifactDetails]
    }
  }
  
  @js.native
  trait ElectronDownloadRequest extends StObject {
    
    /**
      * The type of artifact. For example:
      * * `electron`
      * * `ffmpeg`
      */
    var artifactName: String = js.native
    
    /**
      * The version of Electron associated with the artifact.
      */
    var version: String = js.native
  }
  object ElectronDownloadRequest {
    
    @scala.inline
    def apply(artifactName: String, version: String): ElectronDownloadRequest = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElectronDownloadRequest]
    }
    
    @scala.inline
    implicit class ElectronDownloadRequestMutableBuilder[Self <: ElectronDownloadRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ElectronDownloadRequestOptions extends StObject {
    
    /**
      * The directory that caches Electron artifact downloads.
      *
      * The default value is dependent upon the host platform:
      *
      * * Linux: `$XDG_CACHE_HOME` or `~/.cache/electron/`
      * * MacOS: `~/Library/Caches/electron/`
      * * Windows: `%LOCALAPPDATA%/electron/Cache` or `~/AppData/Local/electron/Cache/`
      */
    var cacheRoot: js.UndefOr[String] = js.native
    
    /**
      * Options passed to the downloader module.
      */
    var downloadOptions: js.UndefOr[DownloadOptions] = js.native
    
    /**
      * The custom [[Downloader]] class used to download artifacts. Defaults to the
      * built-in [[GotDownloader]].
      */
    var downloader: js.UndefOr[Downloader[_]] = js.native
    
    /**
      * Whether to download an artifact regardless of whether it's in the cache directory.
      *
      * Defaults to `false`.
      */
    var force: js.UndefOr[Boolean] = js.native
    
    /**
      * Options related to specifying an artifact mirror.
      */
    var mirrorOptions: js.UndefOr[MirrorOptions] = js.native
    
    /**
      * A temporary directory for downloads.
      * It is used before artifacts are put into cache.
      */
    var tempDirectory: js.UndefOr[String] = js.native
    
    /**
      * When set to `true`, disables checking that the artifact download completed successfully
      * with the correct payload.
      *
      * Defaults to `false`.
      */
    var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
  }
  object ElectronDownloadRequestOptions {
    
    @scala.inline
    def apply(): ElectronDownloadRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElectronDownloadRequestOptions]
    }
    
    @scala.inline
    implicit class ElectronDownloadRequestOptionsMutableBuilder[Self <: ElectronDownloadRequestOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      @scala.inline
      def setDownloadOptions(value: DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      @scala.inline
      def setDownloader(value: Downloader[_]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setMirrorOptions(value: MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
      @scala.inline
      def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      @scala.inline
      def setUnsafelyDisableChecksums(value: Boolean): Self = StObject.set(x, "unsafelyDisableChecksums", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnsafelyDisableChecksumsUndefined: Self = StObject.set(x, "unsafelyDisableChecksums", js.undefined)
    }
  }
  
  /* Inlined {  isGeneric :true} & @electron/get.@electron/get/dist/esm/types.ElectronDownloadRequest & @electron/get.@electron/get/dist/esm/types.ElectronDownloadRequestOptions */
  @js.native
  trait ElectronGenericArtifactDetails
    extends ElectronArtifactDetails
       with ElectronPlatformArtifactDetailsWithDefaults {
    
    /**
      * The type of artifact. For example:
      * * `electron`
      * * `ffmpeg`
      */
    var artifactName: String = js.native
    
    /**
      * The directory that caches Electron artifact downloads.
      *
      * The default value is dependent upon the host platform:
      *
      * * Linux: `$XDG_CACHE_HOME` or `~/.cache/electron/`
      * * MacOS: `~/Library/Caches/electron/`
      * * Windows: `%LOCALAPPDATA%/electron/Cache` or `~/AppData/Local/electron/Cache/`
      */
    var cacheRoot: js.UndefOr[String] = js.native
    
    /**
      * Options passed to the downloader module.
      */
    var downloadOptions: js.UndefOr[DownloadOptions] = js.native
    
    /**
      * The custom [[Downloader]] class used to download artifacts. Defaults to the
      * built-in [[GotDownloader]].
      */
    var downloader: js.UndefOr[Downloader[_]] = js.native
    
    /**
      * Whether to download an artifact regardless of whether it's in the cache directory.
      *
      * Defaults to `false`.
      */
    var force: js.UndefOr[Boolean] = js.native
    
    var isGeneric: `true` = js.native
    
    /**
      * Options related to specifying an artifact mirror.
      */
    var mirrorOptions: js.UndefOr[MirrorOptions] = js.native
    
    /**
      * A temporary directory for downloads.
      * It is used before artifacts are put into cache.
      */
    var tempDirectory: js.UndefOr[String] = js.native
    
    /**
      * When set to `true`, disables checking that the artifact download completed successfully
      * with the correct payload.
      *
      * Defaults to `false`.
      */
    var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
    
    /**
      * The version of Electron associated with the artifact.
      */
    var version: String = js.native
  }
  object ElectronGenericArtifactDetails {
    
    @scala.inline
    def apply(artifactName: String, isGeneric: `true`, version: String): ElectronGenericArtifactDetails = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElectronGenericArtifactDetails]
    }
    
    @scala.inline
    implicit class ElectronGenericArtifactDetailsMutableBuilder[Self <: ElectronGenericArtifactDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      @scala.inline
      def setDownloadOptions(value: DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      @scala.inline
      def setDownloader(value: Downloader[_]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setIsGeneric(value: `true`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptions(value: MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
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
  
  /* Inlined {  platform :string,   arch :string,   artifactSuffix :string | undefined,   isGeneric :false | undefined} & @electron/get.@electron/get/dist/esm/types.ElectronDownloadRequest & @electron/get.@electron/get/dist/esm/types.ElectronDownloadRequestOptions */
  @js.native
  trait ElectronPlatformArtifactDetails extends ElectronArtifactDetails {
    
    /**
      * The target artifact architecture. These are Node-style architecture names, for example:
      * * `ia32`
      * * `x64`
      * * `armv7l`
      */
    var arch: String = js.native
    
    /**
      * The type of artifact. For example:
      * * `electron`
      * * `ffmpeg`
      */
    var artifactName: String = js.native
    
    var artifactSuffix: js.UndefOr[String] = js.native
    
    /**
      * The directory that caches Electron artifact downloads.
      *
      * The default value is dependent upon the host platform:
      *
      * * Linux: `$XDG_CACHE_HOME` or `~/.cache/electron/`
      * * MacOS: `~/Library/Caches/electron/`
      * * Windows: `%LOCALAPPDATA%/electron/Cache` or `~/AppData/Local/electron/Cache/`
      */
    var cacheRoot: js.UndefOr[String] = js.native
    
    /**
      * Options passed to the downloader module.
      */
    var downloadOptions: js.UndefOr[DownloadOptions] = js.native
    
    /**
      * The custom [[Downloader]] class used to download artifacts. Defaults to the
      * built-in [[GotDownloader]].
      */
    var downloader: js.UndefOr[Downloader[_]] = js.native
    
    /**
      * Whether to download an artifact regardless of whether it's in the cache directory.
      *
      * Defaults to `false`.
      */
    var force: js.UndefOr[Boolean] = js.native
    
    var isGeneric: js.UndefOr[`false`] = js.native
    
    /**
      * Options related to specifying an artifact mirror.
      */
    var mirrorOptions: js.UndefOr[MirrorOptions] = js.native
    
    /**
      * The target artifact platform. These are Node-style platform names, for example:
      * * `win32`
      * * `darwin`
      * * `linux`
      */
    var platform: String = js.native
    
    /**
      * A temporary directory for downloads.
      * It is used before artifacts are put into cache.
      */
    var tempDirectory: js.UndefOr[String] = js.native
    
    /**
      * When set to `true`, disables checking that the artifact download completed successfully
      * with the correct payload.
      *
      * Defaults to `false`.
      */
    var unsafelyDisableChecksums: js.UndefOr[Boolean] = js.native
    
    /**
      * The version of Electron associated with the artifact.
      */
    var version: String = js.native
  }
  object ElectronPlatformArtifactDetails {
    
    @scala.inline
    def apply(arch: String, artifactName: String, platform: String, version: String): ElectronPlatformArtifactDetails = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElectronPlatformArtifactDetails]
    }
    
    @scala.inline
    implicit class ElectronPlatformArtifactDetailsMutableBuilder[Self <: ElectronPlatformArtifactDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
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
      def setDownloader(value: Downloader[_]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
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
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronGet.anon.OmitElectronPlatformArtifArch
    - typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails
  */
  trait ElectronPlatformArtifactDetailsWithDefaults extends StObject
  object ElectronPlatformArtifactDetailsWithDefaults {
    
    @scala.inline
    def ElectronGenericArtifactDetails(artifactName: String, isGeneric: `true`, version: String): typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = isGeneric.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.esmTypesMod.ElectronGenericArtifactDetails]
    }
    
    @scala.inline
    def OmitElectronPlatformArtifArch(artifactName: String, version: String): typings.electronGet.anon.OmitElectronPlatformArtifArch = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.anon.OmitElectronPlatformArtifArch]
    }
  }
  
  @js.native
  trait MirrorOptions extends StObject {
    
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
    implicit class MirrorOptionsMutableBuilder[Self <: MirrorOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCustomDir(value: String): Self = StObject.set(x, "customDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomDirUndefined: Self = StObject.set(x, "customDir", js.undefined)
      
      @scala.inline
      def setCustomFilename(value: String): Self = StObject.set(x, "customFilename", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFilenameUndefined: Self = StObject.set(x, "customFilename", js.undefined)
      
      @scala.inline
      def setMirror(value: String): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      @scala.inline
      def setNightlyMirror(value: String): Self = StObject.set(x, "nightlyMirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNightlyMirrorUndefined: Self = StObject.set(x, "nightlyMirror", js.undefined)
      
      @scala.inline
      def setNightly_mirror(value: String): Self = StObject.set(x, "nightly_mirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNightly_mirrorUndefined: Self = StObject.set(x, "nightly_mirror", js.undefined)
      
      @scala.inline
      def setResolveAssetURL(value: /* opts */ DownloadOptions => js.Promise[String]): Self = StObject.set(x, "resolveAssetURL", js.Any.fromFunction1(value))
      
      @scala.inline
      def setResolveAssetURLUndefined: Self = StObject.set(x, "resolveAssetURL", js.undefined)
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
