package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents settings used for FBInstant.tournament.createAsync
  */
trait CreateTournamentPayload extends StObject {
  
  /**
    * An object holding optional configurations for the tournament.
    */
  var config: CreateTournamentConfig
  
  /**
    * A blob of data to attach to the update.
    *
    * All game sessions launched from the update will be able to access this blob from the payload on the tournament.
    * Must be less than or equal to 1000 characters when stringified.
    */
  var data: js.UndefOr[Any] = js.undefined
  
  /**
    * An integer value representing the player's score which will be the first score in the tournament.
    */
  var initialScore: Double
}
object CreateTournamentPayload {
  
  inline def apply(config: CreateTournamentConfig, initialScore: Double): CreateTournamentPayload = {
    val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any], initialScore = initialScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateTournamentPayload]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTournamentPayload] (val x: Self) extends AnyVal {
    
    inline def setConfig(value: CreateTournamentConfig): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
    
    inline def setInitialScore(value: Double): Self = StObject.set(x, "initialScore", value.asInstanceOf[js.Any])
  }
}
