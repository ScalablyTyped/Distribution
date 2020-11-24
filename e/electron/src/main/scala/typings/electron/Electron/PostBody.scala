package typings.electron.Electron

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostBody extends js.Object {
  
  // Docs: https://electronjs.org/docs/api/structures/post-body
  /**
    * The boundary used to separate multiple parts of the message. Only valid when
    * `contentType` is `multipart/form-data`.
    */
  var boundary: js.UndefOr[String] = js.native
  
  /**
    * The `content-type` header used for the data. One of
    * `application/x-www-form-urlencoded` or `multipart/form-data`. Corresponds to the
    * `enctype` attribute of the submitted HTML form.
    */
  var contentType: String = js.native
  
  /**
    * The post data to be sent to the new window.
    */
  var data: js.Array[PostData] = js.native
}
object PostBody {
  
  @scala.inline
  def apply(contentType: String, data: js.Array[PostData]): PostBody = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostBody]
  }
  
  @scala.inline
  implicit class PostBodyOps[Self <: PostBody] (val x: Self) extends AnyVal {
    
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
    def setContentType(value: String): Self = this.set("contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataVarargs(value: PostData*): Self = this.set("data", js.Array(value :_*))
    
    @scala.inline
    def setData(value: js.Array[PostData]): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundary(value: String): Self = this.set("boundary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBoundary: Self = this.set("boundary", js.undefined)
  }
}
