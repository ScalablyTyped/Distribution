package typings.googleapis.buildSrcApisPubsubV1beta1aMod.pubsub_v1beta1a

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A topic resource.
  */
@js.native
trait Schema$Topic extends js.Object {
  /**
    * Name of the topic.
    */
  var name: js.UndefOr[String] = js.native
}

object Schema$Topic {
  @scala.inline
  def apply(name: String = null): Schema$Topic = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Topic]
  }
}

