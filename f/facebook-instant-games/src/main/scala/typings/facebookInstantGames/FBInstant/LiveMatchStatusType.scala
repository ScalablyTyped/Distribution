package typings.facebookInstantGames.FBInstant

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Live Match status that may be returned by the Instant Games API.
  *
  * * `PENDING` - Match hasn't started yet
  * * `RUNNING` - Match has begun and is running
  * * `CONCLUDED` - Match has been ended explicitly
  * * `ABANDONED` - All the participants in the call have left the match
  *
  * @since 7.1
  */
/* Rewritten from type alias, can be one of: 
  - typings.facebookInstantGames.facebookInstantGamesStrings.PENDING
  - typings.facebookInstantGames.facebookInstantGamesStrings.RUNNING
  - typings.facebookInstantGames.facebookInstantGamesStrings.CONCLUDED
  - typings.facebookInstantGames.facebookInstantGamesStrings.ABANDONED
*/
trait LiveMatchStatusType extends StObject
object LiveMatchStatusType {
  
  inline def ABANDONED: typings.facebookInstantGames.facebookInstantGamesStrings.ABANDONED = "ABANDONED".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.ABANDONED]
  
  inline def CONCLUDED: typings.facebookInstantGames.facebookInstantGamesStrings.CONCLUDED = "CONCLUDED".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.CONCLUDED]
  
  inline def PENDING: typings.facebookInstantGames.facebookInstantGamesStrings.PENDING = "PENDING".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.PENDING]
  
  inline def RUNNING: typings.facebookInstantGames.facebookInstantGamesStrings.RUNNING = "RUNNING".asInstanceOf[typings.facebookInstantGames.facebookInstantGamesStrings.RUNNING]
}
