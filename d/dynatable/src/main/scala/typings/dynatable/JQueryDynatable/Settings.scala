package typings.dynatable.JQueryDynatable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Settings extends StObject {
  
  var dataset: Dataset
  
  var features: Features
  
  var inputs: Inputs
  
  var params: Params
  
  var readers: Readers
  
  var table: Table
  
  var writers: Writers
}
object Settings {
  
  @scala.inline
  def apply(
    dataset: Dataset,
    features: Features,
    inputs: Inputs,
    params: Params,
    readers: Readers,
    table: Table,
    writers: Writers
  ): Settings = {
    val __obj = js.Dynamic.literal(dataset = dataset.asInstanceOf[js.Any], features = features.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], readers = readers.asInstanceOf[js.Any], table = table.asInstanceOf[js.Any], writers = writers.asInstanceOf[js.Any])
    __obj.asInstanceOf[Settings]
  }
  
  @scala.inline
  implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataset(value: Dataset): Self = StObject.set(x, "dataset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFeatures(value: Features): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: Inputs): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReaders(value: Readers): Self = StObject.set(x, "readers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTable(value: Table): Self = StObject.set(x, "table", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriters(value: Writers): Self = StObject.set(x, "writers", value.asInstanceOf[js.Any])
  }
}
