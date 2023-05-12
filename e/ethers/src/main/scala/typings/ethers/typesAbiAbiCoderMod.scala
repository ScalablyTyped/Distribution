package typings.ethers

import typings.ethers.anon.Data
import typings.ethers.typesAbiCodersAbstractCoderMod.Result
import typings.ethers.typesAbiFragmentsMod.ParamType
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CallExceptionAction
import typings.ethers.typesUtilsErrorsMod.CallExceptionError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAbiAbiCoderMod {
  
  @JSImport("ethers/types/abi/abi-coder", "AbiCoder")
  @js.native
  open class AbiCoder () extends StObject {
    
    /**
      *  Decode the ABI %%data%% as the %%types%% into values.
      *
      *  If %%loose%% decoding is enabled, then strict padding is
      *  not enforced. Some older versions of Solidity incorrectly
      *  padded event data emitted from ``external`` functions.
      */
    def decode(types: js.Array[String | ParamType], data: BytesLike): Result = js.native
    def decode(types: js.Array[String | ParamType], data: BytesLike, loose: Boolean): Result = js.native
    
    /**
      *  Encode the %%values%% as the %%types%% into ABI data.
      *
      *  @returns DataHexstring
      */
    def encode(types: js.Array[String | ParamType], values: js.Array[Any]): String = js.native
    
    /**
      *  Get the default values for the given %%types%%.
      *
      *  For example, a ``uint`` is by default ``0`` and ``bool``
      *  is by default ``false``.
      */
    def getDefaultValue(types: js.Array[String | ParamType]): Result = js.native
    
    /* private */ var `private`: Any = js.native
  }
  /* static members */
  object AbiCoder {
    
    @JSImport("ethers/types/abi/abi-coder", "AbiCoder")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *  Returns the shared singleton instance of a default [[AbiCoder]].
      *
      *  On the first call, the instance is created internally.
      */
    inline def defaultAbiCoder(): AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAbiCoder")().asInstanceOf[AbiCoder]
    
    /**
      *  Returns an ethers-compatible [[CallExceptionError]] Error for the given
      *  result %%data%% for the [[CallExceptionAction]] %%action%% against
      *  the Transaction %%tx%%.
      */
    inline def getBuiltinCallException(action: CallExceptionAction, tx: Data): CallExceptionError = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuiltinCallException")(action.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[CallExceptionError]
    inline def getBuiltinCallException(action: CallExceptionAction, tx: Data, data: BytesLike): CallExceptionError = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuiltinCallException")(action.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[CallExceptionError]
  }
}
