package typings.faviconsWebpackPlugin.oracleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Oracle extends js.Object {
  
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
  implicit class OracleOps[Self <: Oracle] (val x: Self) extends AnyVal {
    
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
    def setGuessAppName(value: () => js.Any): Self = this.set("guessAppName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGuessDescription(value: () => js.Any): Self = this.set("guessDescription", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGuessDeveloper(value: () => js.Any): Self = this.set("guessDeveloper", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGuessDeveloperName(value: () => js.Any): Self = this.set("guessDeveloperName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGuessDeveloperURL(value: () => js.Any): Self = this.set("guessDeveloperURL", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGuessVersion(value: () => js.Any): Self = this.set("guessVersion", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPkg(value: js.Any): Self = this.set("pkg", value.asInstanceOf[js.Any])
  }
}
