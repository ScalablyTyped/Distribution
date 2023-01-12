package typings.googleAdwordsScripts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReportOptionArguments extends StObject {
  
  var apiVersion: js.UndefOr[String] = js.undefined
  
  var includeZeroImpressions: js.UndefOr[Boolean] = js.undefined
  
  var resolveGeoNames: js.UndefOr[Boolean] = js.undefined
  
  var returnMoneyInMicros: js.UndefOr[Boolean] = js.undefined
}
object ReportOptionArguments {
  
  inline def apply(): ReportOptionArguments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReportOptionArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReportOptionArguments] (val x: Self) extends AnyVal {
    
    inline def setApiVersion(value: String): Self = StObject.set(x, "apiVersion", value.asInstanceOf[js.Any])
    
    inline def setApiVersionUndefined: Self = StObject.set(x, "apiVersion", js.undefined)
    
    inline def setIncludeZeroImpressions(value: Boolean): Self = StObject.set(x, "includeZeroImpressions", value.asInstanceOf[js.Any])
    
    inline def setIncludeZeroImpressionsUndefined: Self = StObject.set(x, "includeZeroImpressions", js.undefined)
    
    inline def setResolveGeoNames(value: Boolean): Self = StObject.set(x, "resolveGeoNames", value.asInstanceOf[js.Any])
    
    inline def setResolveGeoNamesUndefined: Self = StObject.set(x, "resolveGeoNames", js.undefined)
    
    inline def setReturnMoneyInMicros(value: Boolean): Self = StObject.set(x, "returnMoneyInMicros", value.asInstanceOf[js.Any])
    
    inline def setReturnMoneyInMicrosUndefined: Self = StObject.set(x, "returnMoneyInMicros", js.undefined)
  }
}
