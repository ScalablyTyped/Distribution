package typings.divaDotJs.divaDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DivaState extends js.Object {
  var toolbar: Null
  var viewerCore: typings.divaDotJs.viewerDashCoreMod.default
}

object DivaState {
  @scala.inline
  def apply(toolbar: Null, viewerCore: typings.divaDotJs.viewerDashCoreMod.default): DivaState = {
    val __obj = js.Dynamic.literal(toolbar = toolbar.asInstanceOf[js.Any], viewerCore = viewerCore.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DivaState]
  }
}

