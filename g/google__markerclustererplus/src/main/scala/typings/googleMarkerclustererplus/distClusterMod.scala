package typings.googleMarkerclustererplus

import typings.googleMarkerclustererplus.anon.IsAdded
import typings.googleMarkerclustererplus.distMarkerclustererMod.MarkerClusterer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distClusterMod {
  
  @JSImport("@google/markerclustererplus/dist/cluster", "Cluster")
  @js.native
  open class Cluster protected () extends StObject {
    /**
      *
      * @param markerClusterer_ The `MarkerClusterer` object with which this
      *  cluster is associated.
      */
    def this(markerClusterer_ : MarkerClusterer) = this()
    
    /**
      * Adds a marker to the cluster.
      *
      * @param marker The marker to be added.
      * @return True if the marker was added.
      * @ignore
      */
    def addMarker(
      marker: (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any) & IsAdded
    ): Boolean = js.native
    
    /* private */ var averageCenter_ : Any = js.native
    
    /* private */ var bounds_ : Any = js.native
    
    /**
      * Calculates the extended bounds of the cluster with the grid.
      */
    /* private */ var calculateBounds_ : Any = js.native
    
    /* private */ var center_ : Any = js.native
    
    /* private */ var clusterIcon_ : Any = js.native
    
    /**
      * Returns the bounds of the cluster.
      *
      * @return the cluster bounds.
      * @ignore
      */
    def getBounds(): Any = js.native
    
    /**
      * Returns the center of the cluster. You can call this from
      * a `click`, `mouseover`, or `mouseout` event handler
      * for the `MarkerClusterer` object.
      *
      * @return The center of the cluster.
      */
    def getCenter(): Any = js.native
    
    /**
      * Returns the map with which the cluster is associated.
      *
      * @return The map.
      * @ignore
      */
    def getMap(): Any = js.native
    
    /**
      * Returns the `MarkerClusterer` object with which the cluster is associated.
      *
      * @return The associated marker clusterer.
      * @ignore
      */
    def getMarkerClusterer(): MarkerClusterer = js.native
    
    /**
      * Returns the array of markers managed by the cluster. You can call this from
      * a `click`, `mouseover`, or `mouseout` event handler for the `MarkerClusterer` object.
      *
      * @return The array of markers in the cluster.
      */
    def getMarkers(): js.Array[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
      ] = js.native
    
    /**
      * Returns the number of markers managed by the cluster. You can call this from
      * a `click`, `mouseover`, or `mouseout` event handler for the `MarkerClusterer` object.
      *
      * @return The number of markers in the cluster.
      */
    def getSize(): Double = js.native
    
    /**
      * Determines if a marker has already been added to the cluster.
      *
      * @param marker The marker to check.
      * @return True if the marker has already been added.
      */
    /* private */ var isMarkerAlreadyAdded_ : Any = js.native
    
    /**
      * Determines if a marker lies within the cluster's bounds.
      *
      * @param marker The marker to check.
      * @return True if the marker lies in the bounds.
      * @ignore
      */
    def isMarkerInClusterBounds(
      marker: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify google.maps.Marker */ Any
    ): Boolean = js.native
    
    /* private */ var map_ : Any = js.native
    
    /* private */ var markerClusterer_ : Any = js.native
    
    /* private */ var markers_ : Any = js.native
    
    /* private */ var minClusterSize_ : Any = js.native
    
    /**
      * Removes the cluster from the map.
      *
      * @ignore
      */
    def remove(): Unit = js.native
    
    /**
      * Updates the cluster icon.
      */
    def updateIcon(): Unit = js.native
  }
}
