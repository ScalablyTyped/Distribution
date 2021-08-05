package typings.firebaseStorage

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseStorage.compatMod.firebaseAppTypesAugmentingMod.FirebaseApp
import typings.firebaseStorageTypes.mod.FirebaseStorage
import typings.firebaseStorageTypes.mod.StringFormat
import typings.firebaseStorageTypes.mod.TaskEvent
import typings.firebaseStorageTypes.mod.TaskState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AccessToken extends StObject {
    
    var accessToken: String
  }
  object AccessToken {
    
    inline def apply(accessToken: String): AccessToken = {
      val __obj = js.Dynamic.literal(accessToken = accessToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[AccessToken]
    }
    
    extension [Self <: AccessToken](x: Self) {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
    }
  }
  
  trait BASE64 extends StObject {
    
    var BASE64: StringFormat
    
    var BASE64URL: StringFormat
    
    var DATA_URL: StringFormat
    
    var RAW: StringFormat
  }
  object BASE64 {
    
    inline def apply(BASE64: StringFormat, BASE64URL: StringFormat, DATA_URL: StringFormat, RAW: StringFormat): BASE64 = {
      val __obj = js.Dynamic.literal(BASE64 = BASE64.asInstanceOf[js.Any], BASE64URL = BASE64URL.asInstanceOf[js.Any], DATA_URL = DATA_URL.asInstanceOf[js.Any], RAW = RAW.asInstanceOf[js.Any])
      __obj.asInstanceOf[BASE64]
    }
    
    extension [Self <: BASE64](x: Self) {
      
      inline def setBASE64(value: StringFormat): Self = StObject.set(x, "BASE64", value.asInstanceOf[js.Any])
      
      inline def setBASE64URL(value: StringFormat): Self = StObject.set(x, "BASE64URL", value.asInstanceOf[js.Any])
      
      inline def setDATA_URL(value: StringFormat): Self = StObject.set(x, "DATA_URL", value.asInstanceOf[js.Any])
      
      inline def setRAW(value: StringFormat): Self = StObject.set(x, "RAW", value.asInstanceOf[js.Any])
    }
  }
  
  trait CANCELED extends StObject {
    
    var CANCELED: TaskState
    
    var ERROR: TaskState
    
    var PAUSED: TaskState
    
    var RUNNING: TaskState
    
    var SUCCESS: TaskState
  }
  object CANCELED {
    
    inline def apply(CANCELED: TaskState, ERROR: TaskState, PAUSED: TaskState, RUNNING: TaskState, SUCCESS: TaskState): CANCELED = {
      val __obj = js.Dynamic.literal(CANCELED = CANCELED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], PAUSED = PAUSED.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
      __obj.asInstanceOf[CANCELED]
    }
    
    extension [Self <: CANCELED](x: Self) {
      
      inline def setCANCELED(value: TaskState): Self = StObject.set(x, "CANCELED", value.asInstanceOf[js.Any])
      
      inline def setERROR(value: TaskState): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
      
      inline def setPAUSED(value: TaskState): Self = StObject.set(x, "PAUSED", value.asInstanceOf[js.Any])
      
      inline def setRUNNING(value: TaskState): Self = StObject.set(x, "RUNNING", value.asInstanceOf[js.Any])
      
      inline def setSUCCESS(value: TaskState): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
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
  
  trait Delete extends StObject {
    
    /**
      * Called when the associated app is deleted.
      */
    def delete(): js.Promise[Unit]
  }
  object Delete {
    
    inline def apply(delete: () => js.Promise[Unit]): Delete = {
      val __obj = js.Dynamic.literal(delete = js.Any.fromFunction0(delete))
      __obj.asInstanceOf[Delete]
    }
    
    extension [Self <: Delete](x: Self) {
      
      inline def setDelete(value: () => js.Promise[Unit]): Self = StObject.set(x, "delete", js.Any.fromFunction0(value))
    }
  }
  
  trait STATECHANGED extends StObject {
    
    var STATE_CHANGED: TaskEvent
  }
  object STATECHANGED {
    
    inline def apply(STATE_CHANGED: TaskEvent): STATECHANGED = {
      val __obj = js.Dynamic.literal(STATE_CHANGED = STATE_CHANGED.asInstanceOf[js.Any])
      __obj.asInstanceOf[STATECHANGED]
    }
    
    extension [Self <: STATECHANGED](x: Self) {
      
      inline def setSTATE_CHANGED(value: TaskEvent): Self = StObject.set(x, "STATE_CHANGED", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServerResponse extends StObject {
    
    var serverResponse: String | Null
  }
  object ServerResponse {
    
    inline def apply(): ServerResponse = {
      val __obj = js.Dynamic.literal(serverResponse = null)
      __obj.asInstanceOf[ServerResponse]
    }
    
    extension [Self <: ServerResponse](x: Self) {
      
      inline def setServerResponse(value: String): Self = StObject.set(x, "serverResponse", value.asInstanceOf[js.Any])
      
      inline def setServerResponseNull: Self = StObject.set(x, "serverResponse", null)
    }
  }
}
