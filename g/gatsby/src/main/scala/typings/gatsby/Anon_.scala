package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  @JSName("*")
  var Asterisk: String
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var data: js.Object
  var location: js.Object
  var navigate: js.Function
  var pageContext: js.Object
  var pageResources: js.Object
  var path: String
  var uri: String
}

object Anon_ {
  @scala.inline
  def apply(
    Asterisk: String,
    data: js.Object,
    location: js.Object,
    navigate: js.Function,
    pageContext: js.Object,
    pageResources: js.Object,
    path: String,
    uri: String,
    children: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any], pageResources = pageResources.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_]
  }
}

