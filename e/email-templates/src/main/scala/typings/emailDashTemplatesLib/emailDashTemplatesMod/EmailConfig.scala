package typings
package emailDashTemplatesLib.emailDashTemplatesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailConfig extends js.Object {
  /**
    * <Https://github.com/werk85/node-html-to-text>
    */
  var htmlToText: js.UndefOr[js.Any] = js.undefined
  /**
    * Set to object to configure and Enable <https://github.com/ladjs/il8n>
    */
  var i18n: js.UndefOr[js.Any] = js.undefined
  /**
    * <https://github.com/Automattic/juice>
    */
  var juice: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * <https://github.com/Automattic/juice>
    */
  var juiceResources: js.UndefOr[js.Any] = js.undefined
  /**
    * The message <Nodemailer.com/message/>
    */
  var message: js.Any
  /**
    * Preview the email
    */
  var preview: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Pass a custom render function if necessary
    */
  var render: js.UndefOr[emailDashTemplatesLib.Anon_Locals] = js.undefined
  /**
    *     Do you really want to send, false for test or development
    */
  var send: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * You can pass an option to prefix subject lines with a string
    * env === 'production' ? false : `[${env.toUpperCase()}] `; // <--- HERE
    */
  var subjectPrefix: js.UndefOr[js.Any] = js.undefined
  /**
    * force text-only rendering of template (disregards template folder)
    */
  var textOnly: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The nodemailer Transport created via nodemailer.createTransport
    */
  var transport: js.UndefOr[js.Any] = js.undefined
  /**
    * The email template directory and engine information
    */
  var views: js.UndefOr[js.Any] = js.undefined
}

object EmailConfig {
  @scala.inline
  def apply(
    message: js.Any,
    htmlToText: js.Any = null,
    i18n: js.Any = null,
    juice: js.UndefOr[scala.Boolean] = js.undefined,
    juiceResources: js.Any = null,
    preview: js.UndefOr[scala.Boolean] = js.undefined,
    render: emailDashTemplatesLib.Anon_Locals = null,
    send: js.UndefOr[scala.Boolean] = js.undefined,
    subjectPrefix: js.Any = null,
    textOnly: js.UndefOr[scala.Boolean] = js.undefined,
    transport: js.Any = null,
    views: js.Any = null
  ): EmailConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("message")(message)
    if (htmlToText != null) __obj.updateDynamic("htmlToText")(htmlToText)
    if (i18n != null) __obj.updateDynamic("i18n")(i18n)
    if (!js.isUndefined(juice)) __obj.updateDynamic("juice")(juice)
    if (juiceResources != null) __obj.updateDynamic("juiceResources")(juiceResources)
    if (!js.isUndefined(preview)) __obj.updateDynamic("preview")(preview)
    if (render != null) __obj.updateDynamic("render")(render)
    if (!js.isUndefined(send)) __obj.updateDynamic("send")(send)
    if (subjectPrefix != null) __obj.updateDynamic("subjectPrefix")(subjectPrefix)
    if (!js.isUndefined(textOnly)) __obj.updateDynamic("textOnly")(textOnly)
    if (transport != null) __obj.updateDynamic("transport")(transport)
    if (views != null) __obj.updateDynamic("views")(views)
    __obj.asInstanceOf[EmailConfig]
  }
}

