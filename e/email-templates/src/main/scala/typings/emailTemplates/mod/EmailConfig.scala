package typings.emailTemplates.mod

import typings.emailTemplates.emailTemplatesBooleans.`false`
import typings.htmlToText.HtmlToTextOptions
import typings.nodemailer.mailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailConfig[T] extends js.Object {
  /**
    * <Https://github.com/werk85/node-html-to-text>
    *
    * configuration object for html-to-text
    */
  var htmlToText: js.UndefOr[HtmlToTextOptions | `false`] = js.undefined
  /**
    * Set to object to configure and Enable <https://github.com/ladjs/il8n>
    */
  var i18n: js.UndefOr[js.Any] = js.undefined
  /**
    * <https://github.com/Automattic/juice>
    */
  var juice: js.UndefOr[Boolean] = js.undefined
  /**
    * <https://github.com/Automattic/juice>
    */
  var juiceResources: js.UndefOr[js.Any] = js.undefined
  /**
    * The message <Nodemailer.com/message/>
    */
  var message: Options
  /**
    * Preview the email
    */
  var preview: js.UndefOr[Boolean | PreviewEmailOpts] = js.undefined
  /**
    * Pass a custom render function if necessary
    */
  var render: js.UndefOr[js.Function2[/* view */ String, /* locals */ T, js.Promise[_]]] = js.undefined
  /**
    * Do you really want to send, false for test or development
    */
  var send: js.UndefOr[Boolean] = js.undefined
  /**
    * You can pass an option to prefix subject lines with a string
    * env === 'production' ? false : `[${env.toUpperCase()}] `; // <--- HERE
    */
  var subjectPrefix: js.UndefOr[String | `false`] = js.undefined
  /**
    * force text-only rendering of template (disregards template folder)
    */
  var textOnly: js.UndefOr[Boolean] = js.undefined
  /**
    * The nodemailer Transport created via nodemailer.createTransport
    */
  var transport: js.UndefOr[NodeMailerTransportOptions] = js.undefined
  /**
    * The email template directory and engine information
    */
  var views: js.UndefOr[View] = js.undefined
}

object EmailConfig {
  @scala.inline
  def apply[T](
    message: Options,
    htmlToText: HtmlToTextOptions | `false` = null,
    i18n: js.Any = null,
    juice: js.UndefOr[Boolean] = js.undefined,
    juiceResources: js.Any = null,
    preview: Boolean | PreviewEmailOpts = null,
    render: (/* view */ String, /* locals */ T) => js.Promise[_] = null,
    send: js.UndefOr[Boolean] = js.undefined,
    subjectPrefix: String | `false` = null,
    textOnly: js.UndefOr[Boolean] = js.undefined,
    transport: NodeMailerTransportOptions = null,
    views: View = null
  ): EmailConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    if (htmlToText != null) __obj.updateDynamic("htmlToText")(htmlToText.asInstanceOf[js.Any])
    if (i18n != null) __obj.updateDynamic("i18n")(i18n.asInstanceOf[js.Any])
    if (!js.isUndefined(juice)) __obj.updateDynamic("juice")(juice.asInstanceOf[js.Any])
    if (juiceResources != null) __obj.updateDynamic("juiceResources")(juiceResources.asInstanceOf[js.Any])
    if (preview != null) __obj.updateDynamic("preview")(preview.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (!js.isUndefined(send)) __obj.updateDynamic("send")(send.asInstanceOf[js.Any])
    if (subjectPrefix != null) __obj.updateDynamic("subjectPrefix")(subjectPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(textOnly)) __obj.updateDynamic("textOnly")(textOnly.asInstanceOf[js.Any])
    if (transport != null) __obj.updateDynamic("transport")(transport.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConfig[T]]
  }
}

