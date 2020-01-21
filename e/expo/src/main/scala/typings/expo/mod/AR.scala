package typings.expo.mod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.aRMod.ARFrame
import typings.expo.aRMod.ARFrameRequest
import typings.expo.aRMod.ARMatrices
import typings.expo.aRMod.ARStartResult
import typings.expo.aRMod.AnchorsDidUpdateEvent
import typings.expo.aRMod.CameraDidChangeTrackingStateEvent
import typings.expo.aRMod.DetectionImage
import typings.expo.aRMod.DidFailWithErrorEvent
import typings.expo.aRMod.EventType
import typings.expo.aRMod.FrameDidUpdateEvent
import typings.expo.aRMod.HitTestResultTypes
import typings.expo.aRMod.HitTestResults
import typings.expo.aRMod.Matrix
import typings.expo.aRMod.PlaneDetection
import typings.expo.aRMod.ReactNativeNodeHandle
import typings.expo.aRMod.SessionInterruptionEndedEvent
import typings.expo.aRMod.SessionWasInterruptedEvent
import typings.expo.aRMod.TrackingConfiguration
import typings.expo.aRMod.Vector2
import typings.expo.aRMod.VideoFormat
import typings.expo.aRMod.WorldAlignment
import typings.react.mod.Component
import typings.reactNative.mod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AR")
@js.native
object AR extends js.Object {
  val AnchorEventTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnchorEventType */ js.Any = js.native
  val AnchorTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AnchorType */ js.Any = js.native
  val EventTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof EventType */ js.Any = js.native
  val FrameAttributes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof FrameAttribute */ js.Any = js.native
  val PlaneDetectionTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof PlaneDetection */ js.Any = js.native
  val TrackingConfigurations: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingConfiguration */ js.Any = js.native
  val TrackingStateReasons: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingStateReason */ js.Any = js.native
  val TrackingStates: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof TrackingState */ js.Any = js.native
  val WorldAlignmentTypes: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof WorldAlignment */ js.Any = js.native
  def getARMatrices(near: Double, far: Double): ARMatrices = js.native
  def getAutoFocusEnabled(): Boolean = js.native
  def getCameraTexture(): Double = js.native
  def getCurrentFrame(): ARFrame = js.native
  def getCurrentFrame(attributes: ARFrameRequest): ARFrame = js.native
  def getLightEstimationEnabled(): Boolean = js.native
  def getPlaneDetection(): PlaneDetection = js.native
  def getProvidesAudioData(): Boolean = js.native
  def getSupportedVideoFormats(configuration: TrackingConfiguration): js.Array[VideoFormat] = js.native
  def getUnavailabilityReason(): String = js.native
  def getVersion(): String = js.native
  def getWorldAlignment(): WorldAlignment = js.native
  def isAvailable(): Boolean = js.native
  def isConfigurationAvailable(configuration: TrackingConfiguration): Boolean = js.native
  def isFrontCameraAvailable(): Boolean = js.native
  def isRearCameraAvailable(): Boolean = js.native
  def onAnchorsDidUpdate(listener: js.Function1[/* event */ AnchorsDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onCameraDidChangeTrackingState(listener: js.Function1[/* event */ CameraDidChangeTrackingStateEvent, Unit]): EmitterSubscription = js.native
  def onDidFailWithError(listener: js.Function1[/* event */ DidFailWithErrorEvent, Unit]): EmitterSubscription = js.native
  def onFrameDidUpdate(listener: js.Function1[/* event */ FrameDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onSessionInterruptionEnded(listener: js.Function1[/* event */ SessionInterruptionEndedEvent, Unit]): EmitterSubscription = js.native
  def onSessionWasInterrupted(listener: js.Function1[/* event */ SessionWasInterruptedEvent, Unit]): EmitterSubscription = js.native
  def pause(): Unit = js.native
  def performHitTest(point: Vector2, types: HitTestResultTypes): HitTestResults = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: EventType): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def setAutoFocusEnabled(isAutoFocusEnabled: Boolean): Unit = js.native
  def setConfigurationAsync(configuration: TrackingConfiguration): js.Promise[Unit] = js.native
  def setDetectionImagesAsync(images: StringDictionary[DetectionImage]): js.Promise[Unit] = js.native
  def setLightEstimationEnabled(isLightEstimationEnabled: Boolean): Unit = js.native
  def setPlaneDetection(planeDetection: PlaneDetection): Unit = js.native
  def setProvidesAudioData(providesAudioData: Boolean): Unit = js.native
  def setWorldAlignment(worldAlignment: WorldAlignment): Unit = js.native
  def setWorldOriginAsync(matrix_float4x4: Matrix): js.Promise[Unit] = js.native
  def startAsync(node: ReactNativeNodeHandle, configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def startAsync(node: Component[js.Object, js.Object, _], configuration: TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def stopAsync(): js.Promise[Unit] = js.native
  @js.native
  object AnchorEventType extends js.Object {
    /* "add" */ val Add: typings.expo.aRMod.AnchorEventType.Add with String = js.native
    /* "remove" */ val Remove: typings.expo.aRMod.AnchorEventType.Remove with String = js.native
    /* "update" */ val Update: typings.expo.aRMod.AnchorEventType.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.AnchorEventType with String] = js.native
  }
  
  @js.native
  object AnchorType extends js.Object {
    /* "ARAnchor" */ val Anchor: typings.expo.aRMod.AnchorType.Anchor with String = js.native
    /* "ARFaceAnchor" */ val Face: typings.expo.aRMod.AnchorType.Face with String = js.native
    /* "ARImageAnchor" */ val Image: typings.expo.aRMod.AnchorType.Image with String = js.native
    /* "ARPlaneAnchor" */ val Plane: typings.expo.aRMod.AnchorType.Plane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.AnchorType with String] = js.native
  }
  
  @js.native
  object BlendShape extends js.Object {
    /* "browDown_L" */ val BrowDownL: typings.expo.aRMod.BlendShape.BrowDownL with String = js.native
    /* "browDown_R" */ val BrowDownR: typings.expo.aRMod.BlendShape.BrowDownR with String = js.native
    /* "browInnerUp" */ val BrowInnerUp: typings.expo.aRMod.BlendShape.BrowInnerUp with String = js.native
    /* "browOuterUp_L" */ val BrowOuterUpL: typings.expo.aRMod.BlendShape.BrowOuterUpL with String = js.native
    /* "browOuterUp_R" */ val BrowOuterUpR: typings.expo.aRMod.BlendShape.BrowOuterUpR with String = js.native
    /* "cheekPuff" */ val CheekPuff: typings.expo.aRMod.BlendShape.CheekPuff with String = js.native
    /* "cheekSquint_L" */ val CheekSquintL: typings.expo.aRMod.BlendShape.CheekSquintL with String = js.native
    /* "cheekSquint_R" */ val CheekSquintR: typings.expo.aRMod.BlendShape.CheekSquintR with String = js.native
    /* "eyeBlink_L" */ val EyeBlinkL: typings.expo.aRMod.BlendShape.EyeBlinkL with String = js.native
    /* "eyeBlink_R" */ val EyeBlinkR: typings.expo.aRMod.BlendShape.EyeBlinkR with String = js.native
    /* "eyeLookDown_L" */ val EyeLookDownL: typings.expo.aRMod.BlendShape.EyeLookDownL with String = js.native
    /* "eyeLookDown_R" */ val EyeLookDownR: typings.expo.aRMod.BlendShape.EyeLookDownR with String = js.native
    /* "eyeLookIn_L" */ val EyeLookInL: typings.expo.aRMod.BlendShape.EyeLookInL with String = js.native
    /* "eyeLookIn_R" */ val EyeLookInR: typings.expo.aRMod.BlendShape.EyeLookInR with String = js.native
    /* "eyeLookOut_L" */ val EyeLookOutL: typings.expo.aRMod.BlendShape.EyeLookOutL with String = js.native
    /* "eyeLookOut_R" */ val EyeLookOutR: typings.expo.aRMod.BlendShape.EyeLookOutR with String = js.native
    /* "eyeLookUp_L" */ val EyeLookUpL: typings.expo.aRMod.BlendShape.EyeLookUpL with String = js.native
    /* "eyeLookUp_R" */ val EyeLookUpR: typings.expo.aRMod.BlendShape.EyeLookUpR with String = js.native
    /* "eyeSquint_L" */ val EyeSquintL: typings.expo.aRMod.BlendShape.EyeSquintL with String = js.native
    /* "eyeSquint_R" */ val EyeSquintR: typings.expo.aRMod.BlendShape.EyeSquintR with String = js.native
    /* "eyeWide_L" */ val EyeWideL: typings.expo.aRMod.BlendShape.EyeWideL with String = js.native
    /* "eyeWide_R" */ val EyeWideR: typings.expo.aRMod.BlendShape.EyeWideR with String = js.native
    /* "jawForward" */ val JawForward: typings.expo.aRMod.BlendShape.JawForward with String = js.native
    /* "jawLeft" */ val JawLeft: typings.expo.aRMod.BlendShape.JawLeft with String = js.native
    /* "jawOpen" */ val JawOpen: typings.expo.aRMod.BlendShape.JawOpen with String = js.native
    /* "jawRight" */ val JawRight: typings.expo.aRMod.BlendShape.JawRight with String = js.native
    /* "mouthClose" */ val MouthClose: typings.expo.aRMod.BlendShape.MouthClose with String = js.native
    /* "mouthDimple_L" */ val MouthDimpleL: typings.expo.aRMod.BlendShape.MouthDimpleL with String = js.native
    /* "mouthDimple_R" */ val MouthDimpleR: typings.expo.aRMod.BlendShape.MouthDimpleR with String = js.native
    /* "mouthFrown_L" */ val MouthFrownL: typings.expo.aRMod.BlendShape.MouthFrownL with String = js.native
    /* "mouthFrown_R" */ val MouthFrownR: typings.expo.aRMod.BlendShape.MouthFrownR with String = js.native
    /* "mouthFunnel" */ val MouthFunnel: typings.expo.aRMod.BlendShape.MouthFunnel with String = js.native
    /* "mouthLeft" */ val MouthLeft: typings.expo.aRMod.BlendShape.MouthLeft with String = js.native
    /* "mouthLowerDown_L" */ val MouthLowerDownL: typings.expo.aRMod.BlendShape.MouthLowerDownL with String = js.native
    /* "mouthLowerDown_R" */ val MouthLowerDownR: typings.expo.aRMod.BlendShape.MouthLowerDownR with String = js.native
    /* "mouthPress_L" */ val MouthPressL: typings.expo.aRMod.BlendShape.MouthPressL with String = js.native
    /* "mouthPress_R" */ val MouthPressR: typings.expo.aRMod.BlendShape.MouthPressR with String = js.native
    /* "mouthPucker" */ val MouthPucker: typings.expo.aRMod.BlendShape.MouthPucker with String = js.native
    /* "mouthRight" */ val MouthRight: typings.expo.aRMod.BlendShape.MouthRight with String = js.native
    /* "mouthRollLower" */ val MouthRollLower: typings.expo.aRMod.BlendShape.MouthRollLower with String = js.native
    /* "mouthRollUpper" */ val MouthRollUpper: typings.expo.aRMod.BlendShape.MouthRollUpper with String = js.native
    /* "mouthShrugLower" */ val MouthShrugLower: typings.expo.aRMod.BlendShape.MouthShrugLower with String = js.native
    /* "mouthShrugUpper" */ val MouthShrugUpper: typings.expo.aRMod.BlendShape.MouthShrugUpper with String = js.native
    /* "mouthSmile_L" */ val MouthSmileL: typings.expo.aRMod.BlendShape.MouthSmileL with String = js.native
    /* "mouthSmile_R" */ val MouthSmileR: typings.expo.aRMod.BlendShape.MouthSmileR with String = js.native
    /* "mouthStretch_L" */ val MouthStretchL: typings.expo.aRMod.BlendShape.MouthStretchL with String = js.native
    /* "mouthStretch_R" */ val MouthStretchR: typings.expo.aRMod.BlendShape.MouthStretchR with String = js.native
    /* "mouthUpperUp_L" */ val MouthUpperUpL: typings.expo.aRMod.BlendShape.MouthUpperUpL with String = js.native
    /* "mouthUpperUp_R" */ val MouthUpperUpR: typings.expo.aRMod.BlendShape.MouthUpperUpR with String = js.native
    /* "noseSneer_L" */ val NoseSneerL: typings.expo.aRMod.BlendShape.NoseSneerL with String = js.native
    /* "noseSneer_R" */ val NoseSneerR: typings.expo.aRMod.BlendShape.NoseSneerR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.BlendShape with String] = js.native
  }
  
  @js.native
  object DepthDataAccuracy extends js.Object {
    /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typings.expo.aRMod.DepthDataAccuracy.Absolute with String = js.native
    /* "AVDepthDataAccuracyRelative" */ val Relative: typings.expo.aRMod.DepthDataAccuracy.Relative with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.DepthDataAccuracy with String] = js.native
  }
  
  @js.native
  object DepthDataQuality extends js.Object {
    /* "AVDepthDataQualityHigh" */ val High: typings.expo.aRMod.DepthDataQuality.High with String = js.native
    /* "AVDepthDataQualityLow" */ val Low: typings.expo.aRMod.DepthDataQuality.Low with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.DepthDataQuality with String] = js.native
  }
  
