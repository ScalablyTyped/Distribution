package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.intersection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntersectionType extends _Type {
  var kind: intersection
  var members: js.Array[Type]
}

object IntersectionType {
  @scala.inline
  def apply(kind: intersection, members: js.Array[Type]): IntersectionType = {
    val __obj = js.Dynamic.literal(kind = kind, members = members)
  
    __obj.asInstanceOf[IntersectionType]
  }
}

