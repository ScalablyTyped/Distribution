package typings.googleapis.buildSrcApisFactchecktoolsV1alpha1Mod.factchecktools_v1alpha1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about a claim review.
  */
@js.native
trait Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview extends js.Object {
  /**
    * The language this review was written in. For instance, &quot;en&quot; or
    * &quot;de&quot;.
    */
  var languageCode: js.UndefOr[String] = js.native
  /**
    * The publisher of this claim review.
    */
  var publisher: js.UndefOr[Schema$GoogleFactcheckingFactchecktoolsV1alpha1Publisher] = js.native
  /**
    * The date the claim was reviewed.
    */
  var reviewDate: js.UndefOr[String] = js.native
  /**
    * Textual rating. For instance, &quot;Mostly false&quot;.
    */
  var textualRating: js.UndefOr[String] = js.native
  /**
    * The title of this claim review, if it can be determined.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * The URL of this claim review.
    */
  var url: js.UndefOr[String] = js.native
}

object Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview {
  @scala.inline
  def apply(
    languageCode: String = null,
    publisher: Schema$GoogleFactcheckingFactchecktoolsV1alpha1Publisher = null,
    reviewDate: String = null,
    textualRating: String = null,
    title: String = null,
    url: String = null
  ): Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview = {
    val __obj = js.Dynamic.literal()
    if (languageCode != null) __obj.updateDynamic("languageCode")(languageCode.asInstanceOf[js.Any])
    if (publisher != null) __obj.updateDynamic("publisher")(publisher.asInstanceOf[js.Any])
    if (reviewDate != null) __obj.updateDynamic("reviewDate")(reviewDate.asInstanceOf[js.Any])
    if (textualRating != null) __obj.updateDynamic("textualRating")(textualRating.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$GoogleFactcheckingFactchecktoolsV1alpha1ClaimReview]
  }
}

