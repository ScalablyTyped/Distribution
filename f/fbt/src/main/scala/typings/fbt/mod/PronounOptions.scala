package typings.fbt.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PronounOptions extends StObject {
  
  /**
    * Whether to capitalize the pronoun in the source string.
    */
  var capitalize: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to elide the NOT_A_PERSON option in the text variations generated.
    */
  var human: js.UndefOr[Boolean] = js.undefined
}
object PronounOptions {
  
  inline def apply(): PronounOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PronounOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PronounOptions] (val x: Self) extends AnyVal {
    
    inline def setCapitalize(value: Boolean): Self = StObject.set(x, "capitalize", value.asInstanceOf[js.Any])
    
    inline def setCapitalizeUndefined: Self = StObject.set(x, "capitalize", js.undefined)
    
    inline def setHuman(value: Boolean): Self = StObject.set(x, "human", value.asInstanceOf[js.Any])
    
    inline def setHumanUndefined: Self = StObject.set(x, "human", js.undefined)
  }
}
