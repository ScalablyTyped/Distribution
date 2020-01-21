package typings.geometryDom.GeometryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DOMRectList extends js.Object {
  /**
    * total number of DOMRect objects associated with the object.
    * readonly unsigned long length
    */
  var length: Double
  /**
    * the DOMRect object at index must be returned.
    * @param index
    */
  def item(index: Double): DOMRect
}

object DOMRectList {
  @scala.inline
  def apply(item: Double => DOMRect, length: Double): DOMRectList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DOMRectList]
  }
}

