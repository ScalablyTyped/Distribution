package typings.emailTemplates.mod

import typings.emailTemplates.emailTemplatesBooleans.`false`
import typings.htmlToText.mod.HtmlToTextOptions
import typings.nodemailer.mailerMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmailConfig[T] extends js.Object {
  
  /**
    * defaults to false, unless you pass your own render function,
    * and in that case it will be automatically set to true.
    * @default false
    */
  var customRender: js.UndefOr[Boolean] = js.native
  
  /**
    * a function that returns the path to a template file
    * @default (path: string, template: string) => string
    */
  var getPath: js.UndefOr[
    js.Function3[/* path */ String, /* template */ String, /* locals */ js.Any, String]
  ] = js.native
  
  /**
    * <Https://github.com/werk85/node-html-to-text>
    *
    * configuration object for html-to-text
    */
  var htmlToText: js.UndefOr[HtmlToTextOptions | `false`] = js.native
  
  /**
    * Set to object to configure and Enable <https://github.com/ladjs/il8n>
    */
  var i18n: js.UndefOr[js.Any] = js.native
  
  /**
    * <https://github.com/Automattic/juice>
    */
  var juice: js.UndefOr[Boolean] = js.native
  
  /**
    * <https://github.com/Automattic/juice>
    */
  var juiceResources: js.UndefOr[js.Any] = js.native
  
  /**
    * The message <Nodemailer.com/message/>
    */
  var message: Options = js.native
  
  /**
    * Preview the email
    */
  var preview: js.UndefOr[Boolean | PreviewEmailOpts] = js.native
  
  /**
    * Pass a custom render function if necessary
    */
  var render: js.UndefOr[js.Function2[/* view */ String, /* locals */ js.UndefOr[T], js.Promise[_]]] = js.native
  
  /**
    * Do you really want to send, false for test or development
    */
  var send: js.UndefOr[Boolean] = js.native
  
  /**
    * You can pass an option to prefix subject lines with a string
    * env === 'production' ? false : `[${env.toUpperCase()}] `; // <--- HERE
    */
  var subjectPrefix: js.UndefOr[String | `false`] = js.native
  
  /**
    * force text-only rendering of template (disregards template folder)
    */
  var textOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The nodemailer Transport created via nodemailer.createTransport
    */
  var transport: js.UndefOr[NodeMailerTransportOptions] = js.native
  
  /**
    * The email template directory and engine information
    */
  var views: js.UndefOr[View] = js.native
}
object EmailConfig {
  
  @scala.inline
  def apply[T](message: Options): EmailConfig[T] = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmailConfig[T]]
  }
  
  @scala.inline
  implicit class EmailConfigOps[Self <: EmailConfig[_], T] (val x: Self with EmailConfig[T]) extends AnyVal {
    
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
    def setCustomRender(value: Boolean): Self = this.set("customRender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomRender: Self = this.set("customRender", js.undefined)
    
    @scala.inline
    def setGetPath(value: (/* path */ String, /* template */ String, /* locals */ js.Any) => String): Self = this.set("getPath", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetPath: Self = this.set("getPath", js.undefined)
    
    @scala.inline
    def setHtmlToText(value: HtmlToTextOptions | `false`): Self = this.set("htmlToText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtmlToText: Self = this.set("htmlToText", js.undefined)
    
    @scala.inline
    def setI18n(value: js.Any): Self = this.set("i18n", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteI18n: Self = this.set("i18n", js.undefined)
    
    @scala.inline
    def setJuice(value: Boolean): Self = this.set("juice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJuice: Self = this.set("juice", js.undefined)
    
    @scala.inline
    def setJuiceResources(value: js.Any): Self = this.set("juiceResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJuiceResources: Self = this.set("juiceResources", js.undefined)
    
    @scala.inline
    def setPreview(value: Boolean | PreviewEmailOpts): Self = this.set("preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreview: Self = this.set("preview", js.undefined)
    
    @scala.inline
    def setRender(value: (/* view */ String, /* locals */ js.UndefOr[T]) => js.Promise[_]): Self = this.set("render", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteRender: Self = this.set("render", js.undefined)
    
    @scala.inline
    def setSend(value: Boolean): Self = this.set("send", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSend: Self = this.set("send", js.undefined)
    
    @scala.inline
    def setSubjectPrefix(value: String | `false`): Self = this.set("subjectPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubjectPrefix: Self = this.set("subjectPrefix", js.undefined)
    
    @scala.inline
    def setTextOnly(value: Boolean): Self = this.set("textOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextOnly: Self = this.set("textOnly", js.undefined)
    
    @scala.inline
    def setTransport(value: NodeMailerTransportOptions): Self = this.set("transport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    
    @scala.inline
    def setViews(value: View): Self = this.set("views", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteViews: Self = this.set("views", js.undefined)
  }
}
