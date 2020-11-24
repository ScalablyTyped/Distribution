package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxDrawer extends Widget {
  
  /**
    * [descr:dxDrawer.content()]
    */
  def content(): dxElement = js.native
  
  /**
    * [descr:dxDrawer.hide()]
    */
  def hide(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxDrawer.show()]
    */
  def show(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxDrawer.toggle()]
    */
  def toggle(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
