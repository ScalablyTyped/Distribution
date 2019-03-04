package typings
package expoLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var format: expoLib.expoLibStrings.png | expoLib.expoLibStrings.jpg | expoLib.expoLibStrings.raw | expoLib.expoLibStrings.webm
  var height: js.UndefOr[scala.Double] = js.undefined
  var quality: scala.Double
  var result: expoLib.expoLibStrings.tmpfile | expoLib.expoLibStrings.base64 | expoLib.expoLibStrings.`data-uri` | expoLib.expoLibStrings.`zip-base64`
  var snapshotContentContainer: scala.Boolean
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(
    format: expoLib.expoLibStrings.png | expoLib.expoLibStrings.jpg | expoLib.expoLibStrings.raw | expoLib.expoLibStrings.webm,
    quality: scala.Double,
    result: expoLib.expoLibStrings.tmpfile | expoLib.expoLibStrings.base64 | expoLib.expoLibStrings.`data-uri` | expoLib.expoLibStrings.`zip-base64`,
    snapshotContentContainer: scala.Boolean,
    height: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): Anon_Base64 = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], quality = quality, result = result.asInstanceOf[js.Any], snapshotContentContainer = snapshotContentContainer)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64]
  }
}

