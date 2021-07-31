package typings.googleMarkerclustererplus

import typings.googlemaps.google.maps.LatLng
import typings.googlemaps.google.maps.LatLngBounds
import typings.googlemaps.google.maps.Map
import typings.googlemaps.google.maps.Marker
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  @JSGlobal("Cluster")
  @js.native
  class Cluster protected ()
    extends StObject
       with typings.googleMarkerclustererplus.Cluster {
    /**
      * Creates a single cluster that manages a group of proximate markers.
      * Used internally, do not call this constructor directly.
      * @param mc The <code>MarkerClusterer</code> object with which this
      *       cluster is associated.
      */
    def this(mc: typings.googleMarkerclustererplus.MarkerClusterer) = this()
    
    /**
      * Adds a marker to the cluster.
      *
      * @param marker The marker to be added.
      * @return True if the marker was added.
      * @ignore
      */
    /* CompleteClass */
    override def addMarker(marker: Marker): Boolean = js.native
    
    /**
      * Calculates the extended bounds of the cluster with the grid.
      */
    /* CompleteClass */
    override def calculateBounds_(): Unit = js.native
    
    /**
      * Returns the bounds of the cluster.
      *
      * @return the cluster bounds.
      * @ignore
      */
    /* CompleteClass */
    override def getBounds(): LatLngBounds = js.native
    
    /**
      * Returns the center of the cluster. You can call this from
      * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
      * for the <code>MarkerClusterer</code> object.
      *
      * @return The center of the cluster.
      */
    /* CompleteClass */
    override def getCenter(): LatLng = js.native
    
    /**
      * Returns the map with which the cluster is associated.
      *
      * @return The map.
      * @ignore
      */
    /* CompleteClass */
    override def getMap(): Map[Element] = js.native
    
    /**
      * Returns the <code>MarkerClusterer</code> object with which the cluster is associated.
      *
      * @return The associated marker clusterer.
      * @ignore
      */
    /* CompleteClass */
    override def getMarkerClusterer(): typings.googleMarkerclustererplus.MarkerClusterer = js.native
    
    /**
      * Returns the array of markers managed by the cluster. You can call this from
      * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
      * for the <code>MarkerClusterer</code> object.
      *
      * @return The array of markers in the cluster.
      */
    /* CompleteClass */
    override def getMarkers(): js.Array[Marker] = js.native
    
    /**
      * Returns the number of markers managed by the cluster. You can call this from
      * a <code>click</code>, <code>mouseover</code>, or <code>mouseout</code> event handler
      * for the <code>MarkerClusterer</code> object.
      *
      * @return The number of markers in the cluster.
      */
    /* CompleteClass */
    override def getSize(): Double = js.native
    
    /**
      * Determines if a marker has already been added to the cluster.
      *
      * @param marker The marker to check.
      * @return True if the marker has already been added.
      */
    /* CompleteClass */
    override def isMarkerAlreadyAdded_(marker: Marker): Boolean = js.native
    
    /**
      * Determines if a marker lies within the cluster's bounds.
      *
      * @param marker The marker to check.
      * @return True if the marker lies in the bounds.
      * @ignore
      */
    /* CompleteClass */
    override def isMarkerInClusterBounds(marker: Marker): Boolean = js.native
    
    /**
      * Removes the cluster from the map.
      *
      * @ignore
      */
    /* CompleteClass */
    override def remove(): Unit = js.native
    
    /**
      * Updates the cluster icon.
      */
    /* CompleteClass */
    override def updateIcon_(): Unit = js.native
  }
  
  @JSGlobal("ClusterIcon")
  @js.native
  class ClusterIcon protected ()
    extends StObject
       with typings.googleMarkerclustererplus.ClusterIcon {
    /**
      * A cluster icon.
      *
      * @param cluster The cluster with which the icon is to be associated.
      * @param [styles] An array of {@link ClusterIconStyle} defining the cluster icons
      *       to use for various cluster sizes.
      */
    def this(cluster: typings.googleMarkerclustererplus.Cluster, styles: js.Array[ClusterIconStyle]) = this()
  }
  
  @JSGlobal("MarkerClusterer")
  @js.native
  class MarkerClusterer protected ()
    extends StObject
       with typings.googleMarkerclustererplus.MarkerClusterer {
    /**
      * Creates a MarkerClusterer object with the options specified in {@link MarkerClustererOptions}.
      * @param map The Google map to attach to.
      * @param [markers] The markers to be added to the cluster.
      * @param [options] The optional parameters.
      */
    def this(map: Map[Element]) = this()
    def this(map: Map[Element], markers: js.Array[Marker]) = this()
    def this(map: Map[Element], markers: js.Array[Marker], options: MarkerClustererOptions) = this()
    def this(map: Map[Element], markers: Unit, options: MarkerClustererOptions) = this()
  }
  object MarkerClusterer {
    
    @JSGlobal("MarkerClusterer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of markers to process in one batch.
      *
      */
    /* static member */
    @JSGlobal("MarkerClusterer.BATCH_SIZE")
    @js.native
    def BATCH_SIZE: Double = js.native
    @scala.inline
    def BATCH_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * The number of markers to process in one batch (IE only).
      *
      */
    /* static member */
    @JSGlobal("MarkerClusterer.BATCH_SIZE_IE")
    @js.native
    def BATCH_SIZE_IE: Double = js.native
    @scala.inline
    def BATCH_SIZE_IE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_SIZE_IE")(x.asInstanceOf[js.Any])
    
    /**
      * The default function for determining the label text and style
      * for a cluster icon.
      *
      * @param markers The array of markers represented by the cluster.
      * @param numStyles The number of marker styles available.
      * @return The information resource for the cluster.
      * @ignore
      */
    /* static member */
    @JSGlobal("MarkerClusterer.CALCULATOR")
    @js.native
    def CALCULATOR: Calculator = js.native
    @scala.inline
    def CALCULATOR_=(x: Calculator): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CALCULATOR")(x.asInstanceOf[js.Any])
    
    /**
      * The default extension name for the marker cluster images.
      *
      */
    /* static member */
    @JSGlobal("MarkerClusterer.IMAGE_EXTENSION")
    @js.native
    def IMAGE_EXTENSION: java.lang.String = js.native
    @scala.inline
    def IMAGE_EXTENSION_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_EXTENSION")(x.asInstanceOf[js.Any])
    
    /**
      * The default root name for the marker cluster images.
      *
      */
    /* static member */
    @JSGlobal("MarkerClusterer.IMAGE_PATH")
    @js.native
    def IMAGE_PATH: java.lang.String = js.native
    @scala.inline
    def IMAGE_PATH_=(x: java.lang.String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_PATH")(x.asInstanceOf[js.Any])
    
    /**
      * The default array of sizes for the marker cluster images.
      *
      */
    /* static member */
    @JSGlobal("MarkerClusterer.IMAGE_SIZES")
    @js.native
    def IMAGE_SIZES: js.Array[Double] = js.native
    @scala.inline
    def IMAGE_SIZES_=(x: js.Array[Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_SIZES")(x.asInstanceOf[js.Any])
  }
}
