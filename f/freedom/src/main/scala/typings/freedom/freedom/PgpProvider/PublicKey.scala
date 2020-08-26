package typings.freedom.freedom.PgpProvider

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PublicKey extends js.Object {
  var fingerprint: String = js.native
  var key: String = js.native
  var words: js.Array[String] = js.native
}

object PublicKey {
  @scala.inline
  def apply(fingerprint: String, key: String, words: js.Array[String]): PublicKey = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], words = words.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKey]
  }
  @scala.inline
  implicit class PublicKeyOps[Self <: PublicKey] (val x: Self) extends AnyVal {
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
    def setFingerprint(value: String): Self = this.set("fingerprint", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordsVarargs(value: String*): Self = this.set("words", js.Array(value :_*))
    @scala.inline
    def setWords(value: js.Array[String]): Self = this.set("words", value.asInstanceOf[js.Any])
  }
  
}

