package typings
package electronDashConfigLib.electronDashConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElectronConfig
  extends stdLib.Iterable[
      js.Tuple2[
        java.lang.String, 
        java.lang.String | scala.Double | scala.Boolean | js.Symbol | js.Object
      ]
    ] {
  /**
       * Get the path to the config file.
       */
  var path: java.lang.String = js.native
  /**
       * gets the item count
       */
  var size: scala.Double = js.native
  /**
       * deletes all items
       */
  def clear(): scala.Unit = js.native
  /**
       * deletes an item
       */
  def delete(key: java.lang.String): scala.Unit = js.native
  /**
       * retrieves an item
       */
  def get(key: java.lang.String): js.Any = js.native
  /**
       * Checks if an item exists
       */
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
       * Sets an item
       */
  def set(key: java.lang.String, value: js.Any): scala.Unit = js.native
  /**
       * Sets multiple items at once
       */
  def set(`object`: js.Object): scala.Unit = js.native
}

