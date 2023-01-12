package typings.faviconsWebpackPlugin

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcOracleMod {
  
  @JSImport("favicons-webpack-plugin/src/oracle", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Oracle {
    def this(context: Any) = this()
    
    /**
      * Tries to guess the name from package.json
      */
    /* CompleteClass */
    override def guessAppName(): Any = js.native
    
    /**
      * Tries to guess the description from package.json
      */
    /* CompleteClass */
    override def guessDescription(): Any = js.native
    
    /**
      * Tries to guess the developer {name, email, url} from package.json
      */
    /* CompleteClass */
    override def guessDeveloper(): Any = js.native
    
    /**
      * Tries to guess the developer name from package.json
      */
    /* CompleteClass */
    override def guessDeveloperName(): Any = js.native
    
    /**
      * Tries to guess the developer URL from package.json
      */
    /* CompleteClass */
    override def guessDeveloperURL(): Any = js.native
    
    /**
      * Tries to guess the version from package.json
      */
    /* CompleteClass */
    override def guessVersion(): Any = js.native
    
    /* CompleteClass */
    var pkg: Any = js.native
  }
  
  trait Oracle extends StObject {
    
    /**
      * Tries to guess the name from package.json
      */
    def guessAppName(): Any
    
    /**
      * Tries to guess the description from package.json
      */
    def guessDescription(): Any
    
    /**
      * Tries to guess the developer {name, email, url} from package.json
      */
    def guessDeveloper(): Any
    
    /**
      * Tries to guess the developer name from package.json
      */
    def guessDeveloperName(): Any
    
    /**
      * Tries to guess the developer URL from package.json
      */
    def guessDeveloperURL(): Any
    
    /**
      * Tries to guess the version from package.json
      */
    def guessVersion(): Any
    
    var pkg: Any
  }
  object Oracle {
    
    inline def apply(
      guessAppName: () => Any,
      guessDescription: () => Any,
      guessDeveloper: () => Any,
      guessDeveloperName: () => Any,
      guessDeveloperURL: () => Any,
      guessVersion: () => Any,
      pkg: Any
    ): Oracle = {
      val __obj = js.Dynamic.literal(guessAppName = js.Any.fromFunction0(guessAppName), guessDescription = js.Any.fromFunction0(guessDescription), guessDeveloper = js.Any.fromFunction0(guessDeveloper), guessDeveloperName = js.Any.fromFunction0(guessDeveloperName), guessDeveloperURL = js.Any.fromFunction0(guessDeveloperURL), guessVersion = js.Any.fromFunction0(guessVersion), pkg = pkg.asInstanceOf[js.Any])
      __obj.asInstanceOf[Oracle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Oracle] (val x: Self) extends AnyVal {
      
      inline def setGuessAppName(value: () => Any): Self = StObject.set(x, "guessAppName", js.Any.fromFunction0(value))
      
      inline def setGuessDescription(value: () => Any): Self = StObject.set(x, "guessDescription", js.Any.fromFunction0(value))
      
      inline def setGuessDeveloper(value: () => Any): Self = StObject.set(x, "guessDeveloper", js.Any.fromFunction0(value))
      
      inline def setGuessDeveloperName(value: () => Any): Self = StObject.set(x, "guessDeveloperName", js.Any.fromFunction0(value))
      
      inline def setGuessDeveloperURL(value: () => Any): Self = StObject.set(x, "guessDeveloperURL", js.Any.fromFunction0(value))
      
      inline def setGuessVersion(value: () => Any): Self = StObject.set(x, "guessVersion", js.Any.fromFunction0(value))
      
      inline def setPkg(value: Any): Self = StObject.set(x, "pkg", value.asInstanceOf[js.Any])
    }
  }
}
