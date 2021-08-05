package typings.googleAppsScript.GoogleAppsScript

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ConferenceData {
  
  @js.native
  sealed trait ConferenceErrorType extends StObject
  /**
    * Enum that defines the types of errors that you can specify in a ConferenceError.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.ConferenceErrorType")
  @js.native
  object ConferenceErrorType extends StObject {
    
    @js.native
    sealed trait AUTHENTICATION
      extends StObject
         with ConferenceErrorType
    
    @js.native
    sealed trait CONFERENCE_SOLUTION_FORBIDDEN
      extends StObject
         with ConferenceErrorType
    
    @js.native
    sealed trait PERMANENT
      extends StObject
         with ConferenceErrorType
    
    @js.native
    sealed trait PERMISSION_DENIED
      extends StObject
         with ConferenceErrorType
    
    @js.native
    sealed trait TEMPORARY
      extends StObject
         with ConferenceErrorType
    
    @js.native
    sealed trait UNKNOWN
      extends StObject
         with ConferenceErrorType
  }
  
  @js.native
  sealed trait EntryPointFeature extends StObject
  /**
    * Enum that defines the features of the entry point that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointFeature")
  @js.native
  object EntryPointFeature extends StObject {
    
    @js.native
    sealed trait TOLL
      extends StObject
         with EntryPointFeature
    
    @js.native
    sealed trait TOLL_FREE
      extends StObject
         with EntryPointFeature
    
    @js.native
    sealed trait UNKNOWN_FEATURE
      extends StObject
         with EntryPointFeature
  }
  
  @js.native
  sealed trait EntryPointType extends StObject
  /**
    * Enum that defines the types of entry points that can be created by a conferencing add-on.
    */
  @JSGlobal("GoogleAppsScript.Conference_Data.EntryPointType")
  @js.native
  object EntryPointType extends StObject {
    
    @js.native
    sealed trait MORE
      extends StObject
         with EntryPointType
    
    @js.native
    sealed trait PHONE
      extends StObject
         with EntryPointType
    
    @js.native
    sealed trait SIP
      extends StObject
         with EntryPointType
    
    @js.native
    sealed trait VIDEO
      extends StObject
         with EntryPointType
  }
  
  /**
    * Container for all conference-related information.
    *
    *     var conferenceId;
    *     // Set the conference ID, that is, the identifier your system creates for the meeting.
    *
    *     var entryPoint = ConferenceDataService.newEntryPoint();
    *     // Finish building the entry point ...
    *
    *     var conferenceParameter = ConferenceDataService.newConferenceParameter();
    *     // Finish building the parameter ...
    *
    *     var conferenceData = ConferenceDataService.newConferenceDataBuilder()
    *         .setConferenceId(conferenceId);
    *         .addEntryPoint(entryPoint)
    *         .addConferenceParameter(conferenceParameter)
    *         .build();
    */
  trait ConferenceData extends StObject {
    
    /**
      * Prints the JSON representation of this object. This is for debugging only.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data#printJson()
      */
    def printJson(): String
  }
  object ConferenceData {
    
    inline def apply(printJson: () => String): typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData = {
      val __obj = js.Dynamic.literal(printJson = js.Any.fromFunction0(printJson))
      __obj.asInstanceOf[typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData]
    }
    
    extension [Self <: typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData](x: Self) {
      
      inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Builder for creating for ConferenceData objects.
    */
  trait ConferenceDataBuilder extends StObject {
    
    /**
      * Adds a ConferenceParameter to this ConferenceData. The maximum number of
      * parameters per ConferenceData is 300.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#addConferenceParameter(ConferenceParameter)
      * @param conferenceParameter The parameter to add.
      */
    def addConferenceParameter(conferenceParameter: ConferenceParameter): ConferenceDataBuilder
    
    /**
      * Adds an EntryPoint to this ConferenceData. The maximum number of entry points
      * per ConferenceData is 300.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#addEntryPoint(EntryPoint)
      * @param entryPoint The entry point to add.
      */
    def addEntryPoint(entryPoint: EntryPoint): ConferenceDataBuilder
    
    /**
      * Builds and validates the ConferenceData.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#build()
      */
    def build(): typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData
    
    /**
      * Sets the conference ID of this ConferenceData. The maximum length for this field is 512
      * characters.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setConferenceId(String)
      * @param conferenceId The ID to set.
      */
    def setConferenceId(conferenceId: String): ConferenceDataBuilder
    
    /**
      * Sets the conference solution ID defined in the addon's manifest. The value must be specified
      * and populates conference's name and iconUrl values.
      *
      *
      * Note that the field is required for GSuite add-ons whereas it's ignored for Conferencing
      * add-ons
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setConferenceSolutionId(String)
      * @param conferenceSolutionId The ID matching the manifest.
      */
    def setConferenceSolutionId(conferenceSolutionId: String): ConferenceDataBuilder
    
    /**
      * Sets the ConferenceError of this ConferenceData, indicating that the conference
      * was not successfully created.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setError(ConferenceError)
      * @param conferenceError The error to set.
      */
    def setError(conferenceError: ConferenceError): ConferenceDataBuilder
    
    /**
      * Sets the additional notes of this ConferenceData, such as instructions from the
      * administrator or legal notices. Can contain HTML. The maximum length for this field is 2048
      * characters.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-builder#setNotes(String)
      * @param notes The additional notes to set.
      */
    def setNotes(notes: String): ConferenceDataBuilder
  }
  object ConferenceDataBuilder {
    
    inline def apply(
      addConferenceParameter: ConferenceParameter => ConferenceDataBuilder,
      addEntryPoint: EntryPoint => ConferenceDataBuilder,
      build: () => typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData,
      setConferenceId: String => ConferenceDataBuilder,
      setConferenceSolutionId: String => ConferenceDataBuilder,
      setError: ConferenceError => ConferenceDataBuilder,
      setNotes: String => ConferenceDataBuilder
    ): ConferenceDataBuilder = {
      val __obj = js.Dynamic.literal(addConferenceParameter = js.Any.fromFunction1(addConferenceParameter), addEntryPoint = js.Any.fromFunction1(addEntryPoint), build = js.Any.fromFunction0(build), setConferenceId = js.Any.fromFunction1(setConferenceId), setConferenceSolutionId = js.Any.fromFunction1(setConferenceSolutionId), setError = js.Any.fromFunction1(setError), setNotes = js.Any.fromFunction1(setNotes))
      __obj.asInstanceOf[ConferenceDataBuilder]
    }
    
    extension [Self <: ConferenceDataBuilder](x: Self) {
      
      inline def setAddConferenceParameter(value: ConferenceParameter => ConferenceDataBuilder): Self = StObject.set(x, "addConferenceParameter", js.Any.fromFunction1(value))
      
      inline def setAddEntryPoint(value: EntryPoint => ConferenceDataBuilder): Self = StObject.set(x, "addEntryPoint", js.Any.fromFunction1(value))
      
      inline def setBuild(value: () => typings.googleAppsScript.GoogleAppsScript.ConferenceData.ConferenceData): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
      
      inline def setSetConferenceId(value: String => ConferenceDataBuilder): Self = StObject.set(x, "setConferenceId", js.Any.fromFunction1(value))
      
      inline def setSetConferenceSolutionId(value: String => ConferenceDataBuilder): Self = StObject.set(x, "setConferenceSolutionId", js.Any.fromFunction1(value))
      
      inline def setSetError(value: ConferenceError => ConferenceDataBuilder): Self = StObject.set(x, "setError", js.Any.fromFunction1(value))
      
      inline def setSetNotes(value: String => ConferenceDataBuilder): Self = StObject.set(x, "setNotes", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Service that scripts can use to create conferencing information.
    */
  trait ConferenceDataService extends StObject {
    
    var ConferenceErrorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any
    
    var EntryPointFeature: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any
    
    var EntryPointType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any
    
    /**
      * Returns a new, empty ConferenceDataBuilder.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceDataBuilder()
      */
    def newConferenceDataBuilder(): ConferenceDataBuilder
    
    /**
      * Returns a new, empty ConferenceError.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceError()
      */
    def newConferenceError(): ConferenceError
    
    /**
      * Returns a new, empty ConferenceParameter.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newConferenceParameter()
      */
    def newConferenceParameter(): ConferenceParameter
    
    /**
      * Returns a new, empty EntryPoint.
      * https://developers.google.com/apps-script/reference/conference-data/conference-data-service#newEntryPoint()
      */
    def newEntryPoint(): EntryPoint
  }
  object ConferenceDataService {
    
    inline def apply(
      ConferenceErrorType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any,
      EntryPointFeature: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any,
      EntryPointType: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any,
      newConferenceDataBuilder: () => ConferenceDataBuilder,
      newConferenceError: () => ConferenceError,
      newConferenceParameter: () => ConferenceParameter,
      newEntryPoint: () => EntryPoint
    ): ConferenceDataService = {
      val __obj = js.Dynamic.literal(ConferenceErrorType = ConferenceErrorType.asInstanceOf[js.Any], EntryPointFeature = EntryPointFeature.asInstanceOf[js.Any], EntryPointType = EntryPointType.asInstanceOf[js.Any], newConferenceDataBuilder = js.Any.fromFunction0(newConferenceDataBuilder), newConferenceError = js.Any.fromFunction0(newConferenceError), newConferenceParameter = js.Any.fromFunction0(newConferenceParameter), newEntryPoint = js.Any.fromFunction0(newEntryPoint))
      __obj.asInstanceOf[ConferenceDataService]
    }
    
    extension [Self <: ConferenceDataService](x: Self) {
      
      inline def setConferenceErrorType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof ConferenceErrorType */ js.Any
      ): Self = StObject.set(x, "ConferenceErrorType", value.asInstanceOf[js.Any])
      
      inline def setEntryPointFeature(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointFeature */ js.Any
      ): Self = StObject.set(x, "EntryPointFeature", value.asInstanceOf[js.Any])
      
      inline def setEntryPointType(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EntryPointType */ js.Any
      ): Self = StObject.set(x, "EntryPointType", value.asInstanceOf[js.Any])
      
      inline def setNewConferenceDataBuilder(value: () => ConferenceDataBuilder): Self = StObject.set(x, "newConferenceDataBuilder", js.Any.fromFunction0(value))
      
      inline def setNewConferenceError(value: () => ConferenceError): Self = StObject.set(x, "newConferenceError", js.Any.fromFunction0(value))
      
      inline def setNewConferenceParameter(value: () => ConferenceParameter): Self = StObject.set(x, "newConferenceParameter", js.Any.fromFunction0(value))
      
      inline def setNewEntryPoint(value: () => EntryPoint): Self = StObject.set(x, "newEntryPoint", js.Any.fromFunction0(value))
    }
  }
  
  /**
    * Error that occurred in a conferencing add-on. Example usage:
    *
    *     var conferenceError = ConferenceDataService.newConferenceError()
    *         .setConferenceErrorType(ConferenceErrorType.PERMANENT);
    *
    *     var state = ScriptApp.newStateToken()
    *         .withMethod('myLoginCallbackFunction');
    *         .withTimeout(3600)
    *         .createToken();
    *
    *     var authenticationUrl = 'https://script.google.com/a/google.com/d/'
    *         + ScriptApp.getScriptId()
    *         + '/usercallback?state='
    *         + state;
    *
    *     var conferenceError = ConferenceDataService.newConferenceError()
    *         .setConferenceErrorType(ConferenceErrorType.UNAUTHENTICATED)
    *         .setAuthenticationUrl(authenticationUrl);
    */
  trait ConferenceError extends StObject {
    
    /**
      * If the error type is AUTHENTICATION, the add-on must
      * provide a URL calling back into the add-on to allow users to log in. The maximum length for
      * this field is 1800 characters.
      * https://developers.google.com/apps-script/reference/conference-data/conference-error#setAuthenticationUrl(String)
      * @param authenticationUrl The authentication URL to set.
      */
    def setAuthenticationUrl(authenticationUrl: String): ConferenceError
    
    /**
      * Sets the error type of this ConferenceError.
      * https://developers.google.com/apps-script/reference/conference-data/conference-error#setConferenceErrorType(ConferenceErrorType)
      * @param conferenceErrorType The type of error to set.
      */
    def setConferenceErrorType(conferenceErrorType: ConferenceErrorType): ConferenceError
  }
  object ConferenceError {
    
    inline def apply(
      setAuthenticationUrl: String => ConferenceError,
      setConferenceErrorType: ConferenceErrorType => ConferenceError
    ): ConferenceError = {
      val __obj = js.Dynamic.literal(setAuthenticationUrl = js.Any.fromFunction1(setAuthenticationUrl), setConferenceErrorType = js.Any.fromFunction1(setConferenceErrorType))
      __obj.asInstanceOf[ConferenceError]
    }
    
    extension [Self <: ConferenceError](x: Self) {
      
      inline def setSetAuthenticationUrl(value: String => ConferenceError): Self = StObject.set(x, "setAuthenticationUrl", js.Any.fromFunction1(value))
      
      inline def setSetConferenceErrorType(value: ConferenceErrorType => ConferenceError): Self = StObject.set(x, "setConferenceErrorType", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Solution-specific parameter available fo the add-on's use. This parameter is persisted with the
    * conference data and, if an update or delete is needed, is passed to the add-on. Example usage:
    *
    *     var conferenceParameter = ConferenceDataService.newConferenceParameter()
    *         .setKey('meetingId')
    *         .setValue('123456');
    */
  trait ConferenceParameter extends StObject {
    
    /**
      * Sets the key of this ConferenceParameter. The maximum length for this field is 50
      * characters. Required.
      * https://developers.google.com/apps-script/reference/conference-data/conference-parameter#setKey(String)
      * @param key The key to set.
      */
    def setKey(key: String): ConferenceParameter
    
    /**
      * Sets the value of this ConferenceParameter. The maximum length for this field is 1024
      * characters. Required.
      * https://developers.google.com/apps-script/reference/conference-data/conference-parameter#setValue(String)
      * @param value The value to set.
      */
    def setValue(value: String): ConferenceParameter
  }
  object ConferenceParameter {
    
    inline def apply(setKey: String => ConferenceParameter, setValue: String => ConferenceParameter): ConferenceParameter = {
      val __obj = js.Dynamic.literal(setKey = js.Any.fromFunction1(setKey), setValue = js.Any.fromFunction1(setValue))
      __obj.asInstanceOf[ConferenceParameter]
    }
    
    extension [Self <: ConferenceParameter](x: Self) {
      
      inline def setSetKey(value: String => ConferenceParameter): Self = StObject.set(x, "setKey", js.Any.fromFunction1(value))
      
      inline def setSetValue(value: String => ConferenceParameter): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * Definition of a specific way to join a conference. Example usage:
    *
    *     var videoEntryPoint = ConferenceDataService.newEntryPoint()
    *         .setEntryPointType(ConferenceDataService.EntryPointType.VIDEO)
    *         .setUri('https://example.com/myroom');
    *         .setPasscode('12345');
    *
    *     var phoneEntryPoint = ConferenceDataService.newEntryPoint()
    *         .setEntryPointType(ConferenceDataService.EntryPointType.PHONE)
    *         .setUri('tel:+11234567890,,,112233445;9687')
    *         .addFeature(ConferenceDataService.EntryPointFeature.TOLL)
    *         setPin('9687');
    *
    *     var sipEntryPoint = ConferenceDataService.newEntryPoint()
    *         .setEntryPointType(ConferenceDataService.EntryPointType.SIP)
    *         .setUri('sip:joe@example.com')
    *         .setAccessCode('1234567');
    *
    *     var moreEntryPoint = ConferenceDataService.newEntryPoint()
    *         .setEntryPointType(ConferenceDataService.EntryPointType.MORE)
    *         .setUri('https://example.com/moreJoiningInfo');
    */
  trait EntryPoint extends StObject {
    
    /**
      * Adds the feature of the entry point, such as being toll or toll-free.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#addFeature(EntryPointFeature)
      * @param feature The feature to set.
      */
    def addFeature(feature: EntryPointFeature): EntryPoint
    
    /**
      * An access code for accessing the conference. Maximum length 128 characters. Optional.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setAccessCode(String)
      * @param accessCode The access code to set.
      */
    def setAccessCode(accessCode: String): EntryPoint
    
    /**
      * Sets the type of this entry point. Required.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setEntryPointType(EntryPointType)
      * @param entryPointType The entry point type to set.
      */
    def setEntryPointType(entryPointType: EntryPointType): EntryPoint
    
    /**
      * A meeting code for accessing the conference. Maximum length 128 characters. Optional.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setMeetingCode(String)
      * @param meetingCode The meeting code to set.
      */
    def setMeetingCode(meetingCode: String): EntryPoint
    
    /**
      * A passcode for accessing the conference. Maximum length 128 characters. Optional.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setPasscode(String)
      * @param passcode The passcode to set.
      */
    def setPasscode(passcode: String): EntryPoint
    
    /**
      * A password code for accessing the conference. Maximum length 128 characters. Optional.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setPassword(String)
      * @param password The password to set.
      */
    def setPassword(password: String): EntryPoint
    
    /**
      * A PIN code for accessing the conference. Maximum length 128 characters. Optional.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setPin(String)
      * @param pin The PIN code to set.
      */
    def setPin(pin: String): EntryPoint
    
    /**
      * The CLDR/ISO 3166 region code for the country associated with this entry point. Applicable only
      * to phone entry point types. Optional.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setRegionCode(String)
      * @param regionCode The regionCode to set.
      */
    def setRegionCode(regionCode: String): EntryPoint
    
    /**
      * Sets the URI for joining the conference through this entry point. For PHONE entry points, the prefix tel: is required. For SIP entry points, the prefix sip: is required. For VIDEO and MORE entry points, the prefixes
      * http: or https: are required. Maximum length 1300 characters. Required.
      * https://developers.google.com/apps-script/reference/conference-data/entry-point#setUri(String)
      * @param uri The URI to set.
      */
    def setUri(uri: String): EntryPoint
  }
  object EntryPoint {
    
    inline def apply(
      addFeature: EntryPointFeature => EntryPoint,
      setAccessCode: String => EntryPoint,
      setEntryPointType: EntryPointType => EntryPoint,
      setMeetingCode: String => EntryPoint,
      setPasscode: String => EntryPoint,
      setPassword: String => EntryPoint,
      setPin: String => EntryPoint,
      setRegionCode: String => EntryPoint,
      setUri: String => EntryPoint
    ): EntryPoint = {
      val __obj = js.Dynamic.literal(addFeature = js.Any.fromFunction1(addFeature), setAccessCode = js.Any.fromFunction1(setAccessCode), setEntryPointType = js.Any.fromFunction1(setEntryPointType), setMeetingCode = js.Any.fromFunction1(setMeetingCode), setPasscode = js.Any.fromFunction1(setPasscode), setPassword = js.Any.fromFunction1(setPassword), setPin = js.Any.fromFunction1(setPin), setRegionCode = js.Any.fromFunction1(setRegionCode), setUri = js.Any.fromFunction1(setUri))
      __obj.asInstanceOf[EntryPoint]
    }
    
    extension [Self <: EntryPoint](x: Self) {
      
      inline def setAddFeature(value: EntryPointFeature => EntryPoint): Self = StObject.set(x, "addFeature", js.Any.fromFunction1(value))
      
      inline def setSetAccessCode(value: String => EntryPoint): Self = StObject.set(x, "setAccessCode", js.Any.fromFunction1(value))
      
      inline def setSetEntryPointType(value: EntryPointType => EntryPoint): Self = StObject.set(x, "setEntryPointType", js.Any.fromFunction1(value))
      
      inline def setSetMeetingCode(value: String => EntryPoint): Self = StObject.set(x, "setMeetingCode", js.Any.fromFunction1(value))
      
      inline def setSetPasscode(value: String => EntryPoint): Self = StObject.set(x, "setPasscode", js.Any.fromFunction1(value))
      
      inline def setSetPassword(value: String => EntryPoint): Self = StObject.set(x, "setPassword", js.Any.fromFunction1(value))
      
      inline def setSetPin(value: String => EntryPoint): Self = StObject.set(x, "setPin", js.Any.fromFunction1(value))
      
      inline def setSetRegionCode(value: String => EntryPoint): Self = StObject.set(x, "setRegionCode", js.Any.fromFunction1(value))
      
      inline def setSetUri(value: String => EntryPoint): Self = StObject.set(x, "setUri", js.Any.fromFunction1(value))
    }
  }
}
