package typings.fhirKitClient.anon

import typings.fhir.fhir.MeasureReport
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BodyMeasureReport extends StObject {
  
  var body: MeasureReport
  
  var headers: js.UndefOr[typings.request.mod.Headers] = js.undefined
  
  var options: js.UndefOr[typings.request.mod.Options] = js.undefined
  
  var resourceType: typings.fhirKitClient.fhirKitClientStrings.MeasureReport
}
object BodyMeasureReport {
  
  @scala.inline
  def apply(body: MeasureReport): BodyMeasureReport = {
    val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], resourceType = "MeasureReport")
    __obj.asInstanceOf[BodyMeasureReport]
  }
  
  @scala.inline
  implicit class BodyMeasureReportMutableBuilder[Self <: BodyMeasureReport] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBody(value: MeasureReport): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeaders(value: typings.request.mod.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setOptions(value: typings.request.mod.Options): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setResourceType(value: typings.fhirKitClient.fhirKitClientStrings.MeasureReport): Self = StObject.set(x, "resourceType", value.asInstanceOf[js.Any])
  }
}
