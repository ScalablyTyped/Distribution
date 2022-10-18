package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.bnJs.mod.^
import typings.node.bufferMod.global.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEvmEeiMod {
  
  @JSImport("ethereumjs-vm/dist/evm/eei", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with EEI {
    def this(
      env: Env,
      state: typings.ethereumjsVm.distStatePromisifiedMod.default,
      evm: typings.ethereumjsVm.distEvmEvmMod.default,
      common: typings.ethereumjsCommon.mod.default,
      gasLeft: ^
    ) = this()
  }
  
  @js.native
  trait EEI extends StObject {
    
    def _baseCall(msg: typings.ethereumjsVm.distEvmMessageMod.default): js.Promise[^] = js.native
    
    var _common: typings.ethereumjsCommon.mod.default = js.native
    
    var _env: Env = js.native
    
    var _evm: typings.ethereumjsVm.distEvmEvmMod.default = js.native
    
    var _gasLeft: ^ = js.native
    
    /* private */ var _getReturnCode: Any = js.native
    
    var _lastReturned: Buffer = js.native
    
    var _result: RunResult = js.native
    
    def _selfDestruct(toAddress: Buffer): js.Promise[Unit] = js.native
    
    var _state: typings.ethereumjsVm.distStatePromisifiedMod.default = js.native
    
    /**
      * Sends a message with arbitrary data to a given address path.
      */
    def call(gasLimit: ^, address: Buffer, value: ^, data: Buffer): js.Promise[^] = js.native
    
    /**
      * Message-call into this account with an alternative account's code.
      */
    def callCode(gasLimit: ^, address: Buffer, value: ^, data: Buffer): js.Promise[^] = js.native
    
    /**
      * Message-call into this account with an alternative account’s code, but
      * persisting the current values for sender and value.
      */
    def callDelegate(gasLimit: ^, address: Buffer, value: ^, data: Buffer): js.Promise[^] = js.native
    
    /**
      * Sends a message with arbitrary data to a given address path, but disallow
      * state modifications. This includes log, create, selfdestruct and call with
      * a non-zero value.
      */
    def callStatic(gasLimit: ^, address: Buffer, value: ^, data: Buffer): js.Promise[^] = js.native
    
    /**
      * Creates a new contract with a given value.
      */
    def create(gasLimit: ^, value: ^, data: Buffer): js.Promise[^] = js.native
    def create(gasLimit: ^, value: ^, data: Buffer, salt: Buffer): js.Promise[^] = js.native
    
    /**
      * Creates a new contract with a given value. Generates
      * a deterministic address via CREATE2 rules.
      */
    def create2(gasLimit: ^, value: ^, data: Buffer, salt: Buffer): js.Promise[^] = js.native
    
    /**
      * Set the returning output data for the execution.
      * @param returnData - Output data to return
      */
    def finish(returnData: Buffer): Unit = js.native
    
    /**
      * Returns address of currently executing account.
      */
    def getAddress(): Buffer = js.native
    
    /**
      * Returns the block's beneficiary address.
      */
    def getBlockCoinbase(): ^ = js.native
    
    /**
      * Returns the block's difficulty.
      */
    def getBlockDifficulty(): ^ = js.native
    
    /**
      * Returns the block's gas limit.
      */
    def getBlockGasLimit(): ^ = js.native
    
    /**
      * Returns Gets the hash of one of the 256 most recent complete blocks.
      * @param num - Number of block
      */
    def getBlockHash(num: ^): js.Promise[^] = js.native
    
    /**
      * Returns the block’s number.
      */
    def getBlockNumber(): ^ = js.native
    
    /**
      * Returns the block's timestamp.
      */
    def getBlockTimestamp(): ^ = js.native
    
    /**
      * Returns input data in current environment. This pertains to the input
      * data passed with the message call instruction or transaction.
      */
    def getCallData(): Buffer = js.native
    
    /**
      * Returns size of input data in current environment. This pertains to the
      * input data passed with the message call instruction or transaction.
      */
    def getCallDataSize(): ^ = js.native
    
    /**
      * Returns the deposited value by the instruction/transaction
      * responsible for this execution.
      */
    def getCallValue(): ^ = js.native
    
    /**
      * Returns caller address. This is the address of the account
      * that is directly responsible for this execution.
      */
    def getCaller(): ^ = js.native
    
    /**
      * Returns the chain ID for current chain. Introduced for the
      * CHAINID opcode proposed in [EIP-1344](https://eips.ethereum.org/EIPS/eip-1344).
      */
    def getChainId(): ^ = js.native
    
    /**
      * Returns the code running in current environment.
      */
    def getCode(): Buffer = js.native
    
    /**
      * Returns the size of code running in current environment.
      */
    def getCodeSize(): ^ = js.native
    
    /**
      * Returns balance of the given account.
      * @param address - Address of account
      */
    def getExternalBalance(address: Buffer): js.Promise[^] = js.native
    
    /**
      * Returns code of an account.
      * @param address - Address of account
      */
    def getExternalCode(address: ^): js.Promise[Buffer] = js.native
    def getExternalCode(address: Buffer): js.Promise[Buffer] = js.native
    
    /**
      * Get size of an account’s code.
      * @param address - Address of account
      */
    def getExternalCodeSize(address: ^): js.Promise[^] = js.native
    
    /**
      * Returns the current gasCounter.
      */
    def getGasLeft(): ^ = js.native
    
    /**
      * Returns the current return data buffer. This contains the return data
      * from last executed call, callCode, callDelegate, callStatic or create.
      * Note: create only fills the return data buffer in case of a failure.
      */
    def getReturnData(): Buffer = js.native
    
    /**
      * Returns size of current return data buffer. This contains the return data
      * from the last executed call, callCode, callDelegate, callStatic or create.
      * Note: create only fills the return data buffer in case of a failure.
      */
    def getReturnDataSize(): ^ = js.native
    
    /**
      * Returns balance of self.
      */
    def getSelfBalance(): ^ = js.native
    
    /**
      * Returns price of gas in current environment.
      */
    def getTxGasPrice(): ^ = js.native
    
    /**
      * Returns the execution's origination address. This is the
      * sender of original transaction; it is never an account with
      * non-empty associated code.
      */
    def getTxOrigin(): ^ = js.native
    
    /**
      * Returns true if account is empty (according to EIP-161).
      * @param address - Address of account
      */
    def isAccountEmpty(address: Buffer): js.Promise[Boolean] = js.native
    
    /**
      * Returns true if the current call must be executed statically.
      */
    def isStatic(): Boolean = js.native
    
    /**
      * Creates a new log in the current environment.
      */
    def log(data: Buffer, numberOfTopics: Double, topics: js.Array[Buffer]): Unit = js.native
    
    /**
      * Adds a positive amount to the gas counter.
      * @param amount - Amount of gas refunded
      */
    def refundGas(amount: ^): Unit = js.native
    
    /**
      * Set the returning output data for the execution. This will halt the
      * execution immediately and set the execution result to "reverted".
      * @param returnData - Output data to return
      */
    def revert(returnData: Buffer): Unit = js.native
    
    /**
      * Mark account for later deletion and give the remaining balance to the
      * specified beneficiary address. This will cause a trap and the
      * execution will be aborted immediately.
      * @param toAddress - Beneficiary address
      */
    def selfDestruct(toAddress: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Loads a 256-bit value to memory from persistent storage.
      * @param key - Storage key
      */
    def storageLoad(key: Buffer): js.Promise[Buffer] = js.native
    
    /**
      * Store 256-bit a value in memory to persistent storage.
      */
    def storageStore(key: Buffer, value: Buffer): js.Promise[Unit] = js.native
    
    /**
      * Reduces amount of gas to be refunded by a positive value.
      * @param amount - Amount to subtract from gas refunds
      */
    def subRefund(amount: ^): Unit = js.native
    
    /**
      * Subtracts an amount from the gas counter.
      * @param amount - Amount of gas to consume
      * @throws if out of gas
      */
    def useGas(amount: ^): Unit = js.native
  }
  
  trait Env extends StObject {
    
    var address: Buffer
    
    var block: Any
    
    var blockchain: typings.ethereumjsBlockchain.mod.default
    
    var callData: Buffer
    
    var callValue: ^
    
    var caller: Buffer
    
    var code: Buffer
    
    var codeAddress: Buffer
    
    var contract: typings.ethereumjsAccount.mod.default
    
    var depth: Double
    
    var gasPrice: Buffer
    
    var isStatic: Boolean
    
    var origin: Buffer
  }
  object Env {
    
    inline def apply(
      address: Buffer,
      block: Any,
      blockchain: typings.ethereumjsBlockchain.mod.default,
      callData: Buffer,
      callValue: ^,
      caller: Buffer,
      code: Buffer,
      codeAddress: Buffer,
      contract: typings.ethereumjsAccount.mod.default,
      depth: Double,
      gasPrice: Buffer,
      isStatic: Boolean,
      origin: Buffer
    ): Env = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], block = block.asInstanceOf[js.Any], blockchain = blockchain.asInstanceOf[js.Any], callData = callData.asInstanceOf[js.Any], callValue = callValue.asInstanceOf[js.Any], caller = caller.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], codeAddress = codeAddress.asInstanceOf[js.Any], contract = contract.asInstanceOf[js.Any], depth = depth.asInstanceOf[js.Any], gasPrice = gasPrice.asInstanceOf[js.Any], isStatic = isStatic.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
      __obj.asInstanceOf[Env]
    }
    
    extension [Self <: Env](x: Self) {
      
      inline def setAddress(value: Buffer): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setBlock(value: Any): Self = StObject.set(x, "block", value.asInstanceOf[js.Any])
      
      inline def setBlockchain(value: typings.ethereumjsBlockchain.mod.default): Self = StObject.set(x, "blockchain", value.asInstanceOf[js.Any])
      
      inline def setCallData(value: Buffer): Self = StObject.set(x, "callData", value.asInstanceOf[js.Any])
      
      inline def setCallValue(value: ^): Self = StObject.set(x, "callValue", value.asInstanceOf[js.Any])
      
      inline def setCaller(value: Buffer): Self = StObject.set(x, "caller", value.asInstanceOf[js.Any])
      
      inline def setCode(value: Buffer): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCodeAddress(value: Buffer): Self = StObject.set(x, "codeAddress", value.asInstanceOf[js.Any])
      
      inline def setContract(value: typings.ethereumjsAccount.mod.default): Self = StObject.set(x, "contract", value.asInstanceOf[js.Any])
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setGasPrice(value: Buffer): Self = StObject.set(x, "gasPrice", value.asInstanceOf[js.Any])
      
      inline def setIsStatic(value: Boolean): Self = StObject.set(x, "isStatic", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: Buffer): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    }
  }
  
  trait RunResult extends StObject {
    
    var logs: Any
    
    var returnValue: js.UndefOr[Buffer] = js.undefined
    
    /**
      * A map from the accounts that have self-destructed to the addresses to send their funds to
      */
    var selfdestruct: StringDictionary[Buffer]
  }
  object RunResult {
    
    inline def apply(logs: Any, selfdestruct: StringDictionary[Buffer]): RunResult = {
      val __obj = js.Dynamic.literal(logs = logs.asInstanceOf[js.Any], selfdestruct = selfdestruct.asInstanceOf[js.Any])
      __obj.asInstanceOf[RunResult]
    }
    
    extension [Self <: RunResult](x: Self) {
      
      inline def setLogs(value: Any): Self = StObject.set(x, "logs", value.asInstanceOf[js.Any])
      
      inline def setReturnValue(value: Buffer): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      inline def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      inline def setSelfdestruct(value: StringDictionary[Buffer]): Self = StObject.set(x, "selfdestruct", value.asInstanceOf[js.Any])
    }
  }
}
