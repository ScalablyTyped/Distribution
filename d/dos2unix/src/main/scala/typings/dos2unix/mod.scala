package typings.dos2unix

import typings.dos2unix.dos2unixStrings.convertDotend
import typings.dos2unix.dos2unixStrings.convertDoterror
import typings.dos2unix.dos2unixStrings.convertDotstart
import typings.dos2unix.dos2unixStrings.end
import typings.dos2unix.dos2unixStrings.error
import typings.dos2unix.dos2unixStrings.processingDotend
import typings.dos2unix.dos2unixStrings.processingDoterror
import typings.dos2unix.dos2unixStrings.processingDotskip
import typings.dos2unix.dos2unixStrings.processingDotstart
import typings.dos2unix.dos2unixStrings.start
import typings.glob.mod.IOptions
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("dos2unix", "dos2unix")
  @js.native
  class dos2unix () extends Dos2UnixConverter {
    def this(defaultOptions: Options) = this()
  }
  
  @js.native
  trait Dos2UnixConverter extends EventEmitter {
    
    @JSName("on")
    def on_convertend(event: convertDotend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
    @JSName("on")
    def on_converterror(event: convertDoterror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
    @JSName("on")
    def on_convertstart(event: convertDotstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
    @JSName("on")
    def on_end(event: end, cb: js.Function1[/* stats */ Stats, Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* error */ js.UndefOr[Error], Unit]): this.type = js.native
    @JSName("on")
    def on_processingend(event: processingDotend, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
    @JSName("on")
    def on_processingerror(event: processingDoterror, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
    @JSName("on")
    def on_processingskip(event: processingDotskip, cb: js.Function1[/* data */ MessageData, Unit]): this.type = js.native
    @JSName("on")
    def on_processingstart(event: processingDotstart, cb: js.Function1[/* data */ FileData, Unit]): this.type = js.native
    @JSName("on")
    def on_start(event: start, cb: js.Function0[Unit]): this.type = js.native
    
    def process(globPatterns: js.Array[String]): Unit = js.native
    def process(globPatterns: js.Array[String], options: Options): Unit = js.native
  }
  
  @js.native
  trait FileData extends StObject {
    
    var file: String = js.native
  }
  object FileData {
    
    @scala.inline
    def apply(file: String): FileData = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileData]
    }
    
    @scala.inline
    implicit class FileDataMutableBuilder[Self <: FileData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait MessageData extends FileData {
    
    var message: String = js.native
  }
  object MessageData {
    
    @scala.inline
    def apply(file: String, message: String): MessageData = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData]
    }
    
    @scala.inline
    implicit class MessageDataMutableBuilder[Self <: MessageData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    var glob: js.UndefOr[IOptions] = js.native
    
    var maxConcurrency: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGlob(value: IOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      @scala.inline
      def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    }
  }
  
  @js.native
  trait Stats extends StObject {
    
    var error: Double = js.native
    
    var fix: Double = js.native
    
    var skip: Double = js.native
  }
  object Stats {
    
    @scala.inline
    def apply(error: Double, fix: Double, skip: Double): Stats = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    @scala.inline
    implicit class StatsMutableBuilder[Self <: Stats] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFix(value: Double): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
