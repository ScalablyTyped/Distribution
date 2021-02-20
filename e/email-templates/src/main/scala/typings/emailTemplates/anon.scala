package typings.emailTemplates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<email-templates.email-templates.EmailMessage> */
  @js.native
  trait PartialEmailMessage extends StObject {
    
    var html: js.UndefOr[String] = js.native
    
    var subject: js.UndefOr[String] = js.native
    
    var text: js.UndefOr[String] = js.native
  }
  object PartialEmailMessage {
    
    @scala.inline
    def apply(): PartialEmailMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEmailMessage]
    }
    
    @scala.inline
    implicit class PartialEmailMessageMutableBuilder[Self <: PartialEmailMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      @scala.inline
      def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      @scala.inline
      def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
