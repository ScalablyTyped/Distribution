package typings.devtoolsProtocol.mod.Protocol.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UsageForType extends StObject {
  
  /**
    * Name of storage type.
    */
  var storageType: StorageType = js.native
  
  /**
    * Storage usage (bytes).
    */
  var usage: Double = js.native
}
object UsageForType {
  
  @scala.inline
  def apply(storageType: StorageType, usage: Double): UsageForType = {
    val __obj = js.Dynamic.literal(storageType = storageType.asInstanceOf[js.Any], usage = usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsageForType]
  }
  
  @scala.inline
  implicit class UsageForTypeMutableBuilder[Self <: UsageForType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStorageType(value: StorageType): Self = StObject.set(x, "storageType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsage(value: Double): Self = StObject.set(x, "usage", value.asInstanceOf[js.Any])
  }
}
