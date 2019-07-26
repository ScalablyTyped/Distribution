package typings
package flatbushLib.flatbushMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlatbushClass extends js.Object {
  /**
    * array type used for internal coordinates storage.
    */
  val ArrayType: TypedArrayConstructor = js.native
  /**
    * array type used for internal item indices storage.
    */
  val IndexArrayType: TypedArrayConstructor = js.native
  /**
    * array buffer that holds the index
    */
  val data: stdLib.ArrayBuffer = js.native
  /**
    * bounding box of the data.
    */
  val maxX: scala.Double = js.native
  /**
    * bounding box of the data.
    */
  val maxY: scala.Double = js.native
  /**
    * bounding box of the data.
    */
  val minX: scala.Double = js.native
  /**
    * bounding box of the data.
    */
  val minY: scala.Double = js.native
  /**
    * number of items in a node tree.
    */
  val nodeSize: scala.Double = js.native
  /**
    * number of stored items.
    */
  val numItems: scala.Double = js.native
  /**
    * Adds a given rectangle to the index.
    */
  def add(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): scala.Unit = js.native
  /**
    * Performs indexing of the added rectangles. Their number must match the one provided when creating a Flatbush object.
    */
  def finish(): scala.Unit = js.native
  /**
    * Returns an array of item indices in order of distance from the given x, y (known as K nearest neighbors, or KNN).
    */
  def neighbors(x: scala.Double, y: scala.Double): js.Array[scala.Double] = js.native
  def neighbors(x: scala.Double, y: scala.Double, maxResults: scala.Double): js.Array[scala.Double] = js.native
  def neighbors(x: scala.Double, y: scala.Double, maxResults: scala.Double, maxDistance: scala.Double): js.Array[scala.Double] = js.native
  def neighbors(
    x: scala.Double,
    y: scala.Double,
    maxResults: scala.Double,
    maxDistance: scala.Double,
    filter: js.Function1[/* idx */ scala.Double, scala.Boolean]
  ): js.Array[scala.Double] = js.native
  /**
    * Returns an array of indices of items in a given bounding box.
    */
  def search(minX: scala.Double, minY: scala.Double, maxX: scala.Double, maxY: scala.Double): js.Array[scala.Double] = js.native
  def search(
    minX: scala.Double,
    minY: scala.Double,
    maxX: scala.Double,
    maxY: scala.Double,
    filter: js.Function1[/* idx */ scala.Double, scala.Boolean]
  ): js.Array[scala.Double] = js.native
}

