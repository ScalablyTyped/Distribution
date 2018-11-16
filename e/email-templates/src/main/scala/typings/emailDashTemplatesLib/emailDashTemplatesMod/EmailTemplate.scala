package typings
package emailDashTemplatesLib.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait EmailTemplate extends js.Object {
  /**
       *   shorthand use of `juiceResources` with the config
       *   mainly for custom renders like from a database).
       */
  def juiceResources(html: java.lang.String): stdLib.Promise[java.lang.String]
  /**
       *
       * @param view The Html pug to render
       * @param locals The template Variables
       */
  def render(view: java.lang.String, locals: js.Any): stdLib.Promise[java.lang.String]
  /**
       * Send the Email
       */
  def send(options: EmailOptions): js.Any
}

