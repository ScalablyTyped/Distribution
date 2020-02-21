package typings.gatsby

import typings.reachRouter.mod.NavigateFn
import typings.std.Location_
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon extends js.Object {
  @JSName("*")
  var Asterisk: String
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var data: js.Object
  var location: Location_
  var navigate: NavigateFn
  var pageContext: Record[String, _]
  var pageResources: js.Object
  var path: String
  var pathContext: Record[String, _]
  var uri: String
}

object Anon {
  @scala.inline
  def apply(
    Asterisk: String,
    data: js.Object,
    location: Location_,
    navigate: NavigateFn,
    pageContext: Record[String, _],
    pageResources: js.Object,
    path: String,
    pathContext: Record[String, _],
    uri: String,
    children: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], navigate = navigate.asInstanceOf[js.Any], pageContext = pageContext.asInstanceOf[js.Any], pageResources = pageResources.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], pathContext = pathContext.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("*")(Asterisk.asInstanceOf[js.Any])
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon]
  }
}

