package typings.flatbush.mod

import typings.std.ArrayBuffer
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
  val data: ArrayBuffer = js.native
  /**
    * bounding box of the data.
    */
  val maxX: Double = js.native
  /**
    * bounding box of the data.
    */
  val maxY: Double = js.native
  /**
    * bounding box of the data.
    */
  val minX: Double = js.native
  /**
    * bounding box of the data.
    */
  val minY: Double = js.native
  /**
    * number of items in a node tree.
    */
  val nodeSize: Double = js.native
  /**
    * number of stored items.
    */
  val numItems: Double = js.native
  /**
    * Adds a given rectangle to the index.
    */
  def add(minX: Double, minY: Double, maxX: Double, maxY: Double): Unit = js.native
  /**
    * Performs indexing of the added rectangles. Their number must match the one provided when creating a Flatbush object.
    */
  def finish(): Unit = js.native
  /**
    * Returns an array of item indices in order of distance from the given x, y (known as K nearest neighbors, or KNN).
    */
  def neighbors(x: Double, y: Double): js.Array[Double] = js.native
  def neighbors(x: Double, y: Double, maxResults: Double): js.Array[Double] = js.native
  def neighbors(x: Double, y: Double, maxResults: Double, maxDistance: Double): js.Array[Double] = js.native
  def neighbors(
    x: Double,
    y: Double,
    maxResults: Double,
    maxDistance: Double,
    filter: js.Function1[/* idx */ Double, Boolean]
  ): js.Array[Double] = js.native
  /**
    * Returns an array of indices of items in a given bounding box.
    */
  def search(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
  def search(
    minX: Double,
    minY: Double,
    maxX: Double,
    maxY: Double,
    filter: js.Function1[/* idx */ Double, Boolean]
  ): js.Array[Double] = js.native
}

