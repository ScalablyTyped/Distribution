package typings.gapiClientManufacturers.gapi.client.manufacturers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Product extends js.Object {
  /**
    * The content language of the product as a two-letter ISO 639-1 language code
    * (for example, en).
    * @OutputOnly
    */
  var contentLanguage: js.UndefOr[String] = js.native
  /**
    * Final attributes of the product. The final attributes are obtained by
    * overriding the uploaded attributes with the manually provided and deleted
    * attributes. Google systems only process, evaluate, review, and/or use final
    * attributes.
    * @OutputOnly
    */
  var finalAttributes: js.UndefOr[Attributes] = js.native
  /**
    * A server-generated list of issues associated with the product.
    * @OutputOnly
    */
  var issues: js.UndefOr[js.Array[Issue]] = js.native
  /**
    * Names of the attributes of the product deleted manually via the
    * Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyDeletedAttributes: js.UndefOr[js.Array[String]] = js.native
  /**
    * Attributes of the product provided manually via the Manufacturer Center UI.
    * @OutputOnly
    */
  var manuallyProvidedAttributes: js.UndefOr[Attributes] = js.native
  /**
    * Name in the format `{target_country}:{content_language}:{product_id}`.
    *
    * `target_country`   - The target country of the product as a CLDR territory
    * code (for example, US).
    *
    * `content_language` - The content language of the product as a two-letter
    * ISO 639-1 language code (for example, en).
    *
    * `product_id`     -   The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Parent ID in the format `accounts/{account_id}`.
    *
    * `account_id` - The ID of the Manufacturer Center account.
    * @OutputOnly
    */
  var parent: js.UndefOr[String] = js.native
  /**
    * The ID of the product. For more information, see
    * https://support.google.com/manufacturers/answer/6124116#id.
    * @OutputOnly
    */
  var productId: js.UndefOr[String] = js.native
  /**
    * The target country of the product as a CLDR territory code (for example,
    * US).
    * @OutputOnly
    */
  var targetCountry: js.UndefOr[String] = js.native
  /**
    * Attributes of the product uploaded via the Manufacturer Center API or via
    * feeds.
    */
  var uploadedAttributes: js.UndefOr[Attributes] = js.native
}

object Product {
  @scala.inline
  def apply(): Product = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Product]
  }
  @scala.inline
  implicit class ProductOps[Self <: Product] (val x: Self) extends AnyVal {
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
    def setContentLanguage(value: String): Self = this.set("contentLanguage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentLanguage: Self = this.set("contentLanguage", js.undefined)
    @scala.inline
    def setFinalAttributes(value: Attributes): Self = this.set("finalAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalAttributes: Self = this.set("finalAttributes", js.undefined)
    @scala.inline
    def setIssuesVarargs(value: Issue*): Self = this.set("issues", js.Array(value :_*))
    @scala.inline
    def setIssues(value: js.Array[Issue]): Self = this.set("issues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssues: Self = this.set("issues", js.undefined)
    @scala.inline
    def setManuallyDeletedAttributesVarargs(value: String*): Self = this.set("manuallyDeletedAttributes", js.Array(value :_*))
    @scala.inline
    def setManuallyDeletedAttributes(value: js.Array[String]): Self = this.set("manuallyDeletedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManuallyDeletedAttributes: Self = this.set("manuallyDeletedAttributes", js.undefined)
    @scala.inline
    def setManuallyProvidedAttributes(value: Attributes): Self = this.set("manuallyProvidedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManuallyProvidedAttributes: Self = this.set("manuallyProvidedAttributes", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParent(value: String): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
    @scala.inline
    def setTargetCountry(value: String): Self = this.set("targetCountry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetCountry: Self = this.set("targetCountry", js.undefined)
    @scala.inline
    def setUploadedAttributes(value: Attributes): Self = this.set("uploadedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUploadedAttributes: Self = this.set("uploadedAttributes", js.undefined)
  }
  
}

