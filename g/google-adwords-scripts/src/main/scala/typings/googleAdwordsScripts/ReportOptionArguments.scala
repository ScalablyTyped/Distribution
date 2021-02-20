package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReportOptionArguments extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.native
  
  var includeZeroImpressions: js.UndefOr[Boolean] = js.native
  
  var resolveGeoNames: js.UndefOr[Boolean] = js.native
  
  var returnMoneyInMicros: js.UndefOr[Boolean] = js.native
}
object ReportOptionArguments {
  
  @scala.inline
  def apply(): ReportOptionArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptionArguments]
  }
  
  @scala.inline
  implicit class ReportOptionArgumentsMutableBuilder[Self <: ReportOptionArguments] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    @scala.inline
    def setIncludeZeroImpressions(value: Boolean): Self = StObject.set(x, "includeZeroImpressions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncludeZeroImpressionsUndefined: Self = StObject.set(x, "includeZeroImpressions", js.undefined)
    
    @scala.inline
    def setResolveGeoNames(value: Boolean): Self = StObject.set(x, "resolveGeoNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResolveGeoNamesUndefined: Self = StObject.set(x, "resolveGeoNames", js.undefined)
    
    @scala.inline
    def setReturnMoneyInMicros(value: Boolean): Self = StObject.set(x, "returnMoneyInMicros", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnMoneyInMicrosUndefined: Self = StObject.set(x, "returnMoneyInMicros", js.undefined)
  }
}
