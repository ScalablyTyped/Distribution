package typings.googleapis.buildSrcApisChatV1Mod.chat_v1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Annotations associated with the plain-text body of the message.  Example
  * plain-text message body: ``` Hello @FooBot how are you!&quot; ```  The
  * corresponding annotations metadata: ``` &quot;annotations&quot;:[{
  * &quot;type&quot;:&quot;USER_MENTION&quot;,   &quot;startIndex&quot;:6,
  * &quot;length&quot;:7,   &quot;userMention&quot;: {     &quot;user&quot;: {
  * &quot;name&quot;:&quot;users/107946847022116401880&quot;,
  * &quot;displayName&quot;:&quot;FooBot&quot;,
  * &quot;avatarUrl&quot;:&quot;https://goo.gl/aeDtrS&quot;,
  * &quot;type&quot;:&quot;BOT&quot;     },
  * &quot;type&quot;:&quot;MENTION&quot;    } }] ```
  */
@js.native
trait Schema$Annotation extends js.Object {
  /**
    * Length of the substring in the plain-text message body this annotation
    * corresponds to.
    */
  var length: js.UndefOr[Double] = js.native
  /**
    * Start index (0-based, inclusive) in the plain-text message body this
    * annotation corresponds to.
    */
  var startIndex: js.UndefOr[Double] = js.native
  /**
    * The type of this annotation.
    */
  var `type`: js.UndefOr[String] = js.native
  /**
    * The metadata of user mention.
    */
  var userMention: js.UndefOr[Schema$UserMentionMetadata] = js.native
}

object Schema$Annotation {
  @scala.inline
  def apply(
    length: Int | Double = null,
    startIndex: Int | Double = null,
    `type`: String = null,
    userMention: Schema$UserMentionMetadata = null
  ): Schema$Annotation = {
    val __obj = js.Dynamic.literal()
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (startIndex != null) __obj.updateDynamic("startIndex")(startIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (userMention != null) __obj.updateDynamic("userMention")(userMention.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$Annotation]
  }
}

