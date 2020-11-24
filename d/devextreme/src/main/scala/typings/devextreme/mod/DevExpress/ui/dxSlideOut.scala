package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSlideOut extends CollectionWidget {
  
  /**
    * [descr:dxSlideOut.hideMenu()]
    */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxSlideOut.showMenu()]
    */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxSlideOut.toggleMenuVisibility(showing)]
    */
  def toggleMenuVisibility(showing: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
