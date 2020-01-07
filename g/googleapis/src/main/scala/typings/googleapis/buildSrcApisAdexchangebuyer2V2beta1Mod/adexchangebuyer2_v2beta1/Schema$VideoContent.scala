package typings.googleapis.buildSrcApisAdexchangebuyer2V2beta1Mod.adexchangebuyer2_v2beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Video content for a creative.
  */
@js.native
trait Schema$VideoContent extends js.Object {
  /**
    * The URL to fetch a video ad.
    */
  var videoUrl: js.UndefOr[String] = js.native
  /**
    * The contents of a VAST document for a video ad. This document should
    * conform to the VAST 2.0 or 3.0 standard.
    */
  var videoVastXml: js.UndefOr[String] = js.native
}

object Schema$VideoContent {
  @scala.inline
  def apply(videoUrl: String = null, videoVastXml: String = null): Schema$VideoContent = {
    val __obj = js.Dynamic.literal()
    if (videoUrl != null) __obj.updateDynamic("videoUrl")(videoUrl.asInstanceOf[js.Any])
    if (videoVastXml != null) __obj.updateDynamic("videoVastXml")(videoVastXml.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schema$VideoContent]
  }
}

