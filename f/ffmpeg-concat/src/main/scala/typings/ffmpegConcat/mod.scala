package typings.ffmpegConcat

import typings.ffmpegConcat.ffmpegConcatStrings.jpg
import typings.ffmpegConcat.ffmpegConcatStrings.png
import typings.ffmpegConcat.ffmpegConcatStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ffmpeg-concat", JSImport.Namespace)
  @js.native
  def apply(concatOptions: ConcatOptions): js.Promise[Unit] = js.native
  
  @js.native
  trait ConcatOptions extends StObject {
    
    var audio: js.UndefOr[String] = js.native
    
    var cleanupFrames: js.UndefOr[Boolean] = js.native
    
    var concurrency: js.UndefOr[Double] = js.native
    
    var frameFormat: js.UndefOr[jpg | png | raw] = js.native
    
    var log: js.UndefOr[js.Function1[/* stdout */ String, Unit]] = js.native
    
    var output: String = js.native
    
    var tempDir: js.UndefOr[String] = js.native
    
    var transition: js.UndefOr[Transition] = js.native
    
    var transitions: js.UndefOr[js.Array[Transition]] = js.native
    
    var videos: js.Array[String] = js.native
  }
  object ConcatOptions {
    
    @scala.inline
    def apply(output: String, videos: js.Array[String]): ConcatOptions = {
      val __obj = js.Dynamic.literal(output = output.asInstanceOf[js.Any], videos = videos.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConcatOptions]
    }
    
    @scala.inline
    implicit class ConcatOptionsMutableBuilder[Self <: ConcatOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAudio(value: String): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
      
      @scala.inline
      def setCleanupFrames(value: Boolean): Self = StObject.set(x, "cleanupFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanupFramesUndefined: Self = StObject.set(x, "cleanupFrames", js.undefined)
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
      
      @scala.inline
      def setFrameFormat(value: jpg | png | raw): Self = StObject.set(x, "frameFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameFormatUndefined: Self = StObject.set(x, "frameFormat", js.undefined)
      
      @scala.inline
      def setLog(value: /* stdout */ String => Unit): Self = StObject.set(x, "log", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDir(value: String): Self = StObject.set(x, "tempDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTempDirUndefined: Self = StObject.set(x, "tempDir", js.undefined)
      
      @scala.inline
      def setTransition(value: Transition): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setTransitions(value: js.Array[Transition]): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setTransitionsVarargs(value: Transition*): Self = StObject.set(x, "transitions", js.Array(value :_*))
      
      @scala.inline
      def setVideos(value: js.Array[String]): Self = StObject.set(x, "videos", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideosVarargs(value: String*): Self = StObject.set(x, "videos", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Transition extends StObject {
    
    var duration: Double = js.native
    
    var name: String = js.native
    
    var params: js.UndefOr[js.Any] = js.native
  }
  object Transition {
    
    @scala.inline
    def apply(duration: Double, name: String): Transition = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transition]
    }
    
    @scala.inline
    implicit class TransitionMutableBuilder[Self <: Transition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParams(value: js.Any): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    }
  }
}
