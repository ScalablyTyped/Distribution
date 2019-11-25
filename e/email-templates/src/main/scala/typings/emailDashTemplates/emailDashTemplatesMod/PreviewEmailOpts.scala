package typings.emailDashTemplates.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// No typedef for https://github.com/niftylettuce/preview-email
trait PreviewEmailOpts extends js.Object {
  /**
    * a path to a directory for saving the generated email previews (defaults to os.tmpdir()
    */
  var dir: js.UndefOr[String] = js.undefined
  /**
    * a unique ID for the file name created for the preview in dir (defaults to uuid.v4() from uuid)
    */
  var id: js.UndefOr[String] = js.undefined
  /**
    * https://github.com/sindresorhus/open
    */
  var open: js.UndefOr[js.Any] = js.undefined
  /**
    * a file path to a pug template file (defaults to preview-email's template.pug by default)
    */
  var template: js.UndefOr[String] = js.undefined
}

object PreviewEmailOpts {
  @scala.inline
  def apply(dir: String = null, id: String = null, open: js.Any = null, template: String = null): PreviewEmailOpts = {
    val __obj = js.Dynamic.literal()
    if (dir != null) __obj.updateDynamic("dir")(dir.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (open != null) __obj.updateDynamic("open")(open.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewEmailOpts]
  }
}

