package typings.devexpressWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains members related to the document's layout functionality.
  */
@JSGlobal("RichEditLayout")
@js.native
class RichEditLayout () extends js.Object {
  /**
    * Returns bounds of the specified document model's position. The object that contains position bounds.
    * @param position The position in a document model.
    * @param endOfLine true to return bounds of a position at the end of a line; false to return bounds of a position at a new line start.
    */
  def getPositionBounds(position: Double): Rectangle = js.native
  def getPositionBounds(position: Double, endOfLine: Boolean): Rectangle = js.native
}

