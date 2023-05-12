package typings.ethers.typesEthersMod

import typings.ethers.ethersStrings.nonpayable
import typings.ethers.ethersStrings.pure
import typings.ethers.ethersStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers/types/ethers", "FunctionFragment")
@js.native
open class FunctionFragment protected ()
  extends typings.ethers.typesAbiMod.FunctionFragment {
  /**
    *  @private
    */
  def this(
    guard: Any,
    name: String,
    stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure,
    inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    outputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType]
  ) = this()
  def this(
    guard: Any,
    name: String,
    stateMutability: typings.ethers.ethersStrings.payable | nonpayable | view | pure,
    inputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    outputs: js.Array[typings.ethers.typesAbiFragmentsMod.ParamType],
    gas: js.BigInt
  ) = this()
}
/* static members */
object FunctionFragment {
  
  @JSImport("ethers/types/ethers", "FunctionFragment")
  @js.native
  val ^ : js.Any = js.native
  
  inline def from(obj: Any): typings.ethers.typesAbiFragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(obj.asInstanceOf[js.Any]).asInstanceOf[typings.ethers.typesAbiFragmentsMod.FunctionFragment]
  
  inline def getSelector(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def getSelector(name: String, params: js.Array[Any]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("getSelector")(name.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def isFragment(value: Any): /* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is ethers.ethers/types/abi/fragments.FunctionFragment */ Boolean]
}
