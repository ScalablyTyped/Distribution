package typings.facebookInstantGames

import typings.facebookInstantGames.FBInstant.ContextFilter
import typings.facebookInstantGames.FBInstant.ErrorCodeType
import typings.facebookInstantGames.FBInstant.Intent
import typings.facebookInstantGames.FBInstant.Platform
import typings.facebookInstantGames.FBInstant.Type
import typings.facebookInstantGames.FBInstant.UpdateAction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object facebookInstantGamesStrings {
  
  @js.native
  sealed trait ADS_FREQUENT_LOAD
    extends StObject
       with ErrorCodeType
  inline def ADS_FREQUENT_LOAD: ADS_FREQUENT_LOAD = "ADS_FREQUENT_LOAD".asInstanceOf[ADS_FREQUENT_LOAD]
  
  @js.native
  sealed trait ADS_NOT_LOADED
    extends StObject
       with ErrorCodeType
  inline def ADS_NOT_LOADED: ADS_NOT_LOADED = "ADS_NOT_LOADED".asInstanceOf[ADS_NOT_LOADED]
  
  @js.native
  sealed trait ADS_NO_FILL
    extends StObject
       with ErrorCodeType
  inline def ADS_NO_FILL: ADS_NO_FILL = "ADS_NO_FILL".asInstanceOf[ADS_NO_FILL]
  
  @js.native
  sealed trait ADS_TOO_MANY_INSTANCES
    extends StObject
       with ErrorCodeType
  inline def ADS_TOO_MANY_INSTANCES: ADS_TOO_MANY_INSTANCES = "ADS_TOO_MANY_INSTANCES".asInstanceOf[ADS_TOO_MANY_INSTANCES]
  
  @js.native
  sealed trait ANALYTICS_POST_EXCEPTION
    extends StObject
       with ErrorCodeType
  inline def ANALYTICS_POST_EXCEPTION: ANALYTICS_POST_EXCEPTION = "ANALYTICS_POST_EXCEPTION".asInstanceOf[ANALYTICS_POST_EXCEPTION]
  
  @js.native
  sealed trait ANDROID
    extends StObject
       with Platform
  inline def ANDROID: ANDROID = "ANDROID".asInstanceOf[ANDROID]
  
  @js.native
  sealed trait CHALLENGE
    extends StObject
       with Intent
  inline def CHALLENGE: CHALLENGE = "CHALLENGE".asInstanceOf[CHALLENGE]
  
  @js.native
  sealed trait CLIENT_REQUIRES_UPDATE
    extends StObject
       with ErrorCodeType
  inline def CLIENT_REQUIRES_UPDATE: CLIENT_REQUIRES_UPDATE = "CLIENT_REQUIRES_UPDATE".asInstanceOf[CLIENT_REQUIRES_UPDATE]
  
  @js.native
  sealed trait CLIENT_UNSUPPORTED_OPERATION
    extends StObject
       with ErrorCodeType
  inline def CLIENT_UNSUPPORTED_OPERATION: CLIENT_UNSUPPORTED_OPERATION = "CLIENT_UNSUPPORTED_OPERATION".asInstanceOf[CLIENT_UNSUPPORTED_OPERATION]
  
  @js.native
  sealed trait CUSTOM
    extends StObject
       with UpdateAction
  inline def CUSTOM: CUSTOM = "CUSTOM".asInstanceOf[CUSTOM]
  
  @js.native
  sealed trait GROUP
    extends StObject
       with Type
  inline def GROUP: GROUP = "GROUP".asInstanceOf[GROUP]
  
  @js.native
  sealed trait INCLUDE_EXISTING_CHALLENGES
    extends StObject
       with ContextFilter
  inline def INCLUDE_EXISTING_CHALLENGES: INCLUDE_EXISTING_CHALLENGES = "INCLUDE_EXISTING_CHALLENGES".asInstanceOf[INCLUDE_EXISTING_CHALLENGES]
  
  @js.native
  sealed trait INVALID_OPERATION
    extends StObject
       with ErrorCodeType
  inline def INVALID_OPERATION: INVALID_OPERATION = "INVALID_OPERATION".asInstanceOf[INVALID_OPERATION]
  
  @js.native
  sealed trait INVALID_PARAM
    extends StObject
       with ErrorCodeType
  inline def INVALID_PARAM: INVALID_PARAM = "INVALID_PARAM".asInstanceOf[INVALID_PARAM]
  
  @js.native
  sealed trait INVITE
    extends StObject
       with Intent
  inline def INVITE: INVITE = "INVITE".asInstanceOf[INVITE]
  
  @js.native
  sealed trait IOS
    extends StObject
       with Platform
  inline def IOS: IOS = "IOS".asInstanceOf[IOS]
  
  @js.native
  sealed trait LEADERBOARD
    extends StObject
       with UpdateAction
  inline def LEADERBOARD: LEADERBOARD = "LEADERBOARD".asInstanceOf[LEADERBOARD]
  
  @js.native
  sealed trait LEADERBOARD_NOT_FOUND
    extends StObject
       with ErrorCodeType
  inline def LEADERBOARD_NOT_FOUND: LEADERBOARD_NOT_FOUND = "LEADERBOARD_NOT_FOUND".asInstanceOf[LEADERBOARD_NOT_FOUND]
  
  @js.native
  sealed trait LEADERBOARD_WRONG_CONTEXT
    extends StObject
       with ErrorCodeType
  inline def LEADERBOARD_WRONG_CONTEXT: LEADERBOARD_WRONG_CONTEXT = "LEADERBOARD_WRONG_CONTEXT".asInstanceOf[LEADERBOARD_WRONG_CONTEXT]
  
  @js.native
  sealed trait MOBILE_WEB
    extends StObject
       with Platform
  inline def MOBILE_WEB: MOBILE_WEB = "MOBILE_WEB".asInstanceOf[MOBILE_WEB]
  
  @js.native
  sealed trait NETWORK_FAILURE
    extends StObject
       with ErrorCodeType
  inline def NETWORK_FAILURE: NETWORK_FAILURE = "NETWORK_FAILURE".asInstanceOf[NETWORK_FAILURE]
  
  @js.native
  sealed trait NEW_CONTEXT_ONLY
    extends StObject
       with ContextFilter
  inline def NEW_CONTEXT_ONLY: NEW_CONTEXT_ONLY = "NEW_CONTEXT_ONLY".asInstanceOf[NEW_CONTEXT_ONLY]
  
  @js.native
  sealed trait NEW_PLAYERS_ONLY
    extends StObject
       with ContextFilter
  inline def NEW_PLAYERS_ONLY: NEW_PLAYERS_ONLY = "NEW_PLAYERS_ONLY".asInstanceOf[NEW_PLAYERS_ONLY]
  
  @js.native
  sealed trait PENDING_REQUEST
    extends StObject
       with ErrorCodeType
  inline def PENDING_REQUEST: PENDING_REQUEST = "PENDING_REQUEST".asInstanceOf[PENDING_REQUEST]
  
  @js.native
  sealed trait POST
    extends StObject
       with Type
  inline def POST: POST = "POST".asInstanceOf[POST]
  
  @js.native
  sealed trait RATE_LIMITED
    extends StObject
       with ErrorCodeType
  inline def RATE_LIMITED: RATE_LIMITED = "RATE_LIMITED".asInstanceOf[RATE_LIMITED]
  
  @js.native
  sealed trait REQUEST
    extends StObject
       with Intent
  inline def REQUEST: REQUEST = "REQUEST".asInstanceOf[REQUEST]
  
  @js.native
  sealed trait SAME_CONTEXT
    extends StObject
       with ErrorCodeType
  inline def SAME_CONTEXT: SAME_CONTEXT = "SAME_CONTEXT".asInstanceOf[SAME_CONTEXT]
  
  @js.native
  sealed trait SHARE
    extends StObject
       with Intent
  inline def SHARE: SHARE = "SHARE".asInstanceOf[SHARE]
  
  @js.native
  sealed trait SOLO
    extends StObject
       with Type
  inline def SOLO: SOLO = "SOLO".asInstanceOf[SOLO]
  
  @js.native
  sealed trait THREAD
    extends StObject
       with Type
  inline def THREAD: THREAD = "THREAD".asInstanceOf[THREAD]
  
  @js.native
  sealed trait UNKNOWN
    extends StObject
       with ErrorCodeType
  inline def UNKNOWN: UNKNOWN = "UNKNOWN".asInstanceOf[UNKNOWN]
  
  @js.native
  sealed trait USER_INPUT
    extends StObject
       with ErrorCodeType
  inline def USER_INPUT: USER_INPUT = "USER_INPUT".asInstanceOf[USER_INPUT]
  
  @js.native
  sealed trait WEB
    extends StObject
       with Platform
  inline def WEB: WEB = "WEB".asInstanceOf[WEB]
}
