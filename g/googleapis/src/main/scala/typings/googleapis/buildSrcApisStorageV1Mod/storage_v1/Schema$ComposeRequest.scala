package typings.googleapis.buildSrcApisStorageV1Mod.storage_v1

import typings.googleapis.Anon_Generation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A Compose request.
  */
@js.native
trait Schema$ComposeRequest extends js.Object {
  /**
    * Properties of the resulting object.
    */
  var destination: js.UndefOr[Schema$Object] = js.native
  /**
    * The kind of item this is.
    */
  var kind: js.UndefOr[String] = js.native
  /**
    * The list of source objects that will be concatenated into a single
    * object.
    */
  var sourceObjects: js.UndefOr[js.Array[Anon_Generation]] = js.native
}

object Schema$ComposeRequest {
  @scala.inline
  def apply(
    destination: Schema$Object = null,
    kind: String = null,
    sourceObjects: js.Array[Anon_Generation] = null
  ): Schema$ComposeRequest = {
    val __obj = js.Dynamic.literal()
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind.asInstanceOf[js.Any])
    if (sourceObjects != null) __obj.updateDynamic("sourceObjects")(sourceObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$ComposeRequest]
  }
}

