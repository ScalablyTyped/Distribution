package typings.flatbush

import typings.std.ArrayBufferConstructor
import typings.std.Float32ArrayConstructor
import typings.std.Float64ArrayConstructor
import typings.std.Int16ArrayConstructor
import typings.std.Int32ArrayConstructor
import typings.std.Int8ArrayConstructor
import typings.std.SharedArrayBuffer
import typings.std.SharedArrayBufferConstructor
import typings.std.Uint16ArrayConstructor
import typings.std.Uint32ArrayConstructor
import typings.std.Uint8ArrayConstructor
import typings.std.Uint8ClampedArrayConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("flatbush", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with Flatbush {
    /**
      * Create a Flatbush index that will hold a given number of items.
      * @param {number} numItems
      * @param {number} [nodeSize=16] Size of the tree node (16 by default).
      * @param {TypedArrayConstructor} [ArrayType=Float64Array] The array type used for coordinates storage (`Float64Array` by default).
      * @param {ArrayBufferConstructor | SharedArrayBufferConstructor} [ArrayBufferType=ArrayBuffer] The array buffer type used to store data (`ArrayBuffer` by default).
      * @param {ArrayBuffer | SharedArrayBuffer} [data] (Only used internally)
      */
    def this(numItems: Double) = this()
    def this(numItems: Double, nodeSize: Double) = this()
    def this(numItems: Double, nodeSize: Double, ArrayType: TypedArrayConstructor) = this()
    def this(numItems: Double, nodeSize: Unit, ArrayType: TypedArrayConstructor) = this()
    def this(numItems: Double, nodeSize: Double, ArrayType: Unit, ArrayBufferType: ArrayBufferConstructor) = this()
    def this(numItems: Double, nodeSize: Double, ArrayType: Unit, ArrayBufferType: SharedArrayBufferConstructor) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: ArrayBufferConstructor
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: SharedArrayBufferConstructor
    ) = this()
    def this(numItems: Double, nodeSize: Unit, ArrayType: Unit, ArrayBufferType: ArrayBufferConstructor) = this()
    def this(numItems: Double, nodeSize: Unit, ArrayType: Unit, ArrayBufferType: SharedArrayBufferConstructor) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: ArrayBufferConstructor
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: SharedArrayBufferConstructor
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: Unit,
      ArrayBufferType: Unit,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: Unit,
      ArrayBufferType: Unit,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: Unit,
      ArrayBufferType: ArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: Unit,
      ArrayBufferType: ArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: Unit,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: Unit,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: Unit,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: Unit,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: ArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: ArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Double,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: Unit,
      ArrayBufferType: Unit,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(numItems: Double, nodeSize: Unit, ArrayType: Unit, ArrayBufferType: Unit, data: SharedArrayBuffer) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: Unit,
      ArrayBufferType: ArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: Unit,
      ArrayBufferType: ArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: Unit,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: Unit,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: Unit,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: Unit,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: ArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: ArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: js.typedarray.ArrayBuffer
    ) = this()
    def this(
      numItems: Double,
      nodeSize: Unit,
      ArrayType: TypedArrayConstructor,
      ArrayBufferType: SharedArrayBufferConstructor,
      data: SharedArrayBuffer
    ) = this()
  }
  /* static members */
  object default {
    
    @JSImport("flatbush", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Recreate a Flatbush index from raw `ArrayBuffer` or `SharedArrayBuffer` data.
      * @param {ArrayBuffer | SharedArrayBuffer} data
      * @returns {Flatbush} index
      */
    inline def from(data: js.typedarray.ArrayBuffer): Flatbush = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Flatbush]
    inline def from(data: SharedArrayBuffer): Flatbush = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(data.asInstanceOf[js.Any]).asInstanceOf[Flatbush]
  }
  
  @js.native
  trait Flatbush extends StObject {
    
    var ArrayType: TypedArrayConstructor = js.native
    
    var IndexArrayType: Uint16ArrayConstructor | Uint32ArrayConstructor = js.native
    
    var _boxes: js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array = js.native
    
    var _indices: js.typedarray.Uint16Array | js.typedarray.Uint32Array = js.native
    
    var _levelBounds: js.Array[Double] = js.native
    
    var _pos: Double = js.native
    
    /** @type FlatQueue<number> */
    var _queue: typings.flatqueue.mod.default[Double] = js.native
    
    /**
      * Add a given rectangle to the index.
      * @param {number} minX
      * @param {number} minY
      * @param {number} maxX
      * @param {number} maxY
      * @returns {number} A zero-based, incremental number that represents the newly added rectangle.
      */
    def add(minX: Double, minY: Double, maxX: Double, maxY: Double): Double = js.native
    
    var data: js.typedarray.ArrayBuffer = js.native
    
    /** Perform indexing of the added rectangles. */
    def finish(): Unit = js.native
    
    var maxX: Double = js.native
    
    var maxY: Double = js.native
    
    var minX: Double = js.native
    
    var minY: Double = js.native
    
    /**
      * Search items in order of distance from the given point.
      * @param {number} x
      * @param {number} y
      * @param {number} [maxResults=Infinity]
      * @param {number} [maxDistance=Infinity]
      * @param {(index: number) => boolean} [filterFn] An optional function for filtering the results.
      * @returns {number[]} An array of indices of items found.
      */
    def neighbors(x: Double, y: Double): js.Array[Double] = js.native
    def neighbors(x: Double, y: Double, maxResults: Double): js.Array[Double] = js.native
    def neighbors(x: Double, y: Double, maxResults: Double, maxDistance: Double): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: Double,
      maxDistance: Double,
      filterFn: js.Function1[/* index */ Double, Boolean]
    ): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: Double,
      maxDistance: Unit,
      filterFn: js.Function1[/* index */ Double, Boolean]
    ): js.Array[Double] = js.native
    def neighbors(x: Double, y: Double, maxResults: Unit, maxDistance: Double): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: Unit,
      maxDistance: Double,
      filterFn: js.Function1[/* index */ Double, Boolean]
    ): js.Array[Double] = js.native
    def neighbors(
      x: Double,
      y: Double,
      maxResults: Unit,
      maxDistance: Unit,
      filterFn: js.Function1[/* index */ Double, Boolean]
    ): js.Array[Double] = js.native
    
    var nodeSize: Double = js.native
    
    var numItems: Double = js.native
    
    /**
      * Search the index by a bounding box.
      * @param {number} minX
      * @param {number} minY
      * @param {number} maxX
      * @param {number} maxY
      * @param {(index: number) => boolean} [filterFn] An optional function for filtering the results.
      * @returns {number[]} An array of indices of items intersecting or touching the given bounding box.
      */
    def search(minX: Double, minY: Double, maxX: Double, maxY: Double): js.Array[Double] = js.native
    def search(
      minX: Double,
      minY: Double,
      maxX: Double,
      maxY: Double,
      filterFn: js.Function1[/* index */ Double, Boolean]
    ): js.Array[Double] = js.native
  }
  
  type TypedArrayConstructor = Int8ArrayConstructor | Uint8ArrayConstructor | Uint8ClampedArrayConstructor | Int16ArrayConstructor | Uint16ArrayConstructor | Int32ArrayConstructor | Uint32ArrayConstructor | Float32ArrayConstructor | Float64ArrayConstructor
}
