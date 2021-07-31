package typings.googleCloudPubsub.protosMod.google.pubsub.v1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a MessageStoragePolicy. */
trait IMessageStoragePolicy extends StObject {
  
  /** MessageStoragePolicy allowedPersistenceRegions */
  var allowedPersistenceRegions: js.UndefOr[js.Array[String] | Null] = js.undefined
}
object IMessageStoragePolicy {
  
  @scala.inline
  def apply(): IMessageStoragePolicy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMessageStoragePolicy]
  }
  
  @scala.inline
  implicit class IMessageStoragePolicyMutableBuilder[Self <: IMessageStoragePolicy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllowedPersistenceRegions(value: js.Array[String]): Self = StObject.set(x, "allowedPersistenceRegions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllowedPersistenceRegionsNull: Self = StObject.set(x, "allowedPersistenceRegions", null)
    
    @scala.inline
    def setAllowedPersistenceRegionsUndefined: Self = StObject.set(x, "allowedPersistenceRegions", js.undefined)
    
    @scala.inline
    def setAllowedPersistenceRegionsVarargs(value: String*): Self = StObject.set(x, "allowedPersistenceRegions", js.Array(value :_*))
  }
}
