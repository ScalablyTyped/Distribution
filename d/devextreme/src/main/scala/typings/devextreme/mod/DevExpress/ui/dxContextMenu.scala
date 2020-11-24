package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxContextMenu extends dxMenuBase {
  
  /**
    * [descr:dxContextMenu.hide()]
    */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxContextMenu.show()]
    */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxContextMenu.toggle(showing)]
    */
  def toggle(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
