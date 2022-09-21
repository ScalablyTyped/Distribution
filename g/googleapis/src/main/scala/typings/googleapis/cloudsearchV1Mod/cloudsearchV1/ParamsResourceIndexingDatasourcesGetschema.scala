package typings.googleapis.cloudsearchV1Mod.cloudsearchV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourceIndexingDatasourcesGetschema
  extends StObject
     with StandardParameters {
  
  /**
    * If you are asked by Google to help with debugging, set this field. Otherwise, ignore this field.
    */
  @JSName("debugOptions.enableDebugging")
  var debugOptionsDotenableDebugging: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the data source to get Schema. Format: datasources/{source_id\}
    */
  var name: js.UndefOr[String] = js.undefined
}
object ParamsResourceIndexingDatasourcesGetschema {
  
  inline def apply(): ParamsResourceIndexingDatasourcesGetschema = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourceIndexingDatasourcesGetschema]
  }
  
  extension [Self <: ParamsResourceIndexingDatasourcesGetschema](x: Self) {
    
    inline def setDebugOptionsDotenableDebugging(value: Boolean): Self = StObject.set(x, "debugOptions.enableDebugging", value.asInstanceOf[js.Any])
    
    inline def setDebugOptionsDotenableDebuggingUndefined: Self = StObject.set(x, "debugOptions.enableDebugging", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
