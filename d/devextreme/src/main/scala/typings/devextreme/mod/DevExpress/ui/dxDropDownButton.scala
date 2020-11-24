package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.data.DataSource
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDropDownButton extends Widget {
  
  /**
    * [descr:dxDropDownButton.close()]
    */
  def close(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:DataHelperMixin.getDataSource()]
    */
  def getDataSource(): DataSource = js.native
  
  /**
    * [descr:dxDropDownButton.open()]
    */
  def open(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxDropDownButton.toggle()]
    */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
  /**
    * [descr:dxDropDownButton.toggle(visibility)]
    */
  def toggle(visibility: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
