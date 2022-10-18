package typings.googleMarkerclustererplus

import typings.googleMarkerclustererplus.distClusterIconMod.ClusterIconInfo
import typings.googleMarkerclustererplus.distClusterIconMod.ClusterIconStyle
import typings.googleMarkerclustererplus.distClusterMod.Cluster
import typings.googleMarkerclustererplus.distOverlayViewSafeMod.OverlayViewSafe
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMarkerclustererMod {
  
  @JSImport("@google/markerclustererplus/dist/markerclusterer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer")
  @js.native
  open class MarkerClusterer protected () extends OverlayViewSafe {
    /**
      * Creates a MarkerClusterer object with the options specified in {@link MarkerClustererOptions}.
      * @param map The Google map to attach to.
      * @param markers The markers to be added to the cluster.
      * @param options The optional parameters.
      */
    def this(map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any) = this()
    def this(
      map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any,
      markers: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
          ]
    ) = this()
    def this(
      map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any,
      markers: js.Array[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
          ],
      options: MarkerClustererOptions
    ) = this()
    def this(
      map: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Map */ Any,
      markers: Unit,
      options: MarkerClustererOptions
    ) = this()
    
    /* private */ var activeMap_ : Any = js.native
    
    /**
      * Adds a marker to the clusterer. The clusters are redrawn unless
      *  `nodraw` is set to `true`.
      *
      * @param marker The marker to add.
      * @param nodraw Set to `true` to prevent redrawing.
      */
    def addMarker(
      marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    ): Unit = js.native
    def addMarker(
      marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any,
      nodraw: Boolean
    ): Unit = js.native
    
    /**
      * Adds an array of markers to the clusterer. The clusters are redrawn unless
      *  `nodraw` is set to `true`.
      *
      * @param markers The markers to add.
      * @param nodraw Set to `true` to prevent redrawing.
      */
    def addMarkers(
      markers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ]
    ): Unit = js.native
    def addMarkers(
      markers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ],
      nodraw: Boolean
    ): Unit = js.native
    
    /**
      * Adds a marker to a cluster, or creates a new cluster.
      *
      * @param marker The marker to add.
      */
    /* private */ var addToClosestCluster_ : Any = js.native
    
    def ariaLabelFn(text: String): String = js.native
    @JSName("ariaLabelFn")
    var ariaLabelFn_Original: AriaLabelFn = js.native
    
    /* private */ var averageCenter_ : Any = js.native
    
    /* private */ var batchSizeIE_ : Any = js.native
    
    /* private */ var batchSize_ : Any = js.native
    
    /* private */ var calculator_ : Any = js.native
    
    /**
      * Removes all clusters and markers from the map and also removes all markers
      *  managed by the clusterer.
      */
    def clearMarkers(): Unit = js.native
    
    /* private */ var clusterClass_ : Any = js.native
    
    /* private */ var clusters_ : Any = js.native
    
    /**
      * Creates the clusters. This is done in batches to avoid timeout errors
      *  in some browsers when there is a huge number of markers.
      *
      * @param iFirst The index of the first marker in the batch of
      *  markers to be added to clusters.
      */
    /* private */ var createClusters_ : Any = js.native
    
    /**
      * Calculates the distance between two latlng locations in km.
      *
      * @param p1 The first lat lng point.
      * @param p2 The second lat lng point.
      * @return The distance between the two points in km.
      * @link http://www.movable-type.co.uk/scripts/latlong.html
      */
    /* private */ var distanceBetweenPoints_ : Any = js.native
    
    /**
      * Implementation of the draw interface method.
      * @ignore
      */
    def draw(): Unit = js.native
    
    /* private */ var enableRetinaIcons_ : Any = js.native
    
    def fitMapToMarkers(
      padding: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Padding */ Any
    ): Unit = js.native
    /**
      *  Fits the map to the bounds of the markers managed by the clusterer.
      */
    def fitMapToMarkers(padding: Double): Unit = js.native
    
    /**
      * Returns the value of the `averageCenter` property.
      *
      * @return True if averageCenter property is set.
      */
    def getAverageCenter(): Boolean = js.native
    
    /**
      * Returns the value of the `batchSizeIE` property.
      *
      * @return the value of the batchSizeIE property.
      */
    def getBatchSizeIE(): Double = js.native
    
    /**
      * Returns the value of the `calculator` property.
      *
      * @return the value of the calculator property.
      */
    def getCalculator(): Calculator = js.native
    
    /**
      * Returns the value of the `clusterClass` property.
      *
      * @return the value of the clusterClass property.
      */
    def getClusterClass(): String = js.native
    
    /**
      * Returns the current array of clusters formed by the clusterer.
      *
      * @return The array of clusters formed by the clusterer.
      */
    def getClusters(): js.Array[Cluster] = js.native
    
    /**
      * Returns the value of the `enableRetinaIcons` property.
      *
      * @return True if enableRetinaIcons property is set.
      */
    def getEnableRetinaIcons(): Boolean = js.native
    
    /**
      * Returns the current bounds extended by the grid size.
      *
      * @param bounds The bounds to extend.
      * @return The extended bounds.
      * @ignore
      */
    def getExtendedBounds(
      bounds: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.LatLngBounds */ Any
    ): Any = js.native
    
    /**
      * Returns the value of the `gridSize` property.
      *
      * @return The grid size.
      */
    def getGridSize(): Double = js.native
    
    /**
      * Returns the value of the `ignoreHidden` property.
      *
      * @return True if ignoreHidden property is set.
      */
    def getIgnoreHidden(): Boolean = js.native
    
    /**
      * Returns the value of the `imageExtension` property.
      *
      * @return The value of the imageExtension property.
      */
    def getImageExtension(): String = js.native
    
    /**
      * Returns the value of the `imagePath` property.
      *
      * @return The value of the imagePath property.
      */
    def getImagePath(): String = js.native
    
    /**
      * Returns the value of the `imageSizes` property.
      *
      * @return The value of the imageSizes property.
      */
    def getImageSizes(): js.Array[Double] = js.native
    
    /**
      *  Returns the array of markers managed by the clusterer.
      *
      *  @return The array of markers managed by the clusterer.
      */
    def getMarkers(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
      ] = js.native
    
    /**
      *  Returns the value of the `maxZoom` property.
      *
      *  @return The maximum zoom level.
      */
    def getMaxZoom(): Double = js.native
    
    /**
      * Returns the value of the `minimumClusterSize` property.
      *
      * @return The minimum cluster size.
      */
    def getMinimumClusterSize(): Double = js.native
    
    /**
      *  Returns the value of the `styles` property.
      *
      *  @return The array of styles defining the cluster markers to be used.
      */
    def getStyles(): js.Array[ClusterIconStyle] = js.native
    
    /**
      * Returns the value of the `title` property.
      *
      * @return The content of the title text.
      */
    def getTitle(): String = js.native
    
    /**
      * Returns the number of clusters formed by the clusterer.
      *
      * @return The number of clusters formed by the clusterer.
      */
    def getTotalClusters(): Double = js.native
    
    /**
      *  Returns the number of markers managed by the clusterer.
      *
      *  @return The number of markers.
      */
    def getTotalMarkers(): Double = js.native
    
    def getZIndex(): Double = js.native
    
    /**
      * Returns the value of the `zoomOnClick` property.
      *
      * @return True if zoomOnClick property is set.
      */
    def getZoomOnClick(): Boolean = js.native
    
    /* private */ var gridSize_ : Any = js.native
    
    /* private */ var ignoreHidden_ : Any = js.native
    
    /* private */ var imageExtension_ : Any = js.native
    
    /* private */ var imagePath_ : Any = js.native
    
    /* private */ var imageSizes_ : Any = js.native
    
    /**
      * Determines if a marker is contained in a bounds.
      *
      * @param marker The marker to check.
      * @param bounds The bounds to check against.
      * @return True if the marker is in the bounds.
      */
    /* private */ var isMarkerInBounds_ : Any = js.native
    
    /* private */ var listeners_ : Any = js.native
    
    /* private */ var markers_ : Any = js.native
    
    /* private */ var maxZoom_ : Any = js.native
    
    /* private */ var minClusterSize_ : Any = js.native
    
    /**
      * Implementation of the onAdd interface method.
      * @ignore
      */
    def onAdd(): Unit = js.native
    
    /**
      * Implementation of the onRemove interface method.
      * Removes map event listeners and all cluster icons from the DOM.
      * All managed markers are also put back on the map.
      * @ignore
      */
    def onRemove(): Unit = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var prevZoom_ : Any = js.native
    
    /**
      * Pushes a marker to the clusterer.
      *
      * @param marker The marker to add.
      */
    /* private */ var pushMarkerTo_ : Any = js.native
    
    /* private */ var ready_ : Any = js.native
    
    /**
      * Redraws all the clusters.
      */
    /* private */ var redraw_ : Any = js.native
    
    /**
      * Removes a marker from the cluster.  The clusters are redrawn unless
      *  `nodraw` is set to `true`. Returns `true` if the
      *  marker was removed from the clusterer.
      *
      * @param marker The marker to remove.
      * @param nodraw Set to `true` to prevent redrawing.
      * @return True if the marker was removed from the clusterer.
      */
    def removeMarker(
      marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    ): Boolean = js.native
    def removeMarker(
      marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any,
      nodraw: Boolean
    ): Boolean = js.native
    
    /**
      * Removes a marker and returns true if removed, false if not.
      *
      * @param marker The marker to remove
      * @return Whether the marker was removed or not
      */
    /* private */ var removeMarker_ : Any = js.native
    
    /**
      * Removes an array of markers from the cluster. The clusters are redrawn unless
      *  `nodraw` is set to `true`. Returns `true` if markers were removed from the clusterer.
      *
      * @param markers The markers to remove.
      * @param nodraw Set to `true` to prevent redrawing.
      * @return True if markers were removed from the clusterer.
      */
    def removeMarkers(
      markers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ]
    ): Boolean = js.native
    def removeMarkers(
      markers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ],
      nodraw: Boolean
    ): Boolean = js.native
    
    /**
      * Recalculates and redraws all the marker clusters from scratch.
      *  Call this after changing any properties.
      */
    def repaint(): Unit = js.native
    
    /**
      * Removes all clusters from the map. The markers are also removed from the map
      *  if `hide` is set to `true`.
      *
      * @param hide Set to `true` to also remove the markers from the map.
      */
    /* private */ var resetViewport_ : Any = js.native
    
    /**
      *  Sets the value of the `averageCenter` property.
      *
      *  @param averageCenter The value of the averageCenter property.
      */
    def setAverageCenter(averageCenter: Boolean): Unit = js.native
    
    /**
      * Sets the value of the `batchSizeIE` property.
      *
      *  @param batchSizeIE The value of the batchSizeIE property.
      */
    def setBatchSizeIE(batchSizeIE: Double): Unit = js.native
    
    /**
      * Sets the value of the `calculator` property.
      *
      * @param calculator The value of the calculator property.
      */
    def setCalculator(calculator: Calculator): Unit = js.native
    
    /**
      * Sets the value of the `clusterClass` property.
      *
      *  @param clusterClass The value of the clusterClass property.
      */
    def setClusterClass(clusterClass: String): Unit = js.native
    
    /**
      *  Sets the value of the `enableRetinaIcons` property.
      *
      *  @param enableRetinaIcons The value of the enableRetinaIcons property.
      */
    def setEnableRetinaIcons(enableRetinaIcons: Boolean): Unit = js.native
    
    /**
      * Sets the value of the `gridSize` property.
      *
      * @param gridSize The grid size.
      */
    def setGridSize(gridSize: Double): Unit = js.native
    
    /**
      *  Sets the value of the `ignoreHidden` property.
      *
      *  @param ignoreHidden The value of the ignoreHidden property.
      */
    def setIgnoreHidden(ignoreHidden: Boolean): Unit = js.native
    
    /**
      *  Sets the value of the `imageExtension` property.
      *
      *  @param imageExtension The value of the imageExtension property.
      */
    def setImageExtension(imageExtension: String): Unit = js.native
    
    /**
      *  Sets the value of the `imagePath` property.
      *
      *  @param imagePath The value of the imagePath property.
      */
    def setImagePath(imagePath: String): Unit = js.native
    
    /**
      *  Sets the value of the `imageSizes` property.
      *
      *  @param imageSizes The value of the imageSizes property.
      */
    def setImageSizes(imageSizes: js.Array[Double]): Unit = js.native
    
    /**
      *  Sets the value of the `maxZoom` property.
      *
      *  @param maxZoom The maximum zoom level.
      */
    def setMaxZoom(maxZoom: Double): Unit = js.native
    
    /**
      * Sets the value of the `minimumClusterSize` property.
      *
      * @param minimumClusterSize The minimum cluster size.
      */
    def setMinimumClusterSize(minimumClusterSize: Double): Unit = js.native
    
    /**
      *  Sets the value of the `styles` property.
      *
      *  @param styles The array of styles to use.
      */
    def setStyles(styles: js.Array[ClusterIconStyle]): Unit = js.native
    
    /**
      *  Sets the value of the `title` property.
      *
      *  @param title The value of the title property.
      */
    def setTitle(title: String): Unit = js.native
    
    def setZIndex(zIndex: Double): Unit = js.native
    
    /**
      *  Sets the value of the `zoomOnClick` property.
      *
      *  @param zoomOnClick The value of the zoomOnClick property.
      */
    def setZoomOnClick(zoomOnClick: Boolean): Unit = js.native
    
    /**
      * Sets up the styles object.
      */
    /* private */ var setupStyles_ : Any = js.native
    
    /* private */ var styles_ : Any = js.native
    
    /* private */ var timerRefStatic: Any = js.native
    
    /* private */ var title_ : Any = js.native
    
    /* private */ var zIndex_ : Any = js.native
    
    /* private */ var zoomOnClick_ : Any = js.native
  }
  /* static members */
  object MarkerClusterer {
    
    @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of markers to process in one batch.
      */
    @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer.BATCH_SIZE")
    @js.native
    def BATCH_SIZE: Double = js.native
    inline def BATCH_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * The number of markers to process in one batch (IE only).
      */
    @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer.BATCH_SIZE_IE")
    @js.native
    def BATCH_SIZE_IE: Double = js.native
    inline def BATCH_SIZE_IE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_SIZE_IE")(x.asInstanceOf[js.Any])
    
    /**
      * The default function for determining the label text and style
      * for a cluster icon.
      *
      * @param markers The array of markers represented by the cluster.
      * @param numStyles The number of marker styles available.
      * @return The information resource for the cluster.
      */
    inline def CALCULATOR(
      markers: js.Array[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
        ],
      numStyles: Double
    ): ClusterIconInfo = (^.asInstanceOf[js.Dynamic].applyDynamic("CALCULATOR")(markers.asInstanceOf[js.Any], numStyles.asInstanceOf[js.Any])).asInstanceOf[ClusterIconInfo]
    
    /**
      * The default extension name for the marker cluster images.
      */
    @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer.IMAGE_EXTENSION")
    @js.native
    def IMAGE_EXTENSION: String = js.native
    inline def IMAGE_EXTENSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_EXTENSION")(x.asInstanceOf[js.Any])
    
    /**
      * The default root name for the marker cluster images.
      */
    @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer.IMAGE_PATH")
    @js.native
    def IMAGE_PATH: String = js.native
    inline def IMAGE_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_PATH")(x.asInstanceOf[js.Any])
    
    /**
      * The default array of sizes for the marker cluster images.
      */
    @JSImport("@google/markerclustererplus/dist/markerclusterer", "MarkerClusterer.IMAGE_SIZES")
    @js.native
    def IMAGE_SIZES: js.Array[Double] = js.native
    inline def IMAGE_SIZES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_SIZES")(x.asInstanceOf[js.Any])
    
    /**
      * Generates default styles augmented with user passed values.
      * Useful when you want to override some default values but keep untouched
      *
      * @param overrides override default values
      */
    inline def withDefaultStyle(overrides: ClusterIconStyle): ClusterIconStyle = ^.asInstanceOf[js.Dynamic].applyDynamic("withDefaultStyle")(overrides.asInstanceOf[js.Any]).asInstanceOf[ClusterIconStyle]
  }
  
  inline def clusteringbegin(mc: MarkerClusterer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clusteringbegin")(mc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def clusteringend(mc: MarkerClusterer): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clusteringend")(mc.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * @param text The text attribute of the cluster
    */
  type AriaLabelFn = js.Function1[/* text */ String, String]
  
  type Calculator = js.Function2[
    /* markers */ js.Array[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    ], 
    /* clusterIconStylesCount */ Double, 
    ClusterIconInfo
  ]
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker * / any */ trait ClusterAugmentedMarker extends StObject {
    
    var isAdded: js.UndefOr[Boolean] = js.undefined
  }
  object ClusterAugmentedMarker {
    
    inline def apply(): ClusterAugmentedMarker = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ClusterAugmentedMarker]
    }
    
    extension [Self <: ClusterAugmentedMarker](x: Self) {
      
      inline def setIsAdded(value: Boolean): Self = StObject.set(x, "isAdded", value.asInstanceOf[js.Any])
      
      inline def setIsAddedUndefined: Self = StObject.set(x, "isAdded", js.undefined)
    }
  }
  
  trait MarkerClustererOptions extends StObject {
    
    /**
      * A function to take the text attribute associated with the cluster and output a string to attach an
      * ariaLabel to the cluster
      */
    var ariaLabelFn: js.UndefOr[AriaLabelFn] = js.undefined
    
    /***
      * Whether the position of a cluster marker should be
      * the average position of all markers in the cluster. If set to `false`, the
      * cluster marker is positioned at the location of the first marker added to the cluster.
      *
      * @default `false`
      */
    var averageCenter: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Set this property to the number of markers to be processed in a single batch when using
      * a browser other than Internet Explorer (for Internet Explorer, use the batchSizeIE property instead).
      *
      * @default `MarkerClusterer.BATCH_SIZE`
      */
    var batchSize: js.UndefOr[Double] = js.undefined
    
    /**
      * When Internet Explorer is
      * being used, markers are processed in several batches with a small delay inserted between
      * each batch in an attempt to avoid Javascript timeout errors. Set this property to the
      * number of markers to be processed in a single batch; select as high a number as you can
      * without causing a timeout error in the browser. This number might need to be as low as 100
      * if 15,000 markers are being managed, for example.
      *
      * @default `MarkerClusterer.BATCH_SIZE_IE`
      */
    var batchSizeIE: js.UndefOr[Double] = js.undefined
    
    /**
      * The function used to determine
      * the text to be displayed on a cluster marker and the index indicating which style to use
      * for the cluster marker. The input parameters for the function are (1) the array of markers
      * represented by a cluster marker and (2) the number of cluster icon styles. It returns a
      * {@link ClusterIconInfo} object. The default `calculator` returns a
      * `text` property which is the number of markers in the cluster and an
      * `index` property which is one higher than the lowest integer such that
      * `10^i` exceeds the number of markers in the cluster, or the size of the styles
      * array, whichever is less. The `styles` array element used has an index of
      * `index` minus 1. For example, the default `calculator` returns a
      * `text` value of `"125"` and an `index` of `3`
      * for a cluster icon representing 125 markers so the element used in the `styles`
      * array is `2`. A `calculator` may also return a `title`
      * property that contains the text of the tooltip to be used for the cluster marker. If
      * `title` is not defined, the tooltip is set to the value of the `title`
      * property for the MarkerClusterer.
      *
      * @default {@link MarkerClusterer.CALCULATOR}
      */
    var calculator: js.UndefOr[Calculator] = js.undefined
    
    /**
      * The name of the CSS class defining general styles
      * for the cluster markers. Use this class to define CSS styles that are not set up by the code
      * that processes the `styles` array.
      *
      * @default `"cluster"`
      */
    var clusterClass: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to allow the use of cluster icons that
      * have sizes that are some multiple (typically double) of their actual display size. Icons such
      * as these look better when viewed on high-resolution monitors such as Apple's Retina displays.
      * Note: if this property is `true`, sprites cannot be used as cluster icons.
      *
      * @default `false`
      */
    var enableRetinaIcons: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The grid size of a cluster in pixels. The grid is a square.
      *
      * @default `60`
      */
    var gridSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to ignore hidden markers in clusters. You
      * may want to set this to `true` to ensure that hidden markers are not included
      * in the marker count that appears on a cluster marker (this count is the value of the
      * `text` property of the result returned by the default  {@link calculator}).
      * If set to `true` and you change the visibility of a marker being clustered, be
      * sure to also call {@link MarkerClusterer#repaint()}.
      *
      * @default `false`
      */
    var ignoreHidden: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The extension name for the cluster icon image files (e.g., `"png"` or
      * `"jpg"`).
      *
      * @default `MarkerClusterer.IMAGE_EXTENSION`
      */
    var imageExtension: js.UndefOr[String] = js.undefined
    
    /**
      * The full URL of the root name of the group of image files to use for cluster icons.
      * The complete file name is of the form `imagePath`n.`imageExtension`
      * where n is the image file number (1, 2, etc.).
      *
      * @default `MarkerClusterer.IMAGE_PATH`
      */
    var imagePath: js.UndefOr[String] = js.undefined
    
    /**
      * An array of numbers containing the widths of the group of
      * `imagePath`n.`imageExtension` image files.
      * (The images are assumed to be square.)
      *
      * @default `MarkerClusterer.IMAGE_SIZES`
      */
    var imageSizes: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The maximum zoom level at which clustering is enabled or
      * `null` if clustering is to be enabled at all zoom levels.
      *
      * @default `null`
      */
    var maxZoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum number of markers needed in a cluster
      * before the markers are hidden and a cluster marker appears.
      *
      * @default `2`
      */
    var minimumClusterSize: js.UndefOr[Double] = js.undefined
    
    /**
      * An array of {@link ClusterIconStyle} elements defining the styles
      * of the cluster markers to be used. The element to be used to style a given cluster marker
      * is determined by the function defined by the `calculator` property.
      * The default is an array of {@link ClusterIconStyle} elements whose properties are derived
      * from the values for `imagePath`, `imageExtension`, and `imageSizes`.
      *
      * @default `styles`
      */
    var styles: js.UndefOr[js.Array[ClusterIconStyle]] = js.undefined
    
    /**
      * The tooltip to display when the mouse moves over a cluster
      * marker. (Alternatively, you can use a custom `calculator` function to specify a
      * different tooltip for each cluster marker.)
      *
      * @default `""`
      */
    var title: js.UndefOr[String] = js.undefined
    
    /**
      *  the z-index of a cluster.
      *
      *  @default `google.maps.Marker.MAX_ZINDEX + 1`
      */
    var zIndex: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether to zoom the map when a cluster marker is
      * clicked. You may want to set this to `false` if you have installed a handler
      * for the `click` event and it deals with zooming on its own.
      *
      * @default `true`
      */
    var zoomOnClick: js.UndefOr[Boolean] = js.undefined
  }
  object MarkerClustererOptions {
    
    inline def apply(): MarkerClustererOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MarkerClustererOptions]
    }
    
    extension [Self <: MarkerClustererOptions](x: Self) {
      
      inline def setAriaLabelFn(value: /* text */ String => String): Self = StObject.set(x, "ariaLabelFn", js.Any.fromFunction1(value))
      
      inline def setAriaLabelFnUndefined: Self = StObject.set(x, "ariaLabelFn", js.undefined)
      
      inline def setAverageCenter(value: Boolean): Self = StObject.set(x, "averageCenter", value.asInstanceOf[js.Any])
      
      inline def setAverageCenterUndefined: Self = StObject.set(x, "averageCenter", js.undefined)
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeIE(value: Double): Self = StObject.set(x, "batchSizeIE", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeIEUndefined: Self = StObject.set(x, "batchSizeIE", js.undefined)
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setCalculator(
        value: (/* markers */ js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
            ], /* clusterIconStylesCount */ Double) => ClusterIconInfo
      ): Self = StObject.set(x, "calculator", js.Any.fromFunction2(value))
      
      inline def setCalculatorUndefined: Self = StObject.set(x, "calculator", js.undefined)
      
      inline def setClusterClass(value: String): Self = StObject.set(x, "clusterClass", value.asInstanceOf[js.Any])
      
      inline def setClusterClassUndefined: Self = StObject.set(x, "clusterClass", js.undefined)
      
      inline def setEnableRetinaIcons(value: Boolean): Self = StObject.set(x, "enableRetinaIcons", value.asInstanceOf[js.Any])
      
      inline def setEnableRetinaIconsUndefined: Self = StObject.set(x, "enableRetinaIcons", js.undefined)
      
      inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
      
      inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
      
      inline def setIgnoreHidden(value: Boolean): Self = StObject.set(x, "ignoreHidden", value.asInstanceOf[js.Any])
      
      inline def setIgnoreHiddenUndefined: Self = StObject.set(x, "ignoreHidden", js.undefined)
      
      inline def setImageExtension(value: String): Self = StObject.set(x, "imageExtension", value.asInstanceOf[js.Any])
      
      inline def setImageExtensionUndefined: Self = StObject.set(x, "imageExtension", js.undefined)
      
      inline def setImagePath(value: String): Self = StObject.set(x, "imagePath", value.asInstanceOf[js.Any])
      
      inline def setImagePathUndefined: Self = StObject.set(x, "imagePath", js.undefined)
      
      inline def setImageSizes(value: js.Array[Double]): Self = StObject.set(x, "imageSizes", value.asInstanceOf[js.Any])
      
      inline def setImageSizesUndefined: Self = StObject.set(x, "imageSizes", js.undefined)
      
      inline def setImageSizesVarargs(value: Double*): Self = StObject.set(x, "imageSizes", js.Array(value*))
      
      inline def setMaxZoom(value: Double): Self = StObject.set(x, "maxZoom", value.asInstanceOf[js.Any])
      
      inline def setMaxZoomUndefined: Self = StObject.set(x, "maxZoom", js.undefined)
      
      inline def setMinimumClusterSize(value: Double): Self = StObject.set(x, "minimumClusterSize", value.asInstanceOf[js.Any])
      
      inline def setMinimumClusterSizeUndefined: Self = StObject.set(x, "minimumClusterSize", js.undefined)
      
      inline def setStyles(value: js.Array[ClusterIconStyle]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setStylesVarargs(value: ClusterIconStyle*): Self = StObject.set(x, "styles", js.Array(value*))
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
      
      inline def setZoomOnClick(value: Boolean): Self = StObject.set(x, "zoomOnClick", value.asInstanceOf[js.Any])
      
      inline def setZoomOnClickUndefined: Self = StObject.set(x, "zoomOnClick", js.undefined)
    }
  }
}
