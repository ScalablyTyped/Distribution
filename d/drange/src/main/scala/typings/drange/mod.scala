package typings.drange

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * For adding/subtracting sets of range of numbers.
    */
  @JSImport("drange", JSImport.Namespace)
  @js.native
  /**
    * Creates a new instance of DRange.
    */
  open class ^ ()
    extends StObject
       with DRange {
    def this(low: Double) = this()
    def this(low: Double, high: Double) = this()
    def this(low: Unit, high: Double) = this()
  }
  
  /**
    * For adding/subtracting sets of range of numbers.
    */
  @js.native
  trait DRange extends StObject {
    
    /**
      * Adds all of another DRange's subranges
      */
    def add(drange: DRange): this.type = js.native
    /**
      * Adds a subrange
      */
    def add(low: Double): this.type = js.native
    def add(low: Double, high: Double): this.type = js.native
    
    /**
      * Get the number at the specified index
      */
    def index(i: Double): Double = js.native
    
    /**
      * Keep only subranges that overlap the given subrange
      */
    def intersect(): this.type = js.native
    /**
      * Intersect all of another DRange's subranges
      */
    def intersect(drange: DRange): this.type = js.native
    def intersect(low: Double): this.type = js.native
    def intersect(low: Double, high: Double): this.type = js.native
    def intersect(low: Unit, high: Double): this.type = js.native
    
    /**
      * The total length of all subranges
      */
    var length: Double = js.native
    
    /**
      * Get contained numbers
      */
    def numbers(): js.Array[Double] = js.native
    
    /**
      * Get copy of subranges
      */
    def subranges(): js.Array[SubRange] = js.native
    
    /**
      * Subtracts a subrange
      */
    def subtract(): this.type = js.native
    /**
      * Subtracts all of another DRange's subranges
      */
    def subtract(drange: DRange): this.type = js.native
    def subtract(low: Double): this.type = js.native
    def subtract(low: Double, high: Double): this.type = js.native
    def subtract(low: Unit, high: Double): this.type = js.native
  }
  
  trait SubRange extends StObject {
    
    var high: Double
    
    var length: Double
    
    var low: Double
  }
  object SubRange {
    
    inline def apply(high: Double, length: Double, low: Double): SubRange = {
      val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubRange]
    }
    
    extension [Self <: SubRange](x: Self) {
      
      inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    }
  }
}
