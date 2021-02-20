package typings.faviconsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object oracleMod {
  
  @JSImport("favicons-webpack-plugin/src/oracle", JSImport.Namespace)
  @js.native
  class ^ protected () extends Oracle {
    def this(context: js.Any) = this()
  }
  
  @js.native
  trait Oracle extends StObject {
    
    /**
      * Tries to guess the name from package.json
      */
    def guessAppName(): js.Any = js.native
    
    /**
      * Tries to guess the description from package.json
      */
    def guessDescription(): js.Any = js.native
    
    /**
      * Tries to guess the developer {name, email, url} from package.json
      */
    def guessDeveloper(): js.Any = js.native
    
    /**
      * Tries to guess the developer name from package.json
      */
    def guessDeveloperName(): js.Any = js.native
    
    /**
      * Tries to guess the developer URL from package.json
      */
    def guessDeveloperURL(): js.Any = js.native
    
    /**
      * Tries to guess the version from package.json
      */
    def guessVersion(): js.Any = js.native
    
    var pkg: js.Any = js.native
  }
  object Oracle {
    
    @scala.inline
    def apply(
      guessAppName: () => js.Any,
      guessDescription: () => js.Any,
      guessDeveloper: () => js.Any,
      guessDeveloperName: () => js.Any,
      guessDeveloperURL: () => js.Any,
      guessVersion: () => js.Any,
      pkg: js.Any
    ): Oracle = {
      val __obj = js.Dynamic.literal(guessAppName = js.Any.fromFunction0(guessAppName), guessDescription = js.Any.fromFunction0(guessDescription), guessDeveloper = js.Any.fromFunction0(guessDeveloper), guessDeveloperName = js.Any.fromFunction0(guessDeveloperName), guessDeveloperURL = js.Any.fromFunction0(guessDeveloperURL), guessVersion = js.Any.fromFunction0(guessVersion), pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oracle]
    }
    
    @scala.inline
    implicit class OracleMutableBuilder[Self <: Oracle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGuessAppName(value: () => js.Any): Self = StObject.set(x, "guessAppName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuessDescription(value: () => js.Any): Self = StObject.set(x, "guessDescription", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuessDeveloper(value: () => js.Any): Self = StObject.set(x, "guessDeveloper", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuessDeveloperName(value: () => js.Any): Self = StObject.set(x, "guessDeveloperName", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuessDeveloperURL(value: () => js.Any): Self = StObject.set(x, "guessDeveloperURL", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGuessVersion(value: () => js.Any): Self = StObject.set(x, "guessVersion", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPkg(value: js.Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
}
