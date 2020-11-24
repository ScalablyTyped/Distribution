package typings.googleAppsScript.GoogleAppsScript.Dfareporting.Collection

import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.VideoFormat
import typings.googleAppsScript.GoogleAppsScript.Dfareporting.Schema.VideoFormatsListResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoFormatsCollection extends js.Object {
  
  // Gets one video format by ID.
  def get(profileId: String, id: Double): VideoFormat = js.native
  
  // Lists available video formats.
  def list(profileId: String): VideoFormatsListResponse = js.native
}
object VideoFormatsCollection {
  
  @scala.inline
  def apply(get: (String, Double) => VideoFormat, list: String => VideoFormatsListResponse): VideoFormatsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), list = js.Any.fromFunction1(list))
    __obj.asInstanceOf[VideoFormatsCollection]
  }
  
  @scala.inline
  implicit class VideoFormatsCollectionOps[Self <: VideoFormatsCollection] (val x: Self) extends AnyVal {
    
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
    def setGet(value: (String, Double) => VideoFormat): Self = this.set("get", js.Any.fromFunction2(value))
    
    @scala.inline
    def setList(value: String => VideoFormatsListResponse): Self = this.set("list", js.Any.fromFunction1(value))
  }
}
