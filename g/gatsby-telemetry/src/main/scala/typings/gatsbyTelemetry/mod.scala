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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("gatsby-telemetry/lib", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("gatsby-telemetry/lib", "AnalyticsTracker")
  @js.native
  class AnalyticsTracker ()
    extends typings.gatsbyTelemetry.telemetryMod.AnalyticsTracker {
    def this(hasComponentIdGatsbyCliVersionTrackingEnabled: IAnalyticsTrackerConstructorParameters) = this()
  }
  
  @scala.inline
  def addSiteMeasurement(event: String, obj: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addSiteMeasurement")(event.asInstanceOf[js.Any], obj.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def aggregateStats(data: js.Array[Double]): IAggregateStats = ^.asInstanceOf[js.Dynamic].applyDynamic("aggregateStats")(data.asInstanceOf[js.Any]).asInstanceOf[IAggregateStats]
  
  @scala.inline
  def captureEvent(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: String, tags: Unit, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: String, tags: ITelemetryTagsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: String, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: js.Array[String], tags: Unit, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: js.Array[String], tags: ITelemetryTagsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def captureEvent(input: js.Array[String], tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("captureEvent")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def decorateEvent(event: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("decorateEvent")(event.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def decorateEvent(event: String, tags: Record[String, js.Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("decorateEvent")(event.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def expressMiddleware(source: String): js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* _res */ Response_[js.Any], 
    /* next */ js.Any, 
    Unit
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("expressMiddleware")(source.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* req */ Request_[ParamsDictionary, js.Any, js.Any, Query], 
    /* _res */ Response_[js.Any], 
    /* next */ js.Any, 
    Unit
  ]]
  
  @scala.inline
  def isTrackingEnabled(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isTrackingEnabled")().asInstanceOf[Boolean]
  
  @scala.inline
  def setDefaultComponentId(componentId: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultComponentId")(componentId.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setDefaultTags(tags: IDefaultTelemetryTagsPayload): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultTags")(tags.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setGatsbyCliVersion(version: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setGatsbyCliVersion")(version.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def setTelemetryEnabled(enabled: Boolean): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setTelemetryEnabled")(enabled.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def startBackgroundUpdate(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("startBackgroundUpdate")().asInstanceOf[Unit]
  
  @scala.inline
  def trackBuildError(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackBuildError")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trackBuildError(input: String, tags: ITelemetryTagsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackBuildError")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def trackCli(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: String, tags: Unit, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: String, tags: ITelemetryTagsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: String, tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: js.Array[String], tags: Unit, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: js.Array[String], tags: ITelemetryTagsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def trackCli(input: js.Array[String], tags: ITelemetryTagsPayload, opts: ITelemetryOptsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackCli")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def trackError(input: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackError")(input.asInstanceOf[js.Any]).asInstanceOf[Unit]
  @scala.inline
  def trackError(input: String, tags: ITelemetryTagsPayload): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trackError")(input.asInstanceOf[js.Any], tags.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @scala.inline
  def trackFeatureIsUsed(name: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("trackFeatureIsUsed")(name.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
