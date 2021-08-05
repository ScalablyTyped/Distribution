package typings.emailTemplates

import typings.emailTemplates.anon.PartialEmailMessage
import typings.emailTemplates.emailTemplatesBooleans.`false`
import typings.htmlToText.mod.HtmlToTextOptions
import typings.nodemailer.mailerMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-templates", JSImport.Namespace)
  @js.native
  class ^[T] protected ()
    extends StObject
       with EmailTemplate[T] {
    def this(config: EmailConfig[js.Any]) = this()
  }
  
  trait EmailConfig[T] extends StObject {
    
    /**
      * defaults to false, unless you pass your own render function,
      * and in that case it will be automatically set to true.
      * @default false
      */
    var customRender: js.UndefOr[Boolean] = js.undefined
    
    /**
      * a function that returns the path to a template file
      * @default (path: string, template: string) => string
      */
    var getPath: js.UndefOr[
        js.Function3[/* path */ String, /* template */ String, /* locals */ js.Any, String]
      ] = js.undefined
    
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
    var render: js.UndefOr[js.Function2[/* view */ String, /* locals */ js.UndefOr[T], js.Promise[js.Any]]] = js.undefined
    
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
    
    inline def apply[T](message: Options): EmailConfig[T] = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailConfig[T]]
    }
    
    extension [Self <: EmailConfig[?], T](x: Self & EmailConfig[T]) {
      
      inline def setCustomRender(value: Boolean): Self = StObject.set(x, "customRender", value.asInstanceOf[js.Any])
      
      inline def setCustomRenderUndefined: Self = StObject.set(x, "customRender", js.undefined)
      
      inline def setGetPath(value: (/* path */ String, /* template */ String, /* locals */ js.Any) => String): Self = StObject.set(x, "getPath", js.Any.fromFunction3(value))
      
      inline def setGetPathUndefined: Self = StObject.set(x, "getPath", js.undefined)
      
      inline def setHtmlToText(value: HtmlToTextOptions | `false`): Self = StObject.set(x, "htmlToText", value.asInstanceOf[js.Any])
      
      inline def setHtmlToTextUndefined: Self = StObject.set(x, "htmlToText", js.undefined)
      
      inline def setI18n(value: js.Any): Self = StObject.set(x, "i18n", value.asInstanceOf[js.Any])
      
      inline def setI18nUndefined: Self = StObject.set(x, "i18n", js.undefined)
      
      inline def setJuice(value: Boolean): Self = StObject.set(x, "juice", value.asInstanceOf[js.Any])
      
      inline def setJuiceResources(value: js.Any): Self = StObject.set(x, "juiceResources", value.asInstanceOf[js.Any])
      
      inline def setJuiceResourcesUndefined: Self = StObject.set(x, "juiceResources", js.undefined)
      
      inline def setJuiceUndefined: Self = StObject.set(x, "juice", js.undefined)
      
      inline def setMessage(value: Options): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setPreview(value: Boolean | PreviewEmailOpts): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
      
      inline def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
      
      inline def setRender(value: (/* view */ String, /* locals */ js.UndefOr[T]) => js.Promise[js.Any]): Self = StObject.set(x, "render", js.Any.fromFunction2(value))
      
      inline def setRenderUndefined: Self = StObject.set(x, "render", js.undefined)
      
      inline def setSend(value: Boolean): Self = StObject.set(x, "send", value.asInstanceOf[js.Any])
      
      inline def setSendUndefined: Self = StObject.set(x, "send", js.undefined)
      
      inline def setSubjectPrefix(value: String | `false`): Self = StObject.set(x, "subjectPrefix", value.asInstanceOf[js.Any])
      
      inline def setSubjectPrefixUndefined: Self = StObject.set(x, "subjectPrefix", js.undefined)
      
      inline def setTextOnly(value: Boolean): Self = StObject.set(x, "textOnly", value.asInstanceOf[js.Any])
      
      inline def setTextOnlyUndefined: Self = StObject.set(x, "textOnly", js.undefined)
      
      inline def setTransport(value: NodeMailerTransportOptions): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setViews(value: View): Self = StObject.set(x, "views", value.asInstanceOf[js.Any])
      
      inline def setViewsUndefined: Self = StObject.set(x, "views", js.undefined)
    }
  }
  
  trait EmailMessage extends StObject {
    
    var html: String
    
    var subject: String
    
    var text: String
  }
  object EmailMessage {
    
    inline def apply(html: String, subject: String, text: String): EmailMessage = {
      val __obj = js.Dynamic.literal(html = html.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailMessage]
    }
    
    extension [Self <: EmailMessage](x: Self) {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailOptions[T] extends StObject {
    
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
    
    inline def apply[T](message: Options, template: String): EmailOptions[T] = {
      val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any])
      __obj.asInstanceOf[EmailOptions[T]]
    }
    
    extension [Self <: EmailOptions[?], T](x: Self & EmailOptions[T]) {
      
      inline def setLocals(value: T): Self = StObject.set(x, "locals", value.asInstanceOf[js.Any])
      
      inline def setLocalsUndefined: Self = StObject.set(x, "locals", js.undefined)
      
      inline def setMessage(value: Options): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait EmailTemplate[T] extends StObject {
    
    /**
      *   shorthand use of `juiceResources` with the config
      *   mainly for custom renders like from a database).
      */
    def juiceResources(html: String): js.Promise[String] = js.native
    
    /**
      *
      * @param view The Html pug to render
      * @param locals The template Variables
      */
    def render(view: String): js.Promise[String] = js.native
    def render(view: String, locals: T): js.Promise[String] = js.native
    
    /**
      * Render all available template files for a given email
      * template (e.g. `html.pug`, `text.pug`, and `subject.pug`)
      *
      * @param view Name of the template
      * @param locals The template variables
      */
    def renderAll(view: String): js.Promise[PartialEmailMessage] = js.native
    def renderAll(view: String, locals: T): js.Promise[PartialEmailMessage] = js.native
    
    /**
      * Send the Email
      */
    def send(options: EmailOptions[T]): js.Promise[js.Any] = js.native
  }
  
  // email-templates accepts nodemailer.createTransport options directly
  // too and calls createTransport if given a non-function, thus a lot
  // of different types accepted for transport
  type NodeMailerTransportOptions = typings.nodemailer.mailerMod.^ | typings.nodemailer.smtpPoolMod.^ | typings.nodemailer.smtpPoolMod.Options | typings.nodemailer.sendmailTransportMod.^ | typings.nodemailer.sendmailTransportMod.Options | typings.nodemailer.streamTransportMod.^ | typings.nodemailer.streamTransportMod.Options | typings.nodemailer.jsonTransportMod.^ | typings.nodemailer.jsonTransportMod.Options | typings.nodemailer.sesTransportMod.^ | typings.nodemailer.sesTransportMod.Options | typings.nodemailer.smtpTransportMod.^ | typings.nodemailer.smtpTransportMod.Options | String
  
  // No typedef for https://github.com/forwardemail/preview-email
  trait PreviewEmailOpts extends StObject {
    
    /**
      * a path to a directory for saving the generated email previews (defaults to os.tmpdir()
      */
    var dir: js.UndefOr[String] = js.undefined
    
    /**
      * a unique ID for the file name created for the preview in dir (defaults to uuid.v4() from uuid)
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * https://github.com/sindresorhus/open
      */
    var open: js.UndefOr[js.Any] = js.undefined
    
    /**
      * a file path to a pug template file (defaults to preview-email's template.pug by default)
      */
    var template: js.UndefOr[String] = js.undefined
  }
  object PreviewEmailOpts {
    
    inline def apply(): PreviewEmailOpts = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PreviewEmailOpts]
    }
    
    extension [Self <: PreviewEmailOpts](x: Self) {
      
      inline def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      inline def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setOpen(value: js.Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      inline def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
    }
  }
  
  trait View extends StObject {
    
    var options: js.UndefOr[ViewOptions] = js.undefined
    
    /**
      * View root. Defaults to the current working directory's "emails" folder via path.resolve('emails')
      */
    var root: js.UndefOr[String] = js.undefined
  }
  object View {
    
    inline def apply(): View = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[View]
    }
    
    extension [Self <: View](x: Self) {
      
      inline def setOptions(value: ViewOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
    }
  }
  
  trait ViewOptions extends StObject {
    
    /**
      *  the default template engine source, defaults to consolidate
      */
    var engineSource: js.UndefOr[js.Any] = js.undefined
    
    /**
      *  View extansion. defaults to 'pug', and is the default file extension for templates
      */
    var `extension`: js.UndefOr[String] = js.undefined
    
    /**
      * a template file extension mapping, defaults to { hbs: 'handlebars', njk: 'nunjucks' }
      * (this is useful if you use different file extension naming conventions)
      */
    var map: js.UndefOr[js.Any] = js.undefined
  }
  object ViewOptions {
    
    inline def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    extension [Self <: ViewOptions](x: Self) {
      
      inline def setEngineSource(value: js.Any): Self = StObject.set(x, "engineSource", value.asInstanceOf[js.Any])
      
      inline def setEngineSourceUndefined: Self = StObject.set(x, "engineSource", js.undefined)
      
      inline def setExtension(value: String): Self = StObject.set(x, "extension", value.asInstanceOf[js.Any])
      
      inline def setExtensionUndefined: Self = StObject.set(x, "extension", js.undefined)
      
      inline def setMap(value: js.Any): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapUndefined: Self = StObject.set(x, "map", js.undefined)
    }
  }
}
