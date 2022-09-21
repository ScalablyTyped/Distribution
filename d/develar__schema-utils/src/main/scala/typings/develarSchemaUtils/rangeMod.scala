package typings.develarSchemaUtils

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rangeMod {
  
  /**
    * @typedef {[number, boolean]} RangeValue
    */
  /**
    * @callback RangeValueCallback
    * @param {RangeValue} rangeValue
    * @returns {boolean}
    */
  @JSImport("@develar/schema-utils/declarations/util/Range", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with Range
  
  /**
    * @typedef {[number, boolean]} RangeValue
    */
  /**
    * @callback RangeValueCallback
    * @param {RangeValue} rangeValue
    * @returns {boolean}
    */
  @js.native
  trait Range extends StObject {
    
    /** @type {Array<RangeValue>} */
    var _left: js.Array[RangeValue] = js.native
    
    /** @type {Array<RangeValue>} */
    var _right: js.Array[RangeValue] = js.native
    
    /**
      * @param {boolean} logic is not logic applied
      * @return {string} "smart" range string representation
      */
    def format(): String = js.native
    def format(logic: Boolean): String = js.native
    
    /**
      * @param {number} value
      * @param {boolean=} exclusive
      */
    def left(value: Double): Unit = js.native
    def left(value: Double, exclusive: Boolean): Unit = js.native
    
    /**
      * @param {number} value
      * @param {boolean=} exclusive
      */
    def right(value: Double): Unit = js.native
    def right(value: Double, exclusive: Boolean): Unit = js.native
  }
  
  type RangeValue = js.Tuple2[Double, Boolean]
  
  type RangeValueCallback = js.Function1[/* rangeValue */ js.Tuple2[Double, Boolean], Boolean]
}
