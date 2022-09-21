package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataHelperMixin extends StObject {
  
  /**
    * Gets the DataSource instance.
    */
  def getDataSource(): DataSource[Any, Any]
}
object DataHelperMixin {
  
  inline def apply(getDataSource: () => DataSource[Any, Any]): DataHelperMixin = {
    val __obj = js.Dynamic.literal(getDataSource = js.Any.fromFunction0(getDataSource))
    __obj.asInstanceOf[DataHelperMixin]
  }
  
  extension [Self <: DataHelperMixin](x: Self) {
    
    inline def setGetDataSource(value: () => DataSource[Any, Any]): Self = StObject.set(x, "getDataSource", js.Any.fromFunction0(value))
  }
}
