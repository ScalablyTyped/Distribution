package typings.fastifyWarning

import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("fastify-warning", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(): Warning = js.native
  
  @js.native
  class WarnOpts () extends js.Object {
    
    var code: String = js.native
    
    var message: String = js.native
    
    var name: String = js.native
  }
  
  @js.native
  trait Warning extends js.Object {
    
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
  
  type BuildWarnOptsFn = js.Function3[
    /* a */ js.UndefOr[js.Any], 
    /* b */ js.UndefOr[js.Any], 
    /* c */ js.UndefOr[js.Any], 
    WarnOpts
  ]
}
