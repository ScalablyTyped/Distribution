package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends StObject {
  
  var dataset: js.UndefOr[Dataset] = js.native
  
  var features: js.UndefOr[Features] = js.native
  
  var inputs: js.UndefOr[Inputs] = js.native
  
  var params: js.UndefOr[Params] = js.native
  
  var readers: js.UndefOr[Readers] = js.native
  
  var table: js.UndefOr[Table] = js.native
  
  var writers: js.UndefOr[Writers] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDatasetUndefined: Self = StObject.set(x, "dataset", js.undefined)
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    @scala.inline
    def setInputs(value: Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsUndefined: Self = StObject.set(x, "inputs", js.undefined)
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setReaders(value: Readers): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReadersUndefined: Self = StObject.set(x, "readers", js.undefined)
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTableUndefined: Self = StObject.set(x, "table", js.undefined)
    
    @scala.inline
    def setWriters(value: Writers): Self = StObject.set(x, "writers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritersUndefined: Self = StObject.set(x, "writers", js.undefined)
  }
}
