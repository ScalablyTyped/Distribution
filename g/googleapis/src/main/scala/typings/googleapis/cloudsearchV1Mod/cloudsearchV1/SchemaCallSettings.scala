package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SchemaCallSettings extends StObject {
  
  /**
    * Indicates whether the access lock is currently on or off.
    */
  var accessLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the attendance report is currently enabled or disabled.
    */
  var attendanceReportEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the audio lock is currently on or off.
    */
  var audioLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the chat lock is currently on or off.
    */
  var chatLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Whether Client-side Encryption is enabled for this conference.
    */
  var cseEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the current call is moderated. go/meet-multimod-dd
    */
  var moderationEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the present lock is currently on or off.
    */
  var presentLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether project Dino is currently on or off. WARNING: This is currently an experimental field. It should not be used without getting an explicit review and approval from the Meet team.
    */
  var projectDinoEnabled: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the reactions lock is currently on or off.
    */
  var reactionsLock: js.UndefOr[Boolean | Null] = js.undefined
  
  /**
    * Indicates whether the video lock is currently on or off.
    */
  var videoLock: js.UndefOr[Boolean | Null] = js.undefined
}
object SchemaCallSettings {
  
  inline def apply(): SchemaCallSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaCallSettings]
  }
  
  extension [Self <: SchemaCallSettings](x: Self) {
    
    inline def setAccessLock(value: Boolean): Self = StObject.set(x, "accessLock", value.asInstanceOf[js.Any])
    
    inline def setAccessLockNull: Self = StObject.set(x, "accessLock", null)
    
    inline def setAccessLockUndefined: Self = StObject.set(x, "accessLock", js.undefined)
    
    inline def setAttendanceReportEnabled(value: Boolean): Self = StObject.set(x, "attendanceReportEnabled", value.asInstanceOf[js.Any])
    
    inline def setAttendanceReportEnabledNull: Self = StObject.set(x, "attendanceReportEnabled", null)
    
    inline def setAttendanceReportEnabledUndefined: Self = StObject.set(x, "attendanceReportEnabled", js.undefined)
    
    inline def setAudioLock(value: Boolean): Self = StObject.set(x, "audioLock", value.asInstanceOf[js.Any])
    
    inline def setAudioLockNull: Self = StObject.set(x, "audioLock", null)
    
    inline def setAudioLockUndefined: Self = StObject.set(x, "audioLock", js.undefined)
    
    inline def setChatLock(value: Boolean): Self = StObject.set(x, "chatLock", value.asInstanceOf[js.Any])
    
    inline def setChatLockNull: Self = StObject.set(x, "chatLock", null)
    
    inline def setChatLockUndefined: Self = StObject.set(x, "chatLock", js.undefined)
    
    inline def setCseEnabled(value: Boolean): Self = StObject.set(x, "cseEnabled", value.asInstanceOf[js.Any])
    
    inline def setCseEnabledNull: Self = StObject.set(x, "cseEnabled", null)
    
    inline def setCseEnabledUndefined: Self = StObject.set(x, "cseEnabled", js.undefined)
    
    inline def setModerationEnabled(value: Boolean): Self = StObject.set(x, "moderationEnabled", value.asInstanceOf[js.Any])
    
    inline def setModerationEnabledNull: Self = StObject.set(x, "moderationEnabled", null)
    
    inline def setModerationEnabledUndefined: Self = StObject.set(x, "moderationEnabled", js.undefined)
    
    inline def setPresentLock(value: Boolean): Self = StObject.set(x, "presentLock", value.asInstanceOf[js.Any])
    
    inline def setPresentLockNull: Self = StObject.set(x, "presentLock", null)
    
    inline def setPresentLockUndefined: Self = StObject.set(x, "presentLock", js.undefined)
    
    inline def setProjectDinoEnabled(value: Boolean): Self = StObject.set(x, "projectDinoEnabled", value.asInstanceOf[js.Any])
    
    inline def setProjectDinoEnabledNull: Self = StObject.set(x, "projectDinoEnabled", null)
    
    inline def setProjectDinoEnabledUndefined: Self = StObject.set(x, "projectDinoEnabled", js.undefined)
    
    inline def setReactionsLock(value: Boolean): Self = StObject.set(x, "reactionsLock", value.asInstanceOf[js.Any])
    
    inline def setReactionsLockNull: Self = StObject.set(x, "reactionsLock", null)
    
    inline def setReactionsLockUndefined: Self = StObject.set(x, "reactionsLock", js.undefined)
    
    inline def setVideoLock(value: Boolean): Self = StObject.set(x, "videoLock", value.asInstanceOf[js.Any])
    
    inline def setVideoLockNull: Self = StObject.set(x, "videoLock", null)
    
    inline def setVideoLockUndefined: Self = StObject.set(x, "videoLock", js.undefined)
  }
}
