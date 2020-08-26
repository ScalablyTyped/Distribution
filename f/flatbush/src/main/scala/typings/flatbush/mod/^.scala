package typings.flatbush.mod

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatbush", JSImport.Namespace)
@js.native
class ^ protected () extends FlatbushClass {
  /**
    * @param numItems total number of items to be indexed
    * @param nodeSize size of the tree node, experiment with different values for best performance. Default 16.
    * @param arrayType The array type used for coordinates storage. Other types may be faster in certain cases. Default Float64Array.
    */
  def this(numItems: Double) = this()
  def this(numItems: Double, nodeSize: Double) = this()
  def this(numItems: Double, nodeSize: js.UndefOr[scala.Nothing], arrayType: TypedArrayConstructor) = this()
  def this(numItems: Double, nodeSize: Double, arrayType: TypedArrayConstructor) = this()
}

@JSImport("flatbush", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Recreates a Flatbush index from raw ArrayBuffer data (that's exposed as index.data on a previously indexed Flatbush instance).
    * Very useful for transferring indices between threads or storing them in a file.
    */
  def from(data: ArrayBuffer): FlatbushClass = js.native
}

