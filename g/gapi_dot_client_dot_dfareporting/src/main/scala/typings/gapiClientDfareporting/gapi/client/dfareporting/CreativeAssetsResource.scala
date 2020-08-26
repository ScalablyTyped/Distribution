package typings.gapiClientDfareporting.gapi.client.dfareporting

import typings.gapiClient.gapi.client.Request
import typings.gapiClientDfareporting.anon.PrettyPrint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreativeAssetsResource extends js.Object {
  /** Inserts a new creative asset. */
  def insert(request: PrettyPrint): Request[CreativeAssetMetadata] = js.native
}

object CreativeAssetsResource {
  @scala.inline
  def apply(insert: PrettyPrint => Request[CreativeAssetMetadata]): CreativeAssetsResource = {
    val __obj = js.Dynamic.literal(insert = js.Any.fromFunction1(insert))
    __obj.asInstanceOf[CreativeAssetsResource]
  }
  @scala.inline
  implicit class CreativeAssetsResourceOps[Self <: CreativeAssetsResource] (val x: Self) extends AnyVal {
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
    def setInsert(value: PrettyPrint => Request[CreativeAssetMetadata]): Self = this.set("insert", js.Any.fromFunction1(value))
  }
  
}

