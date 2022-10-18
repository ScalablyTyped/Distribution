package typings.expoDevServer.anon

import typings.expoBunyan.mod.^
import typings.expoDevServer.buildWebpackSymbolicatorMod.StackFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomizeFrame extends StObject {
  
  def customizeFrame(frame: StackFrame): StackFrame
  
  def getFileAsync(props: Platform): js.Promise[String]
  
  def getSourceMapAsync(props: Platform): js.Promise[String]
  
  var logger: ^
  
  var projectRoot: String
}
object CustomizeFrame {
  
  inline def apply(
    customizeFrame: StackFrame => StackFrame,
    getFileAsync: Platform => js.Promise[String],
    getSourceMapAsync: Platform => js.Promise[String],
    logger: ^,
    projectRoot: String
  ): CustomizeFrame = {
    val __obj = js.Dynamic.literal(customizeFrame = js.Any.fromFunction1(customizeFrame), getFileAsync = js.Any.fromFunction1(getFileAsync), getSourceMapAsync = js.Any.fromFunction1(getSourceMapAsync), logger = logger.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomizeFrame]
  }
  
  extension [Self <: CustomizeFrame](x: Self) {
    
    inline def setCustomizeFrame(value: StackFrame => StackFrame): Self = StObject.set(x, "customizeFrame", js.Any.fromFunction1(value))
    
    inline def setGetFileAsync(value: Platform => js.Promise[String]): Self = StObject.set(x, "getFileAsync", js.Any.fromFunction1(value))
    
    inline def setGetSourceMapAsync(value: Platform => js.Promise[String]): Self = StObject.set(x, "getSourceMapAsync", js.Any.fromFunction1(value))
    
    inline def setLogger(value: ^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
