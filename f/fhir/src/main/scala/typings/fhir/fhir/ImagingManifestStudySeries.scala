package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Series identity of the selected instances
  */
trait ImagingManifestStudySeries
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * Series access endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * The selected instance
    */
  var instance: js.Array[ImagingManifestStudySeriesInstance]
  
  /**
    * Series instance UID
    */
  var uid: oid
}
object ImagingManifestStudySeries {
  
  @scala.inline
  def apply(instance: js.Array[ImagingManifestStudySeriesInstance], uid: oid): ImagingManifestStudySeries = {
    val __obj = js.Dynamic.literal(instance = instance.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudySeries]
  }
  
  @scala.inline
  implicit class ImagingManifestStudySeriesMutableBuilder[Self <: ImagingManifestStudySeries] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setInstance(value: js.Array[ImagingManifestStudySeriesInstance]): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceVarargs(value: ImagingManifestStudySeriesInstance*): Self = StObject.set(x, "instance", js.Array(value :_*))
    
    @scala.inline
    def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
