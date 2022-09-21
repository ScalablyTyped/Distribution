package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interfacesInstallationEntryMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.interfacesInstallationEntryMod.NotStartedAuthToken
    - typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressAuthToken
    - typings.firebaseInstallations.interfacesInstallationEntryMod.CompletedAuthToken
  */
  trait AuthToken extends StObject
  object AuthToken {
    
    inline def CompletedAuthToken(creationTime: Double, expiresIn: Double, token: String): typings.firebaseInstallations.interfacesInstallationEntryMod.CompletedAuthToken = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = 2, token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.interfacesInstallationEntryMod.CompletedAuthToken]
    }
    
    inline def InProgressAuthToken(requestTime: Double): typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 1, requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressAuthToken]
    }
    
    inline def NotStartedAuthToken(): typings.firebaseInstallations.interfacesInstallationEntryMod.NotStartedAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 0)
      __obj.asInstanceOf[typings.firebaseInstallations.interfacesInstallationEntryMod.NotStartedAuthToken]
    }
  }
  
  trait CompletedAuthToken
    extends StObject
       with AuthToken {
    
    /**
      * Unix timestamp when Authentication Token was created.
      * Only exists if requestStatus is COMPLETED.
      */
    val creationTime: Double
    
    /**
      * Authentication Token time to live duration in milliseconds.
      * Only exists if requestStatus is COMPLETED.
      */
    val expiresIn: Double
    
    val requestStatus: `2`
    
    /**
      * Firebase Installations Authentication Token.
      * Only exists if requestStatus is COMPLETED.
      */
    val token: String
  }
  object CompletedAuthToken {
    
    inline def apply(creationTime: Double, expiresIn: Double, token: String): CompletedAuthToken = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = 2, token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletedAuthToken]
    }
    
    extension [Self <: CompletedAuthToken](x: Self) {
      
      inline def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      inline def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      inline def setRequestStatus(value: `2`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  trait InProgressAuthToken
    extends StObject
       with AuthToken {
    
    val requestStatus: `1`
    
    /**
      * Unix timestamp when the current generateAuthRequest was initiated.
      * Used for figuring out how long the request status has been IN_PROGRESS.
      */
    val requestTime: Double
  }
  object InProgressAuthToken {
    
    inline def apply(requestTime: Double): InProgressAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 1, requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressAuthToken]
    }
    
    extension [Self <: InProgressAuthToken](x: Self) {
      
      inline def setRequestStatus(value: `1`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      inline def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    }
  }
  
  trait InProgressInstallationEntry
    extends StObject
       with InstallationEntry {
    
    /** Firebase Installation ID */
    val fid: String
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `1`
    
    /**
      * Unix timestamp that shows the time when the current createInstallation
      * request was initiated.
      * Used for figuring out how long the registration status has been PENDING.
      */
    val registrationTime: Double
  }
  object InProgressInstallationEntry {
    
    inline def apply(fid: String, registrationTime: Double): InProgressInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 1, registrationTime = registrationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressInstallationEntry]
    }
    
    extension [Self <: InProgressInstallationEntry](x: Self) {
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setRegistrationStatus(value: `1`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
      
      inline def setRegistrationTime(value: Double): Self = StObject.set(x, "registrationTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.interfacesInstallationEntryMod.UnregisteredInstallationEntry
    - typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressInstallationEntry
    - typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry
  */
  trait InstallationEntry extends StObject
  object InstallationEntry {
    
    inline def InProgressInstallationEntry(fid: String, registrationTime: Double): typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 1, registrationTime = registrationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.interfacesInstallationEntryMod.InProgressInstallationEntry]
    }
    
    inline def RegisteredInstallationEntry(authToken: AuthToken, fid: String, refreshToken: String): typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = 2)
      __obj.asInstanceOf[typings.firebaseInstallations.interfacesInstallationEntryMod.RegisteredInstallationEntry]
    }
    
    inline def UnregisteredInstallationEntry(fid: String): typings.firebaseInstallations.interfacesInstallationEntryMod.UnregisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 0)
      __obj.asInstanceOf[typings.firebaseInstallations.interfacesInstallationEntryMod.UnregisteredInstallationEntry]
    }
  }
  
  trait NotStartedAuthToken
    extends StObject
       with AuthToken {
    
    val requestStatus: `0`
  }
  object NotStartedAuthToken {
    
    inline def apply(): NotStartedAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = 0)
      __obj.asInstanceOf[NotStartedAuthToken]
    }
    
    extension [Self <: NotStartedAuthToken](x: Self) {
      
      inline def setRequestStatus(value: `0`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
    }
  }
  
  trait RegisteredInstallationEntry
    extends StObject
       with InstallationEntry {
    
    /** Firebase Installation Authentication Token. */
    val authToken: AuthToken
    
    /** Firebase Installation ID */
    val fid: String
    
    /**
      * Refresh Token returned from the server.
      * Used for authenticating generateAuthToken requests.
      */
    val refreshToken: String
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `2`
  }
  object RegisteredInstallationEntry {
    
    inline def apply(authToken: AuthToken, fid: String, refreshToken: String): RegisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = 2)
      __obj.asInstanceOf[RegisteredInstallationEntry]
    }
    
    extension [Self <: RegisteredInstallationEntry](x: Self) {
      
      inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      inline def setRegistrationStatus(value: `2`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
    - typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
    - typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
  */
  trait RequestStatus extends StObject
  object RequestStatus {
    
    inline def COMPLETED: `2` = 2.asInstanceOf[`2`]
    
    inline def IN_PROGRESS: `1` = 1.asInstanceOf[`1`]
    
    inline def NOT_STARTED: `0` = 0.asInstanceOf[`0`]
  }
  
  trait UnregisteredInstallationEntry
    extends StObject
       with InstallationEntry {
    
    /** Firebase Installation ID */
    val fid: String
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `0`
  }
  object UnregisteredInstallationEntry {
    
    inline def apply(fid: String): UnregisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = 0)
      __obj.asInstanceOf[UnregisteredInstallationEntry]
    }
    
    extension [Self <: UnregisteredInstallationEntry](x: Self) {
      
      inline def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      inline def setRegistrationStatus(value: `0`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    }
  }
}
