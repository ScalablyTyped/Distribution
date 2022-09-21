package typings.forgeViewer.global.Autodesk.Viewing

import typings.forgeViewer.Autodesk.Viewing.Private.GeometryCallback
import typings.forgeViewer.Autodesk.Viewing.Private.MATERIAL_VARIANT
import typings.forgeViewer.Autodesk.Viewing.Private.PreferencesOptions
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.Geometry
import typings.forgeViewer.THREE.Material
import typings.forgeViewer.THREE.Matrix4
import typings.forgeViewer.THREE.ShaderMaterial
import typings.forgeViewer.THREE.Vector
import typings.forgeViewer.THREE.Vector3
import typings.forgeViewer.anon.ButtonText
import typings.forgeViewer.anon.NoMixedArea
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Private {
  
  @JSGlobal("Autodesk.Viewing.Private")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("Autodesk.Viewing.Private.BoundsCallback")
  @js.native
  open class BoundsCallback protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.BoundsCallback {
    def this(bounds: Box3) = this()
    
    /* CompleteClass */
    @JSName("onCircularArc")
    override def onCircularArc_MBoundsCallback(cx: Double, cy: Double, start: Double, end: Double, radius: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    @JSName("onEllipticalArc")
    override def onEllipticalArc_MBoundsCallback(
      cx: Double,
      cy: Double,
      start: Double,
      end: Double,
      major: Double,
      minor: Double,
      tilt: Double,
      vpId: Double
    ): Unit = js.native
    
    /* CompleteClass */
    @JSName("onLineSegment")
    override def onLineSegment_MBoundsCallback(x1: Double, y1: Double, x2: Double, y2: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    @JSName("onOneTriangle")
    override def onOneTriangle_MBoundsCallback(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    @JSName("onTexQuad")
    override def onTexQuad_MBoundsCallback(centerX: Double, centerY: Double, width: Double, height: Double, rotation: Double, vpId: Double): Unit = js.native
    
    /* CompleteClass */
    @JSName("onVertex")
    override def onVertex_MBoundsCallback(cx: Double, cy: Double, vpId: Double): Unit = js.native
  }
  
  object HudMessage {
    
    @JSGlobal("Autodesk.Viewing.Private.HudMessage")
    @js.native
    val ^ : js.Any = js.native
    
    inline def dismiss(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("dismiss")().asInstanceOf[Boolean]
    
    inline def displayMessage(container: Element, messageSpec: ButtonText): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(container: Element, messageSpec: ButtonText, closeCallback: js.Function1[/* event */ Any, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: js.Function1[/* event */ Any, Unit],
      buttonCallback: js.Function1[/* event */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: js.Function1[/* event */ Any, Unit],
      buttonCallback: js.Function1[/* event */ Any, Unit],
      checkboxCallback: js.Function1[/* event */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: js.Function1[/* event */ Any, Unit],
      buttonCallback: Unit,
      checkboxCallback: js.Function1[/* event */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: Unit,
      buttonCallback: js.Function1[/* event */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: Unit,
      buttonCallback: js.Function1[/* event */ Any, Unit],
      checkboxCallback: js.Function1[/* event */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def displayMessage(
      container: Element,
      messageSpec: ButtonText,
      closeCallback: Unit,
      buttonCallback: Unit,
      checkboxCallback: js.Function1[/* event */ Any, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("displayMessage")(container.asInstanceOf[js.Any], messageSpec.asInstanceOf[js.Any], closeCallback.asInstanceOf[js.Any], buttonCallback.asInstanceOf[js.Any], checkboxCallback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSGlobal("Autodesk.Viewing.Private.LightPresets")
  @js.native
  val LightPresets: js.Array[Any] = js.native
  
  @JSGlobal("Autodesk.Viewing.Private.LocalStorage")
  @js.native
  val LocalStorage: typings.forgeViewer.Autodesk.Viewing.Private.LocalStorageClass = js.native
  
  @JSGlobal("Autodesk.Viewing.Private.LocalStorageClass")
  @js.native
  open class LocalStorageClass ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.LocalStorageClass {
    
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /* CompleteClass */
    override def getAllKeys(): js.Array[String] = js.native
    
    /* CompleteClass */
    override def getItem(key: String): String = js.native
    
    /* CompleteClass */
    override def isSupported(): Boolean = js.native
    
    /* CompleteClass */
    override def removeItem(key: String): Unit = js.native
    
    /* CompleteClass */
    override def setItem(key: String, value: String): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.MATERIAL_VARIANT")
  @js.native
  object MATERIAL_VARIANT extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Private.MATERIAL_VARIANT & Double] = js.native
    
    /* 0 */ val INSTANCED: typings.forgeViewer.Autodesk.Viewing.Private.MATERIAL_VARIANT.INSTANCED & Double = js.native
    
    /* 1 */ val VERTEX_IDS: typings.forgeViewer.Autodesk.Viewing.Private.MATERIAL_VARIANT.VERTEX_IDS & Double = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.MaterialManager")
  @js.native
  open class MaterialManager protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.MaterialManager {
    def this(renderer: Any) = this()
    
    /* CompleteClass */
    override def addCompactLayoutSupport(material: Material): Material = js.native
    
    /* CompleteClass */
    override def addHDRMaterial(name: String, mat: ShaderMaterial): Unit = js.native
    
    /* CompleteClass */
    override def addInstancingSupport(material: Material): Material = js.native
    
    /* CompleteClass */
    override def addLineMaterial(name: String, mat: ShaderMaterial, modelId: Double): Unit = js.native
    
    /* CompleteClass */
    override def addMaterial(name: String, mat: Material, skipSimplePhongHeuristics: Boolean): Unit = js.native
    
    /* CompleteClass */
    override def addMaterialNonHDR(name: String, mat: ShaderMaterial): Unit = js.native
    
    /* CompleteClass */
    override def addNonHDRMaterial(name: String, mat: ShaderMaterial): Unit = js.native
    
    /* CompleteClass */
    override def addOverrideMaterial(name: String, mat: Material): Unit = js.native
    
    /* CompleteClass */
    override def cloneMaterial(mat: Material, model: typings.forgeViewer.Autodesk.Viewing.Model): Material = js.native
    
    /* CompleteClass */
    override def getMaterialVariant(
      srcMaterial: Material,
      variant: MATERIAL_VARIANT,
      model: typings.forgeViewer.Autodesk.Viewing.Model
    ): Material = js.native
    
    /* CompleteClass */
    override def getModelMaterials(model: typings.forgeViewer.Autodesk.Viewing.Model, includeOTG: Boolean): Any = js.native
    
    /* CompleteClass */
    override def removeMaterial(name: String): Unit = js.native
    
    /* CompleteClass */
    override def removeNonHDRMaterial(name: String): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.ModelUnits")
  @js.native
  object ModelUnits extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits & String] = js.native
    
    /* "cm" */ val CENTIMETER: typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits.CENTIMETER & String = js.native
    
    /* "ft" */ val FOOT: typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits.FOOT & String = js.native
    
    /* "in" */ val INCH: typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits.INCH & String = js.native
    
    /* "m" */ val METER: typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits.METER & String = js.native
    
    /* "mm" */ val MILLIMETER: typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits.MILLIMETER & String = js.native
    
    /* "pt" */ val POINT: typings.forgeViewer.Autodesk.Viewing.Private.ModelUnits.POINT & String = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Preferences")
  @js.native
  open class Preferences protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.Preferences {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: PreferencesOptions) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Prefs")
  @js.native
  object Prefs extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Private.Prefs & String] = js.native
    
    /* "backgroundColorPreset" */ val BACKGROUND_COLOR_PRESET: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.BACKGROUND_COLOR_PRESET & String = js.native
    
    /* "displayUnits" */ val DISPLAY_UNITS: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.DISPLAY_UNITS & String = js.native
    
    /* "displayUnitsPrecision" */ val DISPLAY_UNITS_PRECISION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.DISPLAY_UNITS_PRECISION & String = js.native
    
    /* "fusionOrbit" */ val FUSION_ORBIT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.FUSION_ORBIT & String = js.native
    
    /* "fusionOrbitConstrained" */ val FUSION_ORBIT_CONSTRAINED: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.FUSION_ORBIT_CONSTRAINED & String = js.native
    
    /* "keyMapCmd" */ val KEY_MAP_CMD: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.KEY_MAP_CMD & String = js.native
    
    /* "leftHandedMouseSetup" */ val LEFT_HANDED_MOUSE_SETUP: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.LEFT_HANDED_MOUSE_SETUP & String = js.native
    
    /* "openPropertiesOnSelect" */ val OPEN_PROPERTIES_ON_SELECT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.OPEN_PROPERTIES_ON_SELECT & String = js.native
    
    /* "pointRendering" */ val POINT_RENDERING: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.POINT_RENDERING & String = js.native
    
    /* "progressiveRendering" */ val PROGRESSIVE_RENDERING: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.PROGRESSIVE_RENDERING & String = js.native
    
    /* "restoreMeasurements" */ val RESTORE_SESSION_MEASUREMENTS: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.RESTORE_SESSION_MEASUREMENTS & String = js.native
    
    /* "reverseMouseZoomDir" */ val REVERSE_MOUSE_ZOOM_DIR: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.REVERSE_MOUSE_ZOOM_DIR & String = js.native
    
    /* "wheelSetsPivot" */ val WHEEL_SETS_PIVOT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.WHEEL_SETS_PIVOT & String = js.native
    
    /* "zoomDragSpeed" */ val ZOOM_DRAG_SPEED: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.ZOOM_DRAG_SPEED & String = js.native
    
    /* "zoomScrollSpeed" */ val ZOOM_SCROLL_SPEED: typings.forgeViewer.Autodesk.Viewing.Private.Prefs.ZOOM_SCROLL_SPEED & String = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Prefs2D")
  @js.native
  object Prefs2D extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D & String] = js.native
    
    /* "disablePdfHighlight" */ val DISABLE_PDF_HIGHLIGHT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D.DISABLE_PDF_HIGHLIGHT & String = js.native
    
    /* "forceLeafletCalibration" */ val FORCE_LEAFLET_CALIBRATION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D.FORCE_LEAFLET_CALIBRATION & String = js.native
    
    /* "forcePDFCalibration" */ val FORCE_PDF_CALIBRATION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D.FORCE_PDF_CALIBRATION & String = js.native
    
    /* "grayscale" */ val GRAYSCALE: typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D.GRAYSCALE & String = js.native
    
    /* "loadingAnimation" */ val LOADING_ANIMATION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D.LOADING_ANIMATION & String = js.native
    
    /* "swapBlackAndWhite" */ val SWAP_BLACK_AND_WHITE: typings.forgeViewer.Autodesk.Viewing.Private.Prefs2D.SWAP_BLACK_AND_WHITE & String = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Prefs3D")
  @js.native
  object Prefs3D extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D & String] = js.native
    
    /* "alwaysUsePivot" */ val ALWAYS_USE_PIVOT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.ALWAYS_USE_PIVOT & String = js.native
    
    /* "ambientShadows" */ val AMBIENT_SHADOWS: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.AMBIENT_SHADOWS & String = js.native
    
    /* "antialiasing" */ val ANTIALIASING: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.ANTIALIASING & String = js.native
    
    /* "bimWalkGravity" */ val BIM_WALK_GRAVITY: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.BIM_WALK_GRAVITY & String = js.native
    
    /* "bimWalkNavigatorType" */ val BIM_WALK_NAVIGATOR_TYPE: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.BIM_WALK_NAVIGATOR_TYPE & String = js.native
    
    /* "bimWalkToolPopup" */ val BIM_WALK_TOOL_POPUP: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.BIM_WALK_TOOL_POPUP & String = js.native
    
    /* "clickToSetCOI" */ val CLICK_TO_SET_COI: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.CLICK_TO_SET_COI & String = js.native
    
    /* "defaultNavigationTool3D" */ val DEFAULT_NAVIGATION_TOOL_3D: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.DEFAULT_NAVIGATION_TOOL_3D & String = js.native
    
    /* "displaySectionHatches" */ val DISPLAY_SECTION_HATCHES: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.DISPLAY_SECTION_HATCHES & String = js.native
    
    /* "edgeRendering" */ val EDGE_RENDERING: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.EDGE_RENDERING & String = js.native
    
    /* "enableCustomOrbitToolCursor" */ val ENABLE_CUSTOM_ORBIT_TOOL_CURSOR: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.ENABLE_CUSTOM_ORBIT_TOOL_CURSOR & String = js.native
    
    /* "envMapBackground" */ val ENV_MAP_BACKGROUND: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.ENV_MAP_BACKGROUND & String = js.native
    
    /* "explodeStrategy" */ val EXPLODE_STRATEGY: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.EXPLODE_STRATEGY & String = js.native
    
    /* "firstPersonToolPopup" */ val FIRST_PERSON_TOOL_POPUP: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.FIRST_PERSON_TOOL_POPUP & String = js.native
    
    /* "forceDoubleSided" */ val FORCE_DOUBLE_SIDED: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.FORCE_DOUBLE_SIDED & String = js.native
    
    /* "ghosting" */ val GHOSTING: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.GHOSTING & String = js.native
    
    /* "groundReflection" */ val GROUND_REFLECTION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.GROUND_REFLECTION & String = js.native
    
    /* "groundShadow" */ val GROUND_SHADOW: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.GROUND_SHADOW & String = js.native
    
    /* "lightPreset" */ val LIGHT_PRESET: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.LIGHT_PRESET & String = js.native
    
    /* "lineRendering" */ val LINE_RENDERING: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.LINE_RENDERING & String = js.native
    
    /* "optimizeNavigation" */ val OPTIMIZE_NAVIGATION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.OPTIMIZE_NAVIGATION & String = js.native
    
    /* "orbitPastWorldPoles" */ val ORBIT_PAST_WORLD_POLES: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.ORBIT_PAST_WORLD_POLES & String = js.native
    
    /* "reverseHorizontalLookDirection" */ val REVERSE_HORIZONTAL_LOOK_DIRECTION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.REVERSE_HORIZONTAL_LOOK_DIRECTION & String = js.native
    
    /* "reverseVerticalLookDirection" */ val REVERSE_VERTICAL_LOOK_DIRECTION: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.REVERSE_VERTICAL_LOOK_DIRECTION & String = js.native
    
    /* "selectionMode" */ val SELECTION_MODE: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.SELECTION_MODE & String = js.native
    
    /* "selectionSetsPivot" */ val SELECTION_SETS_PIVOT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.SELECTION_SETS_PIVOT & String = js.native
    
    /* "viewCube" */ val VIEW_CUBE: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.VIEW_CUBE & String = js.native
    
    /* "viewCubeCompass" */ val VIEW_CUBE_COMPASS: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.VIEW_CUBE_COMPASS & String = js.native
    
    /* "viewType" */ val VIEW_TYPE: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.VIEW_TYPE & String = js.native
    
    /* "zoomTowardsPivot" */ val ZOOM_TOWARDS_PIVOT: typings.forgeViewer.Autodesk.Viewing.Private.Prefs3D.ZOOM_TOWARDS_PIVOT & String = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.ProgressBar")
  @js.native
  open class ProgressBar ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.ProgressBar {
    
    /* CompleteClass */
    var lastValue: Double = js.native
    
    /* CompleteClass */
    override def setPercent(pct: Double): Unit = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.VIEW_TYPES")
  @js.native
  object VIEW_TYPES extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.Viewing.Private.VIEW_TYPES & Double] = js.native
    
    /* 0 */ val DEFAULT: typings.forgeViewer.Autodesk.Viewing.Private.VIEW_TYPES.DEFAULT & Double = js.native
    
    /* 1 */ val ORTHOGRAPHIC: typings.forgeViewer.Autodesk.Viewing.Private.VIEW_TYPES.ORTHOGRAPHIC & Double = js.native
    
    /* 2 */ val PERSPECTIVE: typings.forgeViewer.Autodesk.Viewing.Private.VIEW_TYPES.PERSPECTIVE & Double = js.native
    
    /* 3 */ val PERSPECTIVE_ORTHO_FACES: typings.forgeViewer.Autodesk.Viewing.Private.VIEW_TYPES.PERSPECTIVE_ORTHO_FACES & Double = js.native
  }
  
  @JSGlobal("Autodesk.Viewing.Private.VertexBufferReader")
  @js.native
  open class VertexBufferReader protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.VertexBufferReader {
    def this(geometry: Any) = this()
    def this(geometry: Any, use2dInstancing: Boolean) = this()
    
    /* CompleteClass */
    override def enumGeoms(filter: Any, callback: GeometryCallback): Unit = js.native
    
    /* CompleteClass */
    override def enumGeomsForObject(dbId: Double, callback: GeometryCallback): Unit = js.native
    
    /* CompleteClass */
    override def enumGeomsForVisibleLayer(layerIdsVisible: js.Array[Double], callback: GeometryCallback): Unit = js.native
  }
  
  object VertexEnumerator {
    
    @JSGlobal("Autodesk.Viewing.Private.VertexEnumerator")
    @js.native
    val ^ : js.Any = js.native
    
    inline def enumMeshEdges(
      geometry: Geometry,
      callback: js.Function4[/* p */ Vector3, /* q */ Vector3, /* a */ Double, /* b */ Double, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumMeshEdges")(geometry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def enumMeshIndices(geometry: Geometry, callback: js.Function3[/* a */ Double, /* b */ Double, /* c */ Double, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumMeshIndices")(geometry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def enumMeshLines(
      geometry: Geometry,
      callback: js.Function5[
          /* start */ Vector3, 
          /* end */ Vector3, 
          /* a */ Double, 
          /* b */ Double, 
          /* idx */ Double, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumMeshLines")(geometry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def enumMeshTriangles(
      geometry: Geometry,
      callback: js.Function9[
          /* vA */ Vector3, 
          /* vB */ Vector3, 
          /* vC */ Vector3, 
          /* a */ Double, 
          /* b */ Double, 
          /* c */ Double, 
          /* nA */ Vector3, 
          /* nB */ Vector3, 
          /* nC */ Vector, 
          Unit
        ]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumMeshTriangles")(geometry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def enumMeshVertices(geometry: Geometry, callback: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumMeshVertices")(geometry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def enumMeshVertices(geometry: Geometry, callback: Any, matrix: Matrix4): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("enumMeshVertices")(geometry.asInstanceOf[js.Any], callback.asInstanceOf[js.Any], matrix.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    inline def getVertexCount(geom: Geometry): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getVertexCount")(geom.asInstanceOf[js.Any]).asInstanceOf[Double]
  }
  
  @JSGlobal("Autodesk.Viewing.Private.Viewer3DImpl")
  @js.native
  open class Viewer3DImpl protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.Viewer3DImpl {
    def this(thecanvas: Any, theapi: Any) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.ViewerPreferences")
  @js.native
  open class ViewerPreferences protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.ViewerPreferences {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D, options: PreferencesOptions) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.ViewerState")
  @js.native
  open class ViewerState protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.ViewerState {
    def this(viewer: typings.forgeViewer.Autodesk.Viewing.Viewer3D) = this()
  }
  
  @JSGlobal("Autodesk.Viewing.Private.VisibilityManager")
  @js.native
  open class VisibilityManager protected ()
    extends StObject
       with typings.forgeViewer.Autodesk.Viewing.Private.VisibilityManager {
    def this(viewerImpl: Any, model: Any) = this()
  }
  
  inline def calculatePrecision(value: String): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def calculatePrecision(value: Double): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("calculatePrecision")(value.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def convertUnits(fromUnits: String, toUnits: String, calibrationFactor: Double, d: Double, `type`: String): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("convertUnits")(fromUnits.asInstanceOf[js.Any], toUnits.asInstanceOf[js.Any], calibrationFactor.asInstanceOf[js.Any], d.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("Autodesk.Viewing.Private.env")
  @js.native
  val env: String = js.native
  
  inline def fadeValue(
    startValue: Double,
    endValue: Double,
    duration: Double,
    setParam: js.Function1[/* value */ Double, Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeValue")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], setParam.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def fadeValue(
    startValue: Double,
    endValue: Double,
    duration: Double,
    setParam: js.Function1[/* value */ Double, Unit],
    onFinished: js.Function0[Unit]
  ): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("fadeValue")(startValue.asInstanceOf[js.Any], endValue.asInstanceOf[js.Any], duration.asInstanceOf[js.Any], setParam.asInstanceOf[js.Any], onFinished.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def formatValueWithUnits(value: Double, units: String, `type`: Double, precision: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValueWithUnits")(value.asInstanceOf[js.Any], units.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], precision.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def formatValueWithUnits(value: Double, units: String, `type`: Double, precision: Double, options: NoMixedArea): String = (^.asInstanceOf[js.Dynamic].applyDynamic("formatValueWithUnits")(value.asInstanceOf[js.Any], units.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], precision.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def getAndroidVersion(ua: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getAndroidVersion")(ua.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getHtmlTemplate(url: String, callback: js.Function2[/* error */ String, /* content */ String, Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("getHtmlTemplate")(url.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def getIOSVersion(ua: Any): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getIOSVersion")(ua.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def lerp(x: Double, y: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lerp")(x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @JSGlobal("Autodesk.Viewing.Private.logger")
  @js.native
  val logger: Any = js.native
}
