package typings.ethereumjsDashTx.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FakeTxData extends TxData {
  /**
    * The sender of the Tx.
    */
  var from: js.UndefOr[BufferLike] = js.undefined
}

object FakeTxData {
  @scala.inline
  def apply(
    data: BufferLike = null,
    from: BufferLike = null,
    gasLimit: BufferLike = null,
    gasPrice: BufferLike = null,
    nonce: BufferLike = null,
    r: BufferLike = null,
    s: BufferLike = null,
    to: BufferLike = null,
    v: BufferLike = null,
    value: BufferLike = null
  ): FakeTxData = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    if (gasLimit != null) __obj.updateDynamic("gasLimit")(gasLimit.asInstanceOf[js.Any])
    if (gasPrice != null) __obj.updateDynamic("gasPrice")(gasPrice.asInstanceOf[js.Any])
    if (nonce != null) __obj.updateDynamic("nonce")(nonce.asInstanceOf[js.Any])
    if (r != null) __obj.updateDynamic("r")(r.asInstanceOf[js.Any])
    if (s != null) __obj.updateDynamic("s")(s.asInstanceOf[js.Any])
    if (to != null) __obj.updateDynamic("to")(to.asInstanceOf[js.Any])
    if (v != null) __obj.updateDynamic("v")(v.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FakeTxData]
  }
}

