package typings.dojo.dojox.geo.charting

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/geo/charting/TouchInteractionSupport.html
  *
  * A class to handle touch interactions on a dojox/geo/charting/Map component.
  *
  * @param map the Map widget this class provides touch navigation for.
  */
@JSGlobal("dojox.geo.charting.TouchInteractionSupport")
@js.native
class TouchInteractionSupport protected () extends js.Object {
  def this(map: Map) = this()
  /**
    * install touch listeners
    *
    */
  def connect(): Unit = js.native
  /**
    * disconnects any installed listeners. Must be called only when disposing of this instance
    *
    */
  def disconnect(): Unit = js.native
}

