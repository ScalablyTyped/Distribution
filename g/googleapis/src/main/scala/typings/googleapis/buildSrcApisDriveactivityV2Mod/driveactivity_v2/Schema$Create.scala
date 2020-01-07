package typings.googleapis.buildSrcApisDriveactivityV2Mod.driveactivity_v2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * An object was created.
  */
@js.native
trait Schema$Create extends js.Object {
  /**
    * If present, indicates the object was created by copying an existing Drive
    * object.
    */
  var copy: js.UndefOr[Schema$Copy] = js.native
  /**
    * If present, indicates the object was newly created (e.g. as a blank
    * document), not derived from a Drive object or external object.
    */
  var `new`: js.UndefOr[Schema$New] = js.native
  /**
    * If present, indicates the object originated externally and was uploaded
    * to Drive.
    */
  var upload: js.UndefOr[Schema$Upload] = js.native
}

object Schema$Create {
  @scala.inline
  def apply(copy: Schema$Copy = null, `new`: Schema$New = null, upload: Schema$Upload = null): Schema$Create = {
    val __obj = js.Dynamic.literal()
    if (copy != null) __obj.updateDynamic("copy")(copy.asInstanceOf[js.Any])
    if (`new` != null) __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
    if (upload != null) __obj.updateDynamic("upload")(upload.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Create]
  }
}

