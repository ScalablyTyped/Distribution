package typings.dojo.dojox.av

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/_Media.html
  *
  * Used as a mixin for dojox and AIR media
  * Calculates the current status of the playing media and fires
  * the appropriate events.
  *
  */
@JSGlobal("dojox.av._Media")
@js.native
class Media () extends js.Object {
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
    * The id of this widget and the id of the SWF movie.
    *
    */
  var id: js.Object = js.native
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
    * destroys flash
    *
    */
  def destroy(): Unit = js.native
  /**
    * Returns the current time of the video
    *
    */
  def getTime(): js.Any = js.native
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
  def onDownloaded(percent: Double): Unit = js.native
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
  def onError(data: js.Object, url: String): Unit = js.native
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
    * @param data
    * @param evt
    */
  def onMetaData(data: js.Object, evt: js.Object): Unit = js.native
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
  def onPlay(data: js.Object): Unit = js.native
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
  def onPosition(time: Double): Unit = js.native
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
  def onStart(data: js.Object): Unit = js.native
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
  def onSwfSized(data: js.Object): Unit = js.native
}

