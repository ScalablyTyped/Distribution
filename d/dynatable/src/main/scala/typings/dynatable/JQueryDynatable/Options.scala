package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  var dataset: js.UndefOr[Dataset] = js.undefined
  
  var features: js.UndefOr[Features] = js.undefined
  
  var inputs: js.UndefOr[Inputs] = js.undefined
  
  var params: js.UndefOr[Params] = js.undefined
  
  var readers: js.UndefOr[Readers] = js.undefined
  
  var table: js.UndefOr[Table] = js.undefined
  
  var writers: js.UndefOr[Writers] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  extension [Self <: Options](x: Self) {
    
    inline def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    inline def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    inline def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setInputs(value: Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    inline def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setReaders(value: Readers): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
    
    inline def setReadersUndefined: Self = StObject.set(x, "readers", js.undefined)
    
    inline def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    inline def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    inline def setWriters(value: Writers): Self = StObject.set(x, "writers", value.asInstanceOf[js.Any])
    
    inline def setWritersUndefined: Self = StObject.set(x, "writers", js.undefined)
  }
}
