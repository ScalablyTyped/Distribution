package typings.emscripten

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// By default Emscripten emits a single global Module.  Users setting -s
// MODULARIZE=1 -s EXPORT_NAME=MyMod should declare their own types, e.g.
// declare var MyMod: EmscriptenModule;
@JSGlobal("Module")
@js.native
object Module extends TopLevel[EmscriptenModule]

