package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxForm extends Widget {
  
  /**
    * [descr:dxForm.getButton(name)]
    */
  def getButton(name: String): js.UndefOr[dxButton] = js.native
  
  /**
    * [descr:dxForm.getEditor(dataField)]
    */
  def getEditor(dataField: String): js.UndefOr[Editor] = js.native
  
  /**
    * [descr:dxForm.itemOption(id)]
    */
  def itemOption(id: String): js.Any = js.native
  /**
    * [descr:dxForm.itemOption(id, option, value)]
    */
  def itemOption(id: String, option: String, value: js.Any): Unit = js.native
  /**
    * [descr:dxForm.itemOption(id, options)]
    */
  def itemOption(id: String, options: js.Any): Unit = js.native
  
  /**
    * [descr:dxForm.resetValues()]
    */
  def resetValues(): Unit = js.native
  
  /**
    * [descr:dxForm.updateData(dataField, value)]
    */
  def updateData(dataField: String, value: js.Any): Unit = js.native
  /**
    * [descr:dxForm.updateData(data)]
    */
  def updateData(data: js.Any): Unit = js.native
  
  /**
    * [descr:dxForm.updateDimensions()]
    */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxForm.validate()]
    */
  def validate(): dxValidationGroupResult = js.native
}
