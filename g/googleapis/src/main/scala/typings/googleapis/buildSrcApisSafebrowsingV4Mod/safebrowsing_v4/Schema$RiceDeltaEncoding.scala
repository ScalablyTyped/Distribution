package typings.googleapis.buildSrcApisSafebrowsingV4Mod.safebrowsing_v4

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The Rice-Golomb encoded data. Used for sending compressed 4-byte hashes or
  * compressed removal indices.
  */
@js.native
trait Schema$RiceDeltaEncoding extends js.Object {
  /**
    * The encoded deltas that are encoded using the Golomb-Rice coder.
    */
  var encodedData: js.UndefOr[String] = js.native
  /**
    * The offset of the first entry in the encoded data, or, if only a single
    * integer was encoded, that single integer&#39;s value. If the field is
    * empty or missing, assume zero.
    */
  var firstValue: js.UndefOr[String] = js.native
  /**
    * The number of entries that are delta encoded in the encoded data. If only
    * a single integer was encoded, this will be zero and the single value will
    * be stored in `first_value`.
    */
  var numEntries: js.UndefOr[Double] = js.native
  /**
    * The Golomb-Rice parameter, which is a number between 2 and 28. This field
    * is missing (that is, zero) if `num_entries` is zero.
    */
  var riceParameter: js.UndefOr[Double] = js.native
}

object Schema$RiceDeltaEncoding {
  @scala.inline
  def apply(
    encodedData: String = null,
    firstValue: String = null,
    numEntries: Int | Double = null,
    riceParameter: Int | Double = null
  ): Schema$RiceDeltaEncoding = {
    val __obj = js.Dynamic.literal()
    if (encodedData != null) __obj.updateDynamic("encodedData")(encodedData.asInstanceOf[js.Any])
    if (firstValue != null) __obj.updateDynamic("firstValue")(firstValue.asInstanceOf[js.Any])
    if (numEntries != null) __obj.updateDynamic("numEntries")(numEntries.asInstanceOf[js.Any])
    if (riceParameter != null) __obj.updateDynamic("riceParameter")(riceParameter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$RiceDeltaEncoding]
  }
}

