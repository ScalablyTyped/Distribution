package typings
package gapiDotClientDotYoutubeLib.gapiNs.clientNs.youtubeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiveBroadcastContentDetails extends js.Object {
  /** This value uniquely identifies the live stream bound to the broadcast. */
  var boundStreamId: js.UndefOr[java.lang.String] = js.undefined
  /** The date and time that the live stream referenced by boundStreamId was last updated. */
  var boundStreamLastUpdateTimeMs: js.UndefOr[java.lang.String] = js.undefined
  var closedCaptionsType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * This setting indicates whether HTTP POST closed captioning is enabled for this broadcast. The ingestion URL of the closed captions is returned through
    * the liveStreams API. This is mutually exclusive with using the closed_captions_type property, and is equivalent to setting closed_captions_type to
    * CLOSED_CAPTIONS_HTTP_POST.
    */
  var enableClosedCaptions: js.UndefOr[scala.Boolean] = js.undefined
  /** This setting indicates whether YouTube should enable content encryption for the broadcast. */
  var enableContentEncryption: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This setting determines whether viewers can access DVR controls while watching the video. DVR controls enable the viewer to control the video playback
    * experience by pausing, rewinding, or fast forwarding content. The default value for this property is true.
    *
    *
    *
    * Important: You must set the value to true and also set the enableArchive property's value to true if you want to make playback available immediately
    * after the broadcast ends.
    */
  var enableDvr: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This setting indicates whether the broadcast video can be played in an embedded player. If you choose to archive the video (using the enableArchive
    * property), this setting will also apply to the archived video.
    */
  var enableEmbed: js.UndefOr[scala.Boolean] = js.undefined
  /** Indicates whether this broadcast has low latency enabled. */
  var enableLowLatency: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * If both this and enable_low_latency are set, they must match. LATENCY_NORMAL should match enable_low_latency=false LATENCY_LOW should match
    * enable_low_latency=true LATENCY_ULTRA_LOW should have enable_low_latency omitted.
    */
  var latencyPreference: js.UndefOr[java.lang.String] = js.undefined
  var mesh: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The monitorStream object contains information about the monitor stream, which the broadcaster can use to review the event content before the broadcast
    * stream is shown publicly.
    */
  var monitorStream: js.UndefOr[MonitorStreamInfo] = js.undefined
  /** The projection format of this broadcast. This defaults to rectangular. */
  var projection: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Automatically start recording after the event goes live. The default value for this property is true.
    *
    *
    *
    * Important: You must also set the enableDvr property's value to true if you want the playback to be available immediately after the broadcast ends. If
    * you set this property's value to true but do not also set the enableDvr property to true, there may be a delay of around one day before the archived
    * video will be available for playback.
    */
  var recordFromStart: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * This setting indicates whether the broadcast should automatically begin with an in-stream slate when you update the broadcast's status to live. After
    * updating the status, you then need to send a liveCuepoints.insert request that sets the cuepoint's eventState to end to remove the in-stream slate and
    * make your broadcast stream visible to viewers.
    */
  var startWithSlate: js.UndefOr[scala.Boolean] = js.undefined
}

