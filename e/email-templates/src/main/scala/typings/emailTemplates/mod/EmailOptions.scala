package typings.emailTemplates.mod

import typings.nodemailer.mailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions[T] extends js.Object {
  /**
    * The Template Variables
    */
  var locals: js.UndefOr[T] = js.undefined
  /**
    * Nodemailer Message <Nodemailer.com/message/>
    *
    * Overrides what is given for constructor
    */
  var message: Options
  /**
    * The template name
    */
  var template: String
}

object EmailOptions {
  @scala.inline
  def apply[T](message: Options, template: String, locals: T = null): EmailOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    if (locals != null) __obj.updateDynamic("locals")(locals.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions[T]]
  }
}

