package typings.ethers.mod

import typings.ethers.anon.Data
import typings.ethers.typesUtilsDataMod.BytesLike
import typings.ethers.typesUtilsErrorsMod.CallExceptionAction
import typings.ethers.typesUtilsErrorsMod.CallExceptionError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethers", "AbiCoder")
@js.native
open class AbiCoder ()
  extends typings.ethers.typesEthersMod.AbiCoder
/* static members */
object AbiCoder {
  
  @JSImport("ethers", "AbiCoder")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *  Returns the shared singleton instance of a default [[AbiCoder]].
    *
    *  On the first call, the instance is created internally.
    */
  inline def defaultAbiCoder(): typings.ethers.typesAbiAbiCoderMod.AbiCoder = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultAbiCoder")().asInstanceOf[typings.ethers.typesAbiAbiCoderMod.AbiCoder]
  
  /**
    *  Returns an ethers-compatible [[CallExceptionError]] Error for the given
    *  result %%data%% for the [[CallExceptionAction]] %%action%% against
    *  the Transaction %%tx%%.
    */
  inline def getBuiltinCallException(action: CallExceptionAction, tx: Data): CallExceptionError = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuiltinCallException")(action.asInstanceOf[js.Any], tx.asInstanceOf[js.Any])).asInstanceOf[CallExceptionError]
  inline def getBuiltinCallException(action: CallExceptionAction, tx: Data, data: BytesLike): CallExceptionError = (^.asInstanceOf[js.Dynamic].applyDynamic("getBuiltinCallException")(action.asInstanceOf[js.Any], tx.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[CallExceptionError]
}
