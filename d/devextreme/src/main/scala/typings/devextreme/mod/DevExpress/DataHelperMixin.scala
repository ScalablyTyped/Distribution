package typings.devextreme.mod.DevExpress

import typings.devextreme.mod.DevExpress.data.DataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DataHelperMixin extends StObject {
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
}
object DataHelperMixin {
  
  @scala.inline
  def apply(getDataSource: () => DataSource): DataHelperMixin = {
    val __obj = js.Dynamic.literal(getDataSource = js.Any.fromFunction0(getDataSource))
    __obj.asInstanceOf[DataHelperMixin]
  }
  
  @scala.inline
  implicit class DataHelperMixinMutableBuilder[Self <: DataHelperMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDataSource(value: () => DataSource): Self = StObject.set(x, "getDataSource", js.Any.fromFunction0(value))
  }
}
