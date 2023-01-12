package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents content used to reshare an Instant Tournament.
  */
trait ShareTournamentPayload extends StObject {
  
  /**
    * A blob of data to attach to the update. Must be less than or equal to 1000 characters when stringified.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * An integer value representing the player's latest score.
    */
  var score: Double
}
object ShareTournamentPayload {
  
  inline def apply(score: Double): ShareTournamentPayload = {
    val __obj = js.Dynamic.literal(score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShareTournamentPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShareTournamentPayload] (val x: Self) extends AnyVal {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setScore(value: Double): Self = StObject.set(x, "score", value.asInstanceOf[js.Any])
  }
}
