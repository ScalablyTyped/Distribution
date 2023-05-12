package typings.electron.Electron

import typings.electron.electronStrings.loopback
import typings.electron.electronStrings.loopbackWithMute
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Streams extends StObject {
  
  /**
    * If a string is specified, can be `loopback` or `loopbackWithMute`. Specifying a
    * loopback device will capture system audio, and is currently only supported on
    * Windows. If a WebFrameMain is specified, will capture audio from that frame.
    */
  var audio: js.UndefOr[loopback | loopbackWithMute | WebFrameMain_] = js.undefined
  
  /**
    * If `audio` is a WebFrameMain and this is set to `true`, then local playback of
    * audio will not be muted (e.g. using `MediaRecorder` to record `WebFrameMain`
    * with this flag set to `true` will allow audio to pass through to the speakers
    * while recording). Default is `false`.
    */
  var enableLocalEcho: js.UndefOr[Boolean] = js.undefined
  
  var video: js.UndefOr[Video | WebFrameMain_] = js.undefined
}
object Streams {
  
  inline def apply(): Streams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Streams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Streams] (val x: Self) extends AnyVal {
    
    inline def setAudio(value: loopback | loopbackWithMute | WebFrameMain_): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setEnableLocalEcho(value: Boolean): Self = StObject.set(x, "enableLocalEcho", value.asInstanceOf[js.Any])
    
    inline def setEnableLocalEchoUndefined: Self = StObject.set(x, "enableLocalEcho", js.undefined)
    
    inline def setVideo(value: Video | WebFrameMain_): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
