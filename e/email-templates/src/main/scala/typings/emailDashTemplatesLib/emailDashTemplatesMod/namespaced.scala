package typings
package emailDashTemplatesLib.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("email-templates", JSImport.Namespace)
@js.native
class namespaced protected () extends EmailTemplate {
  def this(config: EmailConfig) = this()
  /**
       *   shorthand use of `juiceResources` with the config
       *   mainly for custom renders like from a database).
       */
  /* CompleteClass */
  override def juiceResources(html: java.lang.String): js.Promise[java.lang.String] = js.native
  /**
       *
       * @param view The Html pug to render
       * @param locals The template Variables
       */
  /* CompleteClass */
  override def render(view: java.lang.String, locals: js.Any): js.Promise[java.lang.String] = js.native
  /**
       * Send the Email
       */
  /* CompleteClass */
  override def send(options: EmailOptions): js.Any = js.native
}

