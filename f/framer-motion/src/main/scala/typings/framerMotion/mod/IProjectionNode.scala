package typings.framerMotion.mod

import typings.framerMotion.anon.NeedsReset
import typings.std.Map
import typings.std.Set
import typings.std.VoidFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IProjectionNode[I] extends StObject {
  
  def addEventListener(name: LayoutEvents, handler: Any): VoidFunction = js.native
  
  var animationId: Double = js.native
  
  var animationValues: js.UndefOr[ResolvedValues] = js.native
  
  def applyTransform(box: Box): Box = js.native
  def applyTransform(box: Box, transformOnly: Boolean): Box = js.native
  
  def blockUpdate(): Unit = js.native
  
  def calcProjection(): Unit = js.native
  
  def checkUpdateFailed(): Unit = js.native
  
  var children: Set[IProjectionNode[Any]] = js.native
  
  def clearMeasurements(): Unit = js.native
  
  def clearSnapshot(): Unit = js.native
  
  var currentAnimation: js.UndefOr[AnimationPlaybackControls] = js.native
  
  var depth: Double = js.native
  
  def didUpdate(): Unit = js.native
  
  def finishAnimation(): Unit = js.native
  
  def getClosestProjectingParent(): js.UndefOr[IProjectionNode[Any]] = js.native
  
  def getProjectionStyles(): js.UndefOr[MotionStyle] = js.native
  def getProjectionStyles(styles: MotionStyle): js.UndefOr[MotionStyle] = js.native
  
  def getStack(): js.UndefOr[NodeStack] = js.native
  
  def hasListeners(name: LayoutEvents): Boolean = js.native
  
  var hasTreeAnimated: Boolean = js.native
  
  def hide(): Unit = js.native
  
  var id: Double = js.native
  
  var instance: I = js.native
  
  var isAnimationBlocked: js.UndefOr[Boolean] = js.native
  
  var isLayoutDirty: Boolean = js.native
  
  def isLead(): Boolean = js.native
  
  var isPresent: js.UndefOr[Boolean] = js.native
  
  def isProjecting(): Boolean = js.native
  
  var isProjectionDirty: Boolean = js.native
  
  var isSharedProjectionDirty: Boolean = js.native
  
  var isTransformDirty: Boolean = js.native
  
  var isTreeAnimating: js.UndefOr[Boolean] = js.native
  
  def isTreeAnimationBlocked(): Boolean = js.native
  
  def isUpdateBlocked(): Boolean = js.native
  
  var isUpdating: Boolean = js.native
  
  var isVisible: Boolean = js.native
  
  var latestValues: ResolvedValues = js.native
  
  var layout: js.UndefOr[Measurements] = js.native
  
  def measure(): Measurements = js.native
  def measure(removeTransform: Boolean): Measurements = js.native
  
  def measurePageBox(): Box = js.native
  
  def mount(node: I): Unit = js.native
  def mount(node: I, isLayoutDirty: Boolean): Unit = js.native
  
  var needsReset: Boolean = js.native
  
  var nodes: js.UndefOr[FlatTree] = js.native
  
  def notifyListeners(
    name: LayoutEvents,
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type any is not an array type */ args: Any
  ): Unit = js.native
  
  var options: ProjectionNodeOptions = js.native
  
  var parent: js.UndefOr[IProjectionNode[Any]] = js.native
  
  var path: js.Array[IProjectionNode[Any]] = js.native
  
  var preserveOpacity: js.UndefOr[Boolean] = js.native
  
  var prevTransformTemplateValue: js.UndefOr[String] = js.native
  
  var projectionDelta: js.UndefOr[Delta] = js.native
  
  var projectionDeltaWithTransform: js.UndefOr[Delta] = js.native
  
  def promote(): Unit = js.native
  def promote(options: NeedsReset): Unit = js.native
  
  def registerSharedNode(id: String, node: IProjectionNode[Any]): Unit = js.native
  
  var relativeParent: js.UndefOr[IProjectionNode[Any]] = js.native
  
  var relativeTarget: js.UndefOr[Box] = js.native
  
  var relativeTargetOrigin: js.UndefOr[Box] = js.native
  
  def relegate(): Boolean = js.native
  
  def resetRotation(): Unit = js.native
  
  def resetTransform(): Unit = js.native
  
  def resetTree(): Unit = js.native
  
  def resolveTargetDelta(): Unit = js.native
  def resolveTargetDelta(force: Boolean): Unit = js.native
  
  var resolvedRelativeTargetAt: js.UndefOr[Double] = js.native
  
  var resumeFrom: js.UndefOr[IProjectionNode[Any]] = js.native
  
  var resumingFrom: js.UndefOr[IProjectionNode[Any]] = js.native
  
  var root: js.UndefOr[IProjectionNode[Any]] = js.native
  
  def scheduleCheckAfterUnmount(): Unit = js.native
  
  def scheduleRender(): Unit = js.native
  def scheduleRender(notifyAll: Boolean): Unit = js.native
  
  def scheduleUpdateProjection(): Unit = js.native
  
  var scroll: js.UndefOr[ScrollMeasurements] = js.native
  
  def setAnimationOrigin(delta: Delta): Unit = js.native
  
  def setOptions(options: ProjectionNodeOptions): Unit = js.native
  
  def setTargetDelta(delta: Delta): Unit = js.native
  
  var sharedNodes: Map[String, NodeStack] = js.native
  
  var shouldResetTransform: Boolean = js.native
  
  def show(): Unit = js.native
  
  var snapshot: js.UndefOr[Measurements] = js.native
  
  def startAnimation(transition: Transition1): Unit = js.native
  
  def startUpdate(): Unit = js.native
  
  var target: js.UndefOr[Box] = js.native
  
  var targetDelta: js.UndefOr[Delta] = js.native
  
  var targetWithTransforms: js.UndefOr[Box] = js.native
  
  var treeScale: js.UndefOr[Point] = js.native
  
  def unblockUpdate(): Unit = js.native
  
  def unmount(): Unit = js.native
  
  var updateBlockedByResize: Boolean = js.native
  
  def updateLayout(): Unit = js.native
  
  var updateManuallyBlocked: Boolean = js.native
  
  def updateScroll(): Unit = js.native
  def updateScroll(phase: Phase): Unit = js.native
  
  def updateSnapshot(): Unit = js.native
  
  def willUpdate(): Unit = js.native
  def willUpdate(notifyListeners: Boolean): Unit = js.native
}
