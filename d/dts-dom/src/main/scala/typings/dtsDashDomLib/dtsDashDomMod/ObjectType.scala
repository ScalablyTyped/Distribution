package typings
package dtsDashDomLib.dtsDashDomMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectType extends _Type {
  var kind: dtsDashDomLib.dtsDashDomLibStrings.`object`
  var members: js.Array[ObjectTypeMember]
}

object ObjectType {
  @scala.inline
  def apply(kind: dtsDashDomLib.dtsDashDomLibStrings.`object`, members: js.Array[ObjectTypeMember]): ObjectType = {
    val __obj = js.Dynamic.literal(kind = kind, members = members)
  
    __obj.asInstanceOf[ObjectType]
  }
}

