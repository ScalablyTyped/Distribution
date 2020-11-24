package typings.googleMarkerclustererplus

import typings.googlemaps.google.maps.Marker
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Optional parameter passed to the {@link MarkerClusterer} constructor.
  */
@js.native
trait MarkerClustererOptions extends js.Object {
  
  /**
    * [averageCenter=false] Whether the position of a cluster marker should be
    * the average position of all markers in the cluster. If set to <code>false</code>, the
    * cluster marker is positioned at the location of the first marker added to the cluster.
    */
  var averageCenter: js.UndefOr[Boolean] = js.native
  
  /**
    * [batchSize=MarkerClusterer.BATCH_SIZE] Set this property to the
    * number of markers to be processed in a single batch when using a browser other than
    * Internet Explorer (for Internet Explorer, use the batchSizeIE property instead).
    */
  var batchSize: js.UndefOr[Double] = js.native
  
  /**
    * [batchSizeIE=MarkerClusterer.BATCH_SIZE_IE] When Internet Explorer is
    * being used, markers are processed in several batches with a small delay inserted between
    * each batch in an attempt to avoid Javascript timeout errors. Set this property to the
    * number of markers to be processed in a single batch; select as high a number as you can
    * without causing a timeout error in the browser. This number might need to be as low as 100
    * if 15,000 markers are being managed, for example.
    */
  var batchSizeIE: js.UndefOr[Double] = js.native
  
  /**
    * [calculator=MarkerClusterer.CALCULATOR] The function used to determine
    * the text to be displayed on a cluster marker and the index indicating which style to use
    * for the cluster marker. The input parameters for the function are (1) the array of markers
    * represented by a cluster marker and (2) the number of cluster icon styles. It returns a
    * {@link ClusterIconInfo} object. The default <code>calculator</code> returns a
    * <code>text</code> property which is the number of markers in the cluster and an
    * <code>index</code> property which is one higher than the lowest integer such that
    * <code>10^i</code> exceeds the number of markers in the cluster, or the size of the styles
    * array, whichever is less. The <code>styles</code> array element used has an index of
    * <code>index</code> minus 1. For example, the default <code>calculator</code> returns a
    * <code>text</code> value of <code>"125"</code> and an <code>index</code> of <code>3</code>
    * for a cluster icon representing 125 markers so the element used in the <code>styles</code>
    * array is <code>2</code>. A <code>calculator</code> may also return a <code>title</code>
    * property that contains the text of the tooltip to be used for the cluster marker. If
    * <code>title</code> is not defined, the tooltip is set to the value of the <code>title</code>
    * property for the MarkerClusterer.
    */
  var calculator: js.UndefOr[Calculator] = js.native
  
  /**
    * [clusterClass="cluster"] The name of the CSS class defining general styles
    * for the cluster markers. Use this class to define CSS styles that are not set up by the code
    * that processes the <code>styles</code> array.
    */
  var clusterClass: js.UndefOr[java.lang.String] = js.native
  
  /**
    * [enableRetinaIcons=false] Whether to allow the use of cluster icons that
    * have sizes that are some multiple (typically double) of their actual display size. Icons such
    * as these look better when viewed on high-resolution monitors such as Apple's Retina displays.
    * Note: if this property is <code>true</code>, sprites cannot be used as cluster icons.
    */
  var enableRetinaIcons: js.UndefOr[Boolean] = js.native
  
  /** [gridSize=60] The grid size of a cluster in pixels. The grid is a square. */
  var gridSize: js.UndefOr[Double] = js.native
  
  /**
    * [ignoreHidden=false] Whether to ignore hidden markers in clusters. You
    * may want to set this to <code>true</code> to ensure that hidden markers are not included
    * in the marker count that appears on a cluster marker (this count is the value of the
    * <code>text</code> property of the result returned by the default <code>calculator</code>).
    * If set to <code>true</code> and you change the visibility of a marker being clustered, be
    * sure to also call <code>MarkerClusterer.repaint()</code>.
    */
  var ignoreHidden: js.UndefOr[Boolean] = js.native
  
  /**
    * [imageExtension=MarkerClusterer.IMAGE_EXTENSION]
    * The extension name for the cluster icon image files (e.g., <code>"png"</code> or
    * <code>"jpg"</code>).
    */
  var imageExtension: js.UndefOr[java.lang.String] = js.native
  
  /**
    * [imagePath=MarkerClusterer.IMAGE_PATH]
    * The full URL of the root name of the group of image files to use for cluster icons.
    * The complete file name is of the form <code>imagePath</code>n.<code>imageExtension</code>
    * where n is the image file number (1, 2, etc.).
    */
  var imagePath: js.UndefOr[java.lang.String] = js.native
  
