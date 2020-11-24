package typings.devextreme.mod.DevExpress.viz

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait chartSeriesObject extends baseSeriesObject {
  
  /**
    * [descr:chartSeriesObject.axis]
    */
  var axis: js.UndefOr[String] = js.native
  
  /**
    * [descr:chartSeriesObject.barOverlapGroup]
    */
  var barOverlapGroup: js.UndefOr[String] = js.native
  
  /**
    * [descr:chartSeriesObject.getArgumentAxis()]
    */
  def getArgumentAxis(): chartAxisObject = js.native
  
  /**
    * [descr:chartSeriesObject.getValueAxis()]
    */
  def getValueAxis(): chartAxisObject = js.native
  
  /**
    * [descr:chartSeriesObject.pane]
    */
  var pane: js.UndefOr[String] = js.native
  
  /**
    * [descr:chartSeriesObject.stack]
    */
  var stack: js.UndefOr[String] = js.native
}
