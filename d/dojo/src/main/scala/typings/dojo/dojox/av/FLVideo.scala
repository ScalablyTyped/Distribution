package typings.dojo.dojox.av

import typings.dojo.AnonUnwatch
import typings.dojo.dijit.Widget
import typings.dojo.dojoStrings.allowFullScreen
import typings.dojo.dojoStrings.allowNetworking
import typings.dojo.dojoStrings.allowScriptAccess
import typings.dojo.dojoStrings.autoPlay
import typings.dojo.dojoStrings.bufferTime
import typings.dojo.dojoStrings.flashMedia
import typings.dojo.dojoStrings.initialVolume
import typings.dojo.dojoStrings.isDebug
import typings.dojo.dojoStrings.mediaUrl
import typings.dojo.dojoStrings.minBufferTime
import typings.dojo.dojoStrings.percentDownloaded
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.updateTime
import typings.dojo.dojoStrings.wmode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/FLVideo.html
  *
  * Inserts a Flash FLV video into the HTML page and provides methods
  * and events for controlling the video. Also plays the H264/M4V codec
  * with a little trickery: change the '.M4V' extension to '.flv'.
  *
  * @param options
  */
/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.dojo.dojox.av.Media because Inheritance from two classes. Inlined allowFullScreen, allowNetworking, allowScriptAccess, autoPlay, bufferTime, flashMedia, initialVolume, isDebug, mediaUrl, minBufferTime, percentDownloaded, updateTime, wmode, destroy, getTime, onBuffer, onClick, onDownloaded, onEnd, onError, onLoad, onMetaData, onPause, onPlay, onPlayerStatus, onPosition, onResize, onStart, onStatus, onStop, onSwfSized */ @JSGlobal("dojox.av.FLVideo")
@js.native
class FLVideo protected () extends Widget {
  def this(options: js.Object) = this()
  /**
    * Whether to allow the SWF to go to fullscreen
    *
    */
  var allowFullScreen: Boolean = js.native
  /**
    * Whether SWF is restricted to a domain
    *
    */
  var allowNetworking: String = js.native
  /**
    * Whether the SWF can access the container JS
    *
    */
  var allowScriptAccess: String = js.native
  /**
    * Whether the video automatically plays on load or not.
    *
    */
  var autoPlay: js.Object = js.native
  /**
    * Time in milliseconds that the video should be loaded before it will
    * play. May pause and resume to build up buffer. Prevents stuttering.
    *
    * Note: Older FLVs, without a duration, cannot be buffered.
    *
    */
  var bufferTime: js.Object = js.native
  /**
    * The SWF object. Methods are passed to this.
    *
    */
  var flashMedia: js.Object = js.native
  /**
    * The initial volume setting of the player. Acccepts between 0 and 1.
    *
    */
  var initialVolume: js.Object = js.native
  /**
    * Setting to true tells the SWF to output log messages to Firebug.
    *
    */
  var isDebug: js.Object = js.native
  /**
    *
    */
  var mediaUrl: String = js.native
  /**
    * Time in milliseconds between the playhead time and loaded time that
    * will trigger the buffer. When buffer is triggered, video will pause
    * until the bufferTime amount is buffered.
    * Note: Should be a small number, greater than zero.
    *
    */
  var minBufferTime: Double = js.native
  /**
    * The percentage the media has downloaded; from 0-100
    *
    */
  var percentDownloaded: Double = js.native
  /**
    * HTML style attributes as cssText string or name/value hash
    *
    */
  @JSName("style")
  var style_FLVideo: String = js.native
  /**
    * How often, in milliseconds to get an update of the video position.
    *
    */
  var updateTime: Double = js.native
  /**
    * The render type of the SWF
    *
    */
  var wmode: String = js.native
  /**
    * Returns the current time of the video
    *
    */
  def getTime(): js.Any = js.native
  @JSName("get")
  def get_allowFullScreen(property: allowFullScreen): Boolean = js.native
  @JSName("get")
  def get_allowNetworking(property: allowNetworking): String = js.native
  @JSName("get")
  def get_allowScriptAccess(property: allowScriptAccess): String = js.native
  @JSName("get")
  def get_autoPlay(property: autoPlay): js.Object = js.native
  @JSName("get")
  def get_bufferTime(property: bufferTime): js.Object = js.native
  @JSName("get")
  def get_flashMedia(property: flashMedia): js.Object = js.native
  @JSName("get")
  def get_initialVolume(property: initialVolume): js.Object = js.native
  @JSName("get")
  def get_isDebug(property: isDebug): js.Object = js.native
  @JSName("get")
  def get_mediaUrl(property: mediaUrl): String = js.native
  @JSName("get")
  def get_minBufferTime(property: minBufferTime): Double = js.native
  @JSName("get")
  def get_percentDownloaded(property: percentDownloaded): Double = js.native
  @JSName("get")
  def get_updateTime(property: updateTime): Double = js.native
  @JSName("get")
  def get_wmode(property: wmode): String = js.native
  /**
    * Fires a boolean to tell if media
    * is paused for buffering or if buffering
    * has finished
    *
    * @param isBuffering
    */
  def onBuffer(isBuffering: js.Any): Unit = js.native
  /**
    * Fires a boolean to tell if media
    * is paused for buffering or if buffering
    * has finished
    *
    * @param isBuffering
    */
  def onBuffer(isBuffering: Boolean): Unit = js.native
  /**
    * Fires when the player is clicked
    * Could be used to toggle play/pause, or
    * do an external activity, like opening a new
    * window.
    *
    * @param evt
    */
  def onClick(evt: js.Object): Unit = js.native
  /**
    * Fires the amount of that the media has been
    * downloaded. Number, 0-100
    *
    * @param percent
    */
  def onDownloaded(percent: js.Any): Unit = js.native
  /**
    * Fires the amount of that the media has been
    * downloaded. Number, 0-100
    *
    * @param percent
    */
  def onDownloaded(percent: Double): Unit = js.native
  /**
    * Fires when video ends
    * Could be used to change pause button to play
    * or show a post video graphic, like YouTube
    *
    * @param data
    */
  def onEnd(data: js.Any): Unit = js.native
  /**
    * Fires when video ends
    * Could be used to change pause button to play
    * or show a post video graphic, like YouTube
    *
    * @param data
    */
  def onEnd(data: js.Object): Unit = js.native
  /**
    * Fired when the player encounters an error
    *
    * @param data
    * @param url
    */
  def onError(data: js.Any, url: js.Any): Unit = js.native
  /**
    * Fired when the player encounters an error
    *
    * @param data
    * @param url
    */
  def onError(data: js.Object, url: String): Unit = js.native
  /**
    * Fired when the SWF player has loaded
    * NOT when the video has loaded
    *
    * @param mov
    */
  def onLoad(mov: js.Any): Unit = js.native
  /**
    * Fired when the SWF player has loaded
    * NOT when the video has loaded
    *
    * @param mov
    */
  def onLoad(mov: js.Object): Unit = js.native
  /**
    * The video properties. Width, height, duration, etc.
    *
    * NOTE: if data is empty, this is an older FLV with no meta data.
    * Duration cannot be determined. In original FLVs, duration
    * could only be obtained with Flash Media Server.
    *
    * NOTE: Older FLVs can still return width and height
    * and will do so on a second event call
    *
    * @param data
    * @param evt
    */
  def onMetaData(data: js.Any, evt: js.Any): Unit = js.native
  /**
    * The video properties. Width, height, duration, etc.
    *
    * @param data
    * @param evt
    */
  def onMetaData(data: js.Object, evt: js.Object): Unit = js.native
  /**
    * Fires when the pause button is clicked
    *
    * @param data
    */
  def onPause(data: js.Any): Unit = js.native
  /**
    * Fires when the pause button is clicked
    *
    * @param data
    */
  def onPause(data: js.Object): Unit = js.native
  /**
    * Fires when video starts and resumes
    *
    * @param data
    */
  def onPlay(data: js.Any): Unit = js.native
  /**
    * Fires when video starts and resumes
    *
    * @param data
    */
  def onPlay(data: js.Object): Unit = js.native
  /**
    * The status of the video from the SWF
    * playing, stopped, bufering, etc.
    *
    * @param data
    */
  def onPlayerStatus(data: js.Any): Unit = js.native
  /**
    * The status of the video from the SWF
    * playing, stopped, bufering, etc.
    *
    * @param data
    */
  def onPlayerStatus(data: js.Object): Unit = js.native
  /**
    * The position of the playhead in seconds
    *
    * @param time
    */
  def onPosition(time: js.Any): Unit = js.native
  /**
    * The position of the playhead in seconds
    *
    * @param time
    */
  def onPosition(time: Double): Unit = js.native
  /**
    * Fired on page resize
    *
    */
  /**
    *
    */
  def onResize(): Unit = js.native
  /**
    * Fires when video starts
    * Good for setting the play button to pause
    * during an autoPlay for example
    *
    * @param data
    */
  def onStart(data: js.Any): Unit = js.native
  /**
    * Fires when video starts
    * Good for setting the play button to pause
    * during an autoPlay for example
    *
    * @param data
    */
  def onStart(data: js.Object): Unit = js.native
  /**
    * Simple status
    *
    * @param data
    */
  def onStatus(data: js.Any): Unit = js.native
  /**
    * Simple status
    *
    * @param data
    */
  def onStatus(data: js.Object): Unit = js.native
  /**
    * Fire when the Stop button is clicked
    *
    */
  def onStop(): Unit = js.native
  /**
    * Fired on SWF resize, or when its
    * toggled between fullscreen.
    *
    * @param data
    */
  def onSwfSized(data: js.Any): Unit = js.native
  /**
    * Fired on SWF resize, or when its
    * toggled between fullscreen.
    *
    * @param data
    */
  def onSwfSized(data: js.Object): Unit = js.native
  /**
    * Pauses the video
    *
    */
  def pause(): Unit = js.native
  /**
    * Plays the video. If an url is passed in, plays the new link.
    *
    * @param newUrl               Optional
    */
  def play(newUrl: String): Unit = js.native
  /**
    * Goes to the time passed in the argument
    *
    * @param time
    */
  def seek(time: Double): Unit = js.native
  @JSName("set")
  def set_allowFullScreen(property: allowFullScreen, value: Boolean): Unit = js.native
  @JSName("set")
  def set_allowNetworking(property: allowNetworking, value: String): Unit = js.native
  @JSName("set")
  def set_allowScriptAccess(property: allowScriptAccess, value: String): Unit = js.native
  @JSName("set")
  def set_autoPlay(property: autoPlay, value: js.Object): Unit = js.native
  @JSName("set")
  def set_bufferTime(property: bufferTime, value: js.Object): Unit = js.native
  @JSName("set")
  def set_flashMedia(property: flashMedia, value: js.Object): Unit = js.native
  @JSName("set")
  def set_initialVolume(property: initialVolume, value: js.Object): Unit = js.native
  @JSName("set")
  def set_isDebug(property: isDebug, value: js.Object): Unit = js.native
  @JSName("set")
  def set_mediaUrl(property: mediaUrl, value: String): Unit = js.native
  @JSName("set")
  def set_minBufferTime(property: minBufferTime, value: Double): Unit = js.native
  @JSName("set")
  def set_percentDownloaded(property: percentDownloaded, value: Double): Unit = js.native
  @JSName("set")
  def set_style(property: style, value: String): Unit = js.native
  @JSName("set")
  def set_updateTime(property: updateTime, value: Double): Unit = js.native
  @JSName("set")
  def set_wmode(property: wmode, value: String): Unit = js.native
  /**
    * Sets the volume of the video to the time in the
    *
    * @param vol between 0 - 1.
    */
  def volume(vol: Double): js.Any = js.native
  @JSName("watch")
  def watch_allowFullScreen(
    property: allowFullScreen,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Boolean], 
      /* newValue */ js.UndefOr[Boolean], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_allowNetworking(
    property: allowNetworking,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_allowScriptAccess(
    property: allowScriptAccess,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_autoPlay(
    property: autoPlay,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_bufferTime(
    property: bufferTime,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_flashMedia(
    property: flashMedia,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_initialVolume(
    property: initialVolume,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_isDebug(
    property: isDebug,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[js.Object], 
      /* newValue */ js.UndefOr[js.Object], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_mediaUrl(
    property: mediaUrl,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_minBufferTime(
    property: minBufferTime,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_percentDownloaded(
    property: percentDownloaded,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_updateTime(
    property: updateTime,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[Double], 
      /* newValue */ js.UndefOr[Double], 
      Unit
    ]
  ): AnonUnwatch = js.native
  @JSName("watch")
  def watch_wmode(
    property: wmode,
    callback: js.Function3[
      /* property */ js.UndefOr[String], 
      /* oldValue */ js.UndefOr[String], 
      /* newValue */ js.UndefOr[String], 
      Unit
    ]
  ): AnonUnwatch = js.native
}