  /**
    * [imageSizes=MarkerClusterer.IMAGE_SIZES]
    * An array of numbers containing the widths of the group of
    * <code>imagePath</code>n.<code>imageExtension</code> image files.
    * (The images are assumed to be square.)
    */
  var imageSizes: js.UndefOr[js.Array[Double]] = js.native
  
  /**
    * [maxZoom=null] The maximum zoom level at which clustering is enabled or
    * <code>null</code> if clustering is to be enabled at all zoom levels.
    */
  var maxZoom: js.UndefOr[Double] = js.native
  
  /**
    * [minimumClusterSize=2] The minimum number of markers needed in a cluster
    * before the markers are hidden and a cluster marker appears.
    */
  var minimumClusterSize: js.UndefOr[Double] = js.native
  
  /**
    * [styles] An array of {@link ClusterIconStyle} elements defining the styles
    * of the cluster markers to be used. The element to be used to style a given cluster marker
    * is determined by the function defined by the <code>calculator</code> property.
    * The default is an array of {@link ClusterIconStyle} elements whose properties are derived
    * from the values for <code>imagePath</code>, <code>imageExtension</code>, and
    * <code>imageSizes</code>.
    */
  var styles: js.UndefOr[js.Array[ClusterIconStyle]] = js.native
  
  /**
    * [title=""] The tooltip to display when the mouse moves over a cluster
    * marker. (Alternatively, you can use a custom <code>calculator</code> function to specify a
    * different tooltip for each cluster marker.)
    */
  var title: js.UndefOr[java.lang.String] = js.native
  
  /**
    * [zoomOnClick=true] Whether to zoom the map when a cluster marker is
    * clicked. You may want to set this to <code>false</code> if you have installed a handler
    * for the <code>click</code> event and it deals with zooming on its own.
    */
  var zoomOnClick: js.UndefOr[Boolean] = js.native
}
object MarkerClustererOptions {
  
  @scala.inline
  def apply(): MarkerClustererOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkerClustererOptions]
  }
  
  @scala.inline
  implicit class MarkerClustererOptionsOps[Self <: MarkerClustererOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAverageCenter(value: Boolean): Self = this.set("averageCenter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAverageCenter: Self = this.set("averageCenter", js.undefined)
    
    @scala.inline
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setBatchSizeIE(value: Double): Self = this.set("batchSizeIE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSizeIE: Self = this.set("batchSizeIE", js.undefined)
    
    @scala.inline
    def setCalculator(value: (/* markers */ js.Array[Marker], /* clusterIconStylesCount */ Double) => ClusterIconInfo): Self = this.set("calculator", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCalculator: Self = this.set("calculator", js.undefined)
    
    @scala.inline
    def setClusterClass(value: java.lang.String): Self = this.set("clusterClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClusterClass: Self = this.set("clusterClass", js.undefined)
    
    @scala.inline
    def setEnableRetinaIcons(value: Boolean): Self = this.set("enableRetinaIcons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableRetinaIcons: Self = this.set("enableRetinaIcons", js.undefined)
    
    @scala.inline
    def setGridSize(value: Double): Self = this.set("gridSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGridSize: Self = this.set("gridSize", js.undefined)
    
    @scala.inline
    def setIgnoreHidden(value: Boolean): Self = this.set("ignoreHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreHidden: Self = this.set("ignoreHidden", js.undefined)
    
    @scala.inline
    def setImageExtension(value: java.lang.String): Self = this.set("imageExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageExtension: Self = this.set("imageExtension", js.undefined)
    
    @scala.inline
    def setImagePath(value: java.lang.String): Self = this.set("imagePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImagePath: Self = this.set("imagePath", js.undefined)
    
    @scala.inline
    def setImageSizesVarargs(value: Double*): Self = this.set("imageSizes", js.Array(value :_*))
    
    @scala.inline
    def setImageSizes(value: js.Array[Double]): Self = this.set("imageSizes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageSizes: Self = this.set("imageSizes", js.undefined)
    
    @scala.inline
    def setMaxZoom(value: Double): Self = this.set("maxZoom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxZoom: Self = this.set("maxZoom", js.undefined)
    
    @scala.inline
    def setMinimumClusterSize(value: Double): Self = this.set("minimumClusterSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumClusterSize: Self = this.set("minimumClusterSize", js.undefined)
    
    @scala.inline
    def setStylesVarargs(value: ClusterIconStyle*): Self = this.set("styles", js.Array(value :_*))
    
    @scala.inline
    def setStyles(value: js.Array[ClusterIconStyle]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    
    @scala.inline
    def setTitle(value: java.lang.String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setZoomOnClick(value: Boolean): Self = this.set("zoomOnClick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoomOnClick: Self = this.set("zoomOnClick", js.undefined)
  }
}
