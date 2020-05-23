package typings.devexpressAspnetcoreBootstrap.DevExpress.AspNetCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BootstrapGridViewColumn extends js.Object {
  val fieldName: String
  val index: Double
  val instance: js.Any
  val name: String
  val visible: Boolean
}

object BootstrapGridViewColumn {
  @scala.inline
  def apply(fieldName: String, index: Double, instance: js.Any, name: String, visible: Boolean): BootstrapGridViewColumn = {
    val __obj = js.Dynamic.literal(fieldName = fieldName.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], instance = instance.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[BootstrapGridViewColumn]
  }
}

