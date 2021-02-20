package typings.firebaseInstallations

import typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
import typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object installationEntryMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.installationEntryMod.NotStartedAuthToken
    - typings.firebaseInstallations.installationEntryMod.InProgressAuthToken
    - typings.firebaseInstallations.installationEntryMod.CompletedAuthToken
  */
  trait AuthToken extends StObject
  object AuthToken {
    
    @scala.inline
    def CompletedAuthToken(creationTime: Double, expiresIn: Double, requestStatus: `2`, token: String): typings.firebaseInstallations.installationEntryMod.CompletedAuthToken = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.installationEntryMod.CompletedAuthToken]
    }
    
    @scala.inline
    def InProgressAuthToken(requestStatus: `1`, requestTime: Double): typings.firebaseInstallations.installationEntryMod.InProgressAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.installationEntryMod.InProgressAuthToken]
    }
    
    @scala.inline
    def NotStartedAuthToken(requestStatus: `0`): typings.firebaseInstallations.installationEntryMod.NotStartedAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.installationEntryMod.NotStartedAuthToken]
    }
  }
  
  @js.native
  trait CompletedAuthToken extends AuthToken {
    
    /**
      * Unix timestamp when Authentication Token was created.
      * Only exists if requestStatus is COMPLETED.
      */
    val creationTime: Double = js.native
    
    /**
      * Authentication Token time to live duration in milliseconds.
      * Only exists if requestStatus is COMPLETED.
      */
    val expiresIn: Double = js.native
    
    val requestStatus: `2` = js.native
    
    /**
      * Firebase Installations Authentication Token.
      * Only exists if requestStatus is COMPLETED.
      */
    val token: String = js.native
  }
  object CompletedAuthToken {
    
    @scala.inline
    def apply(creationTime: Double, expiresIn: Double, requestStatus: `2`, token: String): CompletedAuthToken = {
      val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], expiresIn = expiresIn.asInstanceOf[js.Any], requestStatus = requestStatus.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompletedAuthToken]
    }
    
    @scala.inline
    implicit class CompletedAuthTokenMutableBuilder[Self <: CompletedAuthToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreationTime(value: Double): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpiresIn(value: Double): Self = StObject.set(x, "expiresIn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestStatus(value: `2`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InProgressAuthToken extends AuthToken {
    
    val requestStatus: `1` = js.native
    
    /**
      * Unix timestamp when the current generateAuthRequest was initiated.
      * Used for figuring out how long the request status has been IN_PROGRESS.
      */
    val requestTime: Double = js.native
  }
  object InProgressAuthToken {
    
    @scala.inline
    def apply(requestStatus: `1`, requestTime: Double): InProgressAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any], requestTime = requestTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressAuthToken]
    }
    
    @scala.inline
    implicit class InProgressAuthTokenMutableBuilder[Self <: InProgressAuthToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestStatus(value: `1`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestTime(value: Double): Self = StObject.set(x, "requestTime", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InProgressInstallationEntry extends InstallationEntry {
    
    /** Firebase Installation ID */
    val fid: String = js.native
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `1` = js.native
    
    /**
      * Unix timestamp that shows the time when the current createInstallation
      * request was initiated.
      * Used for figuring out how long the registration status has been PENDING.
      */
    val registrationTime: Double = js.native
  }
  object InProgressInstallationEntry {
    
    @scala.inline
    def apply(fid: String, registrationStatus: `1`, registrationTime: Double): InProgressInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any], registrationTime = registrationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[InProgressInstallationEntry]
    }
    
    @scala.inline
    implicit class InProgressInstallationEntryMutableBuilder[Self <: InProgressInstallationEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationStatus(value: `1`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationTime(value: Double): Self = StObject.set(x, "registrationTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry
    - typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry
    - typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry
  */
  trait InstallationEntry extends StObject
  object InstallationEntry {
    
    @scala.inline
    def InProgressInstallationEntry(fid: String, registrationStatus: `1`, registrationTime: Double): typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any], registrationTime = registrationTime.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.installationEntryMod.InProgressInstallationEntry]
    }
    
    @scala.inline
    def RegisteredInstallationEntry(authToken: AuthToken, fid: String, refreshToken: String, registrationStatus: `2`): typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.installationEntryMod.RegisteredInstallationEntry]
    }
    
    @scala.inline
    def UnregisteredInstallationEntry(fid: String, registrationStatus: `0`): typings.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.firebaseInstallations.installationEntryMod.UnregisteredInstallationEntry]
    }
  }
  
  @js.native
  trait NotStartedAuthToken extends AuthToken {
    
    val requestStatus: `0` = js.native
  }
  object NotStartedAuthToken {
    
    @scala.inline
    def apply(requestStatus: `0`): NotStartedAuthToken = {
      val __obj = js.Dynamic.literal(requestStatus = requestStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[NotStartedAuthToken]
    }
    
    @scala.inline
    implicit class NotStartedAuthTokenMutableBuilder[Self <: NotStartedAuthToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequestStatus(value: `0`): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RegisteredInstallationEntry extends InstallationEntry {
    
    /** Firebase Installation Authentication Token. */
    val authToken: AuthToken = js.native
    
    /** Firebase Installation ID */
    val fid: String = js.native
    
    /**
      * Refresh Token returned from the server.
      * Used for authenticating generateAuthToken requests.
      */
    val refreshToken: String = js.native
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `2` = js.native
  }
  object RegisteredInstallationEntry {
    
    @scala.inline
    def apply(authToken: AuthToken, fid: String, refreshToken: String, registrationStatus: `2`): RegisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(authToken = authToken.asInstanceOf[js.Any], fid = fid.asInstanceOf[js.Any], refreshToken = refreshToken.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[RegisteredInstallationEntry]
    }
    
    @scala.inline
    implicit class RegisteredInstallationEntryMutableBuilder[Self <: RegisteredInstallationEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshToken(value: String): Self = StObject.set(x, "refreshToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationStatus(value: `2`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.firebaseInstallations.firebaseInstallationsNumbers.`0`
    - typings.firebaseInstallations.firebaseInstallationsNumbers.`1`
    - typings.firebaseInstallations.firebaseInstallationsNumbers.`2`
  */
  trait RequestStatus extends StObject
  object RequestStatus {
    
    @scala.inline
    def COMPLETED: `2` = 2.asInstanceOf[`2`]
    
    @scala.inline
    def IN_PROGRESS: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def NOT_STARTED: `0` = 0.asInstanceOf[`0`]
  }
  
  @js.native
  trait UnregisteredInstallationEntry extends InstallationEntry {
    
    /** Firebase Installation ID */
    val fid: String = js.native
    
    /** Status of the Firebase Installation registration on the server. */
    val registrationStatus: `0` = js.native
  }
  object UnregisteredInstallationEntry {
    
    @scala.inline
    def apply(fid: String, registrationStatus: `0`): UnregisteredInstallationEntry = {
      val __obj = js.Dynamic.literal(fid = fid.asInstanceOf[js.Any], registrationStatus = registrationStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnregisteredInstallationEntry]
    }
    
    @scala.inline
    implicit class UnregisteredInstallationEntryMutableBuilder[Self <: UnregisteredInstallationEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFid(value: String): Self = StObject.set(x, "fid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegistrationStatus(value: `0`): Self = StObject.set(x, "registrationStatus", value.asInstanceOf[js.Any])
    }
  }
}
