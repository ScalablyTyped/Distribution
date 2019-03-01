package typings
package fineDashUploaderLib.libCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BlobWrapper extends js.Object {
  /**
    * the bytes of the `Blob` object being uploaded
    */
  var blob: js.UndefOr[stdLib.Blob] = js.undefined
  /**
    * the name of the `Blob`
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object BlobWrapper {
  @scala.inline
  def apply(blob: stdLib.Blob = null, name: java.lang.String = null): BlobWrapper = {
    val __obj = js.Dynamic.literal()
    if (blob != null) __obj.updateDynamic("blob")(blob)
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[BlobWrapper]
  }
}

