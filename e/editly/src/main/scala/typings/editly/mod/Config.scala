package typings.editly.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Config extends StObject {
  
  /**
  		 * Allow remote URLs as paths.
  		 *
  		 * @default false
  		 */
  var allowRemoteRequests: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Set an audio track for the whole video..
  		 *
  		 * @see [Audio tracks]{@link https://github.com/mifi/editly#arbitrary-audio-tracks}
  		 */
  var audioFilePath: js.UndefOr[String] = js.undefined
  
  /**
  		 * Audio normalization.
  		 */
  var audioNorm: js.UndefOr[AudioNormalizationOptions] = js.undefined
  
  /**
  		 * List of arbitrary audio tracks.
  		 *
  		 * @default []
  		 * @see [Audio tracks]{@link https://github.com/mifi/editly#arbitrary-audio-tracks}
  		 */
  var audioTracks: js.UndefOr[js.Array[AudioTrack]] = js.undefined
  
  /**
  		 * Background Volume
  		 *
  		 * @see [Audio tracks]{@link https://github.com/mifi/editly#arbitrary-audio-tracks}
  		 */
  var backgroundAudioVolume: js.UndefOr[String | Double] = js.undefined
  
  /**
  		 * List of clip objects that will be played in sequence.
  		 * Each clip can have one or more layers.
  		 *
  		 * @default []
  		 */
  var clips: js.Array[Clip]
  
  /**
  		 * Volume of audio from `clips` relative to `audioTracks`.
  		 *
  		 * @default 1
  		 * @see [Audio tracks]{@link https://github.com/mifi/editly#arbitrary-audio-tracks}
  		 */
  var clipsAudioVolume: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * Specify custom output codec/format arguments for ffmpeg.
  		 * Automatically adds codec options (normally `h264`) by default.
  		 *
  		 * @see [Example]{@link https://github.com/mifi/editly/blob/master/examples/customOutputArgs.json5}
  		 */
  var customOutputArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * An object describing default options for clips and layers.
  		 */
  var defaults: js.UndefOr[DefaultOptions] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var enableFfmpegLog: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Fast mode (low resolution and FPS, useful for getting a quick preview ⏩).
  		 *
  		 * @default false
  		 */
  var fast: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var ffmpegPath: js.UndefOr[String] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var ffprobePath: js.UndefOr[String] = js.undefined
  
  /**
  		 * FPS which all videos will be converted to.
  		 * Defaults to first video's FPS or `25`.
  		 */
  var fps: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Height which all media will be converted to.
  		 * Decides height based on `width` and aspect ratio of the first video by default.
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Keep source audio from `clips`?
  		 *
  		 * @default false
  		 */
  var keepSourceAudio: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var keepTmp: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var logTimes: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Loop the audio track if it is shorter than video?
  		 *
  		 * @default false
  		 */
  var loopAudio: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Output path (`.mp4` or `.mkv`, can also be a `.gif`).
  		 */
  var outPath: String
  
  /**
  		 * Adjust output [volume]{@link http://ffmpeg.org/ffmpeg-filters.html#volume} (final stage).
  		 *
  		 * @default 1
  		 * @see [Example]{@link https://github.com/mifi/editly/blob/master/examples/audio-volume.json5}
  		 * @example
  		 * 0.5
  		 * @example
  		 * '10db'
  		 */
  var outputVolume: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * WARNING: Undocumented feature!
  		 */
  var verbose: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Width which all media will be converted to.
  		 *
  		 * @default 640
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object Config {
  
  inline def apply(clips: js.Array[Clip], outPath: String): Config = {
    val __obj = js.Dynamic.literal(clips = clips.asInstanceOf[js.Any], outPath = outPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setAllowRemoteRequests(value: Boolean): Self = StObject.set(x, "allowRemoteRequests", value.asInstanceOf[js.Any])
    
    inline def setAllowRemoteRequestsUndefined: Self = StObject.set(x, "allowRemoteRequests", js.undefined)
    
    inline def setAudioFilePath(value: String): Self = StObject.set(x, "audioFilePath", value.asInstanceOf[js.Any])
    
    inline def setAudioFilePathUndefined: Self = StObject.set(x, "audioFilePath", js.undefined)
    
    inline def setAudioNorm(value: AudioNormalizationOptions): Self = StObject.set(x, "audioNorm", value.asInstanceOf[js.Any])
    
    inline def setAudioNormUndefined: Self = StObject.set(x, "audioNorm", js.undefined)
    
    inline def setAudioTracks(value: js.Array[AudioTrack]): Self = StObject.set(x, "audioTracks", value.asInstanceOf[js.Any])
    
    inline def setAudioTracksUndefined: Self = StObject.set(x, "audioTracks", js.undefined)
    
    inline def setAudioTracksVarargs(value: AudioTrack*): Self = StObject.set(x, "audioTracks", js.Array(value*))
    
    inline def setBackgroundAudioVolume(value: String | Double): Self = StObject.set(x, "backgroundAudioVolume", value.asInstanceOf[js.Any])
    
    inline def setBackgroundAudioVolumeUndefined: Self = StObject.set(x, "backgroundAudioVolume", js.undefined)
    
    inline def setClips(value: js.Array[Clip]): Self = StObject.set(x, "clips", value.asInstanceOf[js.Any])
    
    inline def setClipsAudioVolume(value: Double | String): Self = StObject.set(x, "clipsAudioVolume", value.asInstanceOf[js.Any])
    
    inline def setClipsAudioVolumeUndefined: Self = StObject.set(x, "clipsAudioVolume", js.undefined)
    
    inline def setClipsVarargs(value: Clip*): Self = StObject.set(x, "clips", js.Array(value*))
    
    inline def setCustomOutputArgs(value: js.Array[String]): Self = StObject.set(x, "customOutputArgs", value.asInstanceOf[js.Any])
    
    inline def setCustomOutputArgsUndefined: Self = StObject.set(x, "customOutputArgs", js.undefined)
    
    inline def setCustomOutputArgsVarargs(value: String*): Self = StObject.set(x, "customOutputArgs", js.Array(value*))
    
    inline def setDefaults(value: DefaultOptions): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
    
    inline def setDefaultsUndefined: Self = StObject.set(x, "defaults", js.undefined)
    
    inline def setEnableFfmpegLog(value: Boolean): Self = StObject.set(x, "enableFfmpegLog", value.asInstanceOf[js.Any])
    
    inline def setEnableFfmpegLogUndefined: Self = StObject.set(x, "enableFfmpegLog", js.undefined)
    
    inline def setFast(value: Boolean): Self = StObject.set(x, "fast", value.asInstanceOf[js.Any])
    
    inline def setFastUndefined: Self = StObject.set(x, "fast", js.undefined)
    
    inline def setFfmpegPath(value: String): Self = StObject.set(x, "ffmpegPath", value.asInstanceOf[js.Any])
    
    inline def setFfmpegPathUndefined: Self = StObject.set(x, "ffmpegPath", js.undefined)
    
    inline def setFfprobePath(value: String): Self = StObject.set(x, "ffprobePath", value.asInstanceOf[js.Any])
    
    inline def setFfprobePathUndefined: Self = StObject.set(x, "ffprobePath", js.undefined)
    
    inline def setFps(value: Double): Self = StObject.set(x, "fps", value.asInstanceOf[js.Any])
    
    inline def setFpsUndefined: Self = StObject.set(x, "fps", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setKeepSourceAudio(value: Boolean): Self = StObject.set(x, "keepSourceAudio", value.asInstanceOf[js.Any])
    
    inline def setKeepSourceAudioUndefined: Self = StObject.set(x, "keepSourceAudio", js.undefined)
    
    inline def setKeepTmp(value: Boolean): Self = StObject.set(x, "keepTmp", value.asInstanceOf[js.Any])
    
    inline def setKeepTmpUndefined: Self = StObject.set(x, "keepTmp", js.undefined)
    
    inline def setLogTimes(value: Boolean): Self = StObject.set(x, "logTimes", value.asInstanceOf[js.Any])
    
    inline def setLogTimesUndefined: Self = StObject.set(x, "logTimes", js.undefined)
    
    inline def setLoopAudio(value: Boolean): Self = StObject.set(x, "loopAudio", value.asInstanceOf[js.Any])
    
    inline def setLoopAudioUndefined: Self = StObject.set(x, "loopAudio", js.undefined)
    
    inline def setOutPath(value: String): Self = StObject.set(x, "outPath", value.asInstanceOf[js.Any])
    
    inline def setOutputVolume(value: Double | String): Self = StObject.set(x, "outputVolume", value.asInstanceOf[js.Any])
    
    inline def setOutputVolumeUndefined: Self = StObject.set(x, "outputVolume", js.undefined)
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
