package typings
package googleDashProtobufLib.googleDashProtobufMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("google-protobuf", "BinaryIterator")
@js.native
class BinaryIterator () extends js.Object {
  def this(decoder: BinaryDecoder) = this()
  def this(decoder: BinaryDecoder, next: js.Function0[scala.Double | scala.Boolean | java.lang.String | scala.Null]) = this()
  def this(decoder: BinaryDecoder, next: js.Function0[scala.Double | scala.Boolean | java.lang.String | scala.Null], elements: js.Array[scala.Double | scala.Boolean | java.lang.String]) = this()
  def atEnd(): scala.Boolean = js.native
  def clear(): scala.Unit = js.native
  def free(): scala.Unit = js.native
  def get(): ScalarFieldType | scala.Null = js.native
  def next(): ScalarFieldType | scala.Null = js.native
}

/* static members */
@JSImport("google-protobuf", "BinaryIterator")
@js.native
object BinaryIterator extends js.Object {
  def alloc(): googleDashProtobufLib.googleDashProtobufMod.BinaryIterator = js.native
  def alloc(decoder: googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder): googleDashProtobufLib.googleDashProtobufMod.BinaryIterator = js.native
  def alloc(
    decoder: googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder,
    next: js.Function0[scala.Double | scala.Boolean | java.lang.String | scala.Null]
  ): googleDashProtobufLib.googleDashProtobufMod.BinaryIterator = js.native
  def alloc(
    decoder: googleDashProtobufLib.googleDashProtobufMod.BinaryDecoder,
    next: js.Function0[scala.Double | scala.Boolean | java.lang.String | scala.Null],
    elements: js.Array[scala.Double | scala.Boolean | java.lang.String]
  ): googleDashProtobufLib.googleDashProtobufMod.BinaryIterator = js.native
}

