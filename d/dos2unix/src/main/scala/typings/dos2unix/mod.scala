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
  
  trait FileData extends StObject {
    
    var file: String
  }
  object FileData {
    
    inline def apply(file: String): FileData = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileData]
    }
    
    extension [Self <: FileData](x: Self) {
      
      inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageData
    extends StObject
       with FileData {
    
    var message: String
  }
  object MessageData {
    
    inline def apply(file: String, message: String): MessageData = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageData]
    }
    
    extension [Self <: MessageData](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
    var glob: js.UndefOr[IOptions] = js.undefined
    
    var maxConcurrency: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setGlob(value: IOptions): Self = StObject.set(x, "glob", value.asInstanceOf[js.Any])
      
      inline def setGlobUndefined: Self = StObject.set(x, "glob", js.undefined)
      
      inline def setMaxConcurrency(value: Double): Self = StObject.set(x, "maxConcurrency", value.asInstanceOf[js.Any])
      
      inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "maxConcurrency", js.undefined)
    }
  }
  
  trait Stats extends StObject {
    
    var error: Double
    
    var fix: Double
    
    var skip: Double
  }
  object Stats {
    
    inline def apply(error: Double, fix: Double, skip: Double): Stats = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any], fix = fix.asInstanceOf[js.Any], skip = skip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stats]
    }
    
    extension [Self <: Stats](x: Self) {
      
      inline def setError(value: Double): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setFix(value: Double): Self = StObject.set(x, "fix", value.asInstanceOf[js.Any])
      
      inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    }
  }
}
