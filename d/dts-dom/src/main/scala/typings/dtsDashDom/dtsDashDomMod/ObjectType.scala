package typings.dtsDashDom.dtsDashDomMod

import typings.dtsDashDom.dtsDashDomStrings.`object`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectType extends _Type {
  var kind: `object`
  var members: js.Array[ObjectTypeMember]
}

object ObjectType {
  @scala.inline
  def apply(kind: `object`, members: js.Array[ObjectTypeMember]): ObjectType = {
    val __obj = js.Dynamic.literal(kind = kind, members = members)
  
    __obj.asInstanceOf[ObjectType]
  }
}

