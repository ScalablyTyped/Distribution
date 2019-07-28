package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.union
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnionType extends _Type {
  var kind: union
  var members: js.Array[Type]
}

object UnionType {
  @scala.inline
  def apply(kind: union, members: js.Array[Type]): UnionType = {
    val __obj = js.Dynamic.literal(kind = kind, members = members)
  
    __obj.asInstanceOf[UnionType]
  }
}

