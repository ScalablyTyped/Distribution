package typings.dojo.dojox.dtl.extDojo.NodeList

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * stash or get some arbitrary data on/from these nodes.
  * Stash or get some arbitrary data on/from these nodes. This private _data function is
  * exposed publicly on dojo/NodeList, eg: as the result of a dojo/query call.
  * DIFFERS from jQuery.data in that when used as a getter, the entire list is ALWAYS
  * returned. EVEN WHEN THE LIST IS length == 1.
  *
  * A single-node version of this function is provided as dojo._nodeData, which follows
  * the same signature, though expects a String ID or DomNode reference in the first
  * position, before key/value arguments.
  *
  * @param key               OptionalIf an object, act as a setter and iterate over said object setting data items as defined.If a string, and value present, set the data for defined key to valueIf a string, and value absent, act as a getter, returning the data associated with said key
  * @param value               OptionalThe value to set for said key, provided key is a string (and not an object)
  */
@js.native
trait data extends js.Object {
  def apply(key: String, value: js.Any): js.Any = js.native
  def apply(key: js.Object, value: js.Any): js.Any = js.native
}

