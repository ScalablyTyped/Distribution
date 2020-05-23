package typings.gatsby.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentChunkName extends js.Object {
  var componentChunkName: String
  var matchPath: js.UndefOr[String] = js.undefined
  var path: String
  var webpackCompilationHash: String
}

object ComponentChunkName {
  @scala.inline
  def apply(componentChunkName: String, path: String, webpackCompilationHash: String, matchPath: String = null): ComponentChunkName = {
    val __obj = js.Dynamic.literal(componentChunkName = componentChunkName.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], webpackCompilationHash = webpackCompilationHash.asInstanceOf[js.Any])
    if (matchPath != null) __obj.updateDynamic("matchPath")(matchPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentChunkName]
  }
}

