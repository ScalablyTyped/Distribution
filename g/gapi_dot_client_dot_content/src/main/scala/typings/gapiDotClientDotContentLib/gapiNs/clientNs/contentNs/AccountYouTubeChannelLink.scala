package typings
package gapiDotClientDotContentLib.gapiNs.clientNs.contentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AccountYouTubeChannelLink extends js.Object {
  /** Channel ID. */
  var channelId: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Status of the link between this Merchant Center account and the YouTube channel. Upon retrieval, it represents the actual status of the link and can be
               * either active if it was approved in YT Creator Studio or pending if it's pending approval. Upon insertion, it represents the intended status of the
               * link. Re-uploading a link with status active when it's still pending or with status pending when it's already active will have no effect: the status
               * will remain unchanged. Re-uploading a link with deprecated status inactive is equivalent to not submitting the link at all and will delete the link if
               * it was active or cancel the link request if it was pending.
               */
  var status: js.UndefOr[java.lang.String] = js.undefined
}

