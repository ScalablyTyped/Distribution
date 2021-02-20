package typings.flatbush

import typings.std.ArrayBuffer
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
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
  
  /**
    * Recreates a Flatbush index from raw ArrayBuffer data (that's exposed as index.data on a previously indexed Flatbush instance).
    * Very useful for transferring indices between threads or storing them in a file.
    */
  /* static member */
  @JSImport("flatbush", "from")
  @js.native
  def from(data: ArrayBuffer): FlatbushClass = js.native
  
  type Flatbush = FlatbushClass
  
  @js.native
  trait FlatbushClass extends StObject {
    
    /**
      * array type used for internal coordinates storage.
      */
    val ArrayType: TypedArrayConstructor = js.native
    
    /**
      * array type used for internal item indices storage.
      */
    val IndexArrayType: TypedArrayConstructor = js.native
    
    /**
      * Adds a given rectangle to the index. Returns a zero-based, incremental number that represents the newly added rectangle.
      */
    def add(minX: Double, minY: Double, maxX: Double, maxY: Double): Double = js.native
    
    /**
      * array buffer that holds the index
      */
    val data: ArrayBuffer = js.native
    
    /**
      * Performs indexing of the added rectangles. Their number must match the one provided when creating a Flatbush object.
      */
    def finish(): Unit = js.native
    
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
      * Returns an array of item indices in order of distance from the given x, y (known as K nearest neighbors, or KNN).
      */
    def neighbors(x: Double, y: Double): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: js.UndefOr[scala.Nothing],
      maxDistance: js.UndefOr[scala.Nothing],
      filter: js.Function1[/* idx */ Double, Boolean]
    ): js.Array[Double] = js.native
    def neighbors(x: Double, y: Double, maxResults: js.UndefOr[scala.Nothing], maxDistance: Double): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: js.UndefOr[scala.Nothing],
      maxDistance: Double,
      filter: js.Function1[/* idx */ Double, Boolean]
    ): js.Array[Double] = js.native
    def neighbors(x: Double, y: Double, maxResults: Double): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: Double,
      maxDistance: js.UndefOr[scala.Nothing],
      filter: js.Function1[/* idx */ Double, Boolean]
    ): js.Array[Double] = js.native
    def neighbors(x: Double, y: Double, maxResults: Double, maxDistance: Double): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: Double,
      maxDistance: Double,
      filter: js.Function1[/* idx */ Double, Boolean]
    ): js.Array[Double] = js.native
    
    /**
      * number of items in a node tree.
      */
    val nodeSize: Double = js.native
    
    /**
      * number of stored items.
      */
    val numItems: Double = js.native
    
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
  
  type TypedArrayConstructor = Int8ArrayConstructor | Uint8ArrayConstructor | Uint8ClampedArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor
}
