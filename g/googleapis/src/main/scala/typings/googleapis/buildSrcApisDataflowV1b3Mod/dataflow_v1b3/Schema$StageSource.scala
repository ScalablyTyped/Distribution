package typings.googleapis.buildSrcApisDataflowV1b3Mod.dataflow_v1b3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Description of an input or output of an execution stage.
  */
@js.native
trait Schema$StageSource extends js.Object {
  /**
    * Dataflow service generated name for this source.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * User name for the original user transform or collection with which this
    * source is most closely associated.
    */
  var originalTransformOrCollection: js.UndefOr[String] = js.native
  /**
    * Size of the source, if measurable.
    */
  var sizeBytes: js.UndefOr[String] = js.native
  /**
    * Human-readable name for this source; may be user or system generated.
    */
  var userName: js.UndefOr[String] = js.native
}

object Schema$StageSource {
  @scala.inline
  def apply(
    name: String = null,
    originalTransformOrCollection: String = null,
    sizeBytes: String = null,
    userName: String = null
  ): Schema$StageSource = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (originalTransformOrCollection != null) __obj.updateDynamic("originalTransformOrCollection")(originalTransformOrCollection.asInstanceOf[js.Any])
    if (sizeBytes != null) __obj.updateDynamic("sizeBytes")(sizeBytes.asInstanceOf[js.Any])
    if (userName != null) __obj.updateDynamic("userName")(userName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$StageSource]
  }
}

