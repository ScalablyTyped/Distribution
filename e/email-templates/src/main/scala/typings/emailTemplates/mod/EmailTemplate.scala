package typings.emailTemplates.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplate[T] extends js.Object {
  /**
    *   shorthand use of `juiceResources` with the config
    *   mainly for custom renders like from a database).
    */
  def juiceResources(html: String): js.Promise[String]
  /**
    *
    * @param view The Html pug to render
    * @param locals The template Variables
    */
  def render(view: String, locals: T): js.Promise[String]
  /**
    * Send the Email
    */
  def send(options: EmailOptions[T]): js.Any
}

object EmailTemplate {
  @scala.inline
  def apply[T](
    juiceResources: String => js.Promise[String],
    render: (String, T) => js.Promise[String],
    send: EmailOptions[T] => js.Any
  ): EmailTemplate[T] = {
    val __obj = js.Dynamic.literal(juiceResources = js.Any.fromFunction1(juiceResources), render = js.Any.fromFunction2(render), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[EmailTemplate[T]]
  }
}

