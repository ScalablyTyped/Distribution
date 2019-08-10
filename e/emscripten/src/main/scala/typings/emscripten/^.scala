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
  def UTF16ToString(ptr: Double): String = js.native
  def UTF32ToString(ptr: Double): String = js.native
  def UTF8ToString(ptr: Double): String = js.native
  def UTF8ToString(ptr: Double, maxBytesToRead: Double): String = js.native
  def allocateUTF8(str: String): Double = js.native
  def lengthBytesUTF16(str: String): Double = js.native
  def lengthBytesUTF32(str: String): Double = js.native
  def lengthBytesUTF8(str: String): Double = js.native
  def stringToUTF16(str: String, outPtr: Double): Unit = js.native
  def stringToUTF16(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  def stringToUTF32(str: String, outPtr: Double): Unit = js.native
  def stringToUTF32(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
  def stringToUTF8(str: String, outPtr: Double): Unit = js.native
  def stringToUTF8(str: String, outPtr: Double, maxBytesToRead: Double): Unit = js.native
}

