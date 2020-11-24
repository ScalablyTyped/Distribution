package typings.extjs.Ext.grid.feature

import typings.extjs.Ext.data.IModel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRowBody extends IFeature {
  
  /** [Method] Provides additional data to the prepareData call within the grid view
    * @param data Object The data for this particular record.
    * @param idx Number The row index for this record.
    * @param record Ext.data.Model The record instance
    * @param orig Object The original result from the prepareData call to massage.
    */
  var getAdditionalData: js.UndefOr[
    js.Function4[
      /* data */ js.UndefOr[js.Any], 
      /* idx */ js.UndefOr[Double], 
      /* record */ js.UndefOr[IModel], 
      /* orig */ js.UndefOr[js.Any], 
      Unit
    ]
  ] = js.native
}
object IRowBody {
  
  @scala.inline
  def apply(): IRowBody = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRowBody]
  }
  
  @scala.inline
  implicit class IRowBodyOps[Self <: IRowBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetAdditionalData(
      value: (/* data */ js.UndefOr[js.Any], /* idx */ js.UndefOr[Double], /* record */ js.UndefOr[IModel], /* orig */ js.UndefOr[js.Any]) => Unit
    ): Self = this.set("getAdditionalData", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteGetAdditionalData: Self = this.set("getAdditionalData", js.undefined)
  }
}
