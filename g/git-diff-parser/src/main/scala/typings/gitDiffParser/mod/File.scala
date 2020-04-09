package typings.gitDiffParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait File extends js.Object {
  var added: Boolean
  var binary: Boolean
  var deleted: Boolean
  var index: js.UndefOr[js.Array[String]] = js.undefined
  var lines: js.Array[Line]
  var name: String
  var oldName: js.UndefOr[String] = js.undefined
  var renamed: Boolean
}

object File {
  @scala.inline
  def apply(
    added: Boolean,
    binary: Boolean,
    deleted: Boolean,
    lines: js.Array[Line],
    name: String,
    renamed: Boolean,
    index: js.Array[String] = null,
    oldName: String = null
  ): File = {
    val __obj = js.Dynamic.literal(added = added.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], renamed = renamed.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (oldName != null) __obj.updateDynamic("oldName")(oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[File]
  }
}

