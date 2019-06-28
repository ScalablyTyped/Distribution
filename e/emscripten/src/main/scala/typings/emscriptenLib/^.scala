package typings
package emscriptenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var IDBFS: emscriptenLib.EmscriptenNs.FileSystemType = js.native
  var MEMFS: emscriptenLib.EmscriptenNs.FileSystemType = js.native
  // By default Emscripten emits a single global Module.  Users setting -s
  // MODULARIZE=1 -s EXPORT_NAME=MyMod should declare their own types, e.g.
  // declare var MyMod: EmscriptenModule;
  var Module: EmscriptenModule = js.native
  var NODEFS: emscriptenLib.EmscriptenNs.FileSystemType = js.native
}

