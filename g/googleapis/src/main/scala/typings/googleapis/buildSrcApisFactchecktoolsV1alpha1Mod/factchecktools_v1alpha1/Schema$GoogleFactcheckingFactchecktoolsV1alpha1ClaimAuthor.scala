package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the claim author.
  */
@js.native
trait Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor extends js.Object {
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.image`.
    */
  var imageUrl: js.UndefOr[String] = js.native
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.jobTitle`.
    */
  var jobTitle: js.UndefOr[String] = js.native
  /**
    * A person or organization stating the claim. For instance, &quot;John
    * Doe&quot;.&lt;br&gt; Corresponds to
    * `ClaimReview.itemReviewed.author.name`.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * Corresponds to `ClaimReview.itemReviewed.author.sameAs`.
    */
  var sameAs: js.UndefOr[String] = js.native
}

object Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor {
  @scala.inline
  def apply(imageUrl: String = null, jobTitle: String = null, name: String = null, sameAs: String = null): Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor = {
    val __obj = js.Dynamic.literal()
    if (imageUrl != null) __obj.updateDynamic("imageUrl")(imageUrl.asInstanceOf[js.Any])
    if (jobTitle != null) __obj.updateDynamic("jobTitle")(jobTitle.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (sameAs != null) __obj.updateDynamic("sameAs")(sameAs.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimAuthor]
  }
}

