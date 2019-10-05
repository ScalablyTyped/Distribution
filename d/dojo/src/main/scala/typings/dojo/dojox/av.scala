package typings.dojo.dojox

import typings.dojo.Anon_Unwatch
import typings.dojo.Fn_NewValue
import typings.dojo.Fn_NewValueOldValue
import typings.dojo.Fn_NewValueOldValueProperty
import typings.dojo.Fn_NewValueOldValuePropertyNumber
import typings.dojo.dijit._Widget
import typings.dojo.dojoStrings.allowFullScreen
import typings.dojo.dojoStrings.allowNetworking
import typings.dojo.dojoStrings.allowScriptAccess
import typings.dojo.dojoStrings.attachScope
import typings.dojo.dojoStrings.autoPlay
import typings.dojo.dojoStrings.bufferTime
import typings.dojo.dojoStrings.flashMedia
import typings.dojo.dojoStrings.initialVolume
import typings.dojo.dojoStrings.isDebug
import typings.dojo.dojoStrings.mediaUrl
import typings.dojo.dojoStrings.minBufferTime
import typings.dojo.dojoStrings.percentDownloaded
import typings.dojo.dojoStrings.playerWidth
import typings.dojo.dojoStrings.searchContainerNode
import typings.dojo.dojoStrings.style
import typings.dojo.dojoStrings.templatePath
import typings.dojo.dojoStrings.templateString
import typings.dojo.dojoStrings.updateTime
import typings.dojo.dojoStrings.widgetsInTemplate
import typings.dojo.dojoStrings.wmode
import typings.std.Event
import typings.std.HTMLDocument
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.av")
@js.native
object av extends js.Object {
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
  - typings.dojo.dojox.av._Media because Inheritance from two classes. Inlined allowFullScreen, allowNetworking, allowScriptAccess, autoPlay, bufferTime, flashMedia, initialVolume, isDebug, mediaUrl, minBufferTime, percentDownloaded, updateTime, wmode, destroy, getTime, onBuffer, onClick, onDownloaded, onEnd, onError, onLoad, onMetaData, onPause, onPlay, onPlayerStatus, onPosition, onResize, onStart, onStatus, onStop, onSwfSized */ @js.native
  class FLVideo protected () extends _Widget {
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
    def watch_allowFullScreen(property: allowFullScreen, callback: Fn_NewValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_allowNetworking(property: allowNetworking, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_allowScriptAccess(property: allowScriptAccess, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_autoPlay(property: autoPlay, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_bufferTime(property: bufferTime, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_flashMedia(property: flashMedia, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_initialVolume(property: initialVolume, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_isDebug(property: isDebug, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_mediaUrl(property: mediaUrl, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_minBufferTime(property: minBufferTime, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_percentDownloaded(property: percentDownloaded, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_updateTime(property: updateTime, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
    @JSName("watch")
    def watch_wmode(property: wmode, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/_Media.html
    *
    * Used as a mixin for dojox and AIR media
    * Calculates the current status of the playing media and fires
    * the appropriate events.
    *
    */
  @js.native
  class _Media () extends js.Object {
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
  
  @js.native
  object widget extends js.Object {
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/widget/PlayButton.html
      *
      * A Play/Pause button widget to use with dojox.av.widget.Player
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class PlayButton () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_PlayButton: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        * 
        * @param templateString The template             
        * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
        * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
        */
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      /**
        * Fired on play or pause click.
        *
        */
      def onClick(): Unit = js.native
      /**
        * Fired on pause click.
        *
        */
      def onPause(): Unit = js.native
      /**
        * Fired on play click.
        *
        */
      def onPlay(): Unit = js.native
      /**
        * A common method to set the media in all Player widgets.
        * May do connections and initializations.
        *
        * @param med
        */
      def setMedia(med: js.Object): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      /**
        * Toggles the play button invisible and the pause
        * button visible.
        *
        */
      def showPause(): Unit = js.native
      /**
        * Toggles the pause button invisible and the play
        * button visible..
        *
        */
      def showPlay(): Unit = js.native
      @JSName("watch")
      def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/widget/Player.html
      *
      * A Media Player UI widget for all types of dojox.av and AIR media.
      * Currently for markup only. All controls should reside as child
      * nodes within the Player node. 'controlType' is used to determine
      * the placement of the control. If no type or an unrecognized type
      * is used, it will be left-aligned in the same row as the volume.
      *
      * Note:
      * Be sure to use 'controlType' as a node attribute. It is not a
      * property of the widget.
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class Player () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        * Sets the width of the player (not the video size)
        * Number will be converted to pixels
        * String will be used literally. EX: "320px" or "100%"
        *
        */
      var playerWidth: Double = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_Player: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        *
        */
      var widgetsInTemplate: Boolean = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        * 
        * @param templateString The template             
        * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
        * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
        */
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_playerWidth(property: playerWidth): Double = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      @JSName("get")
      def get_widgetsInTemplate(property: widgetsInTemplate): Boolean = js.native
      /**
        * If a player size is a percentage, this will fire an onResize
        * event for all children, passing the size of the player.
        *
        * @param evt
        */
      def onResize(evt: js.Any): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_playerWidth(property: playerWidth, value: Double): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      @JSName("set")
      def set_widgetsInTemplate(property: widgetsInTemplate, value: Boolean): Unit = js.native
      @JSName("watch")
      def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_playerWidth(property: playerWidth, callback: Fn_NewValueOldValuePropertyNumber): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_widgetsInTemplate(property: widgetsInTemplate, callback: Fn_NewValue): Anon_Unwatch = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/widget/ProgressSlider.html
      *
      * A custom slider widget to use with dojox.av.widget.Player.
      * Displays the current playhead position of the media. Has two
      * progress bars: one for playhead position, and one for download
      * progress.
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class ProgressSlider () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_ProgressSlider: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        * Fired on document.onmouseup.
        *
        */
      def endDrag(): Unit = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        * 
        * @param templateString The template             
        * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
        * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
        */
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      /**
        * Unhighlights handle onmouseover, or on endDrag.
        *
        */
      def handleOut(): Unit = js.native
      /**
        * Highlights the slider handle on mouseover, and
        * stays highlighted during drag.
        *
        */
      def handleOver(): Unit = js.native
      /**
        * Fired when the mouse is moved. Sets the slider.
        *
        * @param evt
        */
      def onDrag(evt: Event): Unit = js.native
      /**
        * Handles player resize. Need to recalculate the width of
        * position an download bars.
        *
        * @param playerDimensions
        */
      def onResize(playerDimensions: js.Any): Unit = js.native
      /**
        * Sets the slider handle (when it is not being dragged)
        *
        * @param time
        */
      def setHandle(time: js.Any): Unit = js.native
      /**
        * Sets the download progress bar to the percentage of how much
        * the media has been downloaded.
        *
        * @param decimal
        */
      def setLoadedPosition(decimal: js.Any): Unit = js.native
      /**
        * A common method to set the media in all Player widgets.
        * May do connections and initializations.
        *
        * @param med
        * @param playerWidget
        */
      def setMedia(med: js.Object, playerWidget: js.Any): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      /**
        * Fired onmousedown of the slider handle.
        *
        */
      def startDrag(): Unit = js.native
      @JSName("watch")
      def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/widget/Status.html
      *
      * A Status widget to use with dojox.av.widget.Player
      * Displays the name of the media file, and it's current status
      * (playing, paused, buffering, etc.) in the middle. Displays
      * the playhead time on the left and the duration on the right.
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class Status () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_Status: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        * 
        * @param templateString The template             
        * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
        * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
        */
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      /**
        *
        * @param isBuffering
        */
      def onBuffer(isBuffering: js.Any): Unit = js.native
      /**
        *
        */
      def onEnd(): Unit = js.native
      /**
        *
        * @param evt
        */
      def onError(evt: js.Any): Unit = js.native
      /**
        *
        */
      def onLoad(): Unit = js.native
      /**
        *
        * @param data
        */
      def onMetaData(data: js.Any): Unit = js.native
      /**
        *
        */
      def onPaused(): Unit = js.native
      /**
        *
        */
      def onPlay(): Unit = js.native
      /**
        *
        * @param time
        */
      def onPosition(time: js.Any): Unit = js.native
      /**
        *
        */
      def onStart(): Unit = js.native
      /**
        *
        */
      def onStop(): Unit = js.native
      /**
        * A common method to set the media in all Player widgets.
        * May do connections and initializations.
        *
        * @param med
        */
      def setMedia(med: js.Object): Unit = js.native
      /**
        *
        * @param str
        * @param isError
        */
      def setStatus(str: js.Any, isError: js.Any): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      /**
        *
        * @param time
        */
      def toSeconds(time: js.Any): js.Any = js.native
      @JSName("watch")
      def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    }
    
    /**
      * Permalink: http://dojotoolkit.org/api/1.9/dojox/av/widget/VolumeButton.html
      *
      * A volume widget to use with dojox.av.widget.Player
      * Controls and displays the volume of the media. This widget
      * opens a slider on click that is used to adjust the volume.
      * The icon changes according to the volume level.
      *
      * @param params Hash of initialization parameters for widget, including scalar values (like title, duration etc.)and functions, typically callbacks like onClick.The hash can contain any of the widget's properties, excluding read-only properties.
      * @param srcNodeRef       OptionalIf a srcNodeRef (DOM node) is specified:use srcNodeRef.innerHTML as my contentsif this is a behavioral widget then apply behavior to that srcNodeRefotherwise, replace srcNodeRef with my generated DOM tree
      */
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.dojo.dijit._AttachMixin because Inheritance from two classes. Inlined 
    - typings.dojo.dijit._TemplatedMixin because Inheritance from two classes. Inlined attachScope, searchContainerNode, templatePath, templateString, buildRendering, destroyRendering, getCachedTemplate, getCachedTemplate */ @js.native
    class VolumeButton () extends _Widget {
      def this(params: js.Object) = this()
      def this(params: js.Object, srcNodeRef: HTMLElement) = this()
      /**
        * Object to which attach points and events will be scoped.  Defaults
        * to 'this'.
        *
        */
      var attachScope: js.Object = js.native
      /**
        *
        */
      var searchContainerNode: Boolean = js.native
      /**
        * HTML style attributes as cssText string or name/value hash
        *
        */
      @JSName("style")
      var style_VolumeButton: String = js.native
      /**
        * Path to template (HTML file) for this widget relative to dojo.baseUrl.
        * Deprecated: use templateString with require([... "dojo/text!..."], ...) instead
        *
        */
      var templatePath: String = js.native
      /**
        *
        */
      var templateString: String = js.native
      /**
        * Fired on mouseup of the slider handle.
        *
        */
      def endDrag(): Unit = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        */
      def getCachedTemplate(): js.Any = js.native
      /**
        * Static method to get a template based on the templatePath or
        * templateString key
        * 
        * @param templateString The template             
        * @param alwaysUseString Don't cache the DOM tree for this template, even if it doesn't have any variables             
        * @param doc               OptionalThe target document.   Defaults to document global if unspecified.             
        */
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean): js.Any = js.native
      def getCachedTemplate(templateString: String, alwaysUseString: Boolean, doc: HTMLDocument): js.Any = js.native
      @JSName("get")
      def get_attachScope(property: attachScope): js.Object = js.native
      @JSName("get")
      def get_searchContainerNode(property: searchContainerNode): Boolean = js.native
      @JSName("get")
      def get_templatePath(property: templatePath): String = js.native
      @JSName("get")
      def get_templateString(property: templateString): String = js.native
      /**
        * Unhighlights handle onmouseover, or on endDrag.
        *
        */
      def handleOut(): Unit = js.native
      /**
        * Highlights the slider handle on mouseover, and
        * stays highlighted during drag.
        *
        */
      def handleOver(): Unit = js.native
      /**
        * Fired on document.onmousedown. Checks if clicked inside
        * of this widget or not.
        *
        * @param evt
        */
      def onDocClick(evt: Event): Unit = js.native
      /**
        * Fired on mousemove. Updates volume and position of
        * slider handle.
        *
        * @param evt
        */
      def onDrag(evt: Event): Unit = js.native
      /**
        * Hides volume slider.
        *
        */
      def onHideVolume(): Unit = js.native
      /**
        * Fired on player resize. Zeros dimensions
        * so that it can be calculated again.
        *
        * @param playerDimensions
        */
      def onResize(playerDimensions: js.Object): Unit = js.native
      /**
        * Shows the volume slider.
        *
        * @param evt
        */
      def onShowVolume(evt: Event): Unit = js.native
      /**
        * A common method to set the media in all Player widgets.
        * May do connections and initializations.
        *
        * @param med
        */
      def setMedia(med: js.Object): Unit = js.native
      @JSName("set")
      def set_attachScope(property: attachScope, value: js.Object): Unit = js.native
      @JSName("set")
      def set_searchContainerNode(property: searchContainerNode, value: Boolean): Unit = js.native
      @JSName("set")
      def set_style(property: style, value: String): Unit = js.native
      @JSName("set")
      def set_templatePath(property: templatePath, value: String): Unit = js.native
      @JSName("set")
      def set_templateString(property: templateString, value: String): Unit = js.native
      /**
        * Fired on mousedown of the slider handle.
        *
        */
      def startDrag(): Unit = js.native
      /**
        * Changes the icon on the button according to volume level.
        *
        * @param vol
        */
      def updateIcon(vol: Double): Unit = js.native
      @JSName("watch")
      def watch_attachScope(property: attachScope, callback: Fn_NewValueOldValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_searchContainerNode(property: searchContainerNode, callback: Fn_NewValue): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_style(property: style, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templatePath(property: templatePath, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
      @JSName("watch")
      def watch_templateString(property: templateString, callback: Fn_NewValueOldValueProperty): Anon_Unwatch = js.native
    }
    
  }
  
}

