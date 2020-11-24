package typings.ethersprojectAbi.fragmentsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@ethersproject/abi/lib/fragments", "EventFragment")
@js.native
class EventFragment () extends Fragment {
  
  val anonymous: Boolean = js.native
}
/* static members */
@JSImport("@ethersproject/abi/lib/fragments", "EventFragment")
@js.native
object EventFragment extends js.Object {
  
  def from(value: String): EventFragment = js.native
  def from(value: EventFragment): EventFragment = js.native
  def from(value: JsonFragment): EventFragment = js.native
  
  def fromObject(value: EventFragment): EventFragment = js.native
  def fromObject(value: JsonFragment): EventFragment = js.native
  
  def fromString(value: String): EventFragment = js.native
  
  def isEventFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = js.native
}
