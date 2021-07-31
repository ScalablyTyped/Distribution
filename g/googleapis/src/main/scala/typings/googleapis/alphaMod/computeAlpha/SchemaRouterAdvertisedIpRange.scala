package typings.googleapis.alphaMod.computeAlpha

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description-tagged IP ranges for the router to advertise.
  */
trait SchemaRouterAdvertisedIpRange extends StObject {
  
  /**
    * User-specified description for the IP range.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * The IP range to advertise. The value must be a CIDR-formatted string.
    */
  var range: js.UndefOr[String] = js.undefined
}
object SchemaRouterAdvertisedIpRange {
  
  @scala.inline
  def apply(): SchemaRouterAdvertisedIpRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaRouterAdvertisedIpRange]
  }
  
  @scala.inline
  implicit class SchemaRouterAdvertisedIpRangeMutableBuilder[Self <: SchemaRouterAdvertisedIpRange] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setRange(value: String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
  }
}
