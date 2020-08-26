package typings.gapiClientLanguage.gapi.client.language

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Features extends js.Object {
  /** Extract document-level sentiment. */
  var extractDocumentSentiment: js.UndefOr[Boolean] = js.native
  /** Extract entities. */
  var extractEntities: js.UndefOr[Boolean] = js.native
  /** Extract entities and their associated sentiment. */
  var extractEntitySentiment: js.UndefOr[Boolean] = js.native
  /** Extract syntax information. */
  var extractSyntax: js.UndefOr[Boolean] = js.native
}

object Features {
  @scala.inline
  def apply(): Features = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Features]
  }
  @scala.inline
  implicit class FeaturesOps[Self <: Features] (val x: Self) extends AnyVal {
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
    def setExtractDocumentSentiment(value: Boolean): Self = this.set("extractDocumentSentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractDocumentSentiment: Self = this.set("extractDocumentSentiment", js.undefined)
    @scala.inline
    def setExtractEntities(value: Boolean): Self = this.set("extractEntities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractEntities: Self = this.set("extractEntities", js.undefined)
    @scala.inline
    def setExtractEntitySentiment(value: Boolean): Self = this.set("extractEntitySentiment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractEntitySentiment: Self = this.set("extractEntitySentiment", js.undefined)
    @scala.inline
    def setExtractSyntax(value: Boolean): Self = this.set("extractSyntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtractSyntax: Self = this.set("extractSyntax", js.undefined)
  }
  
}

