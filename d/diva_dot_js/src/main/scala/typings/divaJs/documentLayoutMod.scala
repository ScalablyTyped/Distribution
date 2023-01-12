package typings.divaJs

import typings.divaJs.anon.X
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.Offset
import typings.divaJs.interfacesMod.PageGroup
import typings.divaJs.interfacesMod.PageInfo
import typings.divaJs.interfacesMod.Region
import typings.divaJs.interfacesMod.RendererConfig
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object documentLayoutMod {
  
  @JSImport("diva.js/document-layout", JSImport.Default)
  @js.native
  open class default protected ()
    extends StObject
       with DocumentLayout {
    def this(config: RendererConfig, zoomLevel: Double) = this()
    
    /* CompleteClass */
    var dimensions: Dimensions = js.native
    
    /* CompleteClass */
    override def getPageDimensions(pageIndex: Double): Dimensions = js.native
    
    /* CompleteClass */
    override def getPageInfo(pageIndex: Double): PageInfo | Null = js.native
    
    /* CompleteClass */
    override def getPageOffset(pageIndex: Double, options: js.Object): Offset = js.native
    
    /* CompleteClass */
    override def getPageRegion(pageIndex: Double, options: js.Object): Offset = js.native
    
    /* CompleteClass */
    override def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): X = js.native
    
    /* CompleteClass */
    var pageGroups: js.Array[PageGroup] = js.native
  }
  
  trait DocumentLayout extends StObject {
    
    var dimensions: Dimensions
    
    def getPageDimensions(pageIndex: Double): Dimensions
    
    def getPageInfo(pageIndex: Double): PageInfo | Null
    
    def getPageOffset(pageIndex: Double, options: js.Object): Offset
    
    def getPageRegion(pageIndex: Double, options: js.Object): Offset
    
    def getPageToViewportCenterOffset(pageIndex: Double, viewport: Region): X
    
    var pageGroups: js.Array[PageGroup]
  }
  object DocumentLayout {
    
    inline def apply(
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
    implicit open class MutableBuilder[Self <: DocumentLayout] (val x: Self) extends AnyVal {
      
      inline def setDimensions(value: Dimensions): Self = StObject.set(x, "dimensions", value.asInstanceOf[js.Any])
      
      inline def setGetPageDimensions(value: Double => Dimensions): Self = StObject.set(x, "getPageDimensions", js.Any.fromFunction1(value))
      
      inline def setGetPageInfo(value: Double => PageInfo | Null): Self = StObject.set(x, "getPageInfo", js.Any.fromFunction1(value))
      
      inline def setGetPageOffset(value: (Double, js.Object) => Offset): Self = StObject.set(x, "getPageOffset", js.Any.fromFunction2(value))
      
      inline def setGetPageRegion(value: (Double, js.Object) => Offset): Self = StObject.set(x, "getPageRegion", js.Any.fromFunction2(value))
      
      inline def setGetPageToViewportCenterOffset(value: (Double, Region) => X): Self = StObject.set(x, "getPageToViewportCenterOffset", js.Any.fromFunction2(value))
      
      inline def setPageGroups(value: js.Array[PageGroup]): Self = StObject.set(x, "pageGroups", value.asInstanceOf[js.Any])
      
      inline def setPageGroupsVarargs(value: PageGroup*): Self = StObject.set(x, "pageGroups", js.Array(value*))
    }
  }
}
