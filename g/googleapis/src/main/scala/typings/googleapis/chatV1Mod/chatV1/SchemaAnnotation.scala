package typings.googleapis.chatV1Mod.chatV1

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
trait SchemaAnnotation extends js.Object {
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
  var userMention: js.UndefOr[SchemaUserMentionMetadata] = js.native
}

object SchemaAnnotation {
  @scala.inline
  def apply(): SchemaAnnotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaAnnotation]
  }
  @scala.inline
  implicit class SchemaAnnotationOps[Self <: SchemaAnnotation] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLength: Self = this.set("length", js.undefined)
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartIndex: Self = this.set("startIndex", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUserMention(value: SchemaUserMentionMetadata): Self = this.set("userMention", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserMention: Self = this.set("userMention", js.undefined)
  }
  
}

