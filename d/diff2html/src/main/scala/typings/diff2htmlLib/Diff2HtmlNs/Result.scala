package typings
package diff2htmlLib.Diff2HtmlNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Result extends js.Object {
  var addedLines: scala.Double
  var blocks: js.Array[Block]
  var changedPercentage: js.UndefOr[scala.Double] = js.undefined
  var checksumAfter: js.UndefOr[java.lang.String] = js.undefined
  var checksumBefore: js.UndefOr[java.lang.String] = js.undefined
  var deletedFileMode: js.UndefOr[java.lang.String] = js.undefined
  var deletedLines: scala.Double
  var isCombined: scala.Boolean
  var isCopy: js.UndefOr[scala.Boolean] = js.undefined
  var isDeleted: js.UndefOr[scala.Boolean] = js.undefined
  var isGitDiff: scala.Boolean
  var isNew: js.UndefOr[scala.Boolean] = js.undefined
  var isRename: js.UndefOr[scala.Boolean] = js.undefined
  var language: java.lang.String
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var newFileMode: js.UndefOr[java.lang.String] = js.undefined
  var newMode: js.UndefOr[java.lang.String] = js.undefined
  var newName: java.lang.String
  var oldMode: js.UndefOr[java.lang.String] = js.undefined
  var oldName: java.lang.String
  var unchangedPercentage: js.UndefOr[scala.Double] = js.undefined
}

