package typings.ethereumjsTx.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TxData extends js.Object {
  /**
    * This will contain the data of the message or the init of a contract
    */
  var data: js.UndefOr[BufferLike] = js.undefined
  /**
    * The transaction's gas limit.
    */
  var gasLimit: js.UndefOr[BufferLike] = js.undefined
  /**
    * The transaction's gas price.
    */
  var gasPrice: js.UndefOr[BufferLike] = js.undefined
  /**
    * The transaction's nonce.
    */
  var nonce: js.UndefOr[BufferLike] = js.undefined
  /**
    * EC signature parameter.
    */
  var r: js.UndefOr[BufferLike] = js.undefined
  /**
    * EC signature parameter.
    */
  var s: js.UndefOr[BufferLike] = js.undefined
  /**
    * The transaction's the address is sent to.
    */
  var to: js.UndefOr[BufferLike] = js.undefined
  /**
    * EC recovery ID.
    */
  var v: js.UndefOr[BufferLike] = js.undefined
  /**
    * The amount of Ether sent.
    */
  var value: js.UndefOr[BufferLike] = js.undefined
}

object TxData {
  @scala.inline
  def apply(
    data: BufferLike = null,
    gasLimit: BufferLike = null,
    gasPrice: BufferLike = null,
    nonce: BufferLike = null,
    r: BufferLike = null,
    s: BufferLike = null,
    to: BufferLike = null,
    v: BufferLike = null,
    value: BufferLike = null
  ): TxData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TxData]
  }
}

