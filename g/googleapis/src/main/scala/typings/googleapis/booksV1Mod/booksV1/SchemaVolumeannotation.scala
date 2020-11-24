package typings.googleapis.booksV1Mod.booksV1

import typings.googleapis.anon.ContentVersion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SchemaVolumeannotation extends js.Object {
  
  /**
    * The annotation data id for this volume annotation.
    */
  var annotationDataId: js.UndefOr[String] = js.native
  
  /**
    * Link to get data for this annotation.
    */
  var annotationDataLink: js.UndefOr[String] = js.native
  
  /**
    * The type of annotation this is.
    */
  var annotationType: js.UndefOr[String] = js.native
  
  /**
    * The content ranges to identify the selected text.
    */
  var contentRanges: js.UndefOr[ContentVersion] = js.native
  
  /**
    * Data for this annotation.
    */
  var data: js.UndefOr[String] = js.native
  
  /**
    * Indicates that this annotation is deleted.
    */
  var deleted: js.UndefOr[Boolean] = js.native
  
  /**
    * Unique id of this volume annotation.
    */
  var id: js.UndefOr[String] = js.native
  
  /**
    * Resource Type
    */
  var kind: js.UndefOr[String] = js.native
  
  /**
    * The Layer this annotation is for.
    */
  var layerId: js.UndefOr[String] = js.native
  
  /**
    * Pages the annotation spans.
    */
  var pageIds: js.UndefOr[js.Array[String]] = js.native
  
  /**
    * Excerpt from the volume.
    */
  var selectedText: js.UndefOr[String] = js.native
  
  /**
    * URL to this resource.
    */
  var selfLink: js.UndefOr[String] = js.native
  
  /**
    * Timestamp for the last time this anntoation was updated. (RFC 3339 UTC
    * date-time format).
    */
  var updated: js.UndefOr[String] = js.native
  
  /**
    * The Volume this annotation is for.
    */
  var volumeId: js.UndefOr[String] = js.native
}
object SchemaVolumeannotation {
  
  @scala.inline
  def apply(): SchemaVolumeannotation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaVolumeannotation]
  }
  
  @scala.inline
  implicit class SchemaVolumeannotationOps[Self <: SchemaVolumeannotation] (val x: Self) extends AnyVal {
    
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
    def setAnnotationDataId(value: String): Self = this.set("annotationDataId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationDataId: Self = this.set("annotationDataId", js.undefined)
    
    @scala.inline
    def setAnnotationDataLink(value: String): Self = this.set("annotationDataLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationDataLink: Self = this.set("annotationDataLink", js.undefined)
    
    @scala.inline
    def setAnnotationType(value: String): Self = this.set("annotationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnotationType: Self = this.set("annotationType", js.undefined)
    
    @scala.inline
    def setContentRanges(value: ContentVersion): Self = this.set("contentRanges", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentRanges: Self = this.set("contentRanges", js.undefined)
    
    @scala.inline
    def setData(value: String): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setKind(value: String): Self = this.set("kind", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    
    @scala.inline
    def setLayerId(value: String): Self = this.set("layerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLayerId: Self = this.set("layerId", js.undefined)
    
    @scala.inline
    def setPageIdsVarargs(value: String*): Self = this.set("pageIds", js.Array(value :_*))
    
    @scala.inline
    def setPageIds(value: js.Array[String]): Self = this.set("pageIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageIds: Self = this.set("pageIds", js.undefined)
    
    @scala.inline
    def setSelectedText(value: String): Self = this.set("selectedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectedText: Self = this.set("selectedText", js.undefined)
    
    @scala.inline
    def setSelfLink(value: String): Self = this.set("selfLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelfLink: Self = this.set("selfLink", js.undefined)
    
    @scala.inline
    def setUpdated(value: String): Self = this.set("updated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUpdated: Self = this.set("updated", js.undefined)
    
    @scala.inline
    def setVolumeId(value: String): Self = this.set("volumeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVolumeId: Self = this.set("volumeId", js.undefined)
  }
}
