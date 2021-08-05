package typings.gatsbyTelemetry

import typings.gatsbyTelemetry.anon.BundleStats
import typings.gatsbyTelemetry.anon.Stack
import typings.gatsbyTelemetry.eventStorageMod.EventStorage
import typings.gatsbyTelemetry.repositoryIdMod.IRepositoryId
import typings.std.Record
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object telemetryMod {
  
  @JSImport("gatsby-telemetry/lib/telemetry", "AnalyticsTracker")
  @js.native
  class AnalyticsTracker () extends StObject {
    def this(hasComponentIdGatsbyCliVersionTrackingEnabled: IAnalyticsTrackerConstructorParameters) = this()
    
    def addSiteMeasurement(event: String, obj: js.Any): Unit = js.native
    
    def aggregateStats(data: js.Array[Double]): IAggregateStats = js.native
    
    def buildAndStoreEvent(eventType: String, tags: ITelemetryTagsPayload): Unit = js.native
    
    def captureBuildError(`type`: String): Unit = js.native
    def captureBuildError(`type`: String, tags: ITelemetryTagsPayload): Unit = js.native
    
    def captureError(`type`: String): Unit = js.native
    def captureError(`type`: String, tags: ITelemetryTagsPayload): Unit = js.native
    
    def captureEvent(): Unit = js.native
    def captureEvent(`type`: String): Unit = js.native
    def captureEvent(`type`: String, tags: Unit, opts: ITelemetryOptsPayload): Unit = js.native
    def captureEvent(`type`: String, tags: ITelemetryTagsPayload): Unit = js.native
    def captureEvent(`type`: String, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
    def captureEvent(`type`: js.Array[String]): Unit = js.native
    def captureEvent(`type`: js.Array[String], tags: Unit, opts: ITelemetryOptsPayload): Unit = js.native
    def captureEvent(`type`: js.Array[String], tags: ITelemetryTagsPayload): Unit = js.native
    def captureEvent(`type`: js.Array[String], tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
    def captureEvent(`type`: Unit, tags: Unit, opts: ITelemetryOptsPayload): Unit = js.native
    def captureEvent(`type`: Unit, tags: ITelemetryTagsPayload): Unit = js.native
    def captureEvent(`type`: Unit, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
    
    def captureMetadataEvent(): Unit = js.native
    
    var componentId: String = js.native
    
    var componentVersion: js.UndefOr[String] = js.native
    
    def decorateAll(tags: ITelemetryTagsPayload): Unit = js.native
    
    def decorateNextEvent(event: String, obj: js.Any): Unit = js.native
    
    var features: Set[String] = js.native
    
    def formatErrorAndStoreEvent(eventType: String, tags: ITelemetryTagsPayload): Unit = js.native
    
    var gatsbyCliVersion: js.UndefOr[SemVer] = js.native
    
    def getGatsbyCliVersion(): SemVer = js.native
    
    def getGatsbyVersion(): SemVer = js.native
    
    def getIsTTY(): Boolean = js.native
    
    def getMachineId(): String = js.native
    
    def getOsInfo(): IOSInfo = js.native
    
    def getRepositoryId(): IRepositoryId = js.native
    
    def getSessionId(): String = js.native
    
    def getTagsFromEnv(): Record[String, js.Any] = js.native
    
    var installedGatsbyVersion: js.UndefOr[SemVer] = js.native
    
    def isFinalEvent(event: String): Boolean = js.native
    
    def isTrackingEnabled(): Boolean = js.native
    
    var machineId: String = js.native
    
    var osInfo: js.UndefOr[IOSInfo] = js.native
    
    var repositoryId: js.UndefOr[IRepositoryId] = js.native
    
    def sendEvents(): js.Promise[Boolean] = js.native
    
    var sessionId: String = js.native
    
    def setTelemetryEnabled(enabled: Boolean): Unit = js.native
    
    var siteHash: js.UndefOr[String] = js.native
    
    var store: EventStorage = js.native
    
    def trackActivity(source: String): Unit = js.native
    def trackActivity(source: String, tags: ITelemetryTagsPayload): Unit = js.native
    
    def trackCli(): Unit = js.native
    def trackCli(`type`: String): Unit = js.native
    def trackCli(`type`: String, tags: Unit, opts: ITelemetryOptsPayload): Unit = js.native
    def trackCli(`type`: String, tags: ITelemetryTagsPayload): Unit = js.native
    def trackCli(`type`: String, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
    def trackCli(`type`: js.Array[String]): Unit = js.native
    def trackCli(`type`: js.Array[String], tags: Unit, opts: ITelemetryOptsPayload): Unit = js.native
    def trackCli(`type`: js.Array[String], tags: ITelemetryTagsPayload): Unit = js.native
    def trackCli(`type`: js.Array[String], tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
    def trackCli(`type`: Unit, tags: Unit, opts: ITelemetryOptsPayload): Unit = js.native
    def trackCli(`type`: Unit, tags: ITelemetryTagsPayload): Unit = js.native
    def trackCli(`type`: Unit, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
    
    def trackFeatureIsUsed(name: String): Unit = js.native
    
    var trackingEnabled: js.UndefOr[Boolean] = js.native
  }
  
  trait IAggregateStats extends StObject {
    
    var count: Double
    
    var max: Double
    
    var mean: Double
    
    var median: Double
    
    var min: Double
    
    var skewness: Double
    
    var stdDev: Double
    
    var sum: Double
  }
  object IAggregateStats {
    
    inline def apply(
      count: Double,
      max: Double,
      mean: Double,
      median: Double,
      min: Double,
      skewness: Double,
      stdDev: Double,
      sum: Double
    ): IAggregateStats = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], skewness = skewness.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], sum = sum.asInstanceOf[js.Any])
      __obj.asInstanceOf[IAggregateStats]
    }
    
    extension [Self <: IAggregateStats](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      inline def setMedian(value: Double): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setSkewness(value: Double): Self = StObject.set(x, "skewness", value.asInstanceOf[js.Any])
      
      inline def setStdDev(value: Double): Self = StObject.set(x, "stdDev", value.asInstanceOf[js.Any])
      
      inline def setSum(value: Double): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    }
  }
  
  trait IAnalyticsTrackerConstructorParameters extends StObject {
    
    var componentId: js.UndefOr[SemVer] = js.undefined
    
    var gatsbyCliVersion: js.UndefOr[SemVer] = js.undefined
    
    var trackingEnabled: js.UndefOr[Boolean] = js.undefined
  }
  object IAnalyticsTrackerConstructorParameters {
    
    inline def apply(): IAnalyticsTrackerConstructorParameters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IAnalyticsTrackerConstructorParameters]
    }
    
    extension [Self <: IAnalyticsTrackerConstructorParameters](x: Self) {
      
      inline def setComponentId(value: SemVer): Self = StObject.set(x, "componentId", value.asInstanceOf[js.Any])
      
      inline def setComponentIdUndefined: Self = StObject.set(x, "componentId", js.undefined)
      
      inline def setGatsbyCliVersion(value: SemVer): Self = StObject.set(x, "gatsbyCliVersion", value.asInstanceOf[js.Any])
      
      inline def setGatsbyCliVersionUndefined: Self = StObject.set(x, "gatsbyCliVersion", js.undefined)
      
      inline def setTrackingEnabled(value: Boolean): Self = StObject.set(x, "trackingEnabled", value.asInstanceOf[js.Any])
      
      inline def setTrackingEnabledUndefined: Self = StObject.set(x, "trackingEnabled", js.undefined)
    }
  }
  
  trait IDefaultTelemetryTagsPayload
    extends StObject
       with ITelemetryTagsPayload {
    
    var gatsbyCliVersion: js.UndefOr[SemVer] = js.undefined
    
    var installedGatsbyVersion: js.UndefOr[SemVer] = js.undefined
  }
  object IDefaultTelemetryTagsPayload {
    
    inline def apply(): IDefaultTelemetryTagsPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IDefaultTelemetryTagsPayload]
    }
    
    extension [Self <: IDefaultTelemetryTagsPayload](x: Self) {
      
      inline def setGatsbyCliVersion(value: SemVer): Self = StObject.set(x, "gatsbyCliVersion", value.asInstanceOf[js.Any])
      
      inline def setGatsbyCliVersionUndefined: Self = StObject.set(x, "gatsbyCliVersion", js.undefined)
      
      inline def setInstalledGatsbyVersion(value: SemVer): Self = StObject.set(x, "installedGatsbyVersion", value.asInstanceOf[js.Any])
      
      inline def setInstalledGatsbyVersionUndefined: Self = StObject.set(x, "installedGatsbyVersion", js.undefined)
    }
  }
  
  trait IOSInfo extends StObject {
    
    var arch: String
    
    var ci: js.UndefOr[Boolean] = js.undefined
    
    var ciName: String | Null
    
    var cpus: js.UndefOr[String] = js.undefined
    
    var docker: js.UndefOr[Boolean] = js.undefined
    
    var isTTY: Boolean
    
    var nodeVersion: SemVer
    
    var platform: String
    
    var release: String
    
    var termProgram: js.UndefOr[String] = js.undefined
  }
  object IOSInfo {
    
    inline def apply(arch: String, isTTY: Boolean, nodeVersion: SemVer, platform: String, release: String): IOSInfo = {
      val __obj = js.Dynamic.literal(arch = arch.asInstanceOf[js.Any], isTTY = isTTY.asInstanceOf[js.Any], nodeVersion = nodeVersion.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], release = release.asInstanceOf[js.Any], ciName = null)
      __obj.asInstanceOf[IOSInfo]
    }
    
    extension [Self <: IOSInfo](x: Self) {
      
      inline def setArch(value: String): Self = StObject.set(x, "arch", value.asInstanceOf[js.Any])
      
      inline def setCi(value: Boolean): Self = StObject.set(x, "ci", value.asInstanceOf[js.Any])
      
      inline def setCiName(value: String): Self = StObject.set(x, "ciName", value.asInstanceOf[js.Any])
      
      inline def setCiNameNull: Self = StObject.set(x, "ciName", null)
      
      inline def setCiUndefined: Self = StObject.set(x, "ci", js.undefined)
      
      inline def setCpus(value: String): Self = StObject.set(x, "cpus", value.asInstanceOf[js.Any])
      
      inline def setCpusUndefined: Self = StObject.set(x, "cpus", js.undefined)
      
      inline def setDocker(value: Boolean): Self = StObject.set(x, "docker", value.asInstanceOf[js.Any])
      
      inline def setDockerUndefined: Self = StObject.set(x, "docker", js.undefined)
      
      inline def setIsTTY(value: Boolean): Self = StObject.set(x, "isTTY", value.asInstanceOf[js.Any])
      
      inline def setNodeVersion(value: SemVer): Self = StObject.set(x, "nodeVersion", value.asInstanceOf[js.Any])
      
      inline def setPlatform(value: String): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setRelease(value: String): Self = StObject.set(x, "release", value.asInstanceOf[js.Any])
      
      inline def setTermProgram(value: String): Self = StObject.set(x, "termProgram", value.asInstanceOf[js.Any])
      
      inline def setTermProgramUndefined: Self = StObject.set(x, "termProgram", js.undefined)
    }
  }
  
  trait IStructuredError extends StObject {
    
    var code: js.UndefOr[String] = js.undefined
    
    var context: js.UndefOr[js.Any] = js.undefined
    
    var error: js.UndefOr[Stack] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var text: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IStructuredError {
    
    inline def apply(text: String): IStructuredError = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuredError]
    }
    
    extension [Self <: IStructuredError](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
      
      inline def setContext(value: js.Any): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setError(value: Stack): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait IStructuredErrorV2 extends StObject {
    
    var context: js.UndefOr[String] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var level: js.UndefOr[String] = js.undefined
    
    var stack: js.UndefOr[String] = js.undefined
    
    var text: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object IStructuredErrorV2 {
    
    inline def apply(text: String): IStructuredErrorV2 = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[IStructuredErrorV2]
    }
    
    extension [Self <: IStructuredErrorV2](x: Self) {
      
      inline def setContext(value: String): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLevel(value: String): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
      
      inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
      
      inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
      
      inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ITelemetryOptsPayload extends StObject {
    
    var debounce: js.UndefOr[Boolean] = js.undefined
  }
  object ITelemetryOptsPayload {
    
    inline def apply(): ITelemetryOptsPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITelemetryOptsPayload]
    }
    
    extension [Self <: ITelemetryOptsPayload](x: Self) {
      
      inline def setDebounce(value: Boolean): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
    }
  }
  
  trait ITelemetryTagsPayload extends StObject {
    
    var cacheStatus: js.UndefOr[String] = js.undefined
    
    var dependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var devDependencies: js.UndefOr[js.Array[String]] = js.undefined
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[IStructuredError | js.Array[IStructuredError]] = js.undefined
    
    var errorV2: js.UndefOr[IStructuredErrorV2] = js.undefined
    
    var exitCode: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var pathname: js.UndefOr[String] = js.undefined
    
    var pluginCachePurged: js.UndefOr[String] = js.undefined
    
    var pluginName: js.UndefOr[String] = js.undefined
    
    var plugins: js.UndefOr[js.Array[String]] = js.undefined
    
    var siteHash: js.UndefOr[String] = js.undefined
    
    var siteMeasurements: js.UndefOr[BundleStats] = js.undefined
    
    var siteName: js.UndefOr[String] = js.undefined
    
    var starterName: js.UndefOr[String] = js.undefined
    
    var uiSource: js.UndefOr[String] = js.undefined
    
    var userAgent: js.UndefOr[String] = js.undefined
    
    var valid: js.UndefOr[Boolean] = js.undefined
    
    var valueInteger: js.UndefOr[Double] = js.undefined
    
    var valueString: js.UndefOr[String] = js.undefined
    
    var valueStringArray: js.UndefOr[js.Array[String]] = js.undefined
  }
  object ITelemetryTagsPayload {
    
    inline def apply(): ITelemetryTagsPayload = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ITelemetryTagsPayload]
    }
    
    extension [Self <: ITelemetryTagsPayload](x: Self) {
      
      inline def setCacheStatus(value: String): Self = StObject.set(x, "cacheStatus", value.asInstanceOf[js.Any])
      
      inline def setCacheStatusUndefined: Self = StObject.set(x, "cacheStatus", js.undefined)
      
      inline def setDependencies(value: js.Array[String]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
      
      inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
      
      inline def setDependenciesVarargs(value: String*): Self = StObject.set(x, "dependencies", js.Array(value :_*))
      
      inline def setDevDependencies(value: js.Array[String]): Self = StObject.set(x, "devDependencies", value.asInstanceOf[js.Any])
      
      inline def setDevDependenciesUndefined: Self = StObject.set(x, "devDependencies", js.undefined)
      
      inline def setDevDependenciesVarargs(value: String*): Self = StObject.set(x, "devDependencies", js.Array(value :_*))
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setError(value: IStructuredError | js.Array[IStructuredError]): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setErrorV2(value: IStructuredErrorV2): Self = StObject.set(x, "errorV2", value.asInstanceOf[js.Any])
      
      inline def setErrorV2Undefined: Self = StObject.set(x, "errorV2", js.undefined)
      
      inline def setErrorVarargs(value: IStructuredError*): Self = StObject.set(x, "error", js.Array(value :_*))
      
      inline def setExitCode(value: Double): Self = StObject.set(x, "exitCode", value.asInstanceOf[js.Any])
      
      inline def setExitCodeUndefined: Self = StObject.set(x, "exitCode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPathname(value: String): Self = StObject.set(x, "pathname", value.asInstanceOf[js.Any])
      
      inline def setPathnameUndefined: Self = StObject.set(x, "pathname", js.undefined)
      
      inline def setPluginCachePurged(value: String): Self = StObject.set(x, "pluginCachePurged", value.asInstanceOf[js.Any])
      
      inline def setPluginCachePurgedUndefined: Self = StObject.set(x, "pluginCachePurged", js.undefined)
      
      inline def setPluginName(value: String): Self = StObject.set(x, "pluginName", value.asInstanceOf[js.Any])
      
      inline def setPluginNameUndefined: Self = StObject.set(x, "pluginName", js.undefined)
      
      inline def setPlugins(value: js.Array[String]): Self = StObject.set(x, "plugins", value.asInstanceOf[js.Any])
      
      inline def setPluginsUndefined: Self = StObject.set(x, "plugins", js.undefined)
      
      inline def setPluginsVarargs(value: String*): Self = StObject.set(x, "plugins", js.Array(value :_*))
      
      inline def setSiteHash(value: String): Self = StObject.set(x, "siteHash", value.asInstanceOf[js.Any])
      
      inline def setSiteHashUndefined: Self = StObject.set(x, "siteHash", js.undefined)
      
      inline def setSiteMeasurements(value: BundleStats): Self = StObject.set(x, "siteMeasurements", value.asInstanceOf[js.Any])
      
      inline def setSiteMeasurementsUndefined: Self = StObject.set(x, "siteMeasurements", js.undefined)
      
      inline def setSiteName(value: String): Self = StObject.set(x, "siteName", value.asInstanceOf[js.Any])
      
      inline def setSiteNameUndefined: Self = StObject.set(x, "siteName", js.undefined)
      
      inline def setStarterName(value: String): Self = StObject.set(x, "starterName", value.asInstanceOf[js.Any])
      
      inline def setStarterNameUndefined: Self = StObject.set(x, "starterName", js.undefined)
      
      inline def setUiSource(value: String): Self = StObject.set(x, "uiSource", value.asInstanceOf[js.Any])
      
      inline def setUiSourceUndefined: Self = StObject.set(x, "uiSource", js.undefined)
      
      inline def setUserAgent(value: String): Self = StObject.set(x, "userAgent", value.asInstanceOf[js.Any])
      
      inline def setUserAgentUndefined: Self = StObject.set(x, "userAgent", js.undefined)
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValidUndefined: Self = StObject.set(x, "valid", js.undefined)
      
      inline def setValueInteger(value: Double): Self = StObject.set(x, "valueInteger", value.asInstanceOf[js.Any])
      
      inline def setValueIntegerUndefined: Self = StObject.set(x, "valueInteger", js.undefined)
      
      inline def setValueString(value: String): Self = StObject.set(x, "valueString", value.asInstanceOf[js.Any])
      
      inline def setValueStringArray(value: js.Array[String]): Self = StObject.set(x, "valueStringArray", value.asInstanceOf[js.Any])
      
      inline def setValueStringArrayUndefined: Self = StObject.set(x, "valueStringArray", js.undefined)
      
      inline def setValueStringArrayVarargs(value: String*): Self = StObject.set(x, "valueStringArray", js.Array(value :_*))
      
      inline def setValueStringUndefined: Self = StObject.set(x, "valueString", js.undefined)
    }
  }
  
  type SemVer = String
}
