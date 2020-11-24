package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MapLayerElement extends js.Object {
  
  /**
    * [descr:MapLayerElement.applySettings(settings)]
    */
  def applySettings(settings: js.Any): Unit = js.native
  
  /**
    * [descr:MapLayerElement.attribute(name)]
    */
  def attribute(name: String): js.Any = js.native
  /**
    * [descr:MapLayerElement.attribute(name, value)]
    */
  def attribute(name: String, value: js.Any): Unit = js.native
  
  /**
    * [descr:MapLayerElement.coordinates()]
    */
  def coordinates(): js.Any = js.native
  
  /**
    * [descr:MapLayerElement.layer]
    */
  var layer: js.UndefOr[js.Any] = js.native
  
  /**
    * [descr:MapLayerElement.selected()]
    */
  def selected(): Boolean = js.native
  /**
    * [descr:MapLayerElement.selected(state)]
    */
  def selected(state: Boolean): Unit = js.native
}
