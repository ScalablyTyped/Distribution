package typings.fhir.fhir

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Contains a collection of resources
  */
@js.native
trait Bundle
  extends ResourceBase
     with Resource {
  /**
    * Contains extended information for property 'total'.
    */
  var _total: js.UndefOr[Element] = js.native
  /**
    * Contains extended information for property 'type'.
    */
  var _type: js.UndefOr[Element] = js.native
  /**
    * Entry in the bundle - will have a resource, or information
    */
  var entry: js.UndefOr[js.Array[BundleEntry]] = js.native
  /**
    * Persistent identifier for the bundle
    */
  var identifier: js.UndefOr[Identifier] = js.native
  /**
    * Links related to this Bundle
    */
  var link: js.UndefOr[js.Array[BundleLink]] = js.native
  /**
    * Digital Signature
    */
  var signature: js.UndefOr[Signature] = js.native
  /**
    * If search, the total number of matches
    */
  var total: js.UndefOr[unsignedInt] = js.native
  /**
    * document | message | transaction | transaction-response | batch | batch-response | history | searchset | collection
    */
  var `type`: code = js.native
}

object Bundle {
  @scala.inline
  def apply(`type`: code): Bundle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bundle]
  }
  @scala.inline
  implicit class BundleOps[Self <: Bundle] (val x: Self) extends AnyVal {
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
    def setType(value: code): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def set_total(value: Element): Self = this.set("_total", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_total: Self = this.set("_total", js.undefined)
    @scala.inline
    def set_type(value: Element): Self = this.set("_type", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_type: Self = this.set("_type", js.undefined)
    @scala.inline
    def setEntryVarargs(value: BundleEntry*): Self = this.set("entry", js.Array(value :_*))
    @scala.inline
    def setEntry(value: js.Array[BundleEntry]): Self = this.set("entry", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEntry: Self = this.set("entry", js.undefined)
    @scala.inline
    def setIdentifier(value: Identifier): Self = this.set("identifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIdentifier: Self = this.set("identifier", js.undefined)
    @scala.inline
    def setLinkVarargs(value: BundleLink*): Self = this.set("link", js.Array(value :_*))
    @scala.inline
    def setLink(value: js.Array[BundleLink]): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    @scala.inline
    def setSignature(value: Signature): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setTotal(value: unsignedInt): Self = this.set("total", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
  
}

