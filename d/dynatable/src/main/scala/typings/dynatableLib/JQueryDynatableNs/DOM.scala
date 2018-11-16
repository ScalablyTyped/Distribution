package typings
package dynatableLib.JQueryDynatableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait DOM extends js.Object {
  /**
           * Manually update the dom with the current record set...
           * This can be useful after multiple calls to `domcolumns.add()` with `skipUpdate` set to true.
           * This way we improve performance by generating the DOM only once.
           */
  def update(): scala.Unit
}

