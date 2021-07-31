package typings.googleapis.anon

import typings.googleapis.booksV1Mod.booksV1.SchemaVolume
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Bannerwithcontentcontainer extends StObject {
  
  var banner_with_content_container: js.UndefOr[FillColorArgb] = js.undefined
  
  var subTitle: js.UndefOr[String] = js.undefined
  
  var title: js.UndefOr[String] = js.undefined
  
  var totalVolumes: js.UndefOr[Double] = js.undefined
  
  var uid: js.UndefOr[String] = js.undefined
  
  var volumes: js.UndefOr[js.Array[SchemaVolume]] = js.undefined
}
object Bannerwithcontentcontainer {
  
  @scala.inline
  def apply(): Bannerwithcontentcontainer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Bannerwithcontentcontainer]
  }
  
  @scala.inline
  implicit class BannerwithcontentcontainerMutableBuilder[Self <: Bannerwithcontentcontainer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBanner_with_content_container(value: FillColorArgb): Self = StObject.set(x, "banner_with_content_container", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBanner_with_content_containerUndefined: Self = StObject.set(x, "banner_with_content_container", js.undefined)
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitleUndefined: Self = StObject.set(x, "subTitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    @scala.inline
    def setTotalVolumes(value: Double): Self = StObject.set(x, "totalVolumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalVolumesUndefined: Self = StObject.set(x, "totalVolumes", js.undefined)
    
    @scala.inline
    def setUid(value: String): Self = StObject.set(x, "uid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUidUndefined: Self = StObject.set(x, "uid", js.undefined)
    
    @scala.inline
    def setVolumes(value: js.Array[SchemaVolume]): Self = StObject.set(x, "volumes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVolumesUndefined: Self = StObject.set(x, "volumes", js.undefined)
    
    @scala.inline
    def setVolumesVarargs(value: SchemaVolume*): Self = StObject.set(x, "volumes", js.Array(value :_*))
  }
}
