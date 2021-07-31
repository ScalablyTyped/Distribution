package typings.googleapis.androidmanagementV1Mod.androidmanagementV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Information about device memory and storage.
  */
trait SchemaMemoryInfo extends StObject {
  
  /**
    * Total internal storage on device in bytes.
    */
  var totalInternalStorage: js.UndefOr[String] = js.undefined
  
  /**
    * Total RAM on device in bytes.
    */
  var totalRam: js.UndefOr[String] = js.undefined
}
object SchemaMemoryInfo {
  
  @scala.inline
  def apply(): SchemaMemoryInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaMemoryInfo]
  }
  
  @scala.inline
  implicit class SchemaMemoryInfoMutableBuilder[Self <: SchemaMemoryInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTotalInternalStorage(value: String): Self = StObject.set(x, "totalInternalStorage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalInternalStorageUndefined: Self = StObject.set(x, "totalInternalStorage", js.undefined)
    
    @scala.inline
    def setTotalRam(value: String): Self = StObject.set(x, "totalRam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalRamUndefined: Self = StObject.set(x, "totalRam", js.undefined)
  }
}
