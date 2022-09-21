package typings.ethersprojectAbi

import org.scalablytyped.runtime.TopLevel
import typings.ethersprojectAbi.abiCoderMod.CoerceFunc
import typings.ethersprojectAbi.abstractCoderMod.Result
import typings.ethersprojectAbi.anon.Error
import typings.ethersprojectAbi.fragmentsMod.JsonFragment
import typings.ethersprojectAbi.fragmentsMod.JsonFragmentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abi", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ethersproject/abi", "AbiCoder")
  @js.native
  open class AbiCoder ()
    extends typings.ethersprojectAbi.abiCoderMod.AbiCoder {
    def this(coerceFunc: CoerceFunc) = this()
  }
  
  @JSImport("@ethersproject/abi", "ConstructorFragment")
  @js.native
  open class ConstructorFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.ConstructorFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ConstructorFragment {
    
    @JSImport("@ethersproject/abi", "ConstructorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ConstructorFragment]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.ConstructorFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ConstructorFragment]
    inline def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ConstructorFragment]
    
    inline def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ConstructorFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ConstructorFragment]
    inline def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ConstructorFragment]
    
    inline def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ConstructorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ConstructorFragment]
    
    inline def isConstructorFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isConstructorFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ConstructorFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "ErrorFragment")
  @js.native
  open class ErrorFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.ErrorFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ErrorFragment {
    
    @JSImport("@ethersproject/abi", "ErrorFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typings.ethersprojectAbi.fragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ErrorFragment]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.ErrorFragment): typings.ethersprojectAbi.fragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ErrorFragment]
    inline def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ErrorFragment]
    
    inline def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ErrorFragment): typings.ethersprojectAbi.fragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ErrorFragment]
    inline def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ErrorFragment]
    
    inline def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ErrorFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ErrorFragment]
    
    inline def isErrorFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ErrorFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isErrorFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ErrorFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "EventFragment")
  @js.native
  open class EventFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.EventFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object EventFragment {
    
    @JSImport("@ethersproject/abi", "EventFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typings.ethersprojectAbi.fragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.EventFragment]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.EventFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.EventFragment]
    inline def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.EventFragment]
    
    inline def fromObject(value: typings.ethersprojectAbi.fragmentsMod.EventFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.EventFragment]
    inline def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.EventFragment]
    
    inline def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.EventFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.EventFragment]
    
    inline def isEventFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isEventFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.EventFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "Fragment")
  @js.native
  abstract class Fragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.Fragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object Fragment {
    
    @JSImport("@ethersproject/abi", "Fragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.Fragment]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.Fragment]
    inline def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.Fragment]
    
    inline def fromObject(value: typings.ethersprojectAbi.fragmentsMod.Fragment): typings.ethersprojectAbi.fragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.Fragment]
    inline def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.Fragment]
    
    inline def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.Fragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.Fragment]
    
    inline def isFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.Fragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "FunctionFragment")
  @js.native
  open class FunctionFragment protected ()
    extends typings.ethersprojectAbi.fragmentsMod.FunctionFragment {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object FunctionFragment {
    
    @JSImport("@ethersproject/abi", "FunctionFragment")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.FunctionFragment]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.FunctionFragment]
    inline def from(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.FunctionFragment]
    
    inline def fromObject(value: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.FunctionFragment]
    inline def fromObject(value: JsonFragment): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.FunctionFragment]
    
    inline def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.FunctionFragment = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.FunctionFragment]
    
    inline def isFunctionFragment(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFunctionFragment")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.FunctionFragment */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "Indexed")
  @js.native
  open class Indexed protected ()
    extends typings.ethersprojectAbi.interfaceMod.Indexed {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed ]: @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed[K]}
      */ typings.ethersprojectAbi.ethersprojectAbiStrings.Indexed & TopLevel[typings.ethersprojectAbi.interfaceMod.Indexed]) = this()
  }
  /* static members */
  object Indexed {
    
    @JSImport("@ethersproject/abi", "Indexed")
    @js.native
    val ^ : js.Any = js.native
    
    inline def isIndexed(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIndexed")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Indexed */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "Interface")
  @js.native
  open class Interface protected ()
    extends typings.ethersprojectAbi.interfaceMod.Interface {
    def this(fragments: String) = this()
    def this(fragments: js.Array[typings.ethersprojectAbi.fragmentsMod.Fragment | JsonFragment | String]) = this()
  }
  /* static members */
  object Interface {
    
    @JSImport("@ethersproject/abi", "Interface")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getAbiCoder(): typings.ethersprojectAbi.abiCoderMod.AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("getAbiCoder")().asInstanceOf[typings.ethersprojectAbi.abiCoderMod.AbiCoder]
    
    inline def getAddress(address: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAddress")(address.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getEventTopic(eventFragment: typings.ethersprojectAbi.fragmentsMod.EventFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getEventTopic")(eventFragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def getSighash(fragment: typings.ethersprojectAbi.fragmentsMod.ErrorFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    inline def getSighash(fragment: typings.ethersprojectAbi.fragmentsMod.FunctionFragment): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSighash")(fragment.asInstanceOf[js.Any]).asInstanceOf[String]
    
    inline def isInterface(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInterface")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/interface.Interface */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "LogDescription")
  @js.native
  open class LogDescription protected ()
    extends typings.ethersprojectAbi.interfaceMod.LogDescription {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.LogDescription[K]}
      */ typings.ethersprojectAbi.ethersprojectAbiStrings.LogDescription & TopLevel[typings.ethersprojectAbi.interfaceMod.LogDescription]) = this()
  }
  
  @JSImport("@ethersproject/abi", "ParamType")
  @js.native
  open class ParamType protected ()
    extends typings.ethersprojectAbi.fragmentsMod.ParamType {
    def this(constructorGuard: Any, params: Any) = this()
  }
  /* static members */
  object ParamType {
    
    @JSImport("@ethersproject/abi", "ParamType")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def from(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def from(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def from(value: JsonFragmentType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def from(value: typings.ethersprojectAbi.fragmentsMod.ParamType, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("from")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    
    inline def fromObject(value: JsonFragmentType): typings.ethersprojectAbi.fragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def fromObject(value: typings.ethersprojectAbi.fragmentsMod.ParamType): typings.ethersprojectAbi.fragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    
    inline def fromString(value: String): typings.ethersprojectAbi.fragmentsMod.ParamType = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any]).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    inline def fromString(value: String, allowIndexed: Boolean): typings.ethersprojectAbi.fragmentsMod.ParamType = (^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(value.asInstanceOf[js.Any], allowIndexed.asInstanceOf[js.Any])).asInstanceOf[typings.ethersprojectAbi.fragmentsMod.ParamType]
    
    inline def isParamType(value: Any): /* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isParamType")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abi.@ethersproject/abi/lib/fragments.ParamType */ Boolean]
  }
  
  @JSImport("@ethersproject/abi", "TransactionDescription")
  @js.native
  open class TransactionDescription protected ()
    extends typings.ethersprojectAbi.interfaceMod.TransactionDescription {
    def this(info: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ K in keyof @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription ]: @ethersproject/abi.@ethersproject/abi/lib/interface.TransactionDescription[K]}
      */ typings.ethersprojectAbi.ethersprojectAbiStrings.TransactionDescription & TopLevel[typings.ethersprojectAbi.interfaceMod.TransactionDescription]) = this()
  }
  
  inline def checkResultErrors(result: Result): js.Array[Error] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkResultErrors")(result.asInstanceOf[js.Any]).asInstanceOf[js.Array[Error]]
  
  @JSImport("@ethersproject/abi", "defaultAbiCoder")
  @js.native
  val defaultAbiCoder: typings.ethersprojectAbi.abiCoderMod.AbiCoder = js.native
}
