package typings.forgeViewer.Autodesk.Viewing

import org.scalablytyped.runtime.StringDictionary
import typings.forgeViewer.Autodesk.Viewing.Private.FragmentList
import typings.forgeViewer.Autodesk.Viewing.Private.MaterialManager
import typings.forgeViewer.Autodesk.Viewing.Private.VisibilityManager
import typings.forgeViewer.THREE.Box2
import typings.forgeViewer.THREE.Box3
import typings.forgeViewer.THREE.Camera
import typings.forgeViewer.THREE.Matrix4
import typings.forgeViewer.THREE.Vector3
import typings.forgeViewer.THREE.Vector4
import typings.forgeViewer.anon.AllowList
import typings.forgeViewer.anon.CategoryFilter
import typings.forgeViewer.anon.IgnoreHidden
import typings.forgeViewer.anon.NeedExternalId
import typings.forgeViewer.anon.NeedsExternalId
import typings.forgeViewer.anon.SearchHidden
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
  def getBulkProperties(
    dbIds: js.Array[Double],
    options: Unit,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    options: Unit,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit],
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    options: Unit,
    successCallback: Unit,
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  def getBulkProperties(dbIds: js.Array[Double], options: IgnoreHidden): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    options: IgnoreHidden,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    options: IgnoreHidden,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit],
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  def getBulkProperties(
    dbIds: js.Array[Double],
    options: IgnoreHidden,
    successCallback: Unit,
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  
  def getBulkProperties2(dbIds: js.Array[Double]): Unit = js.native
  def getBulkProperties2(
    dbIds: js.Array[Double],
    options: Unit,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit]
  ): Unit = js.native
  def getBulkProperties2(
    dbIds: js.Array[Double],
    options: Unit,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit],
    errorCallback: js.Function3[/* s */ Any, /* m */ Any, /* d */ Any, Unit]
  ): Unit = js.native
  def getBulkProperties2(
    dbIds: js.Array[Double],
    options: Unit,
    successCallback: Unit,
    errorCallback: js.Function3[/* s */ Any, /* m */ Any, /* d */ Any, Unit]
  ): Unit = js.native
  def getBulkProperties2(dbIds: js.Array[Double], options: CategoryFilter): Unit = js.native
  def getBulkProperties2(
    dbIds: js.Array[Double],
    options: CategoryFilter,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit]
  ): Unit = js.native
  def getBulkProperties2(
    dbIds: js.Array[Double],
    options: CategoryFilter,
    successCallback: js.Function1[/* r */ js.Array[PropertyResult], Unit],
    errorCallback: js.Function3[/* s */ Any, /* m */ Any, /* d */ Any, Unit]
  ): Unit = js.native
  def getBulkProperties2(
    dbIds: js.Array[Double],
    options: CategoryFilter,
    successCallback: Unit,
    errorCallback: js.Function3[/* s */ Any, /* m */ Any, /* d */ Any, Unit]
  ): Unit = js.native
  
  def getData(): Any = js.native
  
  def getDefaultCamera(): Camera = js.native
  
  def getDisplayUnit(): String = js.native
  
  def getDoNotCut(): Boolean = js.native
  
  def getDocumentNode(): BubbleNode = js.native
  
  def getExternalIdMapping(
    onSuccessCallback: js.Function1[/* idMapping */ StringDictionary[Double], Unit],
    onErrorCallback: js.Function0[Unit]
  ): Any = js.native
  
  def getFastLoadList(): Any = js.native
  
  def getFragmentList(): FragmentList = js.native
  
  def getFragmentMap(): Any = js.native
  
  def getFuzzyBox(options: AllowList): Box3 = js.native
  
  def getGeometryList(): Any = js.native
  
  def getGlobalOffset(): Vector3 = js.native
  
  def getInstanceTree(): InstanceTree = js.native
  
  def getInverseModelToViewerTransform(): Matrix4 = js.native
  
  def getInversePlacementWithOffset(): Matrix4 = js.native
  
  def getLayerToNodeIdMapping(
    onSuccessCallback: js.Function1[/* mapping */ StringDictionary[js.Array[Double]], Unit],
    onErrorCallback: js.Function0[Unit]
  ): Unit = js.native
  
  def getLayersRoot(): js.Object = js.native
  
  def getMetadata(itemName: String): Any = js.native
  def getMetadata(itemName: String, subitemName: String): Any = js.native
  def getMetadata(itemName: String, subitemName: String, defaultValue: Any): Any = js.native
  def getMetadata(itemName: String, subitemName: Unit, defaultValue: Any): Any = js.native
  
  def getModelKey(): String = js.native
  
  def getModelToViewerTransform(): Matrix4 = js.native
  
  def getObjectTree(): Unit = js.native
  def getObjectTree(successCallback: js.Function1[/* result */ InstanceTree, Unit]): Unit = js.native
  def getObjectTree(
    successCallback: js.Function1[/* result */ InstanceTree, Unit],
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  def getObjectTree(successCallback: Unit, errorCallback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  def getPageToModelTransform(vpId: Double): Matrix4 = js.native
  
  def getPlacementTransform(): Matrix4 = js.native
  
  def getProperties(dbId: Double): Unit = js.native
  def getProperties(dbId: Double, successCallback: js.Function1[/* r */ PropertyResult, Unit]): Unit = js.native
  def getProperties(
    dbId: Double,
    successCallback: js.Function1[/* r */ PropertyResult, Unit],
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  def getProperties(dbId: Double, successCallback: Unit, errorCallback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  
  def getProperties2(dbIds: js.Array[Double]): Unit = js.native
  def getProperties2(dbIds: js.Array[Double], successCallback: js.Function1[/* r */ PropertyResult, Unit]): Unit = js.native
  def getProperties2(
    dbIds: js.Array[Double],
    successCallback: js.Function1[/* r */ PropertyResult, Unit],
    errorCallback: js.Function1[/* err */ Any, Unit]
  ): Unit = js.native
  def getProperties2(
    dbIds: js.Array[Double],
    successCallback: js.Function1[/* r */ PropertyResult, Unit],
    errorCallback: js.Function1[/* err */ Any, Unit],
    options: NeedExternalId
  ): Unit = js.native
  def getProperties2(
    dbIds: js.Array[Double],
    successCallback: js.Function1[/* r */ PropertyResult, Unit],
    errorCallback: Unit,
    options: NeedExternalId
  ): Unit = js.native
  def getProperties2(dbIds: js.Array[Double], successCallback: Unit, errorCallback: js.Function1[/* err */ Any, Unit]): Unit = js.native
  def getProperties2(
    dbIds: js.Array[Double],
    successCallback: Unit,
    errorCallback: js.Function1[/* err */ Any, Unit],
    options: NeedExternalId
  ): Unit = js.native
  def getProperties2(dbIds: js.Array[Double], successCallback: Unit, errorCallback: Unit, options: NeedExternalId): Unit = js.native
  
  def getPropertyDb(): PropDbLoader = js.native
  
  def getPropertySet(dbIds: js.Array[Double], options: NeedsExternalId): Unit = js.native
  
  def getPropertySetAsync(dbIds: js.Array[Double], options: NeedsExternalId): js.Promise[PropertySet] = js.native
  
  def getRoot(): js.Object = js.native
  
  def getRootId(): Double = js.native
  
  def getTopoIndex(fragId: Double): Double = js.native
  
  def getTopology(index: Double): js.Object = js.native
  
  def getUnitData(unit: String): js.Object = js.native
  
  def getUnitScale(): Double = js.native
  
  def getUnitString(): String = js.native
  
  def getUpVector(): js.Array[Double] = js.native
  
  def getViewportBounds(): Box3 = js.native
  
  def getVisibleBounds(): Box3 = js.native
  def getVisibleBounds(includeGhosted: Boolean): Box3 = js.native
  def getVisibleBounds(includeGhosted: Boolean, excludeShadow: Boolean): Box3 = js.native
  def getVisibleBounds(includeGhosted: Unit, excludeShadow: Boolean): Box3 = js.native
  
  def hasTopology(): Boolean = js.native
  
  var id: Double = js.native
  
  def instancePolyCount(): Double = js.native
  
  def is2d(): Boolean = js.native
  
  def is3d(): Boolean = js.native
  
  def isAEC(): Boolean = js.native
  
  def isConsolidated(): Boolean = js.native
  
  def isLeaflet(): Boolean = js.native
  
  def isLoadDone(): Boolean = js.native
  
  def isOTG(): Boolean = js.native
  
  def isObjectTreeCreated(): Boolean = js.native
  
  def isObjectTreeLoaded(): Boolean = js.native
  
  def isPageCoordinates(): Boolean = js.native
  
  def isPdf(): Boolean = js.native
  def isPdf(onlyPdfSource: Boolean): Boolean = js.native
  
  def isSVF2(): Boolean = js.native
  
  def isSceneBuilder(): Boolean = js.native
  
  def pageToModel(): Unit = js.native
  
  def pointInClip(): Unit = js.native
  
  def remapDbIdFor2D(dbId: Double): Double = js.native
  
  def reverseMapDbId(dbId: Double): Double = js.native
  
  def reverseMapDbIdFor2D(dbId: Double): Double = js.native
  
  def search(
    text: String,
    onSuccessCallback: js.Function1[/* dbIds */ js.Array[Double], Unit],
    onErrorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit]
  ): Unit = js.native
  def search(
    text: String,
    onSuccessCallback: js.Function1[/* dbIds */ js.Array[Double], Unit],
    onErrorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit],
    attributeNames: js.Array[String]
  ): Unit = js.native
  def search(
    text: String,
    onSuccessCallback: js.Function1[/* dbIds */ js.Array[Double], Unit],
    onErrorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit],
    attributeNames: js.Array[String],
    options: SearchHidden
  ): Unit = js.native
  def search(
    text: String,
    onSuccessCallback: js.Function1[/* dbIds */ js.Array[Double], Unit],
    onErrorCallback: js.Function1[/* err */ js.UndefOr[Any], Unit],
    attributeNames: Unit,
    options: SearchHidden
  ): Unit = js.native
  
  def setData(data: js.Object): Unit = js.native
  
  def setDoNotCut(materialsManager: MaterialManager, doNotCut: Boolean): Unit = js.native
  
  def setThemingColor(dbId: Double, color: Vector4): Unit = js.native
  def setThemingColor(dbId: Double, color: Vector4, recursive: Boolean): Unit = js.native
  
  def setUUID(urn: String): Unit = js.native
  
  def setViewportBounds(materialsManager: MaterialManager, bounds: Box2): Unit = js.native
  def setViewportBounds(materialsManager: MaterialManager, bounds: Box3): Unit = js.native
  
  var visibilityManager: VisibilityManager = js.native
}
