package typings.expo

import typings.expo.expoStrings.`data-uri`
import typings.expo.expoStrings.`zip-base64`
import typings.expo.expoStrings.base64
import typings.expo.expoStrings.jpg
import typings.expo.expoStrings.png
import typings.expo.expoStrings.raw
import typings.expo.expoStrings.tmpfile
import typings.expo.expoStrings.webm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Base64 extends js.Object {
  var format: png | jpg | raw | webm
  var height: js.UndefOr[Double] = js.undefined
  var quality: Double
  var result: tmpfile | base64 | `data-uri` | `zip-base64`
  var snapshotContentContainer: Boolean
  var width: js.UndefOr[Double] = js.undefined
}

object Anon_Base64 {
  @scala.inline
  def apply(
    format: png | jpg | raw | webm,
    quality: Double,
    result: tmpfile | base64 | `data-uri` | `zip-base64`,
    snapshotContentContainer: Boolean,
    height: Int | Double = null,
    width: Int | Double = null
  ): Anon_Base64 = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], quality = quality, result = result.asInstanceOf[js.Any], snapshotContentContainer = snapshotContentContainer)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Base64]
  }
}

