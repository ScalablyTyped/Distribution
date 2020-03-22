package typings.gatsby

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComponentChunkName extends js.Object {
  var componentChunkName: String
  var matchPath: js.UndefOr[String] = js.undefined
  var path: String
  var webpackCompilationHash: String
}

object AnonComponentChunkName {
  @scala.inline
  def apply(componentChunkName: String, path: String, webpackCompilationHash: String, matchPath: String = null): AnonComponentChunkName = {
    val __obj = js.Dynamic.literal(componentChunkName = componentChunkName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], webpackCompilationHash = webpackCompilationHash.asInstanceOf[js.Any])
    if (matchPath != null) __obj.updateDynamic("matchPath")(matchPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComponentChunkName]
  }
}

