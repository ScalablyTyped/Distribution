package typings.emscriptenLibraryDecorator

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  inline def dump(path: String): String = js.Dynamic.global.applyDynamic("dump")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @JSGlobal("fs")
  @js.native
  val fs: Any = js.native
  
  @JSGlobal("process")
  @js.native
  def process: Any = js.native
  inline def process_=(x: Any): Unit = js.Dynamic.global.updateDynamic("process")(x.asInstanceOf[js.Any])
  
  @JSGlobal("require")
  @js.native
  def require: Any = js.native
  inline def require_=(x: Any): Unit = js.Dynamic.global.updateDynamic("require")(x.asInstanceOf[js.Any])
  
  @JSGlobal("util")
  @js.native
  val util: Any = js.native
}
