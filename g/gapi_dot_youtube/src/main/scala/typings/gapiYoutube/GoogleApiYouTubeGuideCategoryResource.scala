package typings.gapiYoutube

import typings.gapiYoutube.anon.Title
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleApiYouTubeGuideCategoryResource extends js.Object {
  
  /**
    * The ETag of the guideCategory resource.
    */
  var etag: String = js.native
  
  /**
    * The ID that YouTube uses to uniquely identify the guide category.
    */
  var id: String = js.native
  
  /**
    * The type of the API resource. For guideCategory resources, the value will be youtube#guideCategory.
    */
  var kind: String = js.native
  
  /**
    * The snippet object contains basic details about the category, such as its title.
    */
  var snippet: Title = js.native
}
object GoogleApiYouTubeGuideCategoryResource {
  
  @scala.inline
  def apply(etag: String, id: String, kind: String, snippet: Title): GoogleApiYouTubeGuideCategoryResource = {
    val __obj = js.Dynamic.literal(etag = etag.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], snippet = snippet.asInstanceOf[js.Any])
    __obj.asInstanceOf[GoogleApiYouTubeGuideCategoryResource]
  }
  
  @scala.inline
  implicit class GoogleApiYouTubeGuideCategoryResourceOps[Self <: GoogleApiYouTubeGuideCategoryResource] (val x: Self) extends AnyVal {
    
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
    def setEtag(value: String): Self = this.set("etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnippet(value: Title): Self = this.set("snippet", value.asInstanceOf[js.Any])
  }
}
