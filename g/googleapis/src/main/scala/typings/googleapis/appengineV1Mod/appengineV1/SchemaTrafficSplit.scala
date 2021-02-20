package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Traffic routing configuration for versions within a single service. Traffic
  * splits define how traffic directed to the service is assigned to versions.
  */
@js.native
trait SchemaTrafficSplit extends StObject {
  
  /**
    * Mapping from version IDs within the service to fractional (0.000, 1]
    * allocations of traffic for that version. Each version can be specified
    * only once, but some versions in the service may not have any traffic
    * allocation. Services that have traffic allocated cannot be deleted until
    * either the service is deleted or their traffic allocation is removed.
    * Allocations must sum to 1. Up to two decimal place precision is supported
    * for IP-based splits and up to three decimal places is supported for
    * cookie-based splits.
    */
  var allocations: js.UndefOr[StringDictionary[Double]] = js.native
  
  /**
    * Mechanism used to determine which version a request is sent to. The
    * traffic selection algorithm will be stable for either type until
    * allocations are changed.
    */
  var shardBy: js.UndefOr[String] = js.native
}
object SchemaTrafficSplit {
  
  @scala.inline
  def apply(): SchemaTrafficSplit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTrafficSplit]
  }
  
  @scala.inline
  implicit class SchemaTrafficSplitMutableBuilder[Self <: SchemaTrafficSplit] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocations(value: StringDictionary[Double]): Self = StObject.set(x, "allocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationsUndefined: Self = StObject.set(x, "allocations", js.undefined)
    
    @scala.inline
    def setShardBy(value: String): Self = StObject.set(x, "shardBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardByUndefined: Self = StObject.set(x, "shardBy", js.undefined)
  }
}
