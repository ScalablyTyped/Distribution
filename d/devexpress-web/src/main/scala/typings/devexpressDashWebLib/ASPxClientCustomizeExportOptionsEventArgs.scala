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

