package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents parameters used to configure the Leave dialog.
  *
  * @since 7.1
  */
trait LeaveGamingSquadPayload extends StObject {
  
  /**
    * Optional localized term to use in place of 'Squad' in the dialog.
    */
  var squadTerm: js.UndefOr[String] = js.undefined
}
object LeaveGamingSquadPayload {
  
  inline def apply(): LeaveGamingSquadPayload = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LeaveGamingSquadPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LeaveGamingSquadPayload] (val x: Self) extends AnyVal {
    
    inline def setSquadTerm(value: String): Self = StObject.set(x, "squadTerm", value.asInstanceOf[js.Any])
    
    inline def setSquadTermUndefined: Self = StObject.set(x, "squadTerm", js.undefined)
  }
}
