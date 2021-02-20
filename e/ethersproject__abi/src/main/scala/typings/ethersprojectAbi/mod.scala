package typings.ethersprojectAbi

import org.scalablytyped.runtime.TopLevel
import typings.ethersprojectAbi.abiCoderMod.CoerceFunc
import typings.ethersprojectAbi.abstractCoderMod.Result
import typings.ethersprojectAbi.anon.Error
import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import typings.ethersprojectAbi.fragmentsMod.JsonFragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abi", "AbiCoder")
  @js.native
  class AbiCoder ()
    extends typings.ethersprojectAbi.abiCoderMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @JSImport("@ethersproject/abi", "ConstructorFragment")
  @js.native
  class ConstructorFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.ConstructorFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.from")
    @js.native
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    @JSImport("@ethersproject/abi", "ConstructorFragment.from")
    @js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.ConstructorFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    @JSImport("@ethersproject/abi", "ConstructorFragment.from")
    @js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.fromObject")
    @js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ConstructorFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    @JSImport("@ethersproject/abi", "ConstructorFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.fromString")
    @js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = js.native
    
    @JSImport("@ethersproject/abi", "ConstructorFragment.isConstructorFragment")
    @js.native
    def isConstructorFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "EventFragment")
  @js.native
  class EventFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.EventFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object EventFragment {
    
    @JSImport("@ethersproject/abi", "EventFragment.from")
    @js.native
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    @JSImport("@ethersproject/abi", "EventFragment.from")
    @js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.EventFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    @JSImport("@ethersproject/abi", "EventFragment.from")
    @js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    @JSImport("@ethersproject/abi", "EventFragment.fromObject")
    @js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.EventFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    @JSImport("@ethersproject/abi", "EventFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    @JSImport("@ethersproject/abi", "EventFragment.fromString")
    @js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.EventFragment = js.native
    
    @JSImport("@ethersproject/abi", "EventFragment.isEventFragment")
    @js.native
    def isEventFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "Fragment")
  @js.native
  abstract class Fragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.Fragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object Fragment {
    
    @JSImport("@ethersproject/abi", "Fragment.from")
    @js.native
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    @JSImport("@ethersproject/abi", "Fragment.from")
    @js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    @JSImport("@ethersproject/abi", "Fragment.from")
    @js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    
    @JSImport("@ethersproject/abi", "Fragment.fromObject")
    @js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    @JSImport("@ethersproject/abi", "Fragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    
    @JSImport("@ethersproject/abi", "Fragment.fromString")
    @js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = js.native
    
    @JSImport("@ethersproject/abi", "Fragment.isFragment")
    @js.native
    def isFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "FunctionFragment")
  @js.native
  class FunctionFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.FunctionFragment {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("@ethersproject/abi", "FunctionFragment.from")
    @js.native
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    @JSImport("@ethersproject/abi", "FunctionFragment.from")
    @js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    @JSImport("@ethersproject/abi", "FunctionFragment.from")
    @js.native
    def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi", "FunctionFragment.fromObject")
    @js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    @JSImport("@ethersproject/abi", "FunctionFragment.fromObject")
    @js.native
    def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi", "FunctionFragment.fromString")
    @js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = js.native
    
    @JSImport("@ethersproject/abi", "FunctionFragment.isFunctionFragment")
    @js.native
    def isFunctionFragment(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "Indexed")
  @js.native
  class Indexed protected ()
    extends typings.ethersprojectAbi.interfaceMod.Indexed {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed ]: @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed[K]}
      */ typings.ethersprojectAbi.ethersprojectAbiStrings.Indexed with TopLevel[typings.ethersprojectAbi.interfaceMod.Indexed]) = this()
  }
  /* static members */
  object Indexed {
    
    @JSImport("@ethersproject/abi", "Indexed.isIndexed")
    @js.native
    def isIndexed(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "Interface")
  @js.native
  class Interface protected ()
    extends typings.ethersprojectAbi.interfaceMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[typings.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
  }
  /* static members */
  object Interface {
    
    @JSImport("@ethersproject/abi", "Interface.getAbiCoder")
    @js.native
    def getAbiCoder(): typings.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
    
    @JSImport("@ethersproject/abi", "Interface.getAddress")
    @js.native
    def getAddress(address: String): String = js.native
    
    @JSImport("@ethersproject/abi", "Interface.getEventTopic")
    @js.native
    def getEventTopic(eventFragment: typings.ethersprojectAbi.fragmentsMod.EventFragment): String = js.native
    
    @JSImport("@ethersproject/abi", "Interface.getSighash")
    @js.native
    def getSighash(functionFragment: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): String = js.native
    
    @JSImport("@ethersproject/abi", "Interface.isInterface")
    @js.native
    def isInterface(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "LogDescription")
  @js.native
  class LogDescription protected ()
    extends typings.ethersprojectAbi.interfaceMod.LogDescription {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription[K]}
      */ typings.ethersprojectAbi.ethersprojectAbiStrings.LogDescription with TopLevel[typings.ethersprojectAbi.interfaceMod.LogDescription]) = this()
  }
  
  @JSImport("@ethersproject/abi", "ParamType")
  @js.native
  class ParamType protected ()
    extends typings.ethersprojectAbi.fragmentsMod.ParamType {
    def this(constructorGuard: js.Any, params: js.Any) = this()
  }
  /* static members */
  object ParamType {
    
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: JsonFragmentType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.from")
    @js.native
    def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    @JSImport("@ethersproject/abi", "ParamType.fromObject")
    @js.native
    def fromObject(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.fromObject")
    @js.native
    def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    @JSImport("@ethersproject/abi", "ParamType.fromString")
    @js.native
    def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    @JSImport("@ethersproject/abi", "ParamType.fromString")
    @js.native
    def fromString(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = js.native
    
    @JSImport("@ethersproject/abi", "ParamType.isParamType")
    @js.native
    def isParamType(value: js.Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abi", "TransactionDescription")
  @js.native
  class TransactionDescription protected ()
    extends typings.ethersprojectAbi.interfaceMod.TransactionDescription {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription[K]}
      */ typings.ethersprojectAbi.ethersprojectAbiStrings.TransactionDescription with TopLevel[typings.ethersprojectAbi.interfaceMod.TransactionDescription]) = this()
  }
  
  @JSImport("@ethersproject/abi", "checkResultErrors")
  @js.native
  def checkResultErrors(result: Result): js.Array[Error] = js.native
  
  @JSImport("@ethersproject/abi", "defaultAbiCoder")
  @js.native
  val defaultAbiCoder: typings.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
}
