package typings.divaJs.documentLayoutMod

import typings.divaJs.anon.X
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Offset
import typings.divaJs.interfacesMod.PageGroup
import typings.divaJs.interfacesMod.PageInfo
import typings.divaJs.interfacesMod.Region
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DocumentLayout extends js.Object {
  
  var dimensions: Dimensions = js.native
  
  def getPageDimensions(pageIndex: Double): Dimensions = js.native
  
  def getPageInfo(pageIndex: Double): PageInfo | Null = js.native
  
  def getPageOffset(pageIndex: Double, options: js.Object): Offset = js.native
  
  def getPageRegion(pageIndex: Double, options: js.Object): Offset = js.native
  
  def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): X = js.native
  
  var pageGroups: js.Array[PageGroup] = js.native
}
object DocumentLayout {
  
  @scala.inline
  def apply(
    dimensions: Dimensions,
    getPageDimensions: Double => Dimensions,
    getPageInfo: Double => PageInfo | Null,
    getPageOffset: (Double, js.Object) => Offset,
    getPageRegion: (Double, js.Object) => Offset,
    getPageToViewportCenterOffset: (Double, Region) => X,
    pageGroups: js.Array[PageGroup]
  ): DocumentLayout = {
    val __obj = js.Dynamic.literal(dimensions = dimensions.asInstanceOf[js.Any], getPageDimensions = js.Any.fromFunction1(getPageDimensions), getPageInfo = js.Any.fromFunction1(getPageInfo), getPageOffset = js.Any.fromFunction2(getPageOffset), getPageRegion = js.Any.fromFunction2(getPageRegion), getPageToViewportCenterOffset = js.Any.fromFunction2(getPageToViewportCenterOffset), pageGroups = pageGroups.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentLayout]
  }
  
  @scala.inline
  implicit class DocumentLayoutOps[Self <: DocumentLayout] (val x: Self) extends AnyVal {
    
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
    def setDimensions(value: Dimensions): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetPageDimensions(value: Double => Dimensions): Self = this.set("getPageDimensions", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageInfo(value: Double => PageInfo | Null): Self = this.set("getPageInfo", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPageOffset(value: (Double, js.Object) => Offset): Self = this.set("getPageOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPageRegion(value: (Double, js.Object) => Offset): Self = this.set("getPageRegion", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPageToViewportCenterOffset(value: (Double, Region) => X): Self = this.set("getPageToViewportCenterOffset", js.Any.fromFunction2(value))
    
    @scala.inline
    def setPageGroupsVarargs(value: PageGroup*): Self = this.set("pageGroups", js.Array(value :_*))
    
    @scala.inline
    def setPageGroups(value: js.Array[PageGroup]): Self = this.set("pageGroups", value.asInstanceOf[js.Any])
  }
}
