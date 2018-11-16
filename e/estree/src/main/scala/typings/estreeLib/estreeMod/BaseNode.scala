package typings
package estreeLib.estreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait BaseNode extends BaseNodeWithoutComments {
  var leadingComments: js.UndefOr[js.Array[Comment]] = js.undefined
  var trailingComments: js.UndefOr[js.Array[Comment]] = js.undefined
}

