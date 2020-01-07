package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A representation of an int64, n, that is immune to precision loss when
  * encoded in JSON.
  */
@js.native
trait Schema$SplitInt64 extends js.Object {
  /**
    * The high order bits, including the sign: n &gt;&gt; 32.
    */
  var highBits: js.UndefOr[Double] = js.native
  /**
    * The low order bits: n &amp; 0xffffffff.
    */
  var lowBits: js.UndefOr[Double] = js.native
}

object Schema$SplitInt64 {
  @scala.inline
  def apply(highBits: Int | Double = null, lowBits: Int | Double = null): Schema$SplitInt64 = {
    val __obj = js.Dynamic.literal()
    if (highBits != null) __obj.updateDynamic("highBits")(highBits.asInstanceOf[js.Any])
    if (lowBits != null) __obj.updateDynamic("lowBits")(lowBits.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$SplitInt64]
  }
}

