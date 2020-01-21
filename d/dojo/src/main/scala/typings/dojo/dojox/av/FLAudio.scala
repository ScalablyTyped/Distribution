package typings.dojo.dojox.av

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/FLAudio.html
  *
  * Play MP3 files through the Flash SWF built in the
  * DEFT project.
  * This class is brand new, so there is a lot of
  * functionality not yet available. The initial
  * purpose is for playing "event" sounds like button
  * clicks, and for loading and controlling multiple
  * sounds at once. As of yet, streaming is not supported
  * and polling the sounds for events during playback
  * may still be missing information. Markup is not
  * supported, as it may not be needed.
  *
  * TODO:
  * Streaming, playback events, crossdomain, CDN support,
  * (alternate SWF location), global volume, ID3 tag,
  * factor out doLater, onLoadStatus needs work,
  * play(position) / seek()
  *
  * @param options
  */
@JSGlobal("dojox.av.FLAudio")
@js.native
class FLAudio protected () extends js.Object {
  def this(options: js.Object) = this()
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
    * The id of this widget and the id of the SWF movie.
    *
    */
  var id: js.Object = js.native
  /**
    * From -1 to 1 (-1 is left, 1 is right, 0 is middle)
    * Sets pan for all files unless changed with play
    * or setPan
    *
    */
  var initialPan: Double = js.native
  /**
    * From 0-1
    * Sets volume for all files unless changed with doPlay
    * or setVolume
    *
    */
  var initialVolume: Double = js.native
  /**
    * Setting to true tells the SWF to output log messages to Firebug.
    *
    */
  var isDebug: js.Object = js.native
  /**
    * How often in milliseconds that the status of the
    * player is checked - both load and play
    *
    */
  var statusInterval: Double = js.native
  /**
    * destroys flash
    *
    */
  def destroy(): Unit = js.native
  /**
    * Tell media to play, based on
    * the options passed.
    *
    * @param options volume: Number:  Sets the volumepan: Number:  Sets left/right panindex:Number OR id:String OR url:String:  Choose one of the above to identify  the media you wish to control. id is  set by you. index is the order in which  media was added (zero based)  NOTE: lack of an identifier will default  to first (or only) item.
    */
  def doPlay(options: js.Object): Unit = js.native
  /**
    * Set media pan, based on identifier in
    * the options passed.
    *
    * @param options index:Number OR id:String OR url:String.See doPlay().
    */
  def getPan(options: js.Object): js.Any = js.native
  /**
    * Get the current time.
    *
    * @param options index:Number OR id:String OR url:String.See doPlay().
    */
  def getPosition(options: js.Object): js.Any = js.native
  /**
    * Get media volume, based on identifier in
    * the options passed.
    *
    * @param options index:Number OR id:String OR url:String.See doPlay().
    */
  def getVolume(options: js.Object): js.Any = js.native
  /**
    * Initialize the media.
    *
    */
  def init(): Unit = js.native
  /**
    * Adds a media object to the playlist
    * *This can be called repeatedly to add multiple items.
    *
    * @param options url: String:  (required) path to MP3 media  url must be absolute or relative to SWF,  not dojo or the html. An effort will be made  to fix incorrect paths.id: String:  (optional) an identifier to later determine  which media to control.
    */
  def load(options: js.Object): js.Any = js.native
  /**
    * stub fired
    *
    */
  def onAllLoaded(): Unit = js.native
  /**
    * Fired at the end of a media file.
    *
    * @param events
    */
  def onComplete(events: js.Array[_]): Unit = js.native
  /**
    * stub fired when an error occurs
    *
    * @param msg
    */
  def onError(msg: js.Any): Unit = js.native
  /**
    * Fired when the ID3 data is received.
    *
    * @param evt
    */
  def onID3(evt: js.Any): Unit = js.native
  /**
    * stub fired when SWF is ready
    *
    */
  def onLoad(): Unit = js.native
  /**
    *
    * @param events
    */
  def onLoadStatus(events: js.Array[_]): Unit = js.native
  /**
    *
    * @param events
    */
  def onPlayStatus(events: js.Array[_]): Unit = js.native
  /**
    * Tell media to pause, based on identifier in
    * the options passed.
    *
    * @param options index:Number OR id:String OR url:String.See doPlay().
    */
  def pause(options: js.Object): Unit = js.native
  /**
    * Set media pan, based on identifier in
    * the options passed.
    *
    * @param options pan:Number (from -1 to 1)index:Number OR id:String OR url:String (see doPlay())
    */
  def setPan(options: js.Object): Unit = js.native
  /**
    * Set media volume, based on identifier in
    * the options passed.
    *
    * @param options volume: Number0 to 1index:Number OR id:String OR url:String.See doPlay().
    */
  def setVolume(options: js.Object): Unit = js.native
  /**
    * Tell media to stop, based on identifier in
    * the options passed.
    *
    * @param options index:Number OR id:String OR url:String.See doPlay().
    */
  def stop(options: js.Object): Unit = js.native
}

