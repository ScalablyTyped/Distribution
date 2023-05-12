package typings.ethers.typesEthersMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "EventFragment")
@js.native
open class EventFragment protected ()
  extends typings.ethers.typesAbiMod.EventFragment {
  /**
    *  @private
    */
  def this(
    guard: Any,
    name: String,
    inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    anonymous: Boolean
  ) = this()
}
/* static members */
object EventFragment {
  
  @JSImport("ethers/types/ethers", "EventFragment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.EventFragment]
  
  inline def getTopicHash(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTopicHash")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getTopicHash(name: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getTopicHash")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.EventFragment */ Boolean]
}
