package typings.googleapis.appengineV1Mod.appengineV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Volumes mounted within the app container. Only applicable in the App Engine
  * flexible environment.
  */
trait SchemaVolume extends StObject {
  
  /**
    * Unique name for the volume.
    */
  var name: js.UndefOr[String] = js.undefined
  
  /**
    * Volume size in gigabytes.
    */
  var sizeGb: js.UndefOr[Double] = js.undefined
  
  /**
    * Underlying volume type, e.g. &#39;tmpfs&#39;.
    */
  var volumeType: js.UndefOr[String] = js.undefined
}
object SchemaVolume {
  
  @scala.inline
  def apply(): SchemaVolume = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolume]
  }
  
  @scala.inline
  implicit class SchemaVolumeMutableBuilder[Self <: SchemaVolume] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setSizeGb(value: Double): Self = StObject.set(x, "sizeGb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSizeGbUndefined: Self = StObject.set(x, "sizeGb", js.undefined)
    
    @scala.inline
    def setVolumeType(value: String): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
  }
}
