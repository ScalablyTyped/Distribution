package typings.emailTemplates.mod

import typings.emailTemplates.PartialEmailMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-templates", "renderAll")
@js.native
object renderAll extends js.Object {
  /**
    * Render all available template files for a given email
    * template (e.g. `html.pug`, `text.pug`, and `subject.pug`)
    *
    * @param view Name of the template
    * @param locals The template variables
    */
  def apply(view: String): js.Promise[PartialEmailMessage] = js.native
  def apply(view: String, locals: js.Any): js.Promise[PartialEmailMessage] = js.native
}

