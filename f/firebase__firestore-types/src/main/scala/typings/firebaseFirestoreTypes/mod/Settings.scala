package typings.firebaseFirestoreTypes.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var cacheSizeBytes: js.UndefOr[Double] = js.undefined
  
  var experimentalAutoDetectLongPolling: js.UndefOr[Boolean] = js.undefined
  
  var experimentalForceLongPolling: js.UndefOr[Boolean] = js.undefined
  
  var host: js.UndefOr[String] = js.undefined
  
  var ignoreUndefinedProperties: js.UndefOr[Boolean] = js.undefined
  
  var merge: js.UndefOr[Boolean] = js.undefined
  
  var ssl: js.UndefOr[Boolean] = js.undefined
}
object Settings {
  
  @scala.inline
  def apply(): Settings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCacheSizeBytes(value: Double): Self = StObject.set(x, "cacheSizeBytes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCacheSizeBytesUndefined: Self = StObject.set(x, "cacheSizeBytes", js.undefined)
    
    @scala.inline
    def setExperimentalAutoDetectLongPolling(value: Boolean): Self = StObject.set(x, "experimentalAutoDetectLongPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalAutoDetectLongPollingUndefined: Self = StObject.set(x, "experimentalAutoDetectLongPolling", js.undefined)
    
    @scala.inline
    def setExperimentalForceLongPolling(value: Boolean): Self = StObject.set(x, "experimentalForceLongPolling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExperimentalForceLongPollingUndefined: Self = StObject.set(x, "experimentalForceLongPolling", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setIgnoreUndefinedProperties(value: Boolean): Self = StObject.set(x, "ignoreUndefinedProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreUndefinedPropertiesUndefined: Self = StObject.set(x, "ignoreUndefinedProperties", js.undefined)
    
    @scala.inline
    def setMerge(value: Boolean): Self = StObject.set(x, "merge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMergeUndefined: Self = StObject.set(x, "merge", js.undefined)
    
    @scala.inline
    def setSsl(value: Boolean): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSslUndefined: Self = StObject.set(x, "ssl", js.undefined)
  }
}
