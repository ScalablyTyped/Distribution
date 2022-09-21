package typings.firebaseStorageCompat

import org.scalablytyped.runtime.Instantiable0
import typings.firebaseStorageCompat.mod.firebaseAppCompatAugmentingMod.FirebaseApp
import typings.firebaseStorageTypes.mod.FirebaseStorage
import typings.firebaseStorageTypes.mod.StringFormat
import typings.firebaseStorageTypes.mod.TaskEvent
import typings.firebaseStorageTypes.mod.TaskState
import typings.firebaseUtil.mod.EmulatorMockTokenOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
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
    def apply(app: Unit, url: String): FirebaseStorage = js.native
    def apply(app: FirebaseApp): FirebaseStorage = js.native
    def apply(app: FirebaseApp, url: String): FirebaseStorage = js.native
    
    var Storage: Instantiable0[FirebaseStorage] = js.native
    
    var StringFormat: BASE64 = js.native
    
    var TaskEvent: STATECHANGED = js.native
    
    var TaskState: CANCELED = js.native
  }
  
  trait MockUserToken extends StObject {
    
    var mockUserToken: js.UndefOr[EmulatorMockTokenOptions | String] = js.undefined
  }
  object MockUserToken {
    
    inline def apply(): MockUserToken = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MockUserToken]
    }
    
    extension [Self <: MockUserToken](x: Self) {
      
      inline def setMockUserToken(value: EmulatorMockTokenOptions | String): Self = StObject.set(x, "mockUserToken", value.asInstanceOf[js.Any])
      
      inline def setMockUserTokenUndefined: Self = StObject.set(x, "mockUserToken", js.undefined)
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
}
