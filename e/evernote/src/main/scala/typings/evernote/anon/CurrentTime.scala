package typings.evernote.anon

import typings.evernote.mod.Types.MessageEventID
import typings.evernote.mod.Types.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CurrentTime extends StObject {
  
  var currentTime: js.UndefOr[Timestamp] = js.undefined
  
  var fullSyncBefore: js.UndefOr[Timestamp] = js.undefined
  
  var updateCount: js.UndefOr[Double] = js.undefined
  
  var uploaded: js.UndefOr[Double] = js.undefined
  
  var userLastUpdated: js.UndefOr[Timestamp] = js.undefined
  
  var userMaxMessageEventId: js.UndefOr[MessageEventID] = js.undefined
}
object CurrentTime {
  
  inline def apply(): CurrentTime = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CurrentTime]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CurrentTime] (val x: Self) extends AnyVal {
    
    inline def setCurrentTime(value: Timestamp): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
    
    inline def setCurrentTimeUndefined: Self = StObject.set(x, "currentTime", js.undefined)
    
    inline def setFullSyncBefore(value: Timestamp): Self = StObject.set(x, "fullSyncBefore", value.asInstanceOf[js.Any])
    
    inline def setFullSyncBeforeUndefined: Self = StObject.set(x, "fullSyncBefore", js.undefined)
    
    inline def setUpdateCount(value: Double): Self = StObject.set(x, "updateCount", value.asInstanceOf[js.Any])
    
    inline def setUpdateCountUndefined: Self = StObject.set(x, "updateCount", js.undefined)
    
    inline def setUploaded(value: Double): Self = StObject.set(x, "uploaded", value.asInstanceOf[js.Any])
    
    inline def setUploadedUndefined: Self = StObject.set(x, "uploaded", js.undefined)
    
    inline def setUserLastUpdated(value: Timestamp): Self = StObject.set(x, "userLastUpdated", value.asInstanceOf[js.Any])
    
    inline def setUserLastUpdatedUndefined: Self = StObject.set(x, "userLastUpdated", js.undefined)
    
    inline def setUserMaxMessageEventId(value: MessageEventID): Self = StObject.set(x, "userMaxMessageEventId", value.asInstanceOf[js.Any])
    
    inline def setUserMaxMessageEventIdUndefined: Self = StObject.set(x, "userMaxMessageEventId", js.undefined)
  }
}
