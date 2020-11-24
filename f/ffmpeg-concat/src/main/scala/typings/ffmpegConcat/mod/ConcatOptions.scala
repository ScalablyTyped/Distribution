package typings.ffmpegConcat.mod

import typings.ffmpegConcat.ffmpegConcatStrings.jpg
import typings.ffmpegConcat.ffmpegConcatStrings.png
import typings.ffmpegConcat.ffmpegConcatStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConcatOptions extends js.Object {
  
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
  implicit class ConcatOptionsOps[Self <: ConcatOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOutput(value: String): Self = this.set("output", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVideosVarargs(value: String*): Self = this.set("videos", js.Array(value :_*))
    
    @scala.inline
    def setVideos(value: js.Array[String]): Self = this.set("videos", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAudio(value: String): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setCleanupFrames(value: Boolean): Self = this.set("cleanupFrames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanupFrames: Self = this.set("cleanupFrames", js.undefined)
    
    @scala.inline
    def setConcurrency(value: Double): Self = this.set("concurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConcurrency: Self = this.set("concurrency", js.undefined)
    
    @scala.inline
    def setFrameFormat(value: jpg | png | raw): Self = this.set("frameFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameFormat: Self = this.set("frameFormat", js.undefined)
    
    @scala.inline
    def setLog(value: /* stdout */ String => Unit): Self = this.set("log", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setTempDir(value: String): Self = this.set("tempDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTempDir: Self = this.set("tempDir", js.undefined)
    
    @scala.inline
    def setTransition(value: Transition): Self = this.set("transition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransition: Self = this.set("transition", js.undefined)
    
    @scala.inline
    def setTransitionsVarargs(value: Transition*): Self = this.set("transitions", js.Array(value :_*))
    
    @scala.inline
    def setTransitions(value: js.Array[Transition]): Self = this.set("transitions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransitions: Self = this.set("transitions", js.undefined)
  }
}
