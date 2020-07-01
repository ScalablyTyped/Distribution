package typings.firebaseFirestore.specTestRunnerMod

import typings.firebaseFirestore.documentMod.DocumentOptions
import typings.firebaseFirestore.objectValueMod.JsonObject
import typings.firebaseFirestore.testUtilHelpersMod.TestSnapshotVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecDocument extends js.Object {
  var key: String
  var options: js.UndefOr[DocumentOptions] = js.undefined
  var value: JsonObject[_] | Null
  var version: TestSnapshotVersion
}

object SpecDocument {
  @scala.inline
  def apply(
    key: String,
    version: TestSnapshotVersion,
    options: DocumentOptions = null,
    value: JsonObject[_] = null
  ): SpecDocument = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpecDocument]
  }
}

