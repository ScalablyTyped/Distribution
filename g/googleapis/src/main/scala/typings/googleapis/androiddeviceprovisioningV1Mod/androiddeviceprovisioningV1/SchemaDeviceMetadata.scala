package typings.googleapis.androiddeviceprovisioningV1Mod.androiddeviceprovisioningV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Metadata entries that can be attached to a `Device`. To learn more, read
  * [Device metadata](/zero-touch/guides/metadata).
  */
trait SchemaDeviceMetadata extends StObject {
  
  /**
    * Metadata entries recorded as key-value pairs.
    */
  var entries: js.UndefOr[StringDictionary[String]] = js.undefined
}
object SchemaDeviceMetadata {
  
  @scala.inline
  def apply(): SchemaDeviceMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaDeviceMetadata]
  }
  
  @scala.inline
  implicit class SchemaDeviceMetadataMutableBuilder[Self <: SchemaDeviceMetadata] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEntries(value: StringDictionary[String]): Self = StObject.set(x, "entries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntriesUndefined: Self = StObject.set(x, "entries", js.undefined)
  }
}
