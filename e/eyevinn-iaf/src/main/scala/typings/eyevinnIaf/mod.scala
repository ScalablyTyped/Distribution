package typings.eyevinnIaf

import typings.node.streamMod.Readable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  trait IafFileWatchModule extends StObject {
    
    var fileInput: String
    
    var logger: Logger
    
    def onAdd(
      callback: js.Function3[
          /* filePath */ String, 
          /* readStream */ Readable, 
          /* contentType */ js.UndefOr[String], 
          Any
        ]
    ): Any
  }
  object IafFileWatchModule {
    
    inline def apply(
      fileInput: String,
      logger: Logger,
      onAdd: js.Function3[
          /* filePath */ String, 
          /* readStream */ Readable, 
          /* contentType */ js.UndefOr[String], 
          Any
        ] => Any
    ): IafFileWatchModule = {
      val __obj = js.Dynamic.literal(fileInput = fileInput.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], onAdd = js.Any.fromFunction1(onAdd))
      __obj.asInstanceOf[IafFileWatchModule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IafFileWatchModule] (val x: Self) extends AnyVal {
      
      inline def setFileInput(value: String): Self = StObject.set(x, "fileInput", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setOnAdd(
        value: js.Function3[
              /* filePath */ String, 
              /* readStream */ Readable, 
              /* contentType */ js.UndefOr[String], 
              Any
            ] => Any
      ): Self = StObject.set(x, "onAdd", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IafUploadModule extends StObject {
    
    def fileUploadedDelegate(result: Any): Any = js.native
    def fileUploadedDelegate(result: Any, error: Any): Any = js.native
    
    var logger: Logger = js.native
    
    def onFileAdd(filePath: String, readStream: Readable): Any = js.native
    def onFileAdd(filePath: String, readStream: Readable, contentType: String): Any = js.native
    
    var playlistName: String = js.native
    
    def progressDelegate(result: Any): Any = js.native
  }
  
  trait Logger extends StObject {
    
    def error(message: String): Unit
    
    def info(message: String): Unit
    
    def verbose(message: String): Unit
    
    def warn(message: String): Unit
  }
  object Logger {
    
    inline def apply(error: String => Unit, info: String => Unit, verbose: String => Unit, warn: String => Unit): Logger = {
      val __obj = js.Dynamic.literal(error = js.Any.fromFunction1(error), info = js.Any.fromFunction1(info), verbose = js.Any.fromFunction1(verbose), warn = js.Any.fromFunction1(warn))
      __obj.asInstanceOf[Logger]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Logger] (val x: Self) extends AnyVal {
      
      inline def setError(value: String => Unit): Self = StObject.set(x, "error", js.Any.fromFunction1(value))
      
      inline def setInfo(value: String => Unit): Self = StObject.set(x, "info", js.Any.fromFunction1(value))
      
      inline def setVerbose(value: String => Unit): Self = StObject.set(x, "verbose", js.Any.fromFunction1(value))
      
      inline def setWarn(value: String => Unit): Self = StObject.set(x, "warn", js.Any.fromFunction1(value))
    }
  }
}
