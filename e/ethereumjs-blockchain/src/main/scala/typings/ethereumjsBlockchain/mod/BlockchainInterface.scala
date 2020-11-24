package typings.ethereumjsBlockchain.mod

import typings.ethereumjsUtil.mod.BN
import typings.node.Buffer
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlockchainInterface extends js.Object {
  
  /**
    * Deletes a block from the blockchain. All child blocks in the chain are deleted and any
    * encountered heads are set to the parent block.
    *
    * @param blockHash - The hash of the block to be deleted
    * @param cb - A callback.
    */
  def delBlock(blockHash: Buffer, cb: js.Any): Unit = js.native
  
  def getBlock(blockTag: Double, cb: js.Function2[/* err */ Error | Null, /* block */ js.UndefOr[Block], Unit]): Unit = js.native
  def getBlock(blockTag: BN, cb: js.Function2[/* err */ Error | Null, /* block */ js.UndefOr[Block], Unit]): Unit = js.native
  /**
    * Returns a block by its hash or number.
    */
  def getBlock(blockTag: Buffer, cb: js.Function2[/* err */ Error | Null, /* block */ js.UndefOr[Block], Unit]): Unit = js.native
  
  /**
    * This method is only here for backwards compatibility. It can be removed once
    * [this PR](https://github.com/ethereumjs/ethereumjs-block/pull/72/files) gets merged, released,
    * and ethereumjs-block is updated here.
    *
    * The method should just call `cb` with `null` as first argument.
    */
  def getDetails(_underscore: String, cb: js.Any): Unit = js.native
  
  /**
    * Iterates through blocks starting at the specified iterator head and calls the onBlock function
    * on each block.
    *
    * @param name - Name of the state root head
    * @param onBlock - Function called on each block with params (block, reorg, cb)
    * @param cb - A callback function
    */
  def iterator(name: String, onBlock: js.Any, cb: js.Any): Unit = js.native
  
  /**
    * Adds a block to the blockchain.
    *
    * @param block - The block to be added to the blockchain.
    * @param cb - The callback. It is given two parameters `err` and the saved `block`
    * @param isGenesis - True if block is the genesis block.
    */
  def putBlock(block: Block, cb: js.Any): Unit = js.native
  def putBlock(block: Block, cb: js.Any, isGenesis: Boolean): Unit = js.native
}
