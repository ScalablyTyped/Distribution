package typings.electronGet

import typings.electronGet.downloaderMod.Downloader
import typings.electronGet.electronGetBooleans.`false`
import typings.electronGet.electronGetBooleans.`true`
import typings.std.Exclude
import typings.std.Pick
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  type DownloadOptions = js.Any
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronGet.typesMod.ElectronPlatformArtifactDetails
    - typings.electronGet.typesMod.ElectronGenericArtifactDetails
  */
  trait ElectronArtifactDetails extends StObject
  object ElectronArtifactDetails {
    
    inline def ElectronGenericArtifactDetails(artifactName: String, version: String): typings.electronGet.typesMod.ElectronGenericArtifactDetails = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = true, version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.typesMod.ElectronGenericArtifactDetails]
    }
    
    inline def ElectronPlatformArtifactDetails(arch: String, artifactName: String, platform: String, version: String): typings.electronGet.typesMod.ElectronPlatformArtifactDetails = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.typesMod.ElectronPlatformArtifactDetails]
    }
  }
  
  trait ElectronDownloadRequest extends StObject {
    
    /**
      * The type of artifact. For example:
      * * `electron`
      * * `ffmpeg`
      */
    var artifactName: String
    
    /**
      * The version of Electron associated with the artifact.
      */
    var version: String
  }
  object ElectronDownloadRequest {
    
    inline def apply(artifactName: String, version: String): ElectronDownloadRequest = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElectronDownloadRequest]
    }
    
    extension [Self <: ElectronDownloadRequest](x: Self) {
      
      inline def setArtifactName(value: String): Self = StObject.set(x, "artifactName", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
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
    var cacheRoot: js.UndefOr[String] = js.undefined
    
    /**
      * Options passed to the downloader module.
      */
    var downloadOptions: js.UndefOr[DownloadOptions] = js.undefined
    
    /**
      * The custom [[Downloader]] class used to download artifacts. Defaults to the
      * built-in [[GotDownloader]].
      */
    var downloader: js.UndefOr[Downloader[js.Any]] = js.undefined
    
    /**
      * Whether to download an artifact regardless of whether it's in the cache directory.
      *
      * Defaults to `false`.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Options related to specifying an artifact mirror.
      */
    var mirrorOptions: js.UndefOr[MirrorOptions] = js.undefined
    
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
  }
  object ElectronDownloadRequestOptions {
    
    inline def apply(): ElectronDownloadRequestOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ElectronDownloadRequestOptions]
    }
    
    extension [Self <: ElectronDownloadRequestOptions](x: Self) {
      
      inline def setCacheRoot(value: String): Self = StObject.set(x, "cacheRoot", value.asInstanceOf[js.Any])
      
      inline def setCacheRootUndefined: Self = StObject.set(x, "cacheRoot", js.undefined)
      
      inline def setDownloadOptions(value: DownloadOptions): Self = StObject.set(x, "downloadOptions", value.asInstanceOf[js.Any])
      
      inline def setDownloadOptionsUndefined: Self = StObject.set(x, "downloadOptions", js.undefined)
      
      inline def setDownloader(value: Downloader[js.Any]): Self = StObject.set(x, "downloader", value.asInstanceOf[js.Any])
      
      inline def setDownloaderUndefined: Self = StObject.set(x, "downloader", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setMirrorOptions(value: MirrorOptions): Self = StObject.set(x, "mirrorOptions", value.asInstanceOf[js.Any])
      
      inline def setMirrorOptionsUndefined: Self = StObject.set(x, "mirrorOptions", js.undefined)
      
      inline def setTempDirectory(value: String): Self = StObject.set(x, "tempDirectory", value.asInstanceOf[js.Any])
      
      inline def setTempDirectoryUndefined: Self = StObject.set(x, "tempDirectory", js.undefined)
      
      inline def setUnsafelyDisableChecksums(value: Boolean): Self = StObject.set(x, "unsafelyDisableChecksums", value.asInstanceOf[js.Any])
      
      inline def setUnsafelyDisableChecksumsUndefined: Self = StObject.set(x, "unsafelyDisableChecksums", js.undefined)
    }
  }
  
  trait ElectronGenericArtifactDetails
    extends StObject
       with ElectronDownloadRequest
       with ElectronDownloadRequestOptions
       with ElectronArtifactDetails
       with ElectronPlatformArtifactDetailsWithDefaults {
    
    var isGeneric: `true`
  }
  object ElectronGenericArtifactDetails {
    
    inline def apply(artifactName: String, version: String): ElectronGenericArtifactDetails = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = true, version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElectronGenericArtifactDetails]
    }
    
    extension [Self <: ElectronGenericArtifactDetails](x: Self) {
      
      inline def setIsGeneric(value: `true`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElectronPlatformArtifactDetails
    extends StObject
       with ElectronDownloadRequest
       with ElectronDownloadRequestOptions
       with ElectronArtifactDetails {
    
    /**
      * The target artifact architecture. These are Node-style architecture names, for example:
      * * `ia32`
      * * `x64`
      * * `armv7l`
      */
    var arch: String
    
    var artifactSuffix: js.UndefOr[String] = js.undefined
    
    var isGeneric: js.UndefOr[`false`] = js.undefined
    
    /**
      * The target artifact platform. These are Node-style platform names, for example:
      * * `win32`
      * * `darwin`
      * * `linux`
      */
    var platform: String
  }
  object ElectronPlatformArtifactDetails {
    
    inline def apply(arch: String, artifactName: String, platform: String, version: String): ElectronPlatformArtifactDetails = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], artifactName = artifactName.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[ElectronPlatformArtifactDetails]
    }
    
    extension [Self <: ElectronPlatformArtifactDetails](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setArtifactSuffix(value: String): Self = StObject.set(x, "artifactSuffix", value.asInstanceOf[js.Any])
      
      inline def setArtifactSuffixUndefined: Self = StObject.set(x, "artifactSuffix", js.undefined)
      
      inline def setIsGeneric(value: `false`): Self = StObject.set(x, "isGeneric", value.asInstanceOf[js.Any])
      
      inline def setIsGenericUndefined: Self = StObject.set(x, "isGeneric", js.undefined)
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.electronGet.anon.OmitElectronPlatformArtif
    - typings.electronGet.typesMod.ElectronGenericArtifactDetails
  */
  trait ElectronPlatformArtifactDetailsWithDefaults extends StObject
  object ElectronPlatformArtifactDetailsWithDefaults {
    
    inline def ElectronGenericArtifactDetails(artifactName: String, version: String): typings.electronGet.typesMod.ElectronGenericArtifactDetails = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], isGeneric = true, version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.typesMod.ElectronGenericArtifactDetails]
    }
    
    inline def OmitElectronPlatformArtif(artifactName: String, version: String): typings.electronGet.anon.OmitElectronPlatformArtif = {
      val __obj = js.Dynamic.literal(artifactName = artifactName.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.electronGet.anon.OmitElectronPlatformArtif]
    }
  }
  
  trait MirrorOptions extends StObject {
    
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
    
    inline def apply(): MirrorOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MirrorOptions]
    }
    
    extension [Self <: MirrorOptions](x: Self) {
      
      inline def setCustomDir(value: String): Self = StObject.set(x, "customDir", value.asInstanceOf[js.Any])
      
      inline def setCustomDirUndefined: Self = StObject.set(x, "customDir", js.undefined)
      
      inline def setCustomFilename(value: String): Self = StObject.set(x, "customFilename", value.asInstanceOf[js.Any])
      
      inline def setCustomFilenameUndefined: Self = StObject.set(x, "customFilename", js.undefined)
      
      inline def setMirror(value: String): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      inline def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      inline def setNightlyMirror(value: String): Self = StObject.set(x, "nightlyMirror", value.asInstanceOf[js.Any])
      
      inline def setNightlyMirrorUndefined: Self = StObject.set(x, "nightlyMirror", js.undefined)
      
      inline def setNightly_mirror(value: String): Self = StObject.set(x, "nightly_mirror", value.asInstanceOf[js.Any])
      
      inline def setNightly_mirrorUndefined: Self = StObject.set(x, "nightly_mirror", js.undefined)
      
      inline def setResolveAssetURL(value: /* opts */ DownloadOptions => js.Promise[String]): Self = StObject.set(x, "resolveAssetURL", js.Any.fromFunction1(value))
      
      inline def setResolveAssetURLUndefined: Self = StObject.set(x, "resolveAssetURL", js.undefined)
    }
  }
  
  type Omit[T, K] = Pick[T, Exclude[/* keyof T */ String, K]]
}
