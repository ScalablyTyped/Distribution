package typings.devexpressDashWeb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ASPxClientCustomizeExportOptionsEventArgs extends ASPxClientEventArgs {
  /**
    * 
    * @param format 
    */
  def GetExportOptionsModel(format: js.Object): js.Object
  def HideExportOptionsPanel(): Unit
  /**
    * 
    * @param format 
    */
  def HideFormat(format: js.Object): Unit
  /**
    * 
    * @param format 
    * @param properties 
    */
  def HideProperties(format: js.Object, properties: js.Array[js.Object]): Unit
}

object ASPxClientCustomizeExportOptionsEventArgs {
  @scala.inline
  def apply(
    GetExportOptionsModel: js.Object => js.Object,
    HideExportOptionsPanel: () => Unit,
    HideFormat: js.Object => Unit,
    HideProperties: (js.Object, js.Array[js.Object]) => Unit
  ): ASPxClientCustomizeExportOptionsEventArgs = {
    val __obj = js.Dynamic.literal(GetExportOptionsModel = js.Any.fromFunction1(GetExportOptionsModel), HideExportOptionsPanel = js.Any.fromFunction0(HideExportOptionsPanel), HideFormat = js.Any.fromFunction1(HideFormat), HideProperties = js.Any.fromFunction2(HideProperties))
  
    __obj.asInstanceOf[ASPxClientCustomizeExportOptionsEventArgs]
  }
}

