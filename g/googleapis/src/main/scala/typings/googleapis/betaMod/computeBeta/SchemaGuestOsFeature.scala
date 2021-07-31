package typings.googleapis.betaMod.computeBeta

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Guest OS features.
  */
trait SchemaGuestOsFeature extends StObject {
  
  /**
    * The ID of a supported feature. Read  Enabling guest operating system
    * features to see a list of available options.
    */
  var `type`: js.UndefOr[String] = js.undefined
}
object SchemaGuestOsFeature {
  
  @scala.inline
  def apply(): SchemaGuestOsFeature = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaGuestOsFeature]
  }
  
  @scala.inline
  implicit class SchemaGuestOsFeatureMutableBuilder[Self <: SchemaGuestOsFeature] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
