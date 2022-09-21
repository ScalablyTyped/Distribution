package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceSeriesGet
  extends StObject
     with StandardParameters {
  
  /**
    * String that identifies the series
    */
  var series_id: js.UndefOr[js.Array[String]] = js.undefined
}
object ParamsResourceSeriesGet {
  
  inline def apply(): ParamsResourceSeriesGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceSeriesGet]
  }
  
  extension [Self <: ParamsResourceSeriesGet](x: Self) {
    
    inline def setSeries_id(value: js.Array[String]): Self = StObject.set(x, "series_id", value.asInstanceOf[js.Any])
    
    inline def setSeries_idUndefined: Self = StObject.set(x, "series_id", js.undefined)
    
    inline def setSeries_idVarargs(value: String*): Self = StObject.set(x, "series_id", js.Array(value*))
  }
}
