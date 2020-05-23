package typings.ethersprojectAbi

import org.scalablytyped.runtime.StringDictionary
import typings.ethersprojectAbi.abiCoderMod.CoerceFunc
import typings.ethersprojectAbi.abstractCoderMod.Result
import typings.ethersprojectAbi.anon.Error
import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import typings.ethersprojectAbi.fragmentsMod.JsonFragmentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ethersproject/abi", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class AbiCoder ()
    extends typings.ethersprojectAbi.abiCoderMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @js.native
  class ConstructorFragment ()
    extends typings.ethersprojectAbi.fragmentsMod.ConstructorFragment
  
  @js.native
  class EventFragment ()
    extends typings.ethersprojectAbi.fragmentsMod.EventFragment
  
  @js.native
  abstract class Fragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.Fragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  
  @js.native
  class FunctionFragment ()
    extends typings.ethersprojectAbi.fragmentsMod.FunctionFragment
  
  @js.native
  class Indexed ()
    extends typings.ethersprojectAbi.interfaceMod.Indexed
  
  @js.native
  class Interface protected ()
    extends typings.ethersprojectAbi.interfaceMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[typings.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
  }
  
  @js.native
  class LogDescription ()
    extends typings.ethersprojectAbi.interfaceMod.LogDescription
  
  @js.native
  class ParamType protected ()
    extends typings.ethersprojectAbi.fragmentsMod.ParamType {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  
  @js.native
  class TransactionDescription ()
    extends typings.ethersprojectAbi.interfaceMod.TransactionDescription
  
  val defaultAbiCoder: typings.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  /* static members */
  @js.native
  object ConstructorFragment extends js.Object {
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.ConstructorFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ConstructorFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    def isConstructorFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object EventFragment extends js.Object {
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.EventFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.EventFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    def isEventFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = js.native
  }
  
  @js.native
  object FormatTypes extends /* name */ StringDictionary[String]
  
  /* static members */
  @js.native
  object Fragment extends js.Object {
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object FunctionFragment extends js.Object {
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    def isFunctionFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Indexed extends js.Object {
    def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object Interface extends js.Object {
    def getAbiCoder(): typings.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
    def getAddress(address: String): String = js.native
    def getEventTopic(eventFragment: typings.ethersprojectAbi.fragmentsMod.EventFragment): String = js.native
    def getSighash(functionFragment: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): String = js.native
    def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
  }
  
  /* static members */
  @js.native
  object ParamType extends js.Object {
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: JsonFragmentType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def fromObject(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def fromString(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
  }
  
}

