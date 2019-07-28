package typings.emailDashTemplates.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailTemplate extends js.Object {
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
  def render(view: String, locals: js.Any): js.Promise[String]
  /**
    * Send the Email
    */
  def send(options: EmailOptions): js.Any
}

object EmailTemplate {
  @scala.inline
  def apply(
    juiceResources: String => js.Promise[String],
    render: (String, js.Any) => js.Promise[String],
    send: EmailOptions => js.Any
  ): EmailTemplate = {
    val __obj = js.Dynamic.literal(juiceResources = js.Any.fromFunction1(juiceResources), render = js.Any.fromFunction2(render), send = js.Any.fromFunction1(send))
  
    __obj.asInstanceOf[EmailTemplate]
  }
}

