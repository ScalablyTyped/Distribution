package typings.fhir.fhir

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Study identity of the selected instances
  */
trait ImagingManifestStudy
  extends StObject
     with BackboneElement {
  
  /**
    * Contains extended information for property 'uid'.
    */
  var _uid: js.UndefOr[Element] = js.undefined
  
  /**
    * Study access service endpoint
    */
  var endpoint: js.UndefOr[js.Array[Reference]] = js.undefined
  
  /**
    * Reference to ImagingStudy
    */
  var imagingStudy: js.UndefOr[Reference] = js.undefined
  
  /**
    * Series identity of the selected instances
    */
  var series: js.Array[ImagingManifestStudySeries]
  
  /**
    * Study instance UID
    */
  var uid: oid
}
object ImagingManifestStudy {
  
  @scala.inline
  def apply(series: js.Array[ImagingManifestStudySeries], uid: oid): ImagingManifestStudy = {
    val __obj = js.Dynamic.literal(series = series.asInstanceOf[js.Any], uid = uid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImagingManifestStudy]
  }
  
  @scala.inline
  implicit class ImagingManifestStudyMutableBuilder[Self <: ImagingManifestStudy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndpoint(value: js.Array[Reference]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
    
    @scala.inline
    def setEndpointVarargs(value: Reference*): Self = StObject.set(x, "endpoint", js.Array(value :_*))
    
    @scala.inline
    def setImagingStudy(value: Reference): Self = StObject.set(x, "imagingStudy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagingStudyUndefined: Self = StObject.set(x, "imagingStudy", js.undefined)
    
    @scala.inline
    def setSeries(value: js.Array[ImagingManifestStudySeries]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: ImagingManifestStudySeries*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setUid(value: oid): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uid(value: Element): Self = StObject.set(x, "_uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_uidUndefined: Self = StObject.set(x, "_uid", js.undefined)
  }
}
