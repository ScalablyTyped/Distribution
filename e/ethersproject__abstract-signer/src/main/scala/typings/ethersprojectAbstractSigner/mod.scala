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
    
    @JSImport("@ethersproject/abstract-signer", "Signer")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def isSigner(value: js.Any): /* is @ethersproject/abstract-signer.@ethersproject/abstract-signer.Signer */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isSigner")(value.asInstanceOf[js.Any]).asInstanceOf[/* is @ethersproject/abstract-signer.@ethersproject/abstract-signer.Signer */ Boolean]
  }
  
  @JSImport("@ethersproject/abstract-signer", "VoidSigner")
  @js.native
  class VoidSigner protected ()
    extends Signer
       with TypedDataSigner {
    def this(address: String) = this()
    def this(address: String, provider: Provider) = this()
    
    def _fail(message: String, operation: String): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def _signTypedData(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, js.Any]
    ): js.Promise[String] = js.native
    
    val address: String = js.native
  }
  
  trait ExternallyOwnedAccount extends StObject {
    
    val address: String
    
    val privateKey: String
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
  
  trait TypedDataDomain extends StObject {
    
    var chainId: js.UndefOr[BigNumberish] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var salt: js.UndefOr[BytesLike] = js.undefined
    
    var verifyingContract: js.UndefOr[String] = js.undefined
    
    var version: js.UndefOr[String] = js.undefined
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
  
  trait TypedDataField extends StObject {
    
    var name: String
    
    var `type`: String
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
  
  trait TypedDataSigner extends StObject {
    
    def _signTypedData(
      domain: TypedDataDomain,
      types: Record[String, js.Array[TypedDataField]],
      value: Record[String, js.Any]
    ): js.Promise[String]
  }
  object TypedDataSigner {
    
    @scala.inline
    def apply(
      _signTypedData: (TypedDataDomain, Record[String, js.Array[TypedDataField]], Record[String, js.Any]) => js.Promise[String]
    ): TypedDataSigner = {
      val __obj = js.Dynamic.literal(_signTypedData = js.Any.fromFunction3(_signTypedData))
      __obj.asInstanceOf[TypedDataSigner]
    }
    
    @scala.inline
    implicit class TypedDataSignerMutableBuilder[Self <: TypedDataSigner] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set_signTypedData(
        value: (TypedDataDomain, Record[String, js.Array[TypedDataField]], Record[String, js.Any]) => js.Promise[String]
      ): Self = StObject.set(x, "_signTypedData", js.Any.fromFunction3(value))
    }
  }
}
