package typings.fastifyWarning

import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("fastify-warning", JSImport.Default)
  @js.native
  def default(): Warning = js.native
  
  @JSImport("fastify-warning", "WarnOpts")
  @js.native
  class WarnOpts () extends StObject {
    
    var code: String = js.native
    
    var message: String = js.native
    
    var name: String = js.native
  }
  
  type BuildWarnOptsFn = js.Function3[
    /* a */ js.UndefOr[js.Any], 
    /* b */ js.UndefOr[js.Any], 
    /* c */ js.UndefOr[js.Any], 
    WarnOpts
  ]
  
  @js.native
  trait Warning extends StObject {
    
    def create(name: String, code: String, message: String): BuildWarnOptsFn = js.native
    
    def emit(cod: String): Unit = js.native
    def emit(cod: String, a: js.UndefOr[scala.Nothing], b: js.UndefOr[scala.Nothing], c: js.Any): Unit = js.native
    def emit(cod: String, a: js.UndefOr[scala.Nothing], b: js.Any): Unit = js.native
    def emit(cod: String, a: js.UndefOr[scala.Nothing], b: js.Any, c: js.Any): Unit = js.native
    def emit(cod: String, a: js.Any): Unit = js.native
    def emit(cod: String, a: js.Any, b: js.UndefOr[scala.Nothing], c: js.Any): Unit = js.native
    def emit(cod: String, a: js.Any, b: js.Any): Unit = js.native
    def emit(cod: String, a: js.Any, b: js.Any, c: js.Any): Unit = js.native
    
    var emitted: Map[String, Boolean] = js.native
  }
}
