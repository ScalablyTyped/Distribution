package typings.dojo.dojox.color

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.color.api")
@js.native
object api extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/color/api/ColorModel.html
    *
    * API for classes that implement a color model that returns a color from a data value.
    *
    */
  @js.native
  class ColorModel () extends js.Object {
    /**
      * return the color for a given data value.
      *
      * @param value The data value.
      */
    def getColor(value: Double): Unit = js.native
    /**
      * Optionally initialize the color model from a list of data items and using a function
      * that returns the value used to compute the color for a given item.
      *
      * @param items The data items.
      * @param colorFunc The function that returns the value used to compute the color for particular data item.
      */
    def initialize(items: js.Array[js.Object], colorFunc: js.Function): Unit = js.native
  }
  
}

