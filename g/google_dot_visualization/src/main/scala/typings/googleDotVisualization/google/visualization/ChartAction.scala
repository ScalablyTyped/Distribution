package typings.googleDotVisualization.google.visualization

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartAction extends js.Object {
  var id: String | Double
  var text: String
  def action(): Unit
}

object ChartAction {
  @scala.inline
  def apply(action: () => Unit, id: String | Double, text: String): ChartAction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), id = id.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartAction]
  }
}

