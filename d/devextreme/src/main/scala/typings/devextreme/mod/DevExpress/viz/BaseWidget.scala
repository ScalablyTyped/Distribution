package typings.devextreme.mod.DevExpress.viz

import typings.devextreme.mod.DevExpress.DOMComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BaseWidget extends DOMComponent {
  
  /**
    * [descr:BaseWidget.exportTo(fileName, format)]
    */
  def exportTo(fileName: String, format: String): Unit = js.native
  
  /**
    * [descr:BaseWidget.getSize()]
    */
  def getSize(): BaseWidgetSize = js.native
  
  /**
    * [descr:BaseWidget.hideLoadingIndicator()]
    */
  def hideLoadingIndicator(): Unit = js.native
  
  /**
    * [descr:BaseWidget.print()]
    */
  def print(): Unit = js.native
  
  /**
    * [descr:BaseWidget.render()]
    */
  def render(): Unit = js.native
  
  /**
    * [descr:BaseWidget.showLoadingIndicator()]
    */
  def showLoadingIndicator(): Unit = js.native
  
  /**
    * [descr:BaseWidget.svg()]
    */
  def svg(): String = js.native
}
