package typings.googleapis.buildSrcApisFirebaserulesV1Mod.firebaserules_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * `Source` is one or more `File` messages comprising a logical set of rules.
  */
@js.native
trait Schema$Source extends js.Object {
  /**
    * `File` set constituting the `Source` bundle.
    */
  var files: js.UndefOr[js.Array[Schema$File]] = js.native
}

object Schema$Source {
  @scala.inline
  def apply(files: js.Array[Schema$File] = null): Schema$Source = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Source]
  }
}

