package typings.googleapis.buildSrcApisTagmanagerV2Mod.tagmanager_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Options for new container versions.
  */
@js.native
trait Schema$CreateContainerVersionRequestVersionOptions extends js.Object {
  /**
    * The name of the container version to be created.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The notes of the container version to be created.
    */
  var notes: js.UndefOr[String] = js.native
}

object Schema$CreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(name: String = null, notes: String = null): Schema$CreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$CreateContainerVersionRequestVersionOptions]
  }
}

