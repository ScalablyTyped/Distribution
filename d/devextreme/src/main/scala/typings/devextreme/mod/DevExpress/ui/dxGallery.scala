package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxGallery extends CollectionWidget {
  
  /**
    * [descr:dxGallery.goToItem(itemIndex, animation)]
    */
  def goToItem(itemIndex: Double, animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxGallery.nextItem(animation)]
    */
  def nextItem(animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxGallery.prevItem(animation)]
    */
  def prevItem(animation: Boolean): Promise[Unit] with JQueryPromise[Unit] = js.native
}
