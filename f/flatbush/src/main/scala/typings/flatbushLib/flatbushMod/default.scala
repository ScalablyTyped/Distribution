package typings
package flatbushLib.flatbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatbush", JSImport.Default)
@js.native
class default protected () extends FlatbushClass {
  /**
    * @param numItems total number of items to be indexed
    * @param nodeSize size of the tree node, experiment with different values for best performance. Default 16.
    * @param arrayType The array type used for coordinates storage. Other types may be faster in certain cases. Default Float64Array.
    */
  def this(numItems: scala.Double) = this()
  def this(numItems: scala.Double, nodeSize: scala.Double) = this()
  def this(numItems: scala.Double, nodeSize: scala.Double, arrayType: TypedArrayConstructor) = this()
}

/* static members */
@JSImport("flatbush", JSImport.Default)
@js.native
object default extends js.Object {
  /**
    * Recreates a Flatbush index from raw ArrayBuffer data (that's exposed as index.data on a previously indexed Flatbush instance).
    * Very useful for transferring indices between threads or storing them in a file.
    */
  def from(data: stdLib.ArrayBuffer): flatbushLib.flatbushMod.Flatbush = js.native
}

