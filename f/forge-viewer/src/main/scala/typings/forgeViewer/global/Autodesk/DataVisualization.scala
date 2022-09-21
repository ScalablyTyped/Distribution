package typings.forgeViewer.global.Autodesk

import typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableType
import typings.forgeViewer.Autodesk.Viewing.GuiViewer3D
import typings.forgeViewer.Autodesk.Viewing.Model
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.BufferGeometry
import typings.forgeViewer.THREE.Color
import typings.forgeViewer.THREE.Vector3
import typings.forgeViewer.anon.AtlasHeight
import typings.forgeViewer.anon.Colors
import typings.forgeViewer.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataVisualization {
  
  object Core {
    
    @JSGlobal("Autodesk.DataVisualization.Core.CustomViewable")
    @js.native
    open class CustomViewable protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.CustomViewable {
      def this(
        position: Vector3,
        style: typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableStyle,
        dbId: Double
      ) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.LevelRoomsMap")
    @js.native
    open class LevelRoomsMap ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.LevelRoomsMap {
      
      /* CompleteClass */
      override def addRoomToLevel(levelName: String, room: typings.forgeViewer.Autodesk.DataVisualization.Core.Room): Unit = js.native
      
      /* CompleteClass */
      override def getRoomsOnLevel(levelName: String, onlyRoomsWithDevices: Boolean): js.Array[typings.forgeViewer.Autodesk.DataVisualization.Core.Room] = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.MOUSE_CLICK")
    @js.native
    val MOUSE_CLICK: /* "DATAVIZ_OBJECT_CLICK" */ String = js.native
    
    @JSGlobal("Autodesk.DataVisualization.Core.MOUSE_CLICK_OUT")
    @js.native
    val MOUSE_CLICK_OUT: /* "DATAVIZ_CLICK_OUT" */ String = js.native
    
    @JSGlobal("Autodesk.DataVisualization.Core.MOUSE_HOVERING")
    @js.native
    val MOUSE_HOVERING: /* "DATAVIZ_OBJECT_HOVERING" */ String = js.native
    
    @JSGlobal("Autodesk.DataVisualization.Core.ModelStructureInfo")
    @js.native
    open class ModelStructureInfo protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.ModelStructureInfo {
      def this(model: Model) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.Room")
    @js.native
    open class Room protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.Room {
      def this(id: Double, name: String, bounds: Box3) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.RoomDevice")
    @js.native
    open class RoomDevice ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.RoomDevice {
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var position: Y = js.native
      
      /* CompleteClass */
      var sensorTypes: js.Array[String] = js.native
      
      /* CompleteClass */
      var `type`: String = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.SpriteViewable")
    @js.native
    open class SpriteViewable ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.SpriteViewable
    
    @JSGlobal("Autodesk.DataVisualization.Core.StreamLine")
    @js.native
    open class StreamLine ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLine {
      
      /* CompleteClass */
      override def advance(position: Y): Unit = js.native
      
      /* CompleteClass */
      var geometry: BufferGeometry = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.StreamLineBuilder")
    @js.native
    open class StreamLineBuilder protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLineBuilder {
      def this(viewer: GuiViewer3D) = this()
      
      /* CompleteClass */
      override def createStreamLine(streamLineSpecs: typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLineSpecs): typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLine = js.native
      
      /* CompleteClass */
      override def destroyStreamLine(streamLine: typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLine): Unit = js.native
      
      /* CompleteClass */
      override def dispose(): Unit = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.StreamLineSpecs")
    @js.native
    open class StreamLineSpecs ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.StreamLineSpecs {
      
      /* CompleteClass */
      var lineColor: Color = js.native
      
      /* CompleteClass */
      var lineData: Colors = js.native
      
      /* CompleteClass */
      var lineWidth: Double = js.native
      
      /* CompleteClass */
      var opacity: Double = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.SurfaceShading")
    @js.native
    open class SurfaceShading protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShading {
      def this(
        viewer: GuiViewer3D,
        model: Model,
        shadingData: typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingData
      ) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.SurfaceShadingData")
    @js.native
    open class SurfaceShadingData ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingData
    
    @JSGlobal("Autodesk.DataVisualization.Core.SurfaceShadingGroup")
    @js.native
    open class SurfaceShadingGroup ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingGroup {
      def this(id: String) = this()
      def this(id: String, name: String) = this()
      def this(id: Unit, name: String) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.SurfaceShadingNode")
    @js.native
    open class SurfaceShadingNode protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingNode {
      def this(id: String, dbIds: js.Array[Double]) = this()
      def this(id: String, dbIds: Double) = this()
      def this(
        id: String,
        dbIds: js.Array[Double],
        shadingPoints: js.Array[typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint]
      ) = this()
      def this(
        id: String,
        dbIds: Double,
        shadingPoints: js.Array[typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint]
      ) = this()
      def this(
        id: String,
        dbIds: js.Array[Double],
        shadingPoints: js.Array[typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint],
        name: String
      ) = this()
      def this(id: String, dbIds: js.Array[Double], shadingPoints: Unit, name: String) = this()
      def this(
        id: String,
        dbIds: Double,
        shadingPoints: js.Array[typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint],
        name: String
      ) = this()
      def this(id: String, dbIds: Double, shadingPoints: Unit, name: String) = this()
      
      /* CompleteClass */
      override def addPoint(point: typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint): Unit = js.native
      
      /* CompleteClass */
      var bounds: Box3 = js.native
      
      /* CompleteClass */
      var dbIds: js.Array[Double] = js.native
      
      /* CompleteClass */
      var fragIds: js.Array[Double] = js.native
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var isLeaf: Boolean = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var shadingPoints: js.Array[typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint] = js.native
      
      /* CompleteClass */
      override def update(model: Model): Unit = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.SurfaceShadingPoint")
    @js.native
    open class SurfaceShadingPoint protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.SurfaceShadingPoint {
      def this(id: String, position: Y, types: js.Array[String]) = this()
      def this(id: String, position: Y, types: js.Array[String], name: String) = this()
      def this(id: String, position: Y, types: js.Array[String], name: String, contextData: js.Object) = this()
      def this(id: String, position: Y, types: js.Array[String], name: Unit, contextData: js.Object) = this()
      
      /* CompleteClass */
      var contextData: js.Object = js.native
      
      /* CompleteClass */
      var id: String = js.native
      
      /* CompleteClass */
      var name: String = js.native
      
      /* CompleteClass */
      var position: Y = js.native
      
      /* CompleteClass */
      override def positionFromDBId(model: Model, dbId: Double): Unit = js.native
      
      /* CompleteClass */
      var types: js.Array[String] = js.native
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.ViewableData")
    @js.native
    open class ViewableData ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableData {
      def this(options: AtlasHeight) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.ViewableStyle")
    @js.native
    open class ViewableStyle protected ()
      extends StObject
         with typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableStyle {
      def this(
        `type`: js.UndefOr[ViewableType],
        color: js.UndefOr[Color],
        url: js.UndefOr[String],
        highlightedColor: js.UndefOr[Color],
        highlightedUrl: js.UndefOr[String],
        animatedUrls: js.UndefOr[js.Array[String]]
      ) = this()
    }
    
    @JSGlobal("Autodesk.DataVisualization.Core.ViewableType")
    @js.native
    object ViewableType extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableType & Double] = js.native
      
      /* 2 */ val GEOMETRY: typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableType.GEOMETRY & Double = js.native
      
      /* 1 */ val SPRITE: typings.forgeViewer.Autodesk.DataVisualization.Core.ViewableType.SPRITE & Double = js.native
    }
  }
}
