package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Google Forms item.
  */
@js.native
trait SchemaForm extends js.Object {
  /**
    * URL of the form.
    */
  var formUrl: js.UndefOr[String] = js.native
  /**
    * URL of the form responses document. Only set if respsonses have been
    * recorded and only when the requesting user is an editor of the form.
    * Read-only.
    */
  var responseUrl: js.UndefOr[String] = js.native
  /**
    * URL of a thumbnail image of the Form.  Read-only.
    */
  var thumbnailUrl: js.UndefOr[String] = js.native
  /**
    * Title of the Form.  Read-only.
    */
  var title: js.UndefOr[String] = js.native
}

object SchemaForm {
  @scala.inline
  def apply(
    formUrl: String = null,
    responseUrl: String = null,
    thumbnailUrl: String = null,
    title: String = null
  ): SchemaForm = {
    val __obj = js.Dynamic.literal()
    if (formUrl != null) __obj.updateDynamic("formUrl")(formUrl.asInstanceOf[js.Any])
    if (responseUrl != null) __obj.updateDynamic("responseUrl")(responseUrl.asInstanceOf[js.Any])
    if (thumbnailUrl != null) __obj.updateDynamic("thumbnailUrl")(thumbnailUrl.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaForm]
  }
}

