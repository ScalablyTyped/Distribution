package typings.emailPrompt

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("email-prompt", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  inline def default(options: Options): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
  
  trait Options extends StObject {
    
    /**
      * A set of chars that abort the process.
      *
      * @default new Set([
      *   '\x03' // Ctrl+C
      * ])
      */
    var abortChars: js.UndefOr[Set[String]] = js.undefined
    
    /**
      * Controls whether non-email chars are accepted.
      *
      * @default false
      */
    var allowInvalidChars: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of chars that trigger autocompletion.
      *
      * @default new Set([
      *   '\t', // tab
      *   '\n', // return
      *   '\x1b[C', // right arrow
      *   ' ' // Spacebar
      * ])
      */
    var autocompleteChars: js.UndefOr[Set[String]] = js.undefined
    
    /**
      * Domain names to autocomplete.
      *
      * @default new Set([
      *   'aol.com',
      *   'gmail.com',
      *   'google.com',
      *   'yahoo.com',
      *   'ymail.com',
      *   'hotmail.com',
      *   'live.com',
      *   'outlook.com',
      *   'inbox.com',
      *   'mail.com',
      *   'gmx.com',
      *   'icloud.com',
      *   'hey.com',
      *   'zeit.co',
      *   'vercel.com'
      * ])
      */
    var domains: js.UndefOr[Set[String]] = js.undefined
    
    /**
      * Converts all input to lowercase.
      *
      * @default true
      */
    var forceLowerCase: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A set of chars that resolve the promise.
      *
      * @default new Set(['\r'])
      */
    var resolveChars: js.UndefOr[Set[String]] = js.undefined
    
    /**
      * The beginning of the prompt.
      *
      * @default '> Enter your email: '
      */
    var start: js.UndefOr[String] = js.undefined
    
    /**
      * A [chalk](https://github.com/chalk/chalk) color.
      *
      * @default 'gray'
      */
    var suggestionColor: js.UndefOr[String] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAbortChars(value: Set[String]): Self = StObject.set(x, "abortChars", value.asInstanceOf[js.Any])
      
      inline def setAbortCharsUndefined: Self = StObject.set(x, "abortChars", js.undefined)
      
      inline def setAllowInvalidChars(value: Boolean): Self = StObject.set(x, "allowInvalidChars", value.asInstanceOf[js.Any])
      
      inline def setAllowInvalidCharsUndefined: Self = StObject.set(x, "allowInvalidChars", js.undefined)
      
      inline def setAutocompleteChars(value: Set[String]): Self = StObject.set(x, "autocompleteChars", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteCharsUndefined: Self = StObject.set(x, "autocompleteChars", js.undefined)
      
      inline def setDomains(value: Set[String]): Self = StObject.set(x, "domains", value.asInstanceOf[js.Any])
      
      inline def setDomainsUndefined: Self = StObject.set(x, "domains", js.undefined)
      
      inline def setForceLowerCase(value: Boolean): Self = StObject.set(x, "forceLowerCase", value.asInstanceOf[js.Any])
      
      inline def setForceLowerCaseUndefined: Self = StObject.set(x, "forceLowerCase", js.undefined)
      
      inline def setResolveChars(value: Set[String]): Self = StObject.set(x, "resolveChars", value.asInstanceOf[js.Any])
      
      inline def setResolveCharsUndefined: Self = StObject.set(x, "resolveChars", js.undefined)
      
      inline def setStart(value: String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setSuggestionColor(value: String): Self = StObject.set(x, "suggestionColor", value.asInstanceOf[js.Any])
      
      inline def setSuggestionColorUndefined: Self = StObject.set(x, "suggestionColor", js.undefined)
    }
  }
}
