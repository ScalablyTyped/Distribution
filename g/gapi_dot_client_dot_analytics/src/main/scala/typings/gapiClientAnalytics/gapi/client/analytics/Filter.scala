package typings.gapiClientAnalytics.gapi.client.analytics

import typings.gapiClientAnalytics.anon.CaseSensitive
import typings.gapiClientAnalytics.anon.Field
import typings.gapiClientAnalytics.anon.FieldIndex
import typings.gapiClientAnalytics.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Filter extends js.Object {
  /** Account ID to which this filter belongs. */
  var accountId: js.UndefOr[String] = js.native
  /** Details for the filter of the type ADVANCED. */
  var advancedDetails: js.UndefOr[CaseSensitive] = js.native
  /** Time this filter was created. */
  var created: js.UndefOr[String] = js.native
  /** Details for the filter of the type EXCLUDE. */
  var excludeDetails: js.UndefOr[FilterExpression] = js.native
  /** Filter ID. */
  var id: js.UndefOr[String] = js.native
  /** Details for the filter of the type INCLUDE. */
  var includeDetails: js.UndefOr[FilterExpression] = js.native
  /** Resource type for Analytics filter. */
  var kind: js.UndefOr[String] = js.native
  /** Details for the filter of the type LOWER. */
  var lowercaseDetails: js.UndefOr[Field] = js.native
  /** Name of this filter. */
  var name: js.UndefOr[String] = js.native
  /** Parent link for this filter. Points to the account to which this filter belongs. */
  var parentLink: js.UndefOr[Href] = js.native
  /** Details for the filter of the type SEARCH_AND_REPLACE. */
  var searchAndReplaceDetails: js.UndefOr[FieldIndex] = js.native
  /** Link for this filter. */
  var selfLink: js.UndefOr[String] = js.native
  /** Type of this filter. Possible values are INCLUDE, EXCLUDE, LOWERCASE, UPPERCASE, SEARCH_AND_REPLACE and ADVANCED. */
  var `type`: js.UndefOr[String] = js.native
  /** Time this filter was last modified. */
  var updated: js.UndefOr[String] = js.native
  /** Details for the filter of the type UPPER. */
  var uppercaseDetails: js.UndefOr[Field] = js.native
}

object Filter {
  @scala.inline
  def apply(): Filter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Filter]
  }
  @scala.inline
  implicit class FilterOps[Self <: Filter] (val x: Self) extends AnyVal {
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
    def setAccountId(value: String): Self = this.set("accountId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccountId: Self = this.set("accountId", js.undefined)
    @scala.inline
    def setAdvancedDetails(value: CaseSensitive): Self = this.set("advancedDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedDetails: Self = this.set("advancedDetails", js.undefined)
    @scala.inline
    def setCreated(value: String): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreated: Self = this.set("created", js.undefined)
    @scala.inline
    def setExcludeDetails(value: FilterExpression): Self = this.set("excludeDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeDetails: Self = this.set("excludeDetails", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIncludeDetails(value: FilterExpression): Self = this.set("includeDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludeDetails: Self = this.set("includeDetails", js.undefined)
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setLowercaseDetails(value: Field): Self = this.set("lowercaseDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLowercaseDetails: Self = this.set("lowercaseDetails", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setParentLink(value: Href): Self = this.set("parentLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentLink: Self = this.set("parentLink", js.undefined)
    @scala.inline
    def setSearchAndReplaceDetails(value: FieldIndex): Self = this.set("searchAndReplaceDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSearchAndReplaceDetails: Self = this.set("searchAndReplaceDetails", js.undefined)
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    @scala.inline
    def setUppercaseDetails(value: Field): Self = this.set("uppercaseDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUppercaseDetails: Self = this.set("uppercaseDetails", js.undefined)
  }
  
}

