package typings.atFirebaseFirestore.distSrcProtosFirestoreUnderscoreProtoUnderscoreApiMod.firestoreV1ApiClientInterfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Target extends js.Object {
  var documents: js.UndefOr[DocumentsTarget] = js.undefined
  var once: js.UndefOr[Boolean] = js.undefined
  var query: js.UndefOr[QueryTarget] = js.undefined
  var readTime: js.UndefOr[String] = js.undefined
  var resumeToken: js.UndefOr[String] = js.undefined
  var targetId: js.UndefOr[Double] = js.undefined
}

object Target {
  @scala.inline
  def apply(
    documents: DocumentsTarget = null,
    once: js.UndefOr[Boolean] = js.undefined,
    query: QueryTarget = null,
    readTime: String = null,
    resumeToken: String = null,
    targetId: Int | Double = null
  ): Target = {
    val __obj = js.Dynamic.literal()
    if (documents != null) __obj.updateDynamic("documents")(documents.asInstanceOf[js.Any])
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (readTime != null) __obj.updateDynamic("readTime")(readTime.asInstanceOf[js.Any])
    if (resumeToken != null) __obj.updateDynamic("resumeToken")(resumeToken.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Target]
  }
}

