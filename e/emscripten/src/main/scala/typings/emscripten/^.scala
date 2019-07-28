package typings.emscripten

import typings.emscripten.EmscriptenNs.FileSystemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobalScope
@js.native
object ^ extends js.Object {
  var IDBFS: FileSystemType = js.native
  var MEMFS: FileSystemType = js.native
  // By default Emscripten emits a single global Module.  Users setting -s
  // MODULARIZE=1 -s EXPORT_NAME=MyMod should declare their own types, e.g.
  // declare var MyMod: EmscriptenModule;
  var Module: EmscriptenModule = js.native
  var NODEFS: FileSystemType = js.native
}

