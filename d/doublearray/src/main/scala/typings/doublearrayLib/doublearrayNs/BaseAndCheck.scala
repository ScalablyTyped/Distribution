package typings
package doublearrayLib.doublearrayNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BaseAndCheck extends js.Object {
  def calc(): doublearrayLib.Anon_All = js.native
  def dump(): java.lang.String = js.native
  def getBase(): scala.Double = js.native
  def getBaseBuffer(): js.Any = js.native
  def getCheck(): scala.Double = js.native
     // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  def getCheckBuffer(): js.Any = js.native
  def getFirstUnusedNode(): scala.Double = js.native
  def loadBaseBuffer(base_buffer: stdLib.Int16Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: stdLib.Int32Array): BaseAndCheck = js.native
    // Int8Array | Int16Array | Int32Array | Uint8Array | Uint16Array | Uint32Array
  def loadBaseBuffer(base_buffer: stdLib.Int8Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: stdLib.Uint16Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: stdLib.Uint32Array): BaseAndCheck = js.native
  def loadBaseBuffer(base_buffer: stdLib.Uint8Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: stdLib.Int16Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: stdLib.Int32Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: stdLib.Int8Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: stdLib.Uint16Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: stdLib.Uint32Array): BaseAndCheck = js.native
  def loadCheckBuffer(check_buffer: stdLib.Uint8Array): BaseAndCheck = js.native
  def setBase(index: scala.Double, base_value: scala.Double): scala.Unit = js.native
  def setCheck(index: scala.Double, check_value: scala.Double): scala.Unit = js.native
  def setFirstUnusedNode(index: scala.Double): scala.Unit = js.native
  def shrink(): scala.Unit = js.native
  def size(): scala.Double = js.native
}

