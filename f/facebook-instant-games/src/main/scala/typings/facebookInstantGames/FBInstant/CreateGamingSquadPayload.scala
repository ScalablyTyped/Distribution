package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents parameters used to configure a Gaming Squad.
  *
  * @since 7.1
  */
trait CreateGamingSquadPayload extends StObject {
  
  /**
    * Optional base64 encoded image that will be associated with the gaming squad and will show up in the creation
    * dialog. It will be the profile icon for the Messenger thread.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * An optional prefill for the squad name input in the creation dialog. The player ultimately has control over
    * the actual name.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Optional localized term to use in place of 'Squad' in the dialog.
    */
  var squadTerm: js.UndefOr[String] = js.undefined
}
object CreateGamingSquadPayload {
  
  inline def apply(): CreateGamingSquadPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateGamingSquadPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateGamingSquadPayload] (val x: Self) extends AnyVal {
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSquadTerm(value: String): Self = StObject.set(x, "squadTerm", value.asInstanceOf[js.Any])
    
    inline def setSquadTermUndefined: Self = StObject.set(x, "squadTerm", js.undefined)
  }
}
