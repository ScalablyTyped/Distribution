package typings.firebaseStorage

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseStorage.compatMod.firebaseAppTypesAugmentingMod.FirebaseApp
import typings.firebaseStorageTypes.mod.FirebaseStorage
import typings.firebaseStorageTypes.mod.StringFormat
import typings.firebaseStorageTypes.mod.TaskEvent
import typings.firebaseStorageTypes.mod.TaskState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AccessToken extends StObject {
    
    var accessToken: String = js.native
  }
  object AccessToken {
    
    @scala.inline
    def apply(accessToken: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    @scala.inline
    implicit class AccessTokenMutableBuilder[Self <: AccessToken] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BASE64 extends StObject {
    
    var BASE64: StringFormat = js.native
    
    var BASE64URL: StringFormat = js.native
    
    var DATA_URL: StringFormat = js.native
    
    var RAW: StringFormat = js.native
  }
  object BASE64 {
    
    @scala.inline
    def apply(BASE64: StringFormat, BASE64URL: StringFormat, DATA_URL: StringFormat, RAW: StringFormat): BASE64 = {
      val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DATA_URL = DATA_URL.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any])
      __obj.asInstanceOf[BASE64]
    }
    
    @scala.inline
    implicit class BASE64MutableBuilder[Self <: BASE64] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBASE64(value: StringFormat): Self = StObject.set(x, "BASE64", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBASE64URL(value: StringFormat): Self = StObject.set(x, "BASE64URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDATA_URL(value: StringFormat): Self = StObject.set(x, "DATA_URL", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRAW(value: StringFormat): Self = StObject.set(x, "RAW", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CANCELED extends StObject {
    
    var CANCELED: TaskState = js.native
    
    var ERROR: TaskState = js.native
    
    var PAUSED: TaskState = js.native
    
    var RUNNING: TaskState = js.native
    
    var SUCCESS: TaskState = js.native
  }
  object CANCELED {
    
    @scala.inline
    def apply(CANCELED: TaskState, ERROR: TaskState, PAUSED: TaskState, RUNNING: TaskState, SUCCESS: TaskState): CANCELED = {
      val __obj = js.Dynamic.literal(CANCELED = CANCELED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], PAUSED = PAUSED.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CANCELED]
    }
    
    @scala.inline
    implicit class CANCELEDMutableBuilder[Self <: CANCELED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCANCELED(value: TaskState): Self = StObject.set(x, "CANCELED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setERROR(value: TaskState): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPAUSED(value: TaskState): Self = StObject.set(x, "PAUSED", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRUNNING(value: TaskState): Self = StObject.set(x, "RUNNING", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSUCCESS(value: TaskState): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Call extends StObject {
    
    def apply(): FirebaseStorage = js.native
    def apply(app: FirebaseApp): FirebaseStorage = js.native
    
    var Storage: Instantiable0[FirebaseStorage] = js.native
    
    var StringFormat: BASE64 = js.native
    
    var TaskEvent: STATECHANGED = js.native
    
    var TaskState: CANCELED = js.native
  }
  
  @js.native
  trait Delete extends StObject {
    
    /**
      * Called when the associated app is deleted.
      */
    def delete(): js.Promise[Unit] = js.native
  }
  object Delete {
    
    @scala.inline
    def apply(delete: () => js.Promise[Unit]): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Delete]
    }
    
    @scala.inline
    implicit class DeleteMutableBuilder[Self <: Delete] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait STATECHANGED extends StObject {
    
    var STATE_CHANGED: TaskEvent = js.native
  }
  object STATECHANGED {
    
    @scala.inline
    def apply(STATE_CHANGED: TaskEvent): STATECHANGED = {
      val __obj = js.Dynamic.literal(STATE_CHANGED = STATE_CHANGED.asInstanceOf[js.Any])
      __obj.asInstanceOf[STATECHANGED]
    }
    
    @scala.inline
    implicit class STATECHANGEDMutableBuilder[Self <: STATECHANGED] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSTATE_CHANGED(value: TaskEvent): Self = StObject.set(x, "STATE_CHANGED", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ServerResponse extends StObject {
    
    var serverResponse: String | Null = js.native
  }
  object ServerResponse {
    
    @scala.inline
    def apply(): ServerResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerResponse]
    }
    
    @scala.inline
    implicit class ServerResponseMutableBuilder[Self <: ServerResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setServerResponse(value: String): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerResponseNull: Self = StObject.set(x, "serverResponse", null)
    }
  }
}
