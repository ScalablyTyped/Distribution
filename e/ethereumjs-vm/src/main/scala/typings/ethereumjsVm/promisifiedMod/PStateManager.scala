package typings.ethereumjsVm.promisifiedMod

import typings.ethereumjsVm.stateManagerMod.StorageDump
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PStateManager extends js.Object {
  
  var _wrapped: typings.ethereumjsVm.stateManagerMod.default = js.native
  
  def accountIsEmpty(address: Buffer): js.Promise[Boolean] = js.native
  
  def checkpoint(): js.Promise[Unit] = js.native
  
  def cleanupTouchedAccounts(): js.Promise[Unit] = js.native
  
  def clearContractStorage(addr: Buffer): js.Promise[Unit] = js.native
  
  def commit(): js.Promise[Unit] = js.native
  
  def copy(): PStateManager = js.native
  
  def dumpStorage(address: Buffer): js.Promise[StorageDump] = js.native
  
  def generateCanonicalGenesis(): js.Promise[Unit] = js.native
  
  def generateGenesis(initState: js.Any): js.Promise[Unit] = js.native
  
  def getAccount(addr: Buffer): js.Promise[typings.ethereumjsAccount.mod.default] = js.native
  
  def getContractCode(addr: Buffer): js.Promise[Buffer] = js.native
  
  def getContractStorage(addr: Buffer, key: Buffer): js.Promise[_] = js.native
  
  def getOriginalContractStorage(addr: Buffer, key: Buffer): js.Promise[_] = js.native
  
  def getStateRoot(): js.Promise[Buffer] = js.native
  
  def hasGenesisState(): js.Promise[Boolean] = js.native
  
  def putAccount(addr: Buffer, account: typings.ethereumjsAccount.mod.default): js.Promise[Unit] = js.native
  
  def putContractCode(addr: Buffer, code: Buffer): js.Promise[Unit] = js.native
  
  def putContractStorage(addr: Buffer, key: Buffer, value: Buffer): js.Promise[Unit] = js.native
  
  def revert(): js.Promise[Unit] = js.native
  
  def setStateRoot(root: Buffer): js.Promise[Unit] = js.native
}
object PStateManager {
  
  @scala.inline
  def apply(
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
    getContractStorage: (Buffer, Buffer) => js.Promise[_],
    getOriginalContractStorage: (Buffer, Buffer) => js.Promise[_],
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
  
  @scala.inline
  implicit class PStateManagerOps[Self <: PStateManager] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_wrapped(value: typings.ethereumjsVm.stateManagerMod.default): Self = this.set("_wrapped", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIsEmpty(value: Buffer => js.Promise[Boolean]): Self = this.set("accountIsEmpty", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCheckpoint(value: () => js.Promise[Unit]): Self = this.set("checkpoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCleanupTouchedAccounts(value: () => js.Promise[Unit]): Self = this.set("cleanupTouchedAccounts", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClearContractStorage(value: Buffer => js.Promise[Unit]): Self = this.set("clearContractStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCommit(value: () => js.Promise[Unit]): Self = this.set("commit", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCopy(value: () => PStateManager): Self = this.set("copy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDumpStorage(value: Buffer => js.Promise[StorageDump]): Self = this.set("dumpStorage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGenerateCanonicalGenesis(value: () => js.Promise[Unit]): Self = this.set("generateCanonicalGenesis", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGenerateGenesis(value: js.Any => js.Promise[Unit]): Self = this.set("generateGenesis", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetAccount(value: Buffer => js.Promise[typings.ethereumjsAccount.mod.default]): Self = this.set("getAccount", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContractCode(value: Buffer => js.Promise[Buffer]): Self = this.set("getContractCode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetContractStorage(value: (Buffer, Buffer) => js.Promise[_]): Self = this.set("getContractStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetOriginalContractStorage(value: (Buffer, Buffer) => js.Promise[_]): Self = this.set("getOriginalContractStorage", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetStateRoot(value: () => js.Promise[Buffer]): Self = this.set("getStateRoot", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasGenesisState(value: () => js.Promise[Boolean]): Self = this.set("hasGenesisState", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPutAccount(value: (Buffer, typings.ethereumjsAccount.mod.default) => js.Promise[Unit]): Self = this.set("putAccount", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPutContractCode(value: (Buffer, Buffer) => js.Promise[Unit]): Self = this.set("putContractCode", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPutContractStorage(value: (Buffer, Buffer, Buffer) => js.Promise[Unit]): Self = this.set("putContractStorage", js.Any.fromFunction3(value))
    
    @scala.inline
    def setRevert(value: () => js.Promise[Unit]): Self = this.set("revert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetStateRoot(value: Buffer => js.Promise[Unit]): Self = this.set("setStateRoot", js.Any.fromFunction1(value))
  }
}
