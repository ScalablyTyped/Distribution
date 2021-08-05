package typings.ethereumjsVm

import typings.ethereumjsVm.stateManagerMod.StorageDump
import typings.node.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object promisifiedMod {
  
  @JSImport("ethereumjs-vm/dist/state/promisified", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with PStateManager {
    def this(wrapped: typings.ethereumjsVm.stateManagerMod.default) = this()
    
    /* CompleteClass */
    var _wrapped: typings.ethereumjsVm.stateManagerMod.default = js.native
    
    /* CompleteClass */
    override def accountIsEmpty(address: Buffer): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    override def checkpoint(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def cleanupTouchedAccounts(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def clearContractStorage(addr: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def commit(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def copy(): PStateManager = js.native
    
    /* CompleteClass */
    override def dumpStorage(address: Buffer): js.Promise[StorageDump] = js.native
    
    /* CompleteClass */
    override def generateCanonicalGenesis(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def generateGenesis(initState: js.Any): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def getAccount(addr: Buffer): js.Promise[typings.ethereumjsAccount.mod.default] = js.native
    
    /* CompleteClass */
    override def getContractCode(addr: Buffer): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def getContractStorage(addr: Buffer, key: Buffer): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def getOriginalContractStorage(addr: Buffer, key: Buffer): js.Promise[js.Any] = js.native
    
    /* CompleteClass */
    override def getStateRoot(): js.Promise[Buffer] = js.native
    
    /* CompleteClass */
    override def hasGenesisState(): js.Promise[Boolean] = js.native
    
    /* CompleteClass */
    override def putAccount(addr: Buffer, account: typings.ethereumjsAccount.mod.default): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def putContractCode(addr: Buffer, code: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def putContractStorage(addr: Buffer, key: Buffer, value: Buffer): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def revert(): js.Promise[Unit] = js.native
    
    /* CompleteClass */
    override def setStateRoot(root: Buffer): js.Promise[Unit] = js.native
  }
  
  trait PStateManager extends StObject {
    
    var _wrapped: typings.ethereumjsVm.stateManagerMod.default
    
    def accountIsEmpty(address: Buffer): js.Promise[Boolean]
    
    def checkpoint(): js.Promise[Unit]
    
    def cleanupTouchedAccounts(): js.Promise[Unit]
    
    def clearContractStorage(addr: Buffer): js.Promise[Unit]
    
    def commit(): js.Promise[Unit]
    
    def copy(): PStateManager
    
    def dumpStorage(address: Buffer): js.Promise[StorageDump]
    
    def generateCanonicalGenesis(): js.Promise[Unit]
    
    def generateGenesis(initState: js.Any): js.Promise[Unit]
    
    def getAccount(addr: Buffer): js.Promise[typings.ethereumjsAccount.mod.default]
    
    def getContractCode(addr: Buffer): js.Promise[Buffer]
    
    def getContractStorage(addr: Buffer, key: Buffer): js.Promise[js.Any]
    
    def getOriginalContractStorage(addr: Buffer, key: Buffer): js.Promise[js.Any]
    
    def getStateRoot(): js.Promise[Buffer]
    
    def hasGenesisState(): js.Promise[Boolean]
    
    def putAccount(addr: Buffer, account: typings.ethereumjsAccount.mod.default): js.Promise[Unit]
    
    def putContractCode(addr: Buffer, code: Buffer): js.Promise[Unit]
    
    def putContractStorage(addr: Buffer, key: Buffer, value: Buffer): js.Promise[Unit]
    
    def revert(): js.Promise[Unit]
    
    def setStateRoot(root: Buffer): js.Promise[Unit]
  }
  object PStateManager {
    
    inline def apply(
      _wrapped: typings.ethereumjsVm.stateManagerMod.default,
      accountIsEmpty: Buffer => js.Promise[Boolean],
      checkpoint: () => js.Promise[Unit],
      cleanupTouchedAccounts: () => js.Promise[Unit],
      clearContractStorage: Buffer => js.Promise[Unit],
      commit: () => js.Promise[Unit],
      copy: () => PStateManager,
      dumpStorage: Buffer => js.Promise[StorageDump],
      generateCanonicalGenesis: () => js.Promise[Unit],
      generateGenesis: js.Any => js.Promise[Unit],
      getAccount: Buffer => js.Promise[typings.ethereumjsAccount.mod.default],
      getContractCode: Buffer => js.Promise[Buffer],
      getContractStorage: (Buffer, Buffer) => js.Promise[js.Any],
      getOriginalContractStorage: (Buffer, Buffer) => js.Promise[js.Any],
      getStateRoot: () => js.Promise[Buffer],
      hasGenesisState: () => js.Promise[Boolean],
      putAccount: (Buffer, typings.ethereumjsAccount.mod.default) => js.Promise[Unit],
      putContractCode: (Buffer, Buffer) => js.Promise[Unit],
      putContractStorage: (Buffer, Buffer, Buffer) => js.Promise[Unit],
      revert: () => js.Promise[Unit],
      setStateRoot: Buffer => js.Promise[Unit]
    ): PStateManager = {
      val __obj = js.Dynamic.literal(_wrapped = _wrapped.asInstanceOf[js.Any], accountIsEmpty = js.Any.fromFunction1(accountIsEmpty), checkpoint = js.Any.fromFunction0(checkpoint), cleanupTouchedAccounts = js.Any.fromFunction0(cleanupTouchedAccounts), clearContractStorage = js.Any.fromFunction1(clearContractStorage), commit = js.Any.fromFunction0(commit), copy = js.Any.fromFunction0(copy), dumpStorage = js.Any.fromFunction1(dumpStorage), generateCanonicalGenesis = js.Any.fromFunction0(generateCanonicalGenesis), generateGenesis = js.Any.fromFunction1(generateGenesis), getAccount = js.Any.fromFunction1(getAccount), getContractCode = js.Any.fromFunction1(getContractCode), getContractStorage = js.Any.fromFunction2(getContractStorage), getOriginalContractStorage = js.Any.fromFunction2(getOriginalContractStorage), getStateRoot = js.Any.fromFunction0(getStateRoot), hasGenesisState = js.Any.fromFunction0(hasGenesisState), putAccount = js.Any.fromFunction2(putAccount), putContractCode = js.Any.fromFunction2(putContractCode), putContractStorage = js.Any.fromFunction3(putContractStorage), revert = js.Any.fromFunction0(revert), setStateRoot = js.Any.fromFunction1(setStateRoot))
      __obj.asInstanceOf[PStateManager]
    }
    
    extension [Self <: PStateManager](x: Self) {
      
      inline def setAccountIsEmpty(value: Buffer => js.Promise[Boolean]): Self = StObject.set(x, "accountIsEmpty", js.Any.fromFunction1(value))
      
      inline def setCheckpoint(value: () => js.Promise[Unit]): Self = StObject.set(x, "checkpoint", js.Any.fromFunction0(value))
      
      inline def setCleanupTouchedAccounts(value: () => js.Promise[Unit]): Self = StObject.set(x, "cleanupTouchedAccounts", js.Any.fromFunction0(value))
      
      inline def setClearContractStorage(value: Buffer => js.Promise[Unit]): Self = StObject.set(x, "clearContractStorage", js.Any.fromFunction1(value))
      
      inline def setCommit(value: () => js.Promise[Unit]): Self = StObject.set(x, "commit", js.Any.fromFunction0(value))
      
      inline def setCopy(value: () => PStateManager): Self = StObject.set(x, "copy", js.Any.fromFunction0(value))
      
      inline def setDumpStorage(value: Buffer => js.Promise[StorageDump]): Self = StObject.set(x, "dumpStorage", js.Any.fromFunction1(value))
      
      inline def setGenerateCanonicalGenesis(value: () => js.Promise[Unit]): Self = StObject.set(x, "generateCanonicalGenesis", js.Any.fromFunction0(value))
      
      inline def setGenerateGenesis(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "generateGenesis", js.Any.fromFunction1(value))
      
      inline def setGetAccount(value: Buffer => js.Promise[typings.ethereumjsAccount.mod.default]): Self = StObject.set(x, "getAccount", js.Any.fromFunction1(value))
      
      inline def setGetContractCode(value: Buffer => js.Promise[Buffer]): Self = StObject.set(x, "getContractCode", js.Any.fromFunction1(value))
      
      inline def setGetContractStorage(value: (Buffer, Buffer) => js.Promise[js.Any]): Self = StObject.set(x, "getContractStorage", js.Any.fromFunction2(value))
      
      inline def setGetOriginalContractStorage(value: (Buffer, Buffer) => js.Promise[js.Any]): Self = StObject.set(x, "getOriginalContractStorage", js.Any.fromFunction2(value))
      
      inline def setGetStateRoot(value: () => js.Promise[Buffer]): Self = StObject.set(x, "getStateRoot", js.Any.fromFunction0(value))
      
      inline def setHasGenesisState(value: () => js.Promise[Boolean]): Self = StObject.set(x, "hasGenesisState", js.Any.fromFunction0(value))
      
      inline def setPutAccount(value: (Buffer, typings.ethereumjsAccount.mod.default) => js.Promise[Unit]): Self = StObject.set(x, "putAccount", js.Any.fromFunction2(value))
      
      inline def setPutContractCode(value: (Buffer, Buffer) => js.Promise[Unit]): Self = StObject.set(x, "putContractCode", js.Any.fromFunction2(value))
      
      inline def setPutContractStorage(value: (Buffer, Buffer, Buffer) => js.Promise[Unit]): Self = StObject.set(x, "putContractStorage", js.Any.fromFunction3(value))
      
      inline def setRevert(value: () => js.Promise[Unit]): Self = StObject.set(x, "revert", js.Any.fromFunction0(value))
      
      inline def setSetStateRoot(value: Buffer => js.Promise[Unit]): Self = StObject.set(x, "setStateRoot", js.Any.fromFunction1(value))
      
      inline def set_wrapped(value: typings.ethereumjsVm.stateManagerMod.default): Self = StObject.set(x, "_wrapped", value.asInstanceOf[js.Any])
    }
  }
}
