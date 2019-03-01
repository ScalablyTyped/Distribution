package typings
package emailDashTemplatesLib.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailOptions extends js.Object {
  /**
    * The Template Variables
    */
  var locals: js.Any
  /**
    * Nodemailer Message <Nodemailer.com/message/>
    */
  var message: js.Any
  /**
    * The template name
    */
  var template: java.lang.String
}

object EmailOptions {
  @scala.inline
  def apply(locals: js.Any, message: js.Any, template: java.lang.String): EmailOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("locals")(locals)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[EmailOptions]
  }
}

