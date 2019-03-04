package typings
package googleDashAppsDashScriptLib.GoogleAppsScriptNs.SlidesUnderscoreV1Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  // The height of the object.
  var height: Dimension
  // The width of the object.
  var width: Dimension
}

object Size {
  @scala.inline
  def apply(height: Dimension, width: Dimension): Size = {
    val __obj = js.Dynamic.literal(height = height, width = width)
  
    __obj.asInstanceOf[Size]
  }
}

