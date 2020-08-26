package typings.gapiTranslate.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Cid extends js.Object {
  /**
    * The customization id for translate
    */
  var cid: js.UndefOr[js.Array[String]] = js.native
  /**
    * Selector specifying which fields to include in a partial response.
    */
  var fields: js.UndefOr[String] = js.native
  /**
    * This optional parameter allows you to indicate that the text to be translated is either plain-text or HTML. A value of html indicates HTML and a value of text indicates plain-text
    */
  var format: js.UndefOr[String] = js.native
  /**
    * If prettyprint=true, the results returned by the server will be human readable (pretty printed).
    */
  var prettyprint: js.UndefOr[String] = js.native
  /**
    *  The text to translate
    */
  var q: js.Array[String] = js.native
  /**
    * The source language of the text
    */
  var source: js.UndefOr[String] = js.native
  /**
    * The target language into which the text should be translated
    */
  var target: String = js.native
}

object Cid {
  @scala.inline
  def apply(q: js.Array[String], target: String): Cid = {
    val __obj = js.Dynamic.literal(q = q.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cid]
  }
  @scala.inline
  implicit class CidOps[Self <: Cid] (val x: Self) extends AnyVal {
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
    def setQVarargs(value: String*): Self = this.set("q", js.Array(value :_*))
    @scala.inline
    def setQ(value: js.Array[String]): Self = this.set("q", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def setCidVarargs(value: String*): Self = this.set("cid", js.Array(value :_*))
    @scala.inline
    def setCid(value: js.Array[String]): Self = this.set("cid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCid: Self = this.set("cid", js.undefined)
    @scala.inline
    def setFields(value: String): Self = this.set("fields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    @scala.inline
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    @scala.inline
    def setPrettyprint(value: String): Self = this.set("prettyprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrettyprint: Self = this.set("prettyprint", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

