package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.mod.global.JQueryPromise
import typings.devextreme.mod.global.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait dxAccordion extends CollectionWidget {
  
  /**
    * [descr:dxAccordion.collapseItem(index)]
    */
  def collapseItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxAccordion.expandItem(index)]
    */
  def expandItem(index: Double): Promise[Unit] with JQueryPromise[Unit] = js.native
  
  /**
    * [descr:dxAccordion.updateDimensions()]
    */
  def updateDimensions(): Promise[Unit] with JQueryPromise[Unit] = js.native
}
