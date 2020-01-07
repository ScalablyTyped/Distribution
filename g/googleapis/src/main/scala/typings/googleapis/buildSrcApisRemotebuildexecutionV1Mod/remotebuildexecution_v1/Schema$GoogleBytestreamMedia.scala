package typings.googleapis.buildSrcApisRemotebuildexecutionV1Mod.remotebuildexecution_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Media resource.
  */
@js.native
trait Schema$GoogleBytestreamMedia extends js.Object {
  /**
    * Name of the media resource.
    */
  var resourceName: js.UndefOr[String] = js.native
}

object Schema$GoogleBytestreamMedia {
  @scala.inline
  def apply(resourceName: String = null): Schema$GoogleBytestreamMedia = {
    val __obj = js.Dynamic.literal()
    if (resourceName != null) __obj.updateDynamic("resourceName")(resourceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleBytestreamMedia]
  }
}

