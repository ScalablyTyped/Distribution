package typings.gatsbyTelemetry

import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.gatsbyTelemetry.telemetryMod.IAggregateStats
import typings.gatsbyTelemetry.telemetryMod.IAnalyticsTrackerConstructorParameters
import typings.gatsbyTelemetry.telemetryMod.IDefaultTelemetryTagsPayload
import typings.gatsbyTelemetry.telemetryMod.ITelemetryOptsPayload
import typings.gatsbyTelemetry.telemetryMod.ITelemetryTagsPayload
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-telemetry/lib", "AnalyticsTracker")
  @js.native
  class AnalyticsTracker ()
    extends typings.gatsbyTelemetry.telemetryMod.AnalyticsTracker {
    def this(hasComponentIdGatsbyCliVersionTrackingEnabled: IAnalyticsTrackerConstructorParameters) = this()
  }
  
  @JSImport("gatsby-telemetry/lib", "addSiteMeasurement")
  @js.native
  def addSiteMeasurement(event: String, obj: js.Any): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "aggregateStats")
  @js.native
  def aggregateStats(data: js.Array[Double]): IAggregateStats = js.native
  
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: String): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: String, tags: js.UndefOr[scala.Nothing], opts: ITelemetryOptsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: String, tags: ITelemetryTagsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: String, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: js.Array[String]): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: js.Array[String], tags: js.UndefOr[scala.Nothing], opts: ITelemetryOptsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: js.Array[String], tags: ITelemetryTagsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "captureEvent")
  @js.native
  def captureEvent(input: js.Array[String], tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "decorateEvent")
  @js.native
  def decorateEvent(event: String): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "decorateEvent")
  @js.native
  def decorateEvent(event: String, tags: Record[String, _]): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "expressMiddleware")
  @js.native
  def expressMiddleware(source: String): js.Function3[
    /* req */ Request_[ParamsDictionary, _, _, Query], 
    /* _res */ Response_[_], 
    /* next */ js.Any, 
    Unit
  ] = js.native
  
  @JSImport("gatsby-telemetry/lib", "isTrackingEnabled")
  @js.native
  def isTrackingEnabled(): Boolean = js.native
  
  @JSImport("gatsby-telemetry/lib", "setDefaultComponentId")
  @js.native
  def setDefaultComponentId(componentId: String): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "setDefaultTags")
  @js.native
  def setDefaultTags(tags: IDefaultTelemetryTagsPayload): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "setGatsbyCliVersion")
  @js.native
  def setGatsbyCliVersion(version: String): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "setTelemetryEnabled")
  @js.native
  def setTelemetryEnabled(enabled: Boolean): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "startBackgroundUpdate")
  @js.native
  def startBackgroundUpdate(): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "trackBuildError")
  @js.native
  def trackBuildError(input: String): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackBuildError")
  @js.native
  def trackBuildError(input: String, tags: ITelemetryTagsPayload): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: String): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: String, tags: js.UndefOr[scala.Nothing], opts: ITelemetryOptsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: String, tags: ITelemetryTagsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: String, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: js.Array[String]): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: js.Array[String], tags: js.UndefOr[scala.Nothing], opts: ITelemetryOptsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: js.Array[String], tags: ITelemetryTagsPayload): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackCli")
  @js.native
  def trackCli(input: js.Array[String], tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "trackError")
  @js.native
  def trackError(input: String): Unit = js.native
  @JSImport("gatsby-telemetry/lib", "trackError")
  @js.native
  def trackError(input: String, tags: ITelemetryTagsPayload): Unit = js.native
  
  @JSImport("gatsby-telemetry/lib", "trackFeatureIsUsed")
  @js.native
  def trackFeatureIsUsed(name: String): Unit = js.native
}
