package typings.ffmpegConcat

import typings.ffmpegConcat.ffmpegConcatStrings.jpg
import typings.ffmpegConcat.ffmpegConcatStrings.png
import typings.ffmpegConcat.ffmpegConcatStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(concatOptions: ConcatOptions): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].apply(concatOptions.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Unit]]
  
  @JSImport("ffmpeg-concat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait ConcatOptions extends StObject {
    
    var audio: js.UndefOr[String] = js.undefined
    
    var cleanupFrames: js.UndefOr[Boolean] = js.undefined
    
    var concurrency: js.UndefOr[Double] = js.undefined
    
    var frameFormat: js.UndefOr[jpg | png | raw] = js.undefined
    
    var log: js.UndefOr[js.Function1[/* stdout */ String, Unit]] = js.undefined
    
    var output: String
    
    var tempDir: js.UndefOr[String] = js.undefined
    
    var transition: js.UndefOr[Transition] = js.undefined
    
    var transitions: js.UndefOr[js.Array[Transition]] = js.undefined
    
    var videos: js.Array[String]
  }
  object ConcatOptions {
    
    inline def apply(output: String, videos: js.Array[String]): ConcatOptions = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcatOptions]
    }
    
    extension [Self <: ConcatOptions](x: Self) {
      
      inline def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      inline def setCleanupFrames(value: Boolean): Self = StObject.set(x, "cleanupFrames", value.asInstanceOf[js.Any])
      
      inline def setCleanupFramesUndefined: Self = StObject.set(x, "cleanupFrames", js.undefined)
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      inline def setFrameFormat(value: jpg | png | raw): Self = StObject.set(x, "frameFormat", value.asInstanceOf[js.Any])
      
      inline def setFrameFormatUndefined: Self = StObject.set(x, "frameFormat", js.undefined)
      
      inline def setLog(value: /* stdout */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      inline def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setTempDir(value: String): Self = StObject.set(x, "tempDir", value.asInstanceOf[js.Any])
      
      inline def setTempDirUndefined: Self = StObject.set(x, "tempDir", js.undefined)
      
      inline def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setTransitions(value: js.Array[Transition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      inline def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      inline def setTransitionsVarargs(value: Transition*): Self = StObject.set(x, "transitions", js.Array(value :_*))
      
      inline def setVideos(value: js.Array[String]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
      
      inline def setVideosVarargs(value: String*): Self = StObject.set(x, "videos", js.Array(value :_*))
    }
  }
  
  trait Transition extends StObject {
    
    var duration: Double
    
    var name: String
    
    var params: js.UndefOr[js.Any] = js.undefined
  }
  object Transition {
    
    inline def apply(duration: Double, name: String): Transition = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transition]
    }
    
    extension [Self <: Transition](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
}
