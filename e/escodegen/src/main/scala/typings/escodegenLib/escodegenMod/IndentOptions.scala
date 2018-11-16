package typings
package escodegenLib.escodegenMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IndentOptions extends js.Object {
  /**
       * Adjust the indentation of multiline comments to keep asterisks vertically aligned. Default is false.
       */
  var adjustMultilineComment: js.UndefOr[scala.Boolean] = js.undefined
  /**
       * Base indent level. Default is 0.
       */
  var base: js.UndefOr[scala.Double] = js.undefined
  /**
       * Indent string. Default is 4 spaces ('    ').
       */
  var style: js.UndefOr[java.lang.String] = js.undefined
}

