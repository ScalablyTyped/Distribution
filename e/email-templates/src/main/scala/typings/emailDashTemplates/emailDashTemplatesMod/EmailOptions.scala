package typings.emailDashTemplates.emailDashTemplatesMod

import typings.nodemailer.libMailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions[T] extends js.Object {
  /**
    * The Template Variables
    */
  var locals: T
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
  def apply[T](locals: T, message: Options, template: String): EmailOptions[T] = {
    val __obj = js.Dynamic.literal(locals = locals.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EmailOptions[T]]
  }
}

