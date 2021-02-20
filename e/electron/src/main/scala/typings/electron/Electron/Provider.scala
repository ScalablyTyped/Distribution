package typings.electron.Electron

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Provider extends StObject {
  
  def spellCheck(words: js.Array[String], callback: js.Function1[/* misspeltWords */ js.Array[String], Unit]): Unit = js.native
}
object Provider {
  
  @scala.inline
  def apply(spellCheck: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Unit): Provider = {
    val __obj = js.Dynamic.literal(spellCheck = js.Any.fromFunction2(spellCheck))
    __obj.asInstanceOf[Provider]
  }
  
  @scala.inline
  implicit class ProviderMutableBuilder[Self <: Provider] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSpellCheck(value: (js.Array[String], js.Function1[/* misspeltWords */ js.Array[String], Unit]) => Unit): Self = StObject.set(x, "spellCheck", js.Any.fromFunction2(value))
  }
}
