package typings.ethereumjsUtil.accountMod

import typings.bnJs.mod.^
import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ethereumjs-util/dist/account", "Account")
@js.native
/**
  * This constructor assigns and validates the values.
  * Use the static factory methods to assist in creating an Account from varying data types.
  */
class Account () extends js.Object {
  def this(nonce: ^) = this()
  def this(nonce: js.UndefOr[scala.Nothing], balance: ^) = this()
  def this(nonce: ^, balance: ^) = this()
  def this(nonce: js.UndefOr[scala.Nothing], balance: js.UndefOr[scala.Nothing], stateRoot: Buffer) = this()
  def this(nonce: js.UndefOr[scala.Nothing], balance: ^, stateRoot: Buffer) = this()
  def this(nonce: ^, balance: js.UndefOr[scala.Nothing], stateRoot: Buffer) = this()
  def this(nonce: ^, balance: ^, stateRoot: Buffer) = this()
  def this(
    nonce: js.UndefOr[scala.Nothing],
    balance: js.UndefOr[scala.Nothing],
    stateRoot: js.UndefOr[scala.Nothing],
    codeHash: Buffer
  ) = this()
  def this(
    nonce: js.UndefOr[scala.Nothing],
    balance: js.UndefOr[scala.Nothing],
    stateRoot: Buffer,
    codeHash: Buffer
  ) = this()
  def this(
    nonce: js.UndefOr[scala.Nothing],
    balance: ^,
    stateRoot: js.UndefOr[scala.Nothing],
    codeHash: Buffer
  ) = this()
  def this(nonce: js.UndefOr[scala.Nothing], balance: ^, stateRoot: Buffer, codeHash: Buffer) = this()
  def this(
    nonce: ^,
    balance: js.UndefOr[scala.Nothing],
    stateRoot: js.UndefOr[scala.Nothing],
    codeHash: Buffer
  ) = this()
  def this(nonce: ^, balance: js.UndefOr[scala.Nothing], stateRoot: Buffer, codeHash: Buffer) = this()
  def this(nonce: ^, balance: ^, stateRoot: js.UndefOr[scala.Nothing], codeHash: Buffer) = this()
  def this(nonce: ^, balance: ^, stateRoot: Buffer, codeHash: Buffer) = this()
  
  var _validate: js.Any = js.native
  
  var balance: ^ = js.native
  
  var codeHash: Buffer = js.native
  
  /**
    * Returns a `Boolean` determining if the account is a contract.
    */
  def isContract(): Boolean = js.native
  
  /**
    * Returns a `Boolean` determining if the account is empty complying to the definition of
    * account emptiness in [EIP-161](https://eips.ethereum.org/EIPS/eip-161):
    * "An account is considered empty when it has no code and zero nonce and zero balance."
    */
  def isEmpty(): Boolean = js.native
  
  var nonce: ^ = js.native
  
  /**
    * Returns a Buffer Array of the raw Buffers for the account, in order.
    */
  def raw(): js.Array[Buffer] = js.native
  
  /**
    * Returns the RLP serialization of the account as a `Buffer`.
    */
  def serialize(): Buffer = js.native
  
  var stateRoot: Buffer = js.native
}
/* static members */
@JSImport("ethereumjs-util/dist/account", "Account")
@js.native
object Account extends js.Object {
  
  def fromAccountData(accountData: AccountData): Account = js.native
  
  def fromRlpSerializedAccount(serialized: Buffer): Account = js.native
  
  def fromValuesArray(values: js.Array[Buffer]): Account = js.native
}
