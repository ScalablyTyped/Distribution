package typings.emailReplyParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Parses an email message and extracts its fragments.
    */
  @JSImport("email-reply-parser", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with EmailReplyParser {
    
    /**
      * Parses an email message and returns the text of the replied message.
      * @param text The text of the email message.
      * @returns The text of the replied message.
      */
    /* CompleteClass */
    override def parseReplied(text: String): String = js.native
    
    /**
      * Parses an email message and returns the text of the reply.
      * @param text The text of the email message.
      * @returns The text of the reply.
      */
    /* CompleteClass */
    override def parseReply(text: String): String = js.native
    
    /**
      * Reads an email message and returns an Email object with its fragments.
      * @param text The text of the email message.
      * @returns An Email object with the fragments of the email message.
      */
    /* CompleteClass */
    override def read(text: String): Email = js.native
  }
  
  /**
    * Represents an email message, with one or more fragments.
    */
  trait Email extends StObject {
    
    /**
      * The fragments that make up the email message.
      */
    var fragments: js.Array[Fragment]
    
    /**
      * Returns an array of the fragments that make up the email message.
      * @returns An array of the fragments that make up the email message.
      */
    def getFragments(): js.Array[Fragment]
    
    /**
      * Returns the quoted text of the email message, which includes all text in the email that is marked as a quote.
      * @returns The quoted text of the email message.
      */
    def getQuotedText(): String
    
    /**
      * Returns the visible text of the email message, which includes all non-quoted text in the email without signatures and other hidden text.
      * @returns The visible text of the email message.
      */
    def getVisibleText(): String
  }
  object Email {
    
    inline def apply(
      fragments: js.Array[Fragment],
      getFragments: () => js.Array[Fragment],
      getQuotedText: () => String,
      getVisibleText: () => String
    ): Email = {
      val __obj = js.Dynamic.literal(fragments = fragments.asInstanceOf[js.Any], getFragments = js.Any.fromFunction0(getFragments), getQuotedText = js.Any.fromFunction0(getQuotedText), getVisibleText = js.Any.fromFunction0(getVisibleText))
      __obj.asInstanceOf[Email]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Email] (val x: Self) extends AnyVal {
      
      inline def setFragments(value: js.Array[Fragment]): Self = StObject.set(x, "fragments", value.asInstanceOf[js.Any])
      
      inline def setFragmentsVarargs(value: Fragment*): Self = StObject.set(x, "fragments", js.Array(value*))
      
      inline def setGetFragments(value: () => js.Array[Fragment]): Self = StObject.set(x, "getFragments", js.Any.fromFunction0(value))
      
      inline def setGetQuotedText(value: () => String): Self = StObject.set(x, "getQuotedText", js.Any.fromFunction0(value))
      
      inline def setGetVisibleText(value: () => String): Self = StObject.set(x, "getVisibleText", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Parses an email message and extracts its fragments.
    */
  trait EmailReplyParser extends StObject {
    
    /**
      * Parses an email message and returns the text of the replied message.
      * @param text The text of the email message.
      * @returns The text of the replied message.
      */
    def parseReplied(text: String): String
    
    /**
      * Parses an email message and returns the text of the reply.
      * @param text The text of the email message.
      * @returns The text of the reply.
      */
    def parseReply(text: String): String
    
    /**
      * Reads an email message and returns an Email object with its fragments.
      * @param text The text of the email message.
      * @returns An Email object with the fragments of the email message.
      */
    def read(text: String): Email
  }
  object EmailReplyParser {
    
    inline def apply(parseReplied: String => String, parseReply: String => String, read: String => Email): EmailReplyParser = {
      val __obj = js.Dynamic.literal(parseReplied = js.Any.fromFunction1(parseReplied), parseReply = js.Any.fromFunction1(parseReply), read = js.Any.fromFunction1(read))
      __obj.asInstanceOf[EmailReplyParser]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: EmailReplyParser] (val x: Self) extends AnyVal {
      
      inline def setParseReplied(value: String => String): Self = StObject.set(x, "parseReplied", js.Any.fromFunction1(value))
      
      inline def setParseReply(value: String => String): Self = StObject.set(x, "parseReply", js.Any.fromFunction1(value))
      
      inline def setRead(value: String => Email): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
    }
  }
  
  trait Fragment extends StObject {
    
    /**
      * The content of the fragment.
      */
    var content: String
    
    /**
      * Returns the content of the fragment.
      * @returns The content of the fragment.
      */
    def getContent(): String
    
    /**
      * Returns whether the fragment contains no content.
      * @returns Whether the fragment is empty.
      */
    def isEmpty(): Boolean
    
    /**
      * Returns whether the fragment is hidden, meaning it is either quotes, signatures, or empty.
      * @returns Whether the fragment is hidden.
      */
    def isHidden(): Boolean
    
    /**
      * Returns whether the fragment is quoted text, meaning it is text that has been copied from a previous email or message and included in the current message.
      * Quoted text is typically marked with a special character, such as a ">" or "|".
      * @returns Whether the fragment is quoted text.
      */
    def isQuoted(): Boolean
    
    /**
      * Returns whether the fragment is a signature, typically containing identifying information or legal disclaimers.
      * @returns Whether the fragment is a signature.
      */
    def isSignature(): Boolean
  }
  object Fragment {
    
    inline def apply(
      content: String,
      getContent: () => String,
      isEmpty: () => Boolean,
      isHidden: () => Boolean,
      isQuoted: () => Boolean,
      isSignature: () => Boolean
    ): Fragment = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], getContent = js.Any.fromFunction0(getContent), isEmpty = js.Any.fromFunction0(isEmpty), isHidden = js.Any.fromFunction0(isHidden), isQuoted = js.Any.fromFunction0(isQuoted), isSignature = js.Any.fromFunction0(isSignature))
      __obj.asInstanceOf[Fragment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fragment] (val x: Self) extends AnyVal {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setGetContent(value: () => String): Self = StObject.set(x, "getContent", js.Any.fromFunction0(value))
      
      inline def setIsEmpty(value: () => Boolean): Self = StObject.set(x, "isEmpty", js.Any.fromFunction0(value))
      
      inline def setIsHidden(value: () => Boolean): Self = StObject.set(x, "isHidden", js.Any.fromFunction0(value))
      
      inline def setIsQuoted(value: () => Boolean): Self = StObject.set(x, "isQuoted", js.Any.fromFunction0(value))
      
      inline def setIsSignature(value: () => Boolean): Self = StObject.set(x, "isSignature", js.Any.fromFunction0(value))
    }
  }
}
