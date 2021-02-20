package typings.googleProtobuf.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("google-protobuf", "BinaryIterator")
@js.native
class BinaryIterator () extends StObject {
  def this(decoder: BinaryDecoder) = this()
  def this(decoder: js.UndefOr[scala.Nothing], next: js.Function0[Double | Boolean | String | Null]) = this()
  def this(decoder: BinaryDecoder, next: js.Function0[Double | Boolean | String | Null]) = this()
  def this(
    decoder: js.UndefOr[scala.Nothing],
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(
    decoder: js.UndefOr[scala.Nothing],
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(
    decoder: BinaryDecoder,
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  def this(
    decoder: BinaryDecoder,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ) = this()
  
  def atEnd(): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def free(): Unit = js.native
  
  def get(): ScalarFieldType | Null = js.native
  
  def next(): ScalarFieldType | Null = js.native
}
/* static members */
object BinaryIterator {
  
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(
    decoder: js.UndefOr[scala.Nothing],
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(decoder: js.UndefOr[scala.Nothing], next: js.Function0[Double | Boolean | String | Null]): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(
    decoder: js.UndefOr[scala.Nothing],
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(decoder: BinaryDecoder): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(
    decoder: BinaryDecoder,
    next: js.UndefOr[scala.Nothing],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(decoder: BinaryDecoder, next: js.Function0[Double | Boolean | String | Null]): BinaryIterator = js.native
  @JSImport("google-protobuf", "BinaryIterator.alloc")
  @js.native
  def alloc(
    decoder: BinaryDecoder,
    next: js.Function0[Double | Boolean | String | Null],
    elements: js.Array[Double | Boolean | String]
  ): BinaryIterator = js.native
}
