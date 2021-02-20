package typings.ethersprojectAbstractSigner

import typings.ethersprojectAbstractProvider.mod.BlockTag
import typings.ethersprojectAbstractProvider.mod.Provider
import typings.ethersprojectAbstractProvider.mod.TransactionRequest
import typings.ethersprojectAbstractProvider.mod.TransactionResponse
import typings.ethersprojectAbstractSigner.anon.DeferrableTransactionRequ
import typings.ethersprojectBignumber.bignumberMod.BigNumberish
import typings.ethersprojectBignumber.mod.BigNumber
import typings.ethersprojectBytes.mod.Bytes
import typings.ethersprojectBytes.mod.BytesLike
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ethersproject/abstract-signer", "Signer")
  @js.native
  abstract class Signer () extends StObject {
    
    def _checkProvider(): Unit = js.native
    def _checkProvider(operation: String): Unit = js.native
    
    val _isSigner: Boolean = js.native
    
    def call(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
    def call(transaction: DeferrableTransactionRequ, blockTag: BlockTag): js.Promise[String] = js.native
    
    def checkTransaction(transaction: DeferrableTransactionRequ): DeferrableTransactionRequ = js.native
    
    def connect(provider: Provider): Signer = js.native
    
    def estimateGas(transaction: DeferrableTransactionRequ): js.Promise[BigNumber] = js.native
    
    def getAddress(): js.Promise[String] = js.native
    
    def getBalance(): js.Promise[BigNumber] = js.native
    def getBalance(blockTag: BlockTag): js.Promise[BigNumber] = js.native
    
    def getChainId(): js.Promise[Double] = js.native
    
    def getGasPrice(): js.Promise[BigNumber] = js.native
    
    def getTransactionCount(): js.Promise[Double] = js.native
    def getTransactionCount(blockTag: BlockTag): js.Promise[Double] = js.native
    
    def populateTransaction(transaction: DeferrableTransactionRequ): js.Promise[TransactionRequest] = js.native
    
    val provider: js.UndefOr[Provider] = js.native
    
    def resolveName(name: String): js.Promise[String] = js.native
    
    def sendTransaction(transaction: DeferrableTransactionRequ): js.Promise[TransactionResponse] = js.native
    
    def signMessage(message: String): js.Promise[String] = js.native
    def signMessage(message: Bytes): js.Promise[String] = js.native
    
    def signTransaction(transaction: DeferrableTransactionRequ): js.Promise[String] = js.native
  }
  /* static members */
  object Signer {
    
    @JSImport("@ethersproject/abstract-signer", "Signer.isSigner")
    @js.native
    def isSigner(value: js.Any): /* is @ethersproject/abstract-signer.@ethersproject/abstract-signer.Signer */ Boolean = js.native
  }
  
  @JSImport("@ethersproject/abstract-signer", "VoidSigner")
  @js.native
  class VoidSigner protected ()
    extends Signer
       with TypedDataSigner {
    def this(address: String) = this()
    def this(address: String, provider: Provider) = this()
    
    def _fail(message: String, operation: String): js.Promise[_] = js.native
    
    val address: String = js.native
  }
  
  @js.native
  trait ExternallyOwnedAccount extends StObject {
    
    val address: String = js.native
    
    val privateKey: String = js.native
  }
  object ExternallyOwnedAccount {
    
    @scala.inline
    def apply(address: String, privateKey: String): ExternallyOwnedAccount = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], privateKey = privateKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExternallyOwnedAccount]
    }
    
    @scala.inline
    implicit class ExternallyOwnedAccountMutableBuilder[Self <: ExternallyOwnedAccount] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKey(value: String): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypedDataDomain extends StObject {
    
    var chainId: js.UndefOr[BigNumberish] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var salt: js.UndefOr[BytesLike] = js.native
    
    var verifyingContract: js.UndefOr[String] = js.native
    
    var version: js.UndefOr[String] = js.native
  }
  object TypedDataDomain {
    
    @scala.inline
    def apply(): TypedDataDomain = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TypedDataDomain]
    }
    
    @scala.inline
    implicit class TypedDataDomainMutableBuilder[Self <: TypedDataDomain] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChainId(value: BigNumberish): Self = StObject.set(x, "chainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChainIdUndefined: Self = StObject.set(x, "chainId", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setSalt(value: BytesLike): Self = StObject.set(x, "salt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSaltUndefined: Self = StObject.set(x, "salt", js.undefined)
      
      @scala.inline
      def setVerifyingContract(value: String): Self = StObject.set(x, "verifyingContract", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerifyingContractUndefined: Self = StObject.set(x, "verifyingContract", js.undefined)
      
      @scala.inline
      def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait TypedDataField extends StObject {
    
    var name: String = js.native
    
    var `type`: String = js.native
  }
  object TypedDataField {
    
    @scala.inline
    def apply(name: String, `type`: String): TypedDataField = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypedDataField]
    }
    
    @scala.inline
    implicit class TypedDataFieldMutableBuilder[Self <: TypedDataField] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypedDataSigner extends StObject {
    
    def _signTypedData(domain: TypedDataDomain, types: Record[String, js.Array[TypedDataField]], value: Record[String, _]): js.Promise[String] = js.native
  }
  object TypedDataSigner {
    
    @scala.inline
    def apply(
      _signTypedData: (TypedDataDomain, Record[String, js.Array[TypedDataField]], Record[String, _]) => js.Promise[String]
    ): TypedDataSigner = {
      val __obj = js.Dynamic.literal(_signTypedData = js.Any.fromFunction3(_signTypedData))
      __obj.asInstanceOf[TypedDataSigner]
    }
    
    @scala.inline
    implicit class TypedDataSignerMutableBuilder[Self <: TypedDataSigner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_signTypedData(
        value: (TypedDataDomain, Record[String, js.Array[TypedDataField]], Record[String, _]) => js.Promise[String]
      ): Self = StObject.set(x, "_signTypedData", js.Any.fromFunction3(value))
    }
  }
}
