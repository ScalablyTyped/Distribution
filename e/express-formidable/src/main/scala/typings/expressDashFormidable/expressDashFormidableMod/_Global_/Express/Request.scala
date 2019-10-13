package typings.expressDashFormidable.expressDashFormidableMod._Global_.Express

import typings.formidable.formidableMod.Fields
import typings.formidable.formidableMod.Files
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var fields: js.UndefOr[Fields] = js.undefined
  var files: js.UndefOr[Files] = js.undefined
}

object Request {
  @scala.inline
  def apply(fields: Fields = null, files: Files = null): Request = {
    val __obj = js.Dynamic.literal()
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (files != null) __obj.updateDynamic("files")(files)
    __obj.asInstanceOf[Request]
  }
}

