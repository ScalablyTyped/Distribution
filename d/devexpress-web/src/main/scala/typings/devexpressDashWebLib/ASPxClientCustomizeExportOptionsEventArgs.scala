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
    GetExportOptionsModel: js.Object => js.Object,
    HideExportOptionsPanel: () => scala.Unit,
    HideFormat: js.Object => scala.Unit,
    HideProperties: (js.Object, js.Array[js.Object]) => scala.Unit
  ): ASPxClientCustomizeExportOptionsEventArgs = {
    val __obj = js.Dynamic.literal(GetExportOptionsModel = js.Any.fromFunction1(GetExportOptionsModel), HideExportOptionsPanel = js.Any.fromFunction0(HideExportOptionsPanel), HideFormat = js.Any.fromFunction1(HideFormat), HideProperties = js.Any.fromFunction2(HideProperties))
  
    __obj.asInstanceOf[ASPxClientCustomizeExportOptionsEventArgs]
  }
}

