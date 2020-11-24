package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.DevExpress.core.dxElement
import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxSlideOutView extends Widget {
  
  /**
    * [descr:dxSlideOutView.content()]
    */
  def content(): dxElement = js.native
  
  /**
    * [descr:dxSlideOutView.hideMenu()]
    */
  def hideMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxSlideOutView.menuContent()]
    */
  def menuContent(): dxElement = js.native
  
  /**
    * [descr:dxSlideOutView.showMenu()]
    */
  def showMenu(): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxSlideOutView.toggleMenuVisibility()]
    */
  def toggleMenuVisibility(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
