package typings.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-templates", JSImport.Namespace)
@js.native
class ^[T] protected () extends EmailTemplate[T] {
  def this(config: EmailConfig[_]) = this()
  /**
    *   shorthand use of `juiceResources` with the config
    *   mainly for custom renders like from a database).
    */
  /* CompleteClass */
  override def juiceResources(html: String): js.Promise[String] = js.native
  /**
    *
    * @param view The Html pug to render
    * @param locals The template Variables
    */
  /* CompleteClass */
  override def render(view: String, locals: T): js.Promise[String] = js.native
  /**
    * Send the Email
    */
  /* CompleteClass */
  override def send(options: EmailOptions[T]): js.Any = js.native
}

