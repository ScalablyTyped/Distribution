package typings.googleMarkerclustererplus

import typings.googleMarkerclustererplus.distClusterIconMod.ClusterIconInfo
import typings.googleMarkerclustererplus.distClusterIconMod.ClusterIconStyle
import typings.googleMarkerclustererplus.distMarkerclustererMod.MarkerClusterer
import typings.googleMarkerclustererplus.distMarkerclustererMod.MarkerClustererOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@google/markerclustererplus", JSImport.Default)
  @js.native
  open class default protected () extends MarkerClusterer {
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
  }
  /* static members */
  object default {
    
    @JSImport("@google/markerclustererplus", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * The number of markers to process in one batch.
      */
    @JSImport("@google/markerclustererplus", "default.BATCH_SIZE")
    @js.native
    def BATCH_SIZE: Double = js.native
    inline def BATCH_SIZE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("BATCH_SIZE")(x.asInstanceOf[js.Any])
    
    /**
      * The number of markers to process in one batch (IE only).
      */
    @JSImport("@google/markerclustererplus", "default.BATCH_SIZE_IE")
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
    @JSImport("@google/markerclustererplus", "default.IMAGE_EXTENSION")
    @js.native
    def IMAGE_EXTENSION: String = js.native
    inline def IMAGE_EXTENSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_EXTENSION")(x.asInstanceOf[js.Any])
    
    /**
      * The default root name for the marker cluster images.
      */
    @JSImport("@google/markerclustererplus", "default.IMAGE_PATH")
    @js.native
    def IMAGE_PATH: String = js.native
    inline def IMAGE_PATH_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("IMAGE_PATH")(x.asInstanceOf[js.Any])
    
    /**
      * The default array of sizes for the marker cluster images.
      */
    @JSImport("@google/markerclustererplus", "default.IMAGE_SIZES")
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
}
