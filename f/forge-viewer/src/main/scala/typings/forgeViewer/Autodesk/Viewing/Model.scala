package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import typings.forgeViewer.Autodesk.Viewing.Private.VisibilityManager
import typings.forgeViewer.anon.AllowList
import typings.three.mod.Box3
import typings.three.mod.Camera
import typings.three.mod.Matrix4
import typings.three.mod.Vector3
import typings.three.mod.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Model extends StObject {
  
  def clearThemingColors(): Unit = js.native
  
  def fetchTopology(maxSizeMB: Double): js.Promise[js.Object] = js.native
  
  def geomPolyCount(): Double = js.native
  
  def getBoundingBox(): Box3 = js.native
  
  def getBulkProperties(dbIds: js.Array[Double]): Unit = js.native
  def getBulkProperties(dbIds: js.Array[Double], propFilter: js.Array[String]): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    propFilter: js.Array[String],
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    propFilter: js.Array[String],
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit],
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    propFilter: js.Array[String],
    successCallback: Unit,
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    propFilter: Unit,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    propFilter: Unit,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit],
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    propFilter: Unit,
    successCallback: Unit,
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  
  def getData(): js.Any = js.native
  
  def getDefaultCamera(): Camera = js.native
  
  def getDisplayUnit(): String = js.native
  
  def getDocumentNode(): js.Any = js.native
  
  def getExternalIdMapping(
    onSuccessCallback: js.Function1[/* idMapping */ StringDictionary[Double], Unit],
    onErrorCallback: js.Function0[Unit]
  ): js.Any = js.native
  
  def getFastLoadList(): js.Any = js.native
  
  def getFragmentList(): js.Any = js.native
  
  def getFragmentMap(): js.Any = js.native
  
  def getFuzzyBox(options: AllowList): Box3 = js.native
  
  def getGeometryList(): js.Any = js.native
  
  def getGlobalOffset(): Vector3 = js.native
  
  def getInstanceTree(): InstanceTree = js.native
  
  def getLayerToNodeIdMapping(
    onSuccessCallback: js.Function1[/* mapping */ StringDictionary[js.Array[Double]], Unit],
    onErrorCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def getLayersRoot(): js.Object = js.native
  
  def getMetadata(itemName: String): js.Any = js.native
  def getMetadata(itemName: String, subitemName: String): js.Any = js.native
  def getMetadata(itemName: String, subitemName: String, defaultValue: js.Any): js.Any = js.native
  def getMetadata(itemName: String, subitemName: Unit, defaultValue: js.Any): js.Any = js.native
  
  def getModelToViewerTransform(): Matrix4 = js.native
  
  def getObjectTree(): Unit = js.native
  def getObjectTree(successCallback: js.Function1[/* result */ InstanceTree, Unit]): Unit = js.native
  def getObjectTree(
    successCallback: js.Function1[/* result */ InstanceTree, Unit],
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def getObjectTree(successCallback: Unit, errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def getPageToModelTransform(vpId: Double): Matrix4 = js.native
  
  def getPlacementTransform(): Matrix4 = js.native
  
  def getProperties(dbId: Double): Unit = js.native
  def getProperties(dbId: Double, successCallback: js.Function1[/* r */ PropertyResult, Unit]): Unit = js.native
  def getProperties(
    dbId: Double,
    successCallback: js.Function1[/* r */ PropertyResult, Unit],
    errorCallback: js.Function1[/* err */ js.Any, Unit]
  ): Unit = js.native
  def getProperties(dbId: Double, successCallback: Unit, errorCallback: js.Function1[/* err */ js.Any, Unit]): Unit = js.native
  
  def getRoot(): js.Object = js.native
  
  def getRootId(): Double = js.native
  
  def getTopoIndex(fragId: Double): Double = js.native
  
  def getTopology(index: Double): js.Object = js.native
  
  def getUnitData(unit: String): js.Object = js.native
  
  def getUnitScale(): Double = js.native
  
  def getUnitString(): String = js.native
  
  def getUpVector(): js.Array[Double] = js.native
  
  def hasTopology(): Boolean = js.native
  
  var id: Double = js.native
  
  def instancePolyCount(): Double = js.native
  
  def is2d(): Boolean = js.native
  
  def is3d(): Boolean = js.native
  
  def isAEC(): Boolean = js.native
  
  def isLoadDone(): Boolean = js.native
  
  def isObjectTreeCreated(): Boolean = js.native
  
  def isObjectTreeLoaded(): Boolean = js.native
  
  def pageToModel(): Unit = js.native
  
  def pointInClip(): Unit = js.native
  
  def search(text: String, onSuccessCallback: js.Function0[Unit], onErrorCallback: js.Function0[Unit]): Unit = js.native
  def search(
    text: String,
    onSuccessCallback: js.Function0[Unit],
    onErrorCallback: js.Function0[Unit],
    attributeNames: js.Array[String]
  ): Unit = js.native
  
  def setData(data: js.Object): Unit = js.native
  
  def setThemingColor(dbId: Double, color: Vector4): Unit = js.native
  def setThemingColor(dbId: Double, color: Vector4, recursive: Boolean): Unit = js.native
  
  def setUUID(urn: String): Unit = js.native
  
  var visibilityManager: VisibilityManager = js.native
}
