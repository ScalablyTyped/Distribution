package typings.ethereumjsVm

import org.scalablytyped.runtime.StringDictionary
import typings.node.bufferMod.global.Buffer
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stateManagerMod {
  
  @JSImport("ethereumjs-vm/dist/state/stateManager", JSImport.Default)
  @js.native
  /**
    * Instantiate the StateManager interface.
    */
  open class default ()
    extends StObject
       with StateManager {
    def this(opts: StateManagerOpts) = this()
    
    /* CompleteClass */
    var _cache: typings.ethereumjsVm.cacheMod.default = js.native
    
    /* CompleteClass */
    var _checkpointCount: Double = js.native
    
    /**
      * Clears the original storage cache. Refer to [[getOriginalContractStorage]]
      * for more explanation.
      * @ignore
      */
    /* CompleteClass */
    override def _clearOriginalStorageCache(): Unit = js.native
    
    /* CompleteClass */
    var _common: typings.ethereumjsCommon.mod.default = js.native
    
    /**
      * Gets the storage trie for an account from the storage
      * cache or does a lookup.
      * @private
      */
    /* CompleteClass */
    override def _getStorageTrie(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Creates a storage trie from the primary storage trie
      * for an account and saves this in the storage cache.
      * @private
      */
    /* CompleteClass */
    override def _lookupStorageTrie(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Modifies the storage trie of an account
      * @private
      * @param address -  Address of the account whose storage is to be modified
      * @param modifyTrie - Function to modify the storage trie of the account
      */
    /* CompleteClass */
    override def _modifyContractStorage(address: Buffer, modifyTrie: Any, cb: Any): Unit = js.native
    
    /* CompleteClass */
    var _originalStorageCache: Map[String, Map[String, Buffer]] = js.native
    
    /* CompleteClass */
    var _storageTries: Any = js.native
    
    /* CompleteClass */
    var _touched: Set[String] = js.native
    
    /* CompleteClass */
    var _touchedStack: js.Array[Set[String]] = js.native
    
    /* CompleteClass */
    var _trie: Any = js.native
    
    /**
      * Callback for `accountIsEmpty` method
      * @callback accountIsEmpty~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Boolean} empty True if the account is empty false otherwise
      */
    /**
      * Checks if the `account` corresponding to `address` is empty as defined in
      * EIP-161 (https://eips.ethereum.org/EIPS/eip-161).
      * @param address - Address to check
      * @param {accountIsEmpty~callback} cb
      */
    /* CompleteClass */
    override def accountIsEmpty(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Checkpoints the current state of the StateManager instance.
      * State changes that follow can then be committed by calling
      * `commit` or `reverted` by calling rollback.
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def checkpoint(cb: Any): Unit = js.native
    
    /**
      * Removes accounts form the state trie that have been touched,
      * as defined in EIP-161 (https://eips.ethereum.org/EIPS/eip-161).
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def cleanupTouchedAccounts(cb: Any): Unit = js.native
    
    /**
      * Clears all storage entries for the account corresponding to `address`.
      * @param address -  Address to clear the storage of
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def clearContractStorage(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Commits the current change-set to the instance since the
      * last call to checkpoint.
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def commit(cb: Any): Unit = js.native
    
    /**
      * Copies the current instance of the `StateManager`
      * at the last fully committed point, i.e. as if all current
      * checkpoints were reverted.
      */
    /* CompleteClass */
    override def copy(): StateManager = js.native
    
    /**
      * Callback for `dumpStorage` method
      * @callback dumpStorage~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Object} accountState The state of the account as an `Object` map.
      * Keys are are the storage keys, values are the storage values as strings.
      * Both are represented as hex strings without the `0x` prefix.
      */
    /**
      * Dumps the the storage values for an `account` specified by `address`.
      * @param address - The address of the `account` to return storage for
      * @param {dumpStorage~callback} cb
      */
    /* CompleteClass */
    override def dumpStorage(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Generates a canonical genesis state on the instance based on the
      * configured chain parameters. Will error if there are uncommitted
      * checkpoints on the instance.
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def generateCanonicalGenesis(cb: Any): Unit = js.native
    
    /**
      * Initializes the provided genesis state into the state trie
      * @param initState - Object (address -> balance)
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def generateGenesis(initState: Any, cb: Any): Any = js.native
    
    /**
      * Callback for `getAccount` method.
      * @callback getAccount~callback
      * @param error - an error that may have happened or `null`
      * @param account - An [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * instance corresponding to the provided `address`
      */
    /**
      * Gets the [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * associated with `address`. Returns an empty account if the account does not exist.
      * @param address - Address of the `account` to get
      * @param {getAccount~callback} cb
      */
    /* CompleteClass */
    override def getAccount(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Callback for `getContractCode` method
      * @callback getContractCode~callback
      * @param error - an error that may have happened or `null`
      * @param code - The code corresponding to the provided address.
      * Returns an empty `Buffer` if the account has no associated code.
      */
    /**
      * Gets the code corresponding to the provided `address`.
      * @param address - Address to get the `code` for
      * @param {getContractCode~callback} cb
      */
    /* CompleteClass */
    override def getContractCode(address: Buffer, cb: Any): Unit = js.native
    
    /**
      * Callback for `getContractStorage` method
      * @callback getContractStorage~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Buffer} storageValue The storage value for the account
      * corresponding to the provided address at the provided key.
      * If this does not exists an empty `Buffer` is returned
      */
    /**
      * Gets the storage value associated with the provided `address` and `key`. This method returns
      * the shortest representation of the stored value.
      * @param address -  Address of the account to get the storage for
      * @param key - Key in the account's storage to get the value for. Must be 32 bytes long.
      * @param {getContractCode~callback} cb.
      */
    /* CompleteClass */
    override def getContractStorage(address: Buffer, key: Buffer, cb: Any): Unit = js.native
    
    /**
      * Caches the storage value associated with the provided `address` and `key`
      * on first invocation, and returns the cached (original) value from then
      * onwards. This is used to get the original value of a storage slot for
      * computing gas costs according to EIP-1283.
      * @param address - Address of the account to get the storage for
      * @param key - Key in the account's storage to get the value for. Must be 32 bytes long.
      */
    /* CompleteClass */
    override def getOriginalContractStorage(address: Buffer, key: Buffer, cb: Any): Unit = js.native
    
    /**
      * Callback for `getStateRoot` method
      * @callback getStateRoot~callback
      * @param {Error} error an error that may have happened or `null`.
      * Will be an error if the un-committed checkpoints on the instance.
      * @param {Buffer} stateRoot The state-root of the `StateManager`
      */
    /**
      * Gets the state-root of the Merkle-Patricia trie representation
      * of the state of this StateManager. Will error if there are uncommitted
      * checkpoints on the instance.
      * @param {getStateRoot~callback} cb
      */
    /* CompleteClass */
    override def getStateRoot(cb: Any): Unit = js.native
    
    /**
      * Callback for `hasGenesisState` method
      * @callback hasGenesisState~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Boolean} hasGenesisState Whether the storage trie contains the
      * canonical genesis state for the configured chain parameters.
      */
    /**
      * Checks whether the current instance has the canonical genesis state
      * for the configured chain parameters.
      * @param {hasGenesisState~callback} cb
      */
    /* CompleteClass */
    override def hasGenesisState(cb: Any): Unit = js.native
    
    /**
      * Saves an [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * into state under the provided `address`.
      * @param address - Address under which to store `account`
      * @param account - The [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account) to store
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def putAccount(address: Buffer, account: typings.ethereumjsAccount.mod.default, cb: Any): Unit = js.native
    
    /**
      * Adds `value` to the state trie as code, and sets `codeHash` on the account
      * corresponding to `address` to reference this.
      * @param address - Address of the `account` to add the `code` for
      * @param value - The value of the `code`
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def putContractCode(address: Buffer, value: Buffer, cb: Any): Unit = js.native
    
    /**
      * Adds value to the state trie for the `account`
      * corresponding to `address` at the provided `key`.
      * @param address -  Address to set a storage value for
      * @param key - Key to set the value at. Must be 32 bytes long.
      * @param value - Value to set at `key` for account corresponding to `address`
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def putContractStorage(address: Buffer, key: Buffer, value: Buffer, cb: Any): Unit = js.native
    
    /**
      * Reverts the current change-set to the instance since the
      * last call to checkpoint.
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def revert(cb: Any): Unit = js.native
    
    /**
      * Sets the state of the instance to that represented
      * by the provided `stateRoot`. Will error if there are uncommitted
      * checkpoints on the instance or if the state root does not exist in
      * the state trie.
      * @param stateRoot - The state-root to reset the instance to
      * @param cb - Callback function
      */
    /* CompleteClass */
    override def setStateRoot(stateRoot: Buffer, cb: Any): Unit = js.native
    
    /**
      * Marks an account as touched, according to the definition
      * in [EIP-158](https://eips.ethereum.org/EIPS/eip-158).
      * This happens when the account is triggered for a state-changing
      * event. Touched accounts that are empty will be cleared
      * at the end of the tx.
      */
    /* CompleteClass */
    override def touchAccount(address: Buffer): Unit = js.native
  }
  
  trait StateManager extends StObject {
    
    var _cache: typings.ethereumjsVm.cacheMod.default
    
    var _checkpointCount: Double
    
    /**
      * Clears the original storage cache. Refer to [[getOriginalContractStorage]]
      * for more explanation.
      * @ignore
      */
    def _clearOriginalStorageCache(): Unit
    
    var _common: typings.ethereumjsCommon.mod.default
    
    /**
      * Gets the storage trie for an account from the storage
      * cache or does a lookup.
      * @private
      */
    def _getStorageTrie(address: Buffer, cb: Any): Unit
    
    /**
      * Creates a storage trie from the primary storage trie
      * for an account and saves this in the storage cache.
      * @private
      */
    def _lookupStorageTrie(address: Buffer, cb: Any): Unit
    
    /**
      * Modifies the storage trie of an account
      * @private
      * @param address -  Address of the account whose storage is to be modified
      * @param modifyTrie - Function to modify the storage trie of the account
      */
    def _modifyContractStorage(address: Buffer, modifyTrie: Any, cb: Any): Unit
    
    var _originalStorageCache: Map[String, Map[String, Buffer]]
    
    var _storageTries: Any
    
    var _touched: Set[String]
    
    var _touchedStack: js.Array[Set[String]]
    
    var _trie: Any
    
    /**
      * Callback for `accountIsEmpty` method
      * @callback accountIsEmpty~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Boolean} empty True if the account is empty false otherwise
      */
    /**
      * Checks if the `account` corresponding to `address` is empty as defined in
      * EIP-161 (https://eips.ethereum.org/EIPS/eip-161).
      * @param address - Address to check
      * @param {accountIsEmpty~callback} cb
      */
    def accountIsEmpty(address: Buffer, cb: Any): Unit
    
    /**
      * Checkpoints the current state of the StateManager instance.
      * State changes that follow can then be committed by calling
      * `commit` or `reverted` by calling rollback.
      * @param cb - Callback function
      */
    def checkpoint(cb: Any): Unit
    
    /**
      * Removes accounts form the state trie that have been touched,
      * as defined in EIP-161 (https://eips.ethereum.org/EIPS/eip-161).
      * @param cb - Callback function
      */
    def cleanupTouchedAccounts(cb: Any): Unit
    
    /**
      * Clears all storage entries for the account corresponding to `address`.
      * @param address -  Address to clear the storage of
      * @param cb - Callback function
      */
    def clearContractStorage(address: Buffer, cb: Any): Unit
    
    /**
      * Commits the current change-set to the instance since the
      * last call to checkpoint.
      * @param cb - Callback function
      */
    def commit(cb: Any): Unit
    
    /**
      * Copies the current instance of the `StateManager`
      * at the last fully committed point, i.e. as if all current
      * checkpoints were reverted.
      */
    def copy(): StateManager
    
    /**
      * Callback for `dumpStorage` method
      * @callback dumpStorage~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Object} accountState The state of the account as an `Object` map.
      * Keys are are the storage keys, values are the storage values as strings.
      * Both are represented as hex strings without the `0x` prefix.
      */
    /**
      * Dumps the the storage values for an `account` specified by `address`.
      * @param address - The address of the `account` to return storage for
      * @param {dumpStorage~callback} cb
      */
    def dumpStorage(address: Buffer, cb: Any): Unit
    
    /**
      * Generates a canonical genesis state on the instance based on the
      * configured chain parameters. Will error if there are uncommitted
      * checkpoints on the instance.
      * @param cb - Callback function
      */
    def generateCanonicalGenesis(cb: Any): Unit
    
    /**
      * Initializes the provided genesis state into the state trie
      * @param initState - Object (address -> balance)
      * @param cb - Callback function
      */
    def generateGenesis(initState: Any, cb: Any): Any
    
    /**
      * Callback for `getAccount` method.
      * @callback getAccount~callback
      * @param error - an error that may have happened or `null`
      * @param account - An [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * instance corresponding to the provided `address`
      */
    /**
      * Gets the [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * associated with `address`. Returns an empty account if the account does not exist.
      * @param address - Address of the `account` to get
      * @param {getAccount~callback} cb
      */
    def getAccount(address: Buffer, cb: Any): Unit
    
    /**
      * Callback for `getContractCode` method
      * @callback getContractCode~callback
      * @param error - an error that may have happened or `null`
      * @param code - The code corresponding to the provided address.
      * Returns an empty `Buffer` if the account has no associated code.
      */
    /**
      * Gets the code corresponding to the provided `address`.
      * @param address - Address to get the `code` for
      * @param {getContractCode~callback} cb
      */
    def getContractCode(address: Buffer, cb: Any): Unit
    
    /**
      * Callback for `getContractStorage` method
      * @callback getContractStorage~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Buffer} storageValue The storage value for the account
      * corresponding to the provided address at the provided key.
      * If this does not exists an empty `Buffer` is returned
      */
    /**
      * Gets the storage value associated with the provided `address` and `key`. This method returns
      * the shortest representation of the stored value.
      * @param address -  Address of the account to get the storage for
      * @param key - Key in the account's storage to get the value for. Must be 32 bytes long.
      * @param {getContractCode~callback} cb.
      */
    def getContractStorage(address: Buffer, key: Buffer, cb: Any): Unit
    
    /**
      * Caches the storage value associated with the provided `address` and `key`
      * on first invocation, and returns the cached (original) value from then
      * onwards. This is used to get the original value of a storage slot for
      * computing gas costs according to EIP-1283.
      * @param address - Address of the account to get the storage for
      * @param key - Key in the account's storage to get the value for. Must be 32 bytes long.
      */
    def getOriginalContractStorage(address: Buffer, key: Buffer, cb: Any): Unit
    
    /**
      * Callback for `getStateRoot` method
      * @callback getStateRoot~callback
      * @param {Error} error an error that may have happened or `null`.
      * Will be an error if the un-committed checkpoints on the instance.
      * @param {Buffer} stateRoot The state-root of the `StateManager`
      */
    /**
      * Gets the state-root of the Merkle-Patricia trie representation
      * of the state of this StateManager. Will error if there are uncommitted
      * checkpoints on the instance.
      * @param {getStateRoot~callback} cb
      */
    def getStateRoot(cb: Any): Unit
    
    /**
      * Callback for `hasGenesisState` method
      * @callback hasGenesisState~callback
      * @param {Error} error an error that may have happened or `null`
      * @param {Boolean} hasGenesisState Whether the storage trie contains the
      * canonical genesis state for the configured chain parameters.
      */
    /**
      * Checks whether the current instance has the canonical genesis state
      * for the configured chain parameters.
      * @param {hasGenesisState~callback} cb
      */
    def hasGenesisState(cb: Any): Unit
    
    /**
      * Saves an [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account)
      * into state under the provided `address`.
      * @param address - Address under which to store `account`
      * @param account - The [`ethereumjs-account`](https://github.com/ethereumjs/ethereumjs-account) to store
      * @param cb - Callback function
      */
    def putAccount(address: Buffer, account: typings.ethereumjsAccount.mod.default, cb: Any): Unit
    
    /**
      * Adds `value` to the state trie as code, and sets `codeHash` on the account
      * corresponding to `address` to reference this.
      * @param address - Address of the `account` to add the `code` for
      * @param value - The value of the `code`
      * @param cb - Callback function
      */
    def putContractCode(address: Buffer, value: Buffer, cb: Any): Unit
    
    /**
      * Adds value to the state trie for the `account`
      * corresponding to `address` at the provided `key`.
      * @param address -  Address to set a storage value for
      * @param key - Key to set the value at. Must be 32 bytes long.
      * @param value - Value to set at `key` for account corresponding to `address`
      * @param cb - Callback function
      */
    def putContractStorage(address: Buffer, key: Buffer, value: Buffer, cb: Any): Unit
    
    /**
      * Reverts the current change-set to the instance since the
      * last call to checkpoint.
      * @param cb - Callback function
      */
    def revert(cb: Any): Unit
    
    /**
      * Sets the state of the instance to that represented
      * by the provided `stateRoot`. Will error if there are uncommitted
      * checkpoints on the instance or if the state root does not exist in
      * the state trie.
      * @param stateRoot - The state-root to reset the instance to
      * @param cb - Callback function
      */
    def setStateRoot(stateRoot: Buffer, cb: Any): Unit
    
    /**
      * Marks an account as touched, according to the definition
      * in [EIP-158](https://eips.ethereum.org/EIPS/eip-158).
      * This happens when the account is triggered for a state-changing
      * event. Touched accounts that are empty will be cleared
      * at the end of the tx.
      */
    def touchAccount(address: Buffer): Unit
  }
  object StateManager {
    
    inline def apply(
      _cache: typings.ethereumjsVm.cacheMod.default,
      _checkpointCount: Double,
      _clearOriginalStorageCache: () => Unit,
      _common: typings.ethereumjsCommon.mod.default,
      _getStorageTrie: (Buffer, Any) => Unit,
      _lookupStorageTrie: (Buffer, Any) => Unit,
      _modifyContractStorage: (Buffer, Any, Any) => Unit,
      _originalStorageCache: Map[String, Map[String, Buffer]],
      _storageTries: Any,
      _touched: Set[String],
      _touchedStack: js.Array[Set[String]],
      _trie: Any,
      accountIsEmpty: (Buffer, Any) => Unit,
      checkpoint: Any => Unit,
      cleanupTouchedAccounts: Any => Unit,
      clearContractStorage: (Buffer, Any) => Unit,
      commit: Any => Unit,
      copy: () => StateManager,
      dumpStorage: (Buffer, Any) => Unit,
      generateCanonicalGenesis: Any => Unit,
      generateGenesis: (Any, Any) => Any,
      getAccount: (Buffer, Any) => Unit,
      getContractCode: (Buffer, Any) => Unit,
      getContractStorage: (Buffer, Buffer, Any) => Unit,
      getOriginalContractStorage: (Buffer, Buffer, Any) => Unit,
      getStateRoot: Any => Unit,
      hasGenesisState: Any => Unit,
      putAccount: (Buffer, typings.ethereumjsAccount.mod.default, Any) => Unit,
      putContractCode: (Buffer, Buffer, Any) => Unit,
      putContractStorage: (Buffer, Buffer, Buffer, Any) => Unit,
      revert: Any => Unit,
      setStateRoot: (Buffer, Any) => Unit,
      touchAccount: Buffer => Unit
    ): StateManager = {
      val __obj = js.Dynamic.literal(_cache = _cache.asInstanceOf[js.Any], _checkpointCount = _checkpointCount.asInstanceOf[js.Any], _clearOriginalStorageCache = js.Any.fromFunction0(_clearOriginalStorageCache), _common = _common.asInstanceOf[js.Any], _getStorageTrie = js.Any.fromFunction2(_getStorageTrie), _lookupStorageTrie = js.Any.fromFunction2(_lookupStorageTrie), _modifyContractStorage = js.Any.fromFunction3(_modifyContractStorage), _originalStorageCache = _originalStorageCache.asInstanceOf[js.Any], _storageTries = _storageTries.asInstanceOf[js.Any], _touched = _touched.asInstanceOf[js.Any], _touchedStack = _touchedStack.asInstanceOf[js.Any], _trie = _trie.asInstanceOf[js.Any], accountIsEmpty = js.Any.fromFunction2(accountIsEmpty), checkpoint = js.Any.fromFunction1(checkpoint), cleanupTouchedAccounts = js.Any.fromFunction1(cleanupTouchedAccounts), clearContractStorage = js.Any.fromFunction2(clearContractStorage), commit = js.Any.fromFunction1(commit), copy = js.Any.fromFunction0(copy), dumpStorage = js.Any.fromFunction2(dumpStorage), generateCanonicalGenesis = js.Any.fromFunction1(generateCanonicalGenesis), generateGenesis = js.Any.fromFunction2(generateGenesis), getAccount = js.Any.fromFunction2(getAccount), getContractCode = js.Any.fromFunction2(getContractCode), getContractStorage = js.Any.fromFunction3(getContractStorage), getOriginalContractStorage = js.Any.fromFunction3(getOriginalContractStorage), getStateRoot = js.Any.fromFunction1(getStateRoot), hasGenesisState = js.Any.fromFunction1(hasGenesisState), putAccount = js.Any.fromFunction3(putAccount), putContractCode = js.Any.fromFunction3(putContractCode), putContractStorage = js.Any.fromFunction4(putContractStorage), revert = js.Any.fromFunction1(revert), setStateRoot = js.Any.fromFunction2(setStateRoot), touchAccount = js.Any.fromFunction1(touchAccount))
      __obj.asInstanceOf[StateManager]
    }
    
    extension [Self <: StateManager](x: Self) {
      
      inline def setAccountIsEmpty(value: (Buffer, Any) => Unit): Self = StObject.set(x, "accountIsEmpty", js.Any.fromFunction2(value))
      
      inline def setCheckpoint(value: Any => Unit): Self = StObject.set(x, "checkpoint", js.Any.fromFunction1(value))
      
      inline def setCleanupTouchedAccounts(value: Any => Unit): Self = StObject.set(x, "cleanupTouchedAccounts", js.Any.fromFunction1(value))
      
      inline def setClearContractStorage(value: (Buffer, Any) => Unit): Self = StObject.set(x, "clearContractStorage", js.Any.fromFunction2(value))
      
      inline def setCommit(value: Any => Unit): Self = StObject.set(x, "commit", js.Any.fromFunction1(value))
      
      inline def setCopy(value: () => StateManager): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setDumpStorage(value: (Buffer, Any) => Unit): Self = StObject.set(x, "dumpStorage", js.Any.fromFunction2(value))
      
      inline def setGenerateCanonicalGenesis(value: Any => Unit): Self = StObject.set(x, "generateCanonicalGenesis", js.Any.fromFunction1(value))
      
      inline def setGenerateGenesis(value: (Any, Any) => Any): Self = StObject.set(x, "generateGenesis", js.Any.fromFunction2(value))
      
      inline def setGetAccount(value: (Buffer, Any) => Unit): Self = StObject.set(x, "getAccount", js.Any.fromFunction2(value))
      
      inline def setGetContractCode(value: (Buffer, Any) => Unit): Self = StObject.set(x, "getContractCode", js.Any.fromFunction2(value))
      
      inline def setGetContractStorage(value: (Buffer, Buffer, Any) => Unit): Self = StObject.set(x, "getContractStorage", js.Any.fromFunction3(value))
      
      inline def setGetOriginalContractStorage(value: (Buffer, Buffer, Any) => Unit): Self = StObject.set(x, "getOriginalContractStorage", js.Any.fromFunction3(value))
      
      inline def setGetStateRoot(value: Any => Unit): Self = StObject.set(x, "getStateRoot", js.Any.fromFunction1(value))
      
      inline def setHasGenesisState(value: Any => Unit): Self = StObject.set(x, "hasGenesisState", js.Any.fromFunction1(value))
      
      inline def setPutAccount(value: (Buffer, typings.ethereumjsAccount.mod.default, Any) => Unit): Self = StObject.set(x, "putAccount", js.Any.fromFunction3(value))
      
      inline def setPutContractCode(value: (Buffer, Buffer, Any) => Unit): Self = StObject.set(x, "putContractCode", js.Any.fromFunction3(value))
      
      inline def setPutContractStorage(value: (Buffer, Buffer, Buffer, Any) => Unit): Self = StObject.set(x, "putContractStorage", js.Any.fromFunction4(value))
      
      inline def setRevert(value: Any => Unit): Self = StObject.set(x, "revert", js.Any.fromFunction1(value))
      
      inline def setSetStateRoot(value: (Buffer, Any) => Unit): Self = StObject.set(x, "setStateRoot", js.Any.fromFunction2(value))
      
      inline def setTouchAccount(value: Buffer => Unit): Self = StObject.set(x, "touchAccount", js.Any.fromFunction1(value))
      
      inline def set_cache(value: typings.ethereumjsVm.cacheMod.default): Self = StObject.set(x, "_cache", value.asInstanceOf[js.Any])
      
      inline def set_checkpointCount(value: Double): Self = StObject.set(x, "_checkpointCount", value.asInstanceOf[js.Any])
      
      inline def set_clearOriginalStorageCache(value: () => Unit): Self = StObject.set(x, "_clearOriginalStorageCache", js.Any.fromFunction0(value))
      
      inline def set_common(value: typings.ethereumjsCommon.mod.default): Self = StObject.set(x, "_common", value.asInstanceOf[js.Any])
      
      inline def set_getStorageTrie(value: (Buffer, Any) => Unit): Self = StObject.set(x, "_getStorageTrie", js.Any.fromFunction2(value))
      
      inline def set_lookupStorageTrie(value: (Buffer, Any) => Unit): Self = StObject.set(x, "_lookupStorageTrie", js.Any.fromFunction2(value))
      
      inline def set_modifyContractStorage(value: (Buffer, Any, Any) => Unit): Self = StObject.set(x, "_modifyContractStorage", js.Any.fromFunction3(value))
      
      inline def set_originalStorageCache(value: Map[String, Map[String, Buffer]]): Self = StObject.set(x, "_originalStorageCache", value.asInstanceOf[js.Any])
      
      inline def set_storageTries(value: Any): Self = StObject.set(x, "_storageTries", value.asInstanceOf[js.Any])
      
      inline def set_touched(value: Set[String]): Self = StObject.set(x, "_touched", value.asInstanceOf[js.Any])
      
      inline def set_touchedStack(value: js.Array[Set[String]]): Self = StObject.set(x, "_touchedStack", value.asInstanceOf[js.Any])
      
      inline def set_touchedStackVarargs(value: Set[String]*): Self = StObject.set(x, "_touchedStack", js.Array(value*))
      
      inline def set_trie(value: Any): Self = StObject.set(x, "_trie", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateManagerOpts extends StObject {
    
    /**
      * Parameters of the chain ([`Common`](https://github.com/ethereumjs/ethereumjs-common))
      */
    var common: js.UndefOr[typings.ethereumjsCommon.mod.default] = js.undefined
    
    /**
      * A [`merkle-patricia-tree`](https://github.com/ethereumjs/merkle-patricia-tree) instance
      */
    var trie: js.UndefOr[Any] = js.undefined
  }
  object StateManagerOpts {
    
    inline def apply(): StateManagerOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StateManagerOpts]
    }
    
    extension [Self <: StateManagerOpts](x: Self) {
      
      inline def setCommon(value: typings.ethereumjsCommon.mod.default): Self = StObject.set(x, "common", value.asInstanceOf[js.Any])
      
      inline def setCommonUndefined: Self = StObject.set(x, "common", js.undefined)
      
      inline def setTrie(value: Any): Self = StObject.set(x, "trie", value.asInstanceOf[js.Any])
      
      inline def setTrieUndefined: Self = StObject.set(x, "trie", js.undefined)
    }
  }
  
  type StorageDump = StringDictionary[String]
}
