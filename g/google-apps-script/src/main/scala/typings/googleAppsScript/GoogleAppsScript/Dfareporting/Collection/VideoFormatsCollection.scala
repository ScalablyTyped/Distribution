package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.VideoFormat
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.VideoFormatsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VideoFormatsCollection extends js.Object {
  // Gets one video format by ID.
  def get(profileId: String, id: Double): VideoFormat
  // Lists available video formats.
  def list(profileId: String): VideoFormatsListResponse
}

object VideoFormatsCollection {
  @scala.inline
  def apply(get: (String, Double) => VideoFormat, list: String => VideoFormatsListResponse): VideoFormatsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
  
    __obj.asInstanceOf[VideoFormatsCollection]
  }
}

