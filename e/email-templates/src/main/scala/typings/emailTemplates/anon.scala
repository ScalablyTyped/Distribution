package typings.emailTemplates

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Dictkey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /**
      * Whether or not to cache templates.
      * Defaults to false for development and test environments, and true for all others (via process.env.NODE_ENV)
      */
    var cache: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @deprecated
      * Adds whitespace to the resulting HTML to make it easier for a human to read using '  ' as indentation.
      * Defaults to true, but is automatically set to false for subject templates and text-based emails
      */
    var pretty: js.UndefOr[Boolean] = js.undefined
  }
  object Dictkey {
    
    inline def apply(): Dictkey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Dictkey]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Dictkey] (val x: Self) extends AnyVal {
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setPretty(value: Boolean): Self = StObject.set(x, "pretty", value.asInstanceOf[js.Any])
      
      inline def setPrettyUndefined: Self = StObject.set(x, "pretty", js.undefined)
    }
  }
  
  /* Inlined std.Partial<email-templates.email-templates.EmailMessage> */
  trait PartialEmailMessage extends StObject {
    
    var html: js.UndefOr[String] = js.undefined
    
    var subject: js.UndefOr[String] = js.undefined
    
    var text: js.UndefOr[String] = js.undefined
  }
  object PartialEmailMessage {
    
    inline def apply(): PartialEmailMessage = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialEmailMessage]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialEmailMessage] (val x: Self) extends AnyVal {
      
      inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
      
      inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
