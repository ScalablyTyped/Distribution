package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.PivotGridDataSource
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait dxPivotGridFieldChooser extends Widget {
  /** Applies changes made in the widget to the PivotGrid. Takes effect only if applyChangesMode is "onDemand". */
  def applyChanges(): Unit = js.native
  /** Cancels changes made in the widget without applying them to the PivotGrid. Takes effect only if applyChangesMode is "onDemand". */
  def cancelChanges(): Unit = js.native
  /** Gets the PivotGridDataSource instance. */
  def getDataSource(): PivotGridDataSource = js.native
  /** Updates the widget to the size of its content. */
  def updateDimensions(): Unit = js.native
}

