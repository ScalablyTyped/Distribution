package typings.ffbinaries

import typings.ffbinaries.anon.Arch
import typings.ffbinaries.anon.Filename
import typings.ffbinaries.anon.KinPlatformffmpegstringff
import typings.ffbinaries.ffbinariesBooleans.`false`
import typings.ffbinaries.ffbinariesBooleans.`true`
import typings.ffbinaries.ffbinariesStrings.DONE_CLEAN
import typings.ffbinaries.ffbinariesStrings.DONE_FROM_CACHE
import typings.ffbinaries.ffbinariesStrings.FILE_EXISTS
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ffbinaries", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def clearCache(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clearCache")().asInstanceOf[Unit]
  
  inline def detectPlatform(): Platform | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectPlatform")().asInstanceOf[Platform | Null]
  inline def detectPlatform(options: Arch): Platform | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("detectPlatform")(options.asInstanceOf[js.Any]).asInstanceOf[Platform | Null]
  
  inline def downloadBinaries(callback: js.Function2[/* error */ String | Null, /* results */ js.Array[DownloadResult], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("downloadBinaries")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def downloadBinaries(
    components: js.Array[Component],
    callback: js.Function2[/* error */ String | Null, /* results */ js.Array[DownloadResult], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadBinaries")(components.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadBinaries(
    components: js.Array[Component],
    opts: DownloadOptions,
    callback: js.Function2[/* error */ String | Null, /* results */ js.Array[DownloadResult], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadBinaries")(components.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadBinaries(
    components: Component,
    callback: js.Function2[/* error */ String | Null, /* results */ js.Array[DownloadResult], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadBinaries")(components.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def downloadBinaries(
    components: Component,
    opts: DownloadOptions,
    callback: js.Function2[/* error */ String | Null, /* results */ js.Array[DownloadResult], Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("downloadBinaries")(components.asInstanceOf[js.Any], opts.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getBinaryFilename(component: Component, platform: Platform): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getBinaryFilename")(component.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getVersionData(version: String, callback: js.Function2[/* error */ String | Null, /* data */ VersionData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getVersionData")(version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getVersionData(version: Null, callback: js.Function2[/* error */ String | Null, /* data */ VersionData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getVersionData")(version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def getVersionData(version: Unit, callback: js.Function2[/* error */ String | Null, /* data */ VersionData, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getVersionData")(version.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def listPlatforms(): js.Array[Platform] = ^.asInstanceOf[js.Dynamic].applyDynamic("listPlatforms")().asInstanceOf[js.Array[Platform]]
  
  inline def listVersions(callback: js.Function2[/* error */ String | Null, /* versions */ js.Array[String], Unit]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("listVersions")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def locateBinariesSync[T /* <: js.Array[Component] */](components: T): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T[number] ]: ffbinaries.ffbinaries.LocateResult} */ js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("locateBinariesSync")(components.asInstanceOf[js.Any]).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in T[number] ]: ffbinaries.ffbinaries.LocateResult} */ js.Any]
  inline def locateBinariesSync[T /* <: js.Array[Component] */](components: T, opts: LocateBinariesOptions): /* import warning: importer.ImportType#apply Failed type conversion: {[ K in T[number] ]: ffbinaries.ffbinaries.LocateResult} */ js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("locateBinariesSync")(components.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[/* import warning: importer.ImportType#apply Failed type conversion: {[ K in T[number] ]: ffbinaries.ffbinaries.LocateResult} */ js.Any]
  
  inline def resolvePlatform(input: String): Platform | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvePlatform")(input.asInstanceOf[js.Any]).asInstanceOf[Platform | Null]
  
  /* Rewritten from type alias, can be one of: 
    - typings.ffbinaries.ffbinariesStrings.ffmpeg
    - typings.ffbinaries.ffbinariesStrings.ffprobe
    - typings.ffbinaries.ffbinariesStrings.ffserver
    - typings.ffbinaries.ffbinariesStrings.ffplay
  */
  trait Component extends StObject
  object Component {
    
    inline def ffmpeg: typings.ffbinaries.ffbinariesStrings.ffmpeg = "ffmpeg".asInstanceOf[typings.ffbinaries.ffbinariesStrings.ffmpeg]
    
    inline def ffplay: typings.ffbinaries.ffbinariesStrings.ffplay = "ffplay".asInstanceOf[typings.ffbinaries.ffbinariesStrings.ffplay]
    
    inline def ffprobe: typings.ffbinaries.ffbinariesStrings.ffprobe = "ffprobe".asInstanceOf[typings.ffbinaries.ffbinariesStrings.ffprobe]
    
    inline def ffserver: typings.ffbinaries.ffbinariesStrings.ffserver = "ffserver".asInstanceOf[typings.ffbinaries.ffbinariesStrings.ffserver]
  }
  
  trait DownloadOptions extends StObject {
    
    /**
      * The path where the binaries will be downloaded to. If not provided it will default to `.`.
      */
    var destination: js.UndefOr[String] = js.undefined
    
    /**
      * Ignore check for existing binaries in the destination and overwrite them if necessary.
      */
    var force: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Defaults to detecting the current platform.
      */
    var platform: js.UndefOr[Platform | Null] = js.undefined
    
    /**
      * Suppress verbose logs.
      */
    var quiet: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A progress-update function, triggered with percentage as argument at an interval until download is completed.
      */
    var tickerFn: js.UndefOr[js.Function1[/* tickData */ Filename, Unit]] = js.undefined
    
    /**
      * Frequency at which the ticker progress updates are issued (in ms; defaults to `1000`).
      */
    var tickerInterval: js.UndefOr[Double] = js.undefined
    
    /**
      * Version of ffmpeg to download.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object DownloadOptions {
    
    inline def apply(): DownloadOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DownloadOptions]
    }
    
    extension [Self <: DownloadOptions](x: Self) {
      
      inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setPlatform(value: Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformNull: Self = StObject.set(x, "platform", null)
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setQuiet(value: Boolean): Self = StObject.set(x, "quiet", value.asInstanceOf[js.Any])
      
      inline def setQuietUndefined: Self = StObject.set(x, "quiet", js.undefined)
      
      inline def setTickerFn(value: /* tickData */ Filename => Unit): Self = StObject.set(x, "tickerFn", js.Any.fromFunction1(value))
      
      inline def setTickerFnUndefined: Self = StObject.set(x, "tickerFn", js.undefined)
      
      inline def setTickerInterval(value: Double): Self = StObject.set(x, "tickerInterval", value.asInstanceOf[js.Any])
      
      inline def setTickerIntervalUndefined: Self = StObject.set(x, "tickerInterval", js.undefined)
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ffbinaries.mod.DownloadResultFileExists
    - typings.ffbinaries.mod.DownloadResultFromCache
    - typings.ffbinaries.mod.DownloadResultClean
  */
  trait DownloadResult extends StObject
  object DownloadResult {
    
    inline def DownloadResultClean(filename: String, path: String, size: String, status: String): typings.ffbinaries.mod.DownloadResultClean = {
      val __obj = js.Dynamic.literal(code = "DONE_CLEAN", filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ffbinaries.mod.DownloadResultClean]
    }
    
    inline def DownloadResultFileExists(filename: String, path: String, status: String): typings.ffbinaries.mod.DownloadResultFileExists = {
      val __obj = js.Dynamic.literal(code = "FILE_EXISTS", filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ffbinaries.mod.DownloadResultFileExists]
    }
    
    inline def DownloadResultFromCache(filename: String, path: String, status: String): typings.ffbinaries.mod.DownloadResultFromCache = {
      val __obj = js.Dynamic.literal(code = "DONE_FROM_CACHE", filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ffbinaries.mod.DownloadResultFromCache]
    }
  }
  
  trait DownloadResultClean
    extends StObject
       with DownloadResult {
    
    var code: DONE_CLEAN
    
    var filename: String
    
    var path: String
    
    var size: String
    
    var status: String
  }
  object DownloadResultClean {
    
    inline def apply(filename: String, path: String, size: String, status: String): DownloadResultClean = {
      val __obj = js.Dynamic.literal(code = "DONE_CLEAN", filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadResultClean]
    }
    
    extension [Self <: DownloadResultClean](x: Self) {
      
      inline def setCode(value: DONE_CLEAN): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadResultFileExists
    extends StObject
       with DownloadResult {
    
    var code: FILE_EXISTS
    
    var filename: String
    
    var path: String
    
    var status: String
  }
  object DownloadResultFileExists {
    
    inline def apply(filename: String, path: String, status: String): DownloadResultFileExists = {
      val __obj = js.Dynamic.literal(code = "FILE_EXISTS", filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadResultFileExists]
    }
    
    extension [Self <: DownloadResultFileExists](x: Self) {
      
      inline def setCode(value: FILE_EXISTS): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait DownloadResultFromCache
    extends StObject
       with DownloadResult {
    
    var code: DONE_FROM_CACHE
    
    var filename: String
    
    var path: String
    
    var status: String
  }
  object DownloadResultFromCache {
    
    inline def apply(filename: String, path: String, status: String): DownloadResultFromCache = {
      val __obj = js.Dynamic.literal(code = "DONE_FROM_CACHE", filename = filename.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[DownloadResultFromCache]
    }
    
    extension [Self <: DownloadResultFromCache](x: Self) {
      
      inline def setCode(value: DONE_FROM_CACHE): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocateBinariesOptions extends StObject {
    
    /** Set executable flag on the file if it's missing */
    var ensureExecutable: js.UndefOr[Boolean] = js.undefined
    
    /** Locations to check first */
    var paths: js.UndefOr[js.Array[String]] = js.undefined
  }
  object LocateBinariesOptions {
    
    inline def apply(): LocateBinariesOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocateBinariesOptions]
    }
    
    extension [Self <: LocateBinariesOptions](x: Self) {
      
      inline def setEnsureExecutable(value: Boolean): Self = StObject.set(x, "ensureExecutable", value.asInstanceOf[js.Any])
      
      inline def setEnsureExecutableUndefined: Self = StObject.set(x, "ensureExecutable", js.undefined)
      
      inline def setPaths(value: js.Array[String]): Self = StObject.set(x, "paths", value.asInstanceOf[js.Any])
      
      inline def setPathsUndefined: Self = StObject.set(x, "paths", js.undefined)
      
      inline def setPathsVarargs(value: String*): Self = StObject.set(x, "paths", js.Array(value*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ffbinaries.mod.LocateResultFound
    - typings.ffbinaries.mod.LocateResultNotFound
  */
  trait LocateResult extends StObject
  object LocateResult {
    
    inline def LocateResultFound(isExecutable: Boolean, path: String, version: String): typings.ffbinaries.mod.LocateResultFound = {
      val __obj = js.Dynamic.literal(found = true, isExecutable = isExecutable.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ffbinaries.mod.LocateResultFound]
    }
    
    inline def LocateResultNotFound(path: Null, version: Null): typings.ffbinaries.mod.LocateResultNotFound = {
      val __obj = js.Dynamic.literal(found = false, isExecutable = false, path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.ffbinaries.mod.LocateResultNotFound]
    }
  }
  
  trait LocateResultFound
    extends StObject
       with LocateResult {
    
    var found: `true`
    
    var isExecutable: Boolean
    
    var path: String
    
    var version: String
  }
  object LocateResultFound {
    
    inline def apply(isExecutable: Boolean, path: String, version: String): LocateResultFound = {
      val __obj = js.Dynamic.literal(found = true, isExecutable = isExecutable.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocateResultFound]
    }
    
    extension [Self <: LocateResultFound](x: Self) {
      
      inline def setFound(value: `true`): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setIsExecutable(value: Boolean): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  trait LocateResultNotFound
    extends StObject
       with LocateResult {
    
    var found: `false`
    
    var isExecutable: `false`
    
    var path: Null
    
    var version: Null
  }
  object LocateResultNotFound {
    
    inline def apply(path: Null, version: Null): LocateResultNotFound = {
      val __obj = js.Dynamic.literal(found = false, isExecutable = false, path = path.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocateResultNotFound]
    }
    
    extension [Self <: LocateResultNotFound](x: Self) {
      
      inline def setFound(value: `false`): Self = StObject.set(x, "found", value.asInstanceOf[js.Any])
      
      inline def setIsExecutable(value: `false`): Self = StObject.set(x, "isExecutable", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Null): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Null): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.ffbinaries.ffbinariesStrings.`osx-64`
    - typings.ffbinaries.ffbinariesStrings.`linux-32`
    - typings.ffbinaries.ffbinariesStrings.`linux-64`
    - typings.ffbinaries.ffbinariesStrings.`linux-armel`
    - typings.ffbinaries.ffbinariesStrings.`linux-armhf`
    - typings.ffbinaries.ffbinariesStrings.`windows-32`
    - typings.ffbinaries.ffbinariesStrings.`windows-64`
  */
  trait Platform extends StObject
  object Platform {
    
    inline def `linux-32`: typings.ffbinaries.ffbinariesStrings.`linux-32` = "linux-32".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`linux-32`]
    
    inline def `linux-64`: typings.ffbinaries.ffbinariesStrings.`linux-64` = "linux-64".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`linux-64`]
    
    inline def `linux-armel`: typings.ffbinaries.ffbinariesStrings.`linux-armel` = "linux-armel".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`linux-armel`]
    
    inline def `linux-armhf`: typings.ffbinaries.ffbinariesStrings.`linux-armhf` = "linux-armhf".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`linux-armhf`]
    
    inline def `osx-64`: typings.ffbinaries.ffbinariesStrings.`osx-64` = "osx-64".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`osx-64`]
    
    inline def `windows-32`: typings.ffbinaries.ffbinariesStrings.`windows-32` = "windows-32".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`windows-32`]
    
    inline def `windows-64`: typings.ffbinaries.ffbinariesStrings.`windows-64` = "windows-64".asInstanceOf[typings.ffbinaries.ffbinariesStrings.`windows-64`]
  }
  
  trait VersionData extends StObject {
    
    var bin: KinPlatformffmpegstringff
    
    var permalink: String
    
    var version: String
  }
  object VersionData {
    
    inline def apply(bin: KinPlatformffmpegstringff, permalink: String, version: String): VersionData = {
      val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], permalink = permalink.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[VersionData]
    }
    
    extension [Self <: VersionData](x: Self) {
      
      inline def setBin(value: KinPlatformffmpegstringff): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setPermalink(value: String): Self = StObject.set(x, "permalink", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
}
