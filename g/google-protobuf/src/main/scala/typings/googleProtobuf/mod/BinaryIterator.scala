package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "BinaryIterator")
@js.native
class BinaryIterator () extends StObject {
  def this(decoder: BinaryDecoder) = this()
  def this(decoder: Unit, next: js.Function0[Double | Boolean | String | Null]) = this()
  def this(decoder: BinaryDecoder, next: js.Function0[Double | Boolean | String | Null]) = this()
  def this(
    decoder: Unit,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(decoder: Unit, next: Unit, elements: js.Array[Double | Boolean | String]) = this()
  def this(
    decoder: BinaryDecoder,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(decoder: BinaryDecoder, next: Unit, elements: js.Array[Double | Boolean | String]) = this()
  
  def atEnd(): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def free(): Unit = js.native
  
  def get(): ScalarFieldType | Null = js.native
  
  def next(): ScalarFieldType | Null = js.native
}
/* static members */
object BinaryIterator {
  
  @JSImport("google-protobuf", "BinaryIterator")
  @js.native
  val ^ : js.Any = js.native
  
  inline def alloc(): BinaryIterator = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")().asInstanceOf[BinaryIterator]
  inline def alloc(decoder: Unit, next: js.Function0[Double | Boolean | String | Null]): BinaryIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[BinaryIterator]
  inline def alloc(
    decoder: Unit,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any], next.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[BinaryIterator]
  inline def alloc(decoder: Unit, next: Unit, elements: js.Array[Double | Boolean | String]): BinaryIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any], next.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[BinaryIterator]
  inline def alloc(decoder: BinaryDecoder): BinaryIterator = ^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any]).asInstanceOf[BinaryIterator]
  inline def alloc(decoder: BinaryDecoder, next: js.Function0[Double | Boolean | String | Null]): BinaryIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any], next.asInstanceOf[js.Any])).asInstanceOf[BinaryIterator]
  inline def alloc(
    decoder: BinaryDecoder,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any], next.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[BinaryIterator]
  inline def alloc(decoder: BinaryDecoder, next: Unit, elements: js.Array[Double | Boolean | String]): BinaryIterator = (^.asInstanceOf[js.Dynamic].applyDynamic("alloc")(decoder.asInstanceOf[js.Any], next.asInstanceOf[js.Any], elements.asInstanceOf[js.Any])).asInstanceOf[BinaryIterator]
}
