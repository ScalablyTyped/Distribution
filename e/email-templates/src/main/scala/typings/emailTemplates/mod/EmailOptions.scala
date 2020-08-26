package typings.emailTemplates.mod

import typings.nodemailer.mailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailOptions[T] extends js.Object {
  /**
    * The Template Variables
    */
  var locals: js.UndefOr[T] = js.native
  /**
    * Nodemailer Message <Nodemailer.com/message/>
    *
    * Overrides what is given for constructor
    */
  var message: Options = js.native
  /**
    * The template name
    */
  var template: String = js.native
}

object EmailOptions {
  @scala.inline
  def apply[T](message: Options, template: String): EmailOptions[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailOptions[T]]
  }
  @scala.inline
  implicit class EmailOptionsOps[Self <: EmailOptions[_], T] (val x: Self with EmailOptions[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMessage(value: Options): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocals(value: T): Self = this.set("locals", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocals: Self = this.set("locals", js.undefined)
  }
  
}

