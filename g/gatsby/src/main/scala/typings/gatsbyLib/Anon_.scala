package typings
package gatsbyLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ extends js.Object {
  var `*`: java.lang.String
  var children: js.UndefOr[scala.Nothing] = js.undefined
  var data: js.Object
  var location: js.Object
  var navigate: js.Function
  var pageContext: js.Object
  var pageResources: js.Object
  var path: java.lang.String
  var uri: java.lang.String
}

object Anon_ {
  @scala.inline
  def apply(
    `*`: java.lang.String,
    data: js.Object,
    location: js.Object,
    navigate: js.Function,
    pageContext: js.Object,
    pageResources: js.Object,
    path: java.lang.String,
    uri: java.lang.String,
    children: js.UndefOr[scala.Nothing] = js.undefined
  ): Anon_ = {
    val __obj = js.Dynamic.literal(data = data, location = location, navigate = navigate, pageContext = pageContext, pageResources = pageResources, path = path, uri = uri)
    __obj.updateDynamic("*")(`*`)
    if (!js.isUndefined(children)) __obj.updateDynamic("children")(children)
    __obj.asInstanceOf[Anon_]
  }
}

