package typings.gapiClientTagmanager.gapi.client.tagmanager

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateContainerVersionRequestVersionOptions extends js.Object {
  /** The name of the container version to be created. */
  var name: js.UndefOr[String] = js.undefined
  /** The notes of the container version to be created. */
  var notes: js.UndefOr[String] = js.undefined
}

object CreateContainerVersionRequestVersionOptions {
  @scala.inline
  def apply(name: String = null, notes: String = null): CreateContainerVersionRequestVersionOptions = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notes != null) __obj.updateDynamic("notes")(notes.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateContainerVersionRequestVersionOptions]
  }
}

