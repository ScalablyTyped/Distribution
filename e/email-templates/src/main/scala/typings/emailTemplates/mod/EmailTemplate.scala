package typings.emailTemplates.mod

import typings.emailTemplates.PartialEmailMessage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailTemplate[T] extends js.Object {
  /**
    *   shorthand use of `juiceResources` with the config
    *   mainly for custom renders like from a database).
    */
  def juiceResources(html: String): js.Promise[String] = js.native
  /**
    *
    * @param view The Html pug to render
    * @param locals The template Variables
    */
  def render(view: String): js.Promise[String] = js.native
  def render(view: String, locals: T): js.Promise[String] = js.native
  /**
    * Render all available template files for a given email
    * template (e.g. `html.pug`, `text.pug`, and `subject.pug`)
    *
    * @param view Name of the template
    * @param locals The template variables
    */
  def renderAll(view: String): js.Promise[PartialEmailMessage] = js.native
  def renderAll(view: String, locals: T): js.Promise[PartialEmailMessage] = js.native
  /**
    * Send the Email
    */
  def send(options: EmailOptions[T]): js.Any = js.native
}

