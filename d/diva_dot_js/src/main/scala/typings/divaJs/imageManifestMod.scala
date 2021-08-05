package typings.divaJs

import typings.divaJs.anon.Cols
import typings.divaJs.interfacesMod.Dimensions
import typings.divaJs.interfacesMod.ManifestData
import typings.divaJs.interfacesMod.Page
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imageManifestMod {
  
  @JSImport("diva.js/image-manifest", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with ImageManifest {
    def this(data: ManifestData, urlAdapter: IIIFSourceAdapter) = this()
  }
  /* static members */
  object default {
    
    @JSImport("diva.js/image-manifest", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def fromIIIF(iiifManifest: js.Object): ImageManifest = ^.asInstanceOf[js.Dynamic].applyDynamic("fromIIIF")(iiifManifest.asInstanceOf[js.Any]).asInstanceOf[ImageManifest]
  }
  
  type IIIFSourceAdapter = js.Any
  
  @js.native
  trait ImageManifest extends StObject {
    
    def etPageImageTiles(pageIndex: Double, zoomLevel: Double, tileDimensions: Dimensions): Cols = js.native
    
    def getMaxPageDimensions(pageIndex: Double): Dimensions = js.native
    
    def getPageDimensionsAtZoomLevel(pageIndex: Double, zoomLevel: Double): Dimensions = js.native
    
    def getPageImageURL(pageIndex: Double): String = js.native
    def getPageImageURL(pageIndex: Double, size: Dimensions): String = js.native
    
    def isPageValid(pageIndex: Double, showNonPagedPages: Boolean): Boolean = js.native
    
    var itemTitle: String = js.native
    
    var maxRatio: Double = js.native
    
    var maxZoom: Double = js.native
    
    var metadata: js.Object = js.native
    
    var paged: Boolean = js.native
    
    var pages: js.Array[Page] = js.native
  }
}
