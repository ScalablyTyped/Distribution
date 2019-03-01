package typings
package gapiDotClientDotFusiontablesLib.gapiNs.clientNs.fusiontablesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Import extends js.Object {
  /** The kind of item this is. For an import, this is always fusiontables#import. */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /** The number of rows received from the import request. */
  var numRowsReceived: js.UndefOr[java.lang.String] = js.undefined
}

object Import {
  @scala.inline
  def apply(kind: java.lang.String = null, numRowsReceived: java.lang.String = null): Import = {
    val __obj = js.Dynamic.literal()
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (numRowsReceived != null) __obj.updateDynamic("numRowsReceived")(numRowsReceived)
    __obj.asInstanceOf[Import]
  }
}

