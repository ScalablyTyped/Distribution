package typings.findProcess

import typings.findProcess.anon.Cmd
import typings.findProcess.findProcessStrings.name
import typings.findProcess.findProcessStrings.pid
import typings.findProcess.findProcessStrings.port
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(`type`: name | pid | port, value: String): js.Promise[js.Array[Cmd]] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cmd]]]
  inline def apply(`type`: name | pid | port, value: String, strict: Boolean): js.Promise[js.Array[Cmd]] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cmd]]]
  inline def apply(`type`: name | pid | port, value: js.RegExp): js.Promise[js.Array[Cmd]] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cmd]]]
  inline def apply(`type`: name | pid | port, value: js.RegExp, strict: Boolean): js.Promise[js.Array[Cmd]] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cmd]]]
  inline def apply(`type`: name | pid | port, value: Double): js.Promise[js.Array[Cmd]] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cmd]]]
  inline def apply(`type`: name | pid | port, value: Double, strict: Boolean): js.Promise[js.Array[Cmd]] = (^.asInstanceOf[js.Dynamic].apply(`type`.asInstanceOf[js.Any], value.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Array[Cmd]]]
  
  @JSImport("find-process", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
