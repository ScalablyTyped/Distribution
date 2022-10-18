package typings.expoDevServer.anon

import typings.expoBunyan.mod.^
import typings.expoDevServer.buildWebpackGetFileAsyncMod.AnyCompiler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Compiler extends StObject {
  
  var compiler: AnyCompiler
  
  var logger: ^
  
  var projectRoot: String
}
object Compiler {
  
  inline def apply(compiler: AnyCompiler, logger: ^, projectRoot: String): Compiler = {
    val __obj = js.Dynamic.literal(compiler = compiler.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], projectRoot = projectRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[Compiler]
  }
  
  extension [Self <: Compiler](x: Self) {
    
    inline def setCompiler(value: AnyCompiler): Self = StObject.set(x, "compiler", value.asInstanceOf[js.Any])
    
    inline def setLogger(value: ^): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
    
    inline def setProjectRoot(value: String): Self = StObject.set(x, "projectRoot", value.asInstanceOf[js.Any])
  }
}
