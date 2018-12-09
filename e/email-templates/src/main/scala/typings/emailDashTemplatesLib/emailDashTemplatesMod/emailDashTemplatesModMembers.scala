package typings
package emailDashTemplatesLib.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-templates", JSImport.Namespace)
@js.native
object emailDashTemplatesModMembers extends js.Object {
  /**
           *   shorthand use of `juiceResources` with the config
           *   mainly for custom renders like from a database).
           */
  def juiceResources(html: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
           *
           * @param view The Html pug to render
           * @param locals The template Variables
           */
  def render(view: java.lang.String, locals: js.Any): js.Promise[java.lang.String] = js.native
  /**
           * Send the Email
           */
  def send(options: EmailOptions): js.Any = js.native
}

