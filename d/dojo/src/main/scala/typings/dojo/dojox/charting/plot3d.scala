package typings.dojo.dojox.charting

import typings.dojo.dojox.charting.plot3d.Base
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("dojox.charting.plot3d")
@js.native
object plot3d extends js.Object {
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot3d/Bars.html
    *
    *
    * @param width
    * @param height
    * @param kwArgs
    */
  @js.native
  class Bars protected () extends Base {
    def this(width: js.Any, height: js.Any, kwArgs: js.Any) = this()
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot3d/Base.html
    *
    *
    * @param width
    * @param height
    * @param kwArgs
    */
  @js.native
  class Base protected () extends js.Object {
    def this(width: js.Any, height: js.Any, kwArgs: js.Any) = this()
    /**
      *
      * @param chart
      * @param creator
      */
    def generate(chart: js.Any, creator: js.Any): Unit = js.native
    /**
      *
      */
    def getDepth(): js.Any = js.native
    /**
      *
      * @param data
      */
    def setData(data: js.Any): js.Function = js.native
  }
  
  /**
    * Permalink: http://dojotoolkit.org/api/1.9/dojox/charting/plot3d/Cylinders.html
    *
    *
    * @param width
    * @param height
    * @param kwArgs
    */
  @js.native
  class Cylinders protected () extends Base {
    def this(width: js.Any, height: js.Any, kwArgs: js.Any) = this()
  }
  
}

