package typings
package devexpressDashWebLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCustomizeExportOptionsEventArgs extends ASPxClientEventArgs {
  /**
    * 
    * @param format 
    */
  def GetExportOptionsModel(format: js.Object): js.Object
  def HideExportOptionsPanel(): scala.Unit
  /**
    * 
    * @param format 
    */
  def HideFormat(format: js.Object): scala.Unit
  /**
    * 
    * @param format 
    * @param properties 
    */
  def HideProperties(format: js.Object, properties: js.Array[js.Object]): scala.Unit
}

object ASPxClientCustomizeExportOptionsEventArgs {
  @scala.inline
  def apply(
    GetExportOptionsModel: js.Function1[js.Object, js.Object],
    HideExportOptionsPanel: js.Function0[scala.Unit],
    HideFormat: js.Function1[js.Object, scala.Unit],
    HideProperties: js.Function2[js.Object, js.Array[js.Object], scala.Unit]
  ): ASPxClientCustomizeExportOptionsEventArgs = {
    val __obj = js.Dynamic.literal(GetExportOptionsModel = GetExportOptionsModel, HideExportOptionsPanel = HideExportOptionsPanel, HideFormat = HideFormat, HideProperties = HideProperties)
  
    __obj.asInstanceOf[ASPxClientCustomizeExportOptionsEventArgs]
  }
}

