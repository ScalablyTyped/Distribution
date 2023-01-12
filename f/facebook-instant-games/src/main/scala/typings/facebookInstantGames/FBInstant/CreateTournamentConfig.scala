package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents the configurations used in creating an Instant Tournament.
  */
trait CreateTournamentConfig extends StObject {
  
  /**
    * Optional input for setting a custom end time for the tournament.
    * The number passed in represents a unix timestamp. If not specified, the tournament will end one week after creation.
    */
  var endTime: js.UndefOr[Double] = js.undefined
  
  /**
    * Optional base64 encoded image that will be associated with the tournament and included in posts sharing the tournament.
    */
  var image: js.UndefOr[String] = js.undefined
  
  /**
    * Optional input for the formatting of the scores in the tournament leaderboard.
    * The options are 'NUMERIC' or 'TIME'. If not specified, the default is 'NUMERIC'.
    */
  var scoreFormat: js.UndefOr[TournamentScoreFormat] = js.undefined
  
  /**
    * Optional input for the ordering of which score is best in the tournament.
    * The options are 'HIGHER_IS_BETTER' or 'LOWER_IS_BETTER'. If not specified, the default is 'HIGHER_IS_BETTER'.
    */
  var sortOrder: js.UndefOr[TournamentSortOrder] = js.undefined
  
  /**
    * Optional text title for the tournament.
    */
  var title: js.UndefOr[String] = js.undefined
}
object CreateTournamentConfig {
  
  inline def apply(): CreateTournamentConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateTournamentConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateTournamentConfig] (val x: Self) extends AnyVal {
    
    inline def setEndTime(value: Double): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setImage(value: String): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    inline def setScoreFormat(value: TournamentScoreFormat): Self = StObject.set(x, "scoreFormat", value.asInstanceOf[js.Any])
    
    inline def setScoreFormatUndefined: Self = StObject.set(x, "scoreFormat", js.undefined)
    
    inline def setSortOrder(value: TournamentSortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
