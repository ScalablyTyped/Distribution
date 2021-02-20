package typings.googleAppsScript.global.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConferenceData {
  
  /**
    * Enum that defines the types of errors that you can specify in a ConferenceError.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.ConferenceErrorType")
  @js.native
  object ConferenceErrorType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType with Double
      ] = js.native
    
    /* 0 */ val AUTHENTICATION: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.AUTHENTICATION with Double = js.native
    
    /* 1 */ val CONFERENCE_SOLUTION_FORBIDDEN: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.CONFERENCE_SOLUTION_FORBIDDEN with Double = js.native
    
    /* 2 */ val PERMANENT: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.PERMANENT with Double = js.native
    
    /* 3 */ val PERMISSION_DENIED: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.PERMISSION_DENIED with Double = js.native
    
    /* 4 */ val TEMPORARY: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.TEMPORARY with Double = js.native
    
    /* 5 */ val UNKNOWN: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceErrorType.UNKNOWN with Double = js.native
  }
  
  /**
    * Enum that defines the features of the entry point that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointFeature")
  @js.native
  object EntryPointFeature extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature with Double
      ] = js.native
    
    /* 1 */ val TOLL: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.TOLL with Double = js.native
    
    /* 2 */ val TOLL_FREE: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.TOLL_FREE with Double = js.native
    
    /* 0 */ val UNKNOWN_FEATURE: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointFeature.UNKNOWN_FEATURE with Double = js.native
  }
  
  /**
    * Enum that defines the types of entry points that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointType")
  @js.native
  object EntryPointType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType with Double
      ] = js.native
    
    /* 2 */ val MORE: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.MORE with Double = js.native
    
    /* 1 */ val PHONE: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.PHONE with Double = js.native
    
    /* 3 */ val SIP: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.SIP with Double = js.native
    
    /* 0 */ val VIDEO: typings.googleAppsScript.GoogleAppsScript.ConferenceData.EntryPointType.VIDEO with Double = js.native
  }
}
