package typings.digibyte

import typings.digibyte.anon.PrevHash
import typings.digibyte.anon.Reverse
import typings.digibyte.digibyteStrings.little
import typings.digibyte.mod.Networks.Network
import typings.digibyte.mod.Transaction.Input
import typings.digibyte.mod.Transaction.Output
import typings.digibyte.mod.Transaction.UnspentOutput
import typings.digibyte.mod.crypto.Signature
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("digibyte", "Address")
  @js.native
  open class Address protected () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    def this(data: js.typedarray.Uint8Array) = this()
    def this(data: Buffer) = this()
    def this(data: String, network: Network) = this()
    def this(data: js.Object, network: Network) = this()
    def this(data: js.typedarray.Uint8Array, network: Network) = this()
    def this(data: Buffer, network: Network) = this()
    def this(data: String, network: scala.Unit, `type`: String) = this()
    def this(data: String, network: Network, `type`: String) = this()
    def this(data: js.Object, network: scala.Unit, `type`: String) = this()
    def this(data: js.Object, network: Network, `type`: String) = this()
    def this(data: js.typedarray.Uint8Array, network: scala.Unit, `type`: String) = this()
    def this(data: js.typedarray.Uint8Array, network: Network, `type`: String) = this()
    def this(data: Buffer, network: scala.Unit, `type`: String) = this()
    def this(data: Buffer, network: Network, `type`: String) = this()
    
    val hashBuffer: Buffer = js.native
    
    val network: Network = js.native
    
    val `type`: String = js.native
  }
  /* static members */
  object Address {
    
    @JSImport("digibyte", "Address")
    @js.native
    val ^ : js.Any = js.native
    
    inline def getValidationError(input: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(input.asInstanceOf[js.Any]).asInstanceOf[js.Error]
    inline def getValidationError(input: String, network: scala.Unit, payToPublicKeyHash: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def getValidationError(input: String, network: scala.Unit, payToPublicKeyHash: Buffer): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def getValidationError(input: String, network: Network): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def getValidationError(input: String, network: Network, payToPublicKeyHash: String): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    inline def getValidationError(input: String, network: Network, payToPublicKeyHash: Buffer): js.Error = (^.asInstanceOf[js.Dynamic].applyDynamic("getValidationError")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[js.Error]
    
    inline def isValid(input: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    inline def isValid(input: String, network: scala.Unit, payToPublicKeyHash: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isValid(input: String, network: scala.Unit, payToPublicKeyHash: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isValid(input: String, network: Network): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isValid(input: String, network: Network, payToPublicKeyHash: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    inline def isValid(input: String, network: Network, payToPublicKeyHash: Buffer): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(input.asInstanceOf[js.Any], network.asInstanceOf[js.Any], payToPublicKeyHash.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  }
  
  @JSImport("digibyte", "Block")
  @js.native
  open class Block protected () extends StObject {
    def this(data: js.Object) = this()
    def this(data: Buffer) = this()
    
    var hash: String = js.native
    
    var header: PrevHash = js.native
    
    var height: Double = js.native
    
    var transactions: js.Array[Transaction] = js.native
  }
  
  @JSImport("digibyte", "HDPrivateKey")
  @js.native
  open class HDPrivateKey () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    def this(data: Buffer) = this()
    
    def derive(arg: String): HDPrivateKey = js.native
    def derive(arg: String, hardened: Boolean): HDPrivateKey = js.native
    def derive(arg: Double): HDPrivateKey = js.native
    def derive(arg: Double, hardened: Boolean): HDPrivateKey = js.native
    
    def deriveChild(arg: String): HDPrivateKey = js.native
    def deriveChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
    def deriveChild(arg: Double): HDPrivateKey = js.native
    def deriveChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
    
    def deriveNonCompliantChild(arg: String): HDPrivateKey = js.native
    def deriveNonCompliantChild(arg: String, hardened: Boolean): HDPrivateKey = js.native
    def deriveNonCompliantChild(arg: Double): HDPrivateKey = js.native
    def deriveNonCompliantChild(arg: Double, hardened: Boolean): HDPrivateKey = js.native
    
    val hdPublicKey: HDPublicKey = js.native
    
    def toJSON(): js.Object = js.native
    
    def toObject(): js.Object = js.native
  }
  
  @JSImport("digibyte", "HDPublicKey")
  @js.native
  open class HDPublicKey protected () extends StObject {
    def this(arg: String) = this()
    def this(arg: js.Object) = this()
    def this(arg: Buffer) = this()
    
    val depth: Double = js.native
    
    def derive(arg: String): HDPublicKey = js.native
    def derive(arg: String, hardened: Boolean): HDPublicKey = js.native
    def derive(arg: Double): HDPublicKey = js.native
    def derive(arg: Double, hardened: Boolean): HDPublicKey = js.native
    
    def deriveChild(arg: String): HDPublicKey = js.native
    def deriveChild(arg: String, hardened: Boolean): HDPublicKey = js.native
    def deriveChild(arg: Double): HDPublicKey = js.native
    def deriveChild(arg: Double, hardened: Boolean): HDPublicKey = js.native
    
    val fingerPrint: Buffer = js.native
    
    val network: Network = js.native
    
    val publicKey: PublicKey = js.native
    
    val xpubkey: Buffer = js.native
  }
  
  object Networks {
    
    @JSImport("digibyte", "Networks")
    @js.native
    val ^ : js.Any = js.native
    
    inline def add(data: Any): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("add")(data.asInstanceOf[js.Any]).asInstanceOf[Network]
    
    inline def get(args: String, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
    inline def get(args: String, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
    inline def get(args: Double, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
    inline def get(args: Double, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
    inline def get(args: Network, keys: String): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
    inline def get(args: Network, keys: js.Array[String]): Network = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(args.asInstanceOf[js.Any], keys.asInstanceOf[js.Any])).asInstanceOf[Network]
    
    @JSImport("digibyte", "Networks.livenet")
    @js.native
    val livenet: Network = js.native
    
    @JSImport("digibyte", "Networks.mainnet")
    @js.native
    val mainnet: Network = js.native
    
    inline def remove(network: Network): scala.Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(network.asInstanceOf[js.Any]).asInstanceOf[scala.Unit]
    
    @JSImport("digibyte", "Networks.testnet")
    @js.native
    val testnet: Network = js.native
    
    trait Network extends StObject {
      
      val alias: String
      
      val name: String
    }
    object Network {
      
      inline def apply(alias: String, name: String): Network = {
        val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
        __obj.asInstanceOf[Network]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Network] (val x: Self) extends AnyVal {
        
        inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
        
        inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @JSImport("digibyte", "PrivateKey")
  @js.native
  open class PrivateKey () extends StObject {
    def this(key: String) = this()
    def this(key: String, network: Network) = this()
    def this(key: scala.Unit, network: Network) = this()
    
    val network: Network = js.native
    
    val publicKey: PublicKey = js.native
    
    def toAddress(): Address = js.native
    
    def toJSON(): js.Object = js.native
    
    def toObject(): js.Object = js.native
    
    def toPublicKey(): PublicKey = js.native
    
    def toWIF(): String = js.native
  }
  
  @JSImport("digibyte", "PublicKey")
  @js.native
  open class PublicKey protected () extends StObject {
    def this(source: String) = this()
    
    def toBuffer(): Buffer = js.native
    
    def toDER(): Buffer = js.native
  }
  /* static members */
  object PublicKey {
    
    @JSImport("digibyte", "PublicKey")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromPrivateKey(privateKey: PrivateKey): PublicKey = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPrivateKey")(privateKey.asInstanceOf[js.Any]).asInstanceOf[PublicKey]
  }
  
  @JSImport("digibyte", "Script")
  @js.native
  open class Script protected () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    
    def add(obj: Any): this.type = js.native
    
    def checkMinimalPush(i: Double): Boolean = js.native
    
    def classify(): String = js.native
    
    def classifyInput(): String = js.native
    
    def classifyOutput(): String = js.native
    
    def equals(script: Script): Boolean = js.native
    
    def findAndDelete(script: Script): this.type = js.native
    
    def getAddressInfo(): Address | Boolean = js.native
    
    def getData(): Buffer = js.native
    
    def getPublicKey(): Buffer = js.native
    
    def getPublicKeyHash(): Buffer = js.native
    
    def getSignatureOperationsCount(accurate: Boolean): Double = js.native
    
    def hasCodeseparators(): Boolean = js.native
    
    def isDataOut(): Boolean = js.native
    
    def isMultisigIn(): Boolean = js.native
    
    def isMultisigOut(): Boolean = js.native
    
    def isPublicKeyHashIn(): Boolean = js.native
    
    def isPublicKeyHashOut(): Boolean = js.native
    
    def isPublicKeyIn(): Boolean = js.native
    
    def isPublicKeyOut(): Boolean = js.native
    
    def isPushOnly(): Boolean = js.native
    
    def isScriptHashIn(): Boolean = js.native
    
    def isScriptHashOut(): Boolean = js.native
    
    def isStandard(): Boolean = js.native
    
    def isWitnessProgram(): Boolean = js.native
    
    def isWitnessPublicKeyHashOut(): Boolean = js.native
    
    def isWitnessScriptHashOut(): Boolean = js.native
    
    def prepend(obj: Any): this.type = js.native
    
    def removeCodeseparators(): this.type = js.native
    
    def set(obj: js.Object): this.type = js.native
    
    def toASM(): String = js.native
    
    def toAddress(): Address = js.native
    
    def toBuffer(): Buffer = js.native
    
    def toHex(): String = js.native
  }
  object Script {
    
    @JSImport("digibyte", "Script")
    @js.native
    val ^ : js.Any = js.native
    
    inline def buildDataOut(data: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any]).asInstanceOf[Script]
    inline def buildDataOut(data: String, encoding: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Script]
    inline def buildDataOut(data: Buffer): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any]).asInstanceOf[Script]
    inline def buildDataOut(data: Buffer, encoding: String): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildDataOut")(data.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[Script]
    
    inline def buildMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMultisigIn")(pubkeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
    
    inline def buildMultisigOut(publicKeys: js.Array[PublicKey], threshold: Double, opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildMultisigOut")(publicKeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
    
    inline def buildP2SHMultisigIn(pubkeys: js.Array[PublicKey], threshold: Double, signatures: js.Array[Buffer], opts: js.Object): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildP2SHMultisigIn")(pubkeys.asInstanceOf[js.Any], threshold.asInstanceOf[js.Any], signatures.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Script]
    
    inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Signature, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
    inline def buildPublicKeyHashIn(publicKey: PublicKey, signature: Buffer, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashIn")(publicKey.asInstanceOf[js.Any], signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
    
    inline def buildPublicKeyHashOut(address: Address): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyHashOut")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
    
    inline def buildPublicKeyIn(signature: Signature, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyIn")(signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
    inline def buildPublicKeyIn(signature: Buffer, sigtype: Double): Script = (^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyIn")(signature.asInstanceOf[js.Any], sigtype.asInstanceOf[js.Any])).asInstanceOf[Script]
    
    inline def buildPublicKeyOut(pubkey: PublicKey): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildPublicKeyOut")(pubkey.asInstanceOf[js.Any]).asInstanceOf[Script]
    
    inline def buildScriptHashOut(script: Script): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildScriptHashOut")(script.asInstanceOf[js.Any]).asInstanceOf[Script]
    
    inline def buildWitnessMultisigOutFromScript(script: Script): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("buildWitnessMultisigOutFromScript")(script.asInstanceOf[js.Any]).asInstanceOf[Script]
    
    inline def empty(): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("empty")().asInstanceOf[Script]
    
    inline def fromAddress(address: String): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
    inline def fromAddress(address: Address): Script = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAddress")(address.asInstanceOf[js.Any]).asInstanceOf[Script]
    
    object types {
      
      @JSImport("digibyte", "Script.types")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("digibyte", "Script.types.DATA_OUT")
      @js.native
      def DATA_OUT: String = js.native
      inline def DATA_OUT_=(x: String): scala.Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DATA_OUT")(x.asInstanceOf[js.Any])
    }
  }
  
  @JSImport("digibyte", "Transaction")
  @js.native
  open class Transaction () extends StObject {
    def this(serialized: Any) = this()
    
    def addData(value: Buffer): this.type = js.native
    
    def addInput(input: Input): this.type = js.native
    
    def addOutput(output: Output): this.type = js.native
    
    def applySignature(sig: Signature): this.type = js.native
    
    def change(address: String): this.type = js.native
    def change(address: Address): this.type = js.native
    
    def enableRBF(): this.type = js.native
    
    def fee(amount: Double): this.type = js.native
    
    def feePerKb(amount: Double): this.type = js.native
    
    def from(utxos: js.Array[UnspentOutput]): this.type = js.native
    
    def getChangeOutput(): Output | Null = js.native
    
    def getFee(): Double = js.native
    
    def getLockTime(): js.Date | Double = js.native
    
    def hasWitnesses(): Boolean = js.native
    
    val hash: String = js.native
    
    val id: String = js.native
    
    var inputs: js.Array[Input] = js.native
    
    def inspect(): String = js.native
    
    def isCoinbase(): Boolean = js.native
    
    def isRBF(): Boolean = js.native
    
    def lockUntilBlockHeight(height: Double): this.type = js.native
    
    def lockUntilDate(time: js.Date): this.type = js.native
    def lockUntilDate(time: Double): this.type = js.native
    
    var nid: String = js.native
    
    var outputs: js.Array[Output] = js.native
    
    def serialize(): String = js.native
    
    def sign(privateKey: String): this.type = js.native
    def sign(privateKey: PrivateKey): this.type = js.native
    
    def to(address: String, amount: Double): this.type = js.native
    def to(address: js.Array[Address], amount: Double): this.type = js.native
    def to(address: Address, amount: Double): this.type = js.native
    
    def verify(): String | Boolean = js.native
  }
  object Transaction {
    
    @JSImport("digibyte", "Transaction.Input")
    @js.native
    open class Input () extends StObject {
      
      val output: js.UndefOr[Output] = js.native
      
      val outputIndex: Double = js.native
      
      val prevTxId: Buffer = js.native
      
      val script: Script = js.native
      
      val sequenceNumber: Double = js.native
    }
    
    @JSImport("digibyte", "Transaction.Output")
    @js.native
    open class Output protected () extends StObject {
      def this(data: js.Object) = this()
      
      def inspect(): String = js.native
      
      val satoshis: Double = js.native
      
      val script: Script = js.native
      
      def setScript(script: String): this.type = js.native
      def setScript(script: Script): this.type = js.native
      def setScript(script: Buffer): this.type = js.native
      
      def toObject(): js.Object = js.native
    }
    
    @JSImport("digibyte", "Transaction.UnspentOutput")
    @js.native
    open class UnspentOutput protected () extends StObject {
      def this(data: js.Object) = this()
      
      val address: Address = js.native
      
      def inspect(): String = js.native
      
      val outputIndex: Double = js.native
      
      val satoshis: Double = js.native
      
      val script: Script = js.native
      
      def toObject(): this.type = js.native
      
      val txId: String = js.native
    }
    object UnspentOutput {
      
      @JSImport("digibyte", "Transaction.UnspentOutput")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromObject(o: js.Object): UnspentOutput = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(o.asInstanceOf[js.Any]).asInstanceOf[UnspentOutput]
    }
  }
  
  @JSImport("digibyte", "URI")
  @js.native
  open class URI protected () extends StObject {
    def this(data: String) = this()
    def this(data: js.Object) = this()
    
    def parse(): Any = js.native
    
    def toObject(): Any = js.native
  }
  /* static members */
  object URI {
    
    @JSImport("digibyte", "URI")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromObject(json: js.Object): URI = ^.asInstanceOf[js.Dynamic].applyDynamic("fromObject")(json.asInstanceOf[js.Any]).asInstanceOf[URI]
    
    inline def fromSatoshis(amount: Double): URI = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSatoshis")(amount.asInstanceOf[js.Any]).asInstanceOf[URI]
    
    inline def fromString(str: String): URI = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(str.asInstanceOf[js.Any]).asInstanceOf[URI]
    
    inline def isValid(data: Boolean): URI = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(data.asInstanceOf[js.Any]).asInstanceOf[URI]
  }
  
  @JSImport("digibyte", "Unit")
  @js.native
  open class Unit protected () extends StObject {
    def this(amount: Double, unitPreference: String) = this()
    
    def toBits(): Double = js.native
    
    def toDGB(): Double = js.native
    
    def toMilis(): Double = js.native
    
    def toSatoshis(): Double = js.native
  }
  /* static members */
  object Unit {
    
    @JSImport("digibyte", "Unit")
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromBits(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBits")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fromDGB(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDGB")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fromFiat(amount: Double, exchangeRate: Double): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFiat")(amount.asInstanceOf[js.Any], exchangeRate.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def fromMilis(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMilis")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def fromSatoshis(amount: Double): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("fromSatoshis")(amount.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  object crypto {
    
    @JSImport("digibyte", "crypto.BN")
    @js.native
    open class BN () extends StObject
    
    object ECDSA {
      
      @JSImport("digibyte", "crypto.ECDSA")
      @js.native
      val ^ : js.Any = js.native
      
      inline def sign(message: Buffer, key: PrivateKey): Signature = (^.asInstanceOf[js.Dynamic].applyDynamic("sign")(message.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Signature]
      
      inline def verify(hashbuf: Buffer, sig: Signature, pubkey: PublicKey): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hashbuf.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any])).asInstanceOf[Boolean]
      
      inline def verify_little(hashbuf: Buffer, sig: Signature, pubkey: PublicKey, endian: little): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("verify")(hashbuf.asInstanceOf[js.Any], sig.asInstanceOf[js.Any], pubkey.asInstanceOf[js.Any], endian.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    }
    
    object Hash {
      
      @JSImport("digibyte", "crypto.Hash")
      @js.native
      val ^ : js.Any = js.native
      
      inline def ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      inline def sha1(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha1")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      inline def sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      inline def sha256hmac(data: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sha256hmac")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
      
      inline def sha256ripemd160(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256ripemd160")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      inline def sha256sha256(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha256sha256")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      inline def sha512(buffer: Buffer): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("sha512")(buffer.asInstanceOf[js.Any]).asInstanceOf[Buffer]
      
      inline def sha512hmac(data: Buffer, key: Buffer): Buffer = (^.asInstanceOf[js.Dynamic].applyDynamic("sha512hmac")(data.asInstanceOf[js.Any], key.asInstanceOf[js.Any])).asInstanceOf[Buffer]
    }
    
    object Random {
      
      @JSImport("digibyte", "crypto.Random")
      @js.native
      val ^ : js.Any = js.native
      
      inline def getRandomBuffer(size: Double): Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("getRandomBuffer")(size.asInstanceOf[js.Any]).asInstanceOf[Buffer]
    }
    
    @JSImport("digibyte", "crypto.Signature")
    @js.native
    open class Signature () extends StObject {
      
      var SIGHASH_ALL: Double = js.native
    }
    object Signature {
      
      @JSImport("digibyte", "crypto.Signature")
      @js.native
      val ^ : js.Any = js.native
      
      /* static member */
      inline def fromDER(sig: Buffer): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDER")(sig.asInstanceOf[js.Any]).asInstanceOf[Signature]
      
      /* static member */
      inline def fromString(data: String): Signature = ^.asInstanceOf[js.Dynamic].applyDynamic("fromString")(data.asInstanceOf[js.Any]).asInstanceOf[Signature]
    }
  }
  
  trait Util extends StObject {
    
    val buffer: Reverse
  }
  object Util {
    
    inline def apply(buffer: Reverse): Util = {
      val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any])
      __obj.asInstanceOf[Util]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Util] (val x: Self) extends AnyVal {
      
      inline def setBuffer(value: Reverse): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
    }
  }
}
