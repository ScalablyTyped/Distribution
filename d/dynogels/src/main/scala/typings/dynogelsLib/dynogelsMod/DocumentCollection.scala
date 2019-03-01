package typings
package dynogelsLib.dynogelsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DocumentCollection extends js.Object {
  var Count: scala.Double
  var Items: js.Array[Document]
  var ScannedCount: scala.Double
}

object DocumentCollection {
  @scala.inline
  def apply(Count: scala.Double, Items: js.Array[Document], ScannedCount: scala.Double): DocumentCollection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Items")(Items)
    __obj.updateDynamic("ScannedCount")(ScannedCount)
    __obj.asInstanceOf[DocumentCollection]
  }
}

