package typings.emilbayesCappedArray

import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * `CappedArray` inherited from `Array`.
    *
    * @example
    * import CappedArray = require('@emilbayes/capped-array')
    *
    * const arr = new CappedArray(2) // max 2 elements
    *
    * arr.push('foo')
    * arr.deleted // === 0
    * arr.length // === 1
    * arr.size // === 2
    *
    * arr.push('bar')
    * arr.deleted // === 0
    * arr.length // === 2
    * arr.size // === 2
    *
    * arr.push('baz')
    * arr.deleted // === 1
    * arr.length // === 2
    * arr.size // === 2
    * // arr is now ['bar', 'baz']
    */
  @JSImport("@emilbayes/capped-array", JSImport.Namespace)
  @js.native
  open class ^[T] protected ()
    extends StObject
       with CappedArray[T] {
    /**
      * Create a new `CappedArray`.
      *
      * @param size The maximum size of the array.
      */
    def this(size: Double) = this()
  }
  
  /**
    * `CappedArray` inherited from `Array`.
    *
    * @example
    * import CappedArray = require('@emilbayes/capped-array')
    *
    * const arr = new CappedArray(2) // max 2 elements
    *
    * arr.push('foo')
    * arr.deleted // === 0
    * arr.length // === 1
    * arr.size // === 2
    *
    * arr.push('bar')
    * arr.deleted // === 0
    * arr.length // === 2
    * arr.size // === 2
    *
    * arr.push('baz')
    * arr.deleted // === 1
    * arr.length // === 2
    * arr.size // === 2
    * // arr is now ['bar', 'baz']
    */
  @js.native
  trait CappedArray[T]
    extends StObject
       with Array[T] {
    
    /**
      * This property is updated on each mutation (`push`, `unshift`) that might have delete elements.
      */
    val deleted: Double = js.native
    
    /**
      * The maximum size of the capped array.
      */
    val size: Double = js.native
  }
}