  @js.native
  object EventType extends js.Object {
    /* 2 */ val AnchorsDidUpdate: typings.expo.aRMod.EventType.AnchorsDidUpdate with Double = js.native
    /* 3 */ val CameraDidChangeTrackingState: typings.expo.aRMod.EventType.CameraDidChangeTrackingState with Double = js.native
    /* 1 */ val DidFailWithError: typings.expo.aRMod.EventType.DidFailWithError with Double = js.native
    /* 0 */ val FrameDidUpdate: typings.expo.aRMod.EventType.FrameDidUpdate with Double = js.native
    /* 5 */ val SessionInterruptionEnded: typings.expo.aRMod.EventType.SessionInterruptionEnded with Double = js.native
    /* 4 */ val SessionWasInterrupted: typings.expo.aRMod.EventType.SessionWasInterrupted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expo.aRMod.EventType with Double] = js.native
  }
  
  @js.native
  object FaceAnchorProp extends js.Object {
    /* "blendShapes" */ val BlendShapes: typings.expo.aRMod.FaceAnchorProp.BlendShapes with String = js.native
    /* "geometry" */ val Geometry: typings.expo.aRMod.FaceAnchorProp.Geometry with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.FaceAnchorProp with String] = js.native
  }
  
  @js.native
  object FrameAttribute extends js.Object {
    /* "anchors" */ val Anchors: typings.expo.aRMod.FrameAttribute.Anchors with String = js.native
    /* "capturedDepthData" */ val CapturedDepthData: typings.expo.aRMod.FrameAttribute.CapturedDepthData with String = js.native
    /* "lightEstimation" */ val LightEstimation: typings.expo.aRMod.FrameAttribute.LightEstimation with String = js.native
    /* "rawFeaturePoints" */ val RawFeaturePoints: typings.expo.aRMod.FrameAttribute.RawFeaturePoints with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.FrameAttribute with String] = js.native
  }
  
  @js.native
  object HitTestResultTypes extends js.Object {
    /* "existingPlane" */ val ExistingPlane: typings.expo.aRMod.HitTestResultTypes.ExistingPlane with String = js.native
    /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typings.expo.aRMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
    /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typings.expo.aRMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
    /* "featurePoint" */ val FeaturePoint: typings.expo.aRMod.HitTestResultTypes.FeaturePoint with String = js.native
    /* "horizontalPlane" */ val HorizontalPlane: typings.expo.aRMod.HitTestResultTypes.HorizontalPlane with String = js.native
    /* "verticalPlane" */ val VerticalPlane: typings.expo.aRMod.HitTestResultTypes.VerticalPlane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.HitTestResultTypes with String] = js.native
  }
  
  @js.native
  object PlaneDetection extends js.Object {
    /* "horizontal" */ val Horizontal: typings.expo.aRMod.PlaneDetection.Horizontal with String = js.native
    /* "none" */ val None: typings.expo.aRMod.PlaneDetection.None with String = js.native
    /* "vertical" */ val Vertical: typings.expo.aRMod.PlaneDetection.Vertical with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.PlaneDetection with String] = js.native
  }
  
  @js.native
  object TrackingConfiguration extends js.Object {
    /* "ARFaceTrackingConfiguration" */ val Face: typings.expo.aRMod.TrackingConfiguration.Face with String = js.native
    /* "AROrientationTrackingConfiguration" */ val Orientation: typings.expo.aRMod.TrackingConfiguration.Orientation with String = js.native
    /* "ARWorldTrackingConfiguration" */ val World: typings.expo.aRMod.TrackingConfiguration.World with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.TrackingConfiguration with String] = js.native
  }
  
  @js.native
  object TrackingState extends js.Object {
    /* "ARTrackingStateLimited" */ val Limited: typings.expo.aRMod.TrackingState.Limited with String = js.native
    /* "ARTrackingStateNormal" */ val Normal: typings.expo.aRMod.TrackingState.Normal with String = js.native
    /* "ARTrackingStateNotAvailable" */ val NotAvailable: typings.expo.aRMod.TrackingState.NotAvailable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.TrackingState with String] = js.native
  }
  
  @js.native
  object TrackingStateReason extends js.Object {
    /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typings.expo.aRMod.TrackingStateReason.ExcessiveMotion with String = js.native
    /* "ARTrackingStateReasonInitializing" */ val Initializing: typings.expo.aRMod.TrackingStateReason.Initializing with String = js.native
    /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typings.expo.aRMod.TrackingStateReason.InsufficientFeatures with String = js.native
    /* "ARTrackingStateReasonNone" */ val None: typings.expo.aRMod.TrackingStateReason.None with String = js.native
    /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typings.expo.aRMod.TrackingStateReason.Relocalizing with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.TrackingStateReason with String] = js.native
  }
  
  @js.native
  object WorldAlignment extends js.Object {
    /* "alignmentCamera" */ val AlignmentCamera: typings.expo.aRMod.WorldAlignment.AlignmentCamera with String = js.native
    /* "gravity" */ val Gravity: typings.expo.aRMod.WorldAlignment.Gravity with String = js.native
    /* "gravityAndHeading" */ val GravityAndHeading: typings.expo.aRMod.WorldAlignment.GravityAndHeading with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.aRMod.WorldAlignment with String] = js.native
  }
  
}

