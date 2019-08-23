package typings.expo.expoMod

import org.scalablytyped.runtime.StringDictionary
import typings.expo.buildARMod.ARFrame
import typings.expo.buildARMod.ARFrameRequest
import typings.expo.buildARMod.ARMatrices
import typings.expo.buildARMod.ARStartResult
import typings.expo.buildARMod.AnchorsDidUpdateEvent
import typings.expo.buildARMod.CameraDidChangeTrackingStateEvent
import typings.expo.buildARMod.DetectionImage
import typings.expo.buildARMod.DidFailWithErrorEvent
import typings.expo.buildARMod.FrameDidUpdateEvent
import typings.expo.buildARMod.HitTestResults
import typings.expo.buildARMod.Matrix
import typings.expo.buildARMod.ReactNativeNodeHandle
import typings.expo.buildARMod.SessionInterruptionEndedEvent
import typings.expo.buildARMod.SessionWasInterruptedEvent
import typings.expo.buildARMod.Vector2
import typings.expo.buildARMod.VideoFormat
import typings.react.reactMod.Component
import typings.reactDashNative.reactDashNativeMod.EmitterSubscription
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("expo", "AR")
@js.native
object ARNs extends js.Object {
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
  def getPlaneDetection(): typings.expo.buildARMod.PlaneDetection = js.native
  def getProvidesAudioData(): Boolean = js.native
  def getSupportedVideoFormats(configuration: typings.expo.buildARMod.TrackingConfiguration): js.Array[VideoFormat] = js.native
  def getUnavailabilityReason(): String = js.native
  def getVersion(): String = js.native
  def getWorldAlignment(): typings.expo.buildARMod.WorldAlignment = js.native
  def isAvailable(): Boolean = js.native
  def isConfigurationAvailable(configuration: typings.expo.buildARMod.TrackingConfiguration): Boolean = js.native
  def isFrontCameraAvailable(): Boolean = js.native
  def isRearCameraAvailable(): Boolean = js.native
  def onAnchorsDidUpdate(listener: js.Function1[/* event */ AnchorsDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onCameraDidChangeTrackingState(listener: js.Function1[/* event */ CameraDidChangeTrackingStateEvent, Unit]): EmitterSubscription = js.native
  def onDidFailWithError(listener: js.Function1[/* event */ DidFailWithErrorEvent, Unit]): EmitterSubscription = js.native
  def onFrameDidUpdate(listener: js.Function1[/* event */ FrameDidUpdateEvent, Unit]): EmitterSubscription = js.native
  def onSessionInterruptionEnded(listener: js.Function1[/* event */ SessionInterruptionEndedEvent, Unit]): EmitterSubscription = js.native
  def onSessionWasInterrupted(listener: js.Function1[/* event */ SessionWasInterruptedEvent, Unit]): EmitterSubscription = js.native
  def pause(): Unit = js.native
  def performHitTest(point: Vector2, types: typings.expo.buildARMod.HitTestResultTypes): HitTestResults = js.native
  def removeAllListeners(): Unit = js.native
  def removeAllListeners(eventType: typings.expo.buildARMod.EventType): Unit = js.native
  def reset(): Unit = js.native
  def resume(): Unit = js.native
  def setAutoFocusEnabled(isAutoFocusEnabled: Boolean): Unit = js.native
  def setConfigurationAsync(configuration: typings.expo.buildARMod.TrackingConfiguration): js.Promise[Unit] = js.native
  def setDetectionImagesAsync(images: StringDictionary[DetectionImage]): js.Promise[Unit] = js.native
  def setLightEstimationEnabled(isLightEstimationEnabled: Boolean): Unit = js.native
  def setPlaneDetection(planeDetection: typings.expo.buildARMod.PlaneDetection): Unit = js.native
  def setProvidesAudioData(providesAudioData: Boolean): Unit = js.native
  def setWorldAlignment(worldAlignment: typings.expo.buildARMod.WorldAlignment): Unit = js.native
  def setWorldOriginAsync(matrix_float4x4: Matrix): js.Promise[Unit] = js.native
  def startAsync(node: ReactNativeNodeHandle, configuration: typings.expo.buildARMod.TrackingConfiguration): js.Promise[ARStartResult] = js.native
  def startAsync(
    node: Component[js.Object, js.Object, _],
    configuration: typings.expo.buildARMod.TrackingConfiguration
  ): js.Promise[ARStartResult] = js.native
  def stopAsync(): js.Promise[Unit] = js.native
  @js.native
  object AnchorEventType extends js.Object {
    /* "add" */ val Add: typings.expo.buildARMod.AnchorEventType.Add with String = js.native
    /* "remove" */ val Remove: typings.expo.buildARMod.AnchorEventType.Remove with String = js.native
    /* "update" */ val Update: typings.expo.buildARMod.AnchorEventType.Update with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.AnchorEventType with String] = js.native
  }
  
  @js.native
  object AnchorType extends js.Object {
    /* "ARAnchor" */ val Anchor: typings.expo.buildARMod.AnchorType.Anchor with String = js.native
    /* "ARFaceAnchor" */ val Face: typings.expo.buildARMod.AnchorType.Face with String = js.native
    /* "ARImageAnchor" */ val Image: typings.expo.buildARMod.AnchorType.Image with String = js.native
    /* "ARPlaneAnchor" */ val Plane: typings.expo.buildARMod.AnchorType.Plane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.AnchorType with String] = js.native
  }
  
  @js.native
  object BlendShape extends js.Object {
    /* "browDown_L" */ val BrowDownL: typings.expo.buildARMod.BlendShape.BrowDownL with String = js.native
    /* "browDown_R" */ val BrowDownR: typings.expo.buildARMod.BlendShape.BrowDownR with String = js.native
    /* "browInnerUp" */ val BrowInnerUp: typings.expo.buildARMod.BlendShape.BrowInnerUp with String = js.native
    /* "browOuterUp_L" */ val BrowOuterUpL: typings.expo.buildARMod.BlendShape.BrowOuterUpL with String = js.native
    /* "browOuterUp_R" */ val BrowOuterUpR: typings.expo.buildARMod.BlendShape.BrowOuterUpR with String = js.native
    /* "cheekPuff" */ val CheekPuff: typings.expo.buildARMod.BlendShape.CheekPuff with String = js.native
    /* "cheekSquint_L" */ val CheekSquintL: typings.expo.buildARMod.BlendShape.CheekSquintL with String = js.native
    /* "cheekSquint_R" */ val CheekSquintR: typings.expo.buildARMod.BlendShape.CheekSquintR with String = js.native
    /* "eyeBlink_L" */ val EyeBlinkL: typings.expo.buildARMod.BlendShape.EyeBlinkL with String = js.native
    /* "eyeBlink_R" */ val EyeBlinkR: typings.expo.buildARMod.BlendShape.EyeBlinkR with String = js.native
    /* "eyeLookDown_L" */ val EyeLookDownL: typings.expo.buildARMod.BlendShape.EyeLookDownL with String = js.native
    /* "eyeLookDown_R" */ val EyeLookDownR: typings.expo.buildARMod.BlendShape.EyeLookDownR with String = js.native
    /* "eyeLookIn_L" */ val EyeLookInL: typings.expo.buildARMod.BlendShape.EyeLookInL with String = js.native
    /* "eyeLookIn_R" */ val EyeLookInR: typings.expo.buildARMod.BlendShape.EyeLookInR with String = js.native
    /* "eyeLookOut_L" */ val EyeLookOutL: typings.expo.buildARMod.BlendShape.EyeLookOutL with String = js.native
    /* "eyeLookOut_R" */ val EyeLookOutR: typings.expo.buildARMod.BlendShape.EyeLookOutR with String = js.native
    /* "eyeLookUp_L" */ val EyeLookUpL: typings.expo.buildARMod.BlendShape.EyeLookUpL with String = js.native
    /* "eyeLookUp_R" */ val EyeLookUpR: typings.expo.buildARMod.BlendShape.EyeLookUpR with String = js.native
    /* "eyeSquint_L" */ val EyeSquintL: typings.expo.buildARMod.BlendShape.EyeSquintL with String = js.native
    /* "eyeSquint_R" */ val EyeSquintR: typings.expo.buildARMod.BlendShape.EyeSquintR with String = js.native
    /* "eyeWide_L" */ val EyeWideL: typings.expo.buildARMod.BlendShape.EyeWideL with String = js.native
    /* "eyeWide_R" */ val EyeWideR: typings.expo.buildARMod.BlendShape.EyeWideR with String = js.native
    /* "jawForward" */ val JawForward: typings.expo.buildARMod.BlendShape.JawForward with String = js.native
    /* "jawLeft" */ val JawLeft: typings.expo.buildARMod.BlendShape.JawLeft with String = js.native
    /* "jawOpen" */ val JawOpen: typings.expo.buildARMod.BlendShape.JawOpen with String = js.native
    /* "jawRight" */ val JawRight: typings.expo.buildARMod.BlendShape.JawRight with String = js.native
    /* "mouthClose" */ val MouthClose: typings.expo.buildARMod.BlendShape.MouthClose with String = js.native
    /* "mouthDimple_L" */ val MouthDimpleL: typings.expo.buildARMod.BlendShape.MouthDimpleL with String = js.native
    /* "mouthDimple_R" */ val MouthDimpleR: typings.expo.buildARMod.BlendShape.MouthDimpleR with String = js.native
    /* "mouthFrown_L" */ val MouthFrownL: typings.expo.buildARMod.BlendShape.MouthFrownL with String = js.native
    /* "mouthFrown_R" */ val MouthFrownR: typings.expo.buildARMod.BlendShape.MouthFrownR with String = js.native
    /* "mouthFunnel" */ val MouthFunnel: typings.expo.buildARMod.BlendShape.MouthFunnel with String = js.native
    /* "mouthLeft" */ val MouthLeft: typings.expo.buildARMod.BlendShape.MouthLeft with String = js.native
    /* "mouthLowerDown_L" */ val MouthLowerDownL: typings.expo.buildARMod.BlendShape.MouthLowerDownL with String = js.native
    /* "mouthLowerDown_R" */ val MouthLowerDownR: typings.expo.buildARMod.BlendShape.MouthLowerDownR with String = js.native
    /* "mouthPress_L" */ val MouthPressL: typings.expo.buildARMod.BlendShape.MouthPressL with String = js.native
    /* "mouthPress_R" */ val MouthPressR: typings.expo.buildARMod.BlendShape.MouthPressR with String = js.native
    /* "mouthPucker" */ val MouthPucker: typings.expo.buildARMod.BlendShape.MouthPucker with String = js.native
    /* "mouthRight" */ val MouthRight: typings.expo.buildARMod.BlendShape.MouthRight with String = js.native
    /* "mouthRollLower" */ val MouthRollLower: typings.expo.buildARMod.BlendShape.MouthRollLower with String = js.native
    /* "mouthRollUpper" */ val MouthRollUpper: typings.expo.buildARMod.BlendShape.MouthRollUpper with String = js.native
    /* "mouthShrugLower" */ val MouthShrugLower: typings.expo.buildARMod.BlendShape.MouthShrugLower with String = js.native
    /* "mouthShrugUpper" */ val MouthShrugUpper: typings.expo.buildARMod.BlendShape.MouthShrugUpper with String = js.native
    /* "mouthSmile_L" */ val MouthSmileL: typings.expo.buildARMod.BlendShape.MouthSmileL with String = js.native
    /* "mouthSmile_R" */ val MouthSmileR: typings.expo.buildARMod.BlendShape.MouthSmileR with String = js.native
    /* "mouthStretch_L" */ val MouthStretchL: typings.expo.buildARMod.BlendShape.MouthStretchL with String = js.native
    /* "mouthStretch_R" */ val MouthStretchR: typings.expo.buildARMod.BlendShape.MouthStretchR with String = js.native
    /* "mouthUpperUp_L" */ val MouthUpperUpL: typings.expo.buildARMod.BlendShape.MouthUpperUpL with String = js.native
    /* "mouthUpperUp_R" */ val MouthUpperUpR: typings.expo.buildARMod.BlendShape.MouthUpperUpR with String = js.native
    /* "noseSneer_L" */ val NoseSneerL: typings.expo.buildARMod.BlendShape.NoseSneerL with String = js.native
    /* "noseSneer_R" */ val NoseSneerR: typings.expo.buildARMod.BlendShape.NoseSneerR with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.BlendShape with String] = js.native
  }
  
  @js.native
  object DepthDataAccuracy extends js.Object {
    /* "AVDepthDataAccuracyAbsolute" */ val Absolute: typings.expo.buildARMod.DepthDataAccuracy.Absolute with String = js.native
    /* "AVDepthDataAccuracyRelative" */ val Relative: typings.expo.buildARMod.DepthDataAccuracy.Relative with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.DepthDataAccuracy with String] = js.native
  }
  
  @js.native
  object DepthDataQuality extends js.Object {
    /* "AVDepthDataQualityHigh" */ val High: typings.expo.buildARMod.DepthDataQuality.High with String = js.native
    /* "AVDepthDataQualityLow" */ val Low: typings.expo.buildARMod.DepthDataQuality.Low with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.DepthDataQuality with String] = js.native
  }
  
  @js.native
  object EventType extends js.Object {
    /* 2 */ val AnchorsDidUpdate: typings.expo.buildARMod.EventType.AnchorsDidUpdate with Double = js.native
    /* 3 */ val CameraDidChangeTrackingState: typings.expo.buildARMod.EventType.CameraDidChangeTrackingState with Double = js.native
    /* 1 */ val DidFailWithError: typings.expo.buildARMod.EventType.DidFailWithError with Double = js.native
    /* 0 */ val FrameDidUpdate: typings.expo.buildARMod.EventType.FrameDidUpdate with Double = js.native
    /* 5 */ val SessionInterruptionEnded: typings.expo.buildARMod.EventType.SessionInterruptionEnded with Double = js.native
    /* 4 */ val SessionWasInterrupted: typings.expo.buildARMod.EventType.SessionWasInterrupted with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.expo.buildARMod.EventType with Double] = js.native
  }
  
  @js.native
  object FaceAnchorProp extends js.Object {
    /* "blendShapes" */ val BlendShapes: typings.expo.buildARMod.FaceAnchorProp.BlendShapes with String = js.native
    /* "geometry" */ val Geometry: typings.expo.buildARMod.FaceAnchorProp.Geometry with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.FaceAnchorProp with String] = js.native
  }
  
  @js.native
  object FrameAttribute extends js.Object {
    /* "anchors" */ val Anchors: typings.expo.buildARMod.FrameAttribute.Anchors with String = js.native
    /* "capturedDepthData" */ val CapturedDepthData: typings.expo.buildARMod.FrameAttribute.CapturedDepthData with String = js.native
    /* "lightEstimation" */ val LightEstimation: typings.expo.buildARMod.FrameAttribute.LightEstimation with String = js.native
    /* "rawFeaturePoints" */ val RawFeaturePoints: typings.expo.buildARMod.FrameAttribute.RawFeaturePoints with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.FrameAttribute with String] = js.native
  }
  
  @js.native
  object HitTestResultTypes extends js.Object {
    /* "existingPlane" */ val ExistingPlane: typings.expo.buildARMod.HitTestResultTypes.ExistingPlane with String = js.native
    /* "existingPlaneUsingExtent" */ val ExistingPlaneUsingExtent: typings.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingExtent with String = js.native
    /* "existingPlaneUsingGeometry" */ val ExistingPlaneUsingGeometry: typings.expo.buildARMod.HitTestResultTypes.ExistingPlaneUsingGeometry with String = js.native
    /* "featurePoint" */ val FeaturePoint: typings.expo.buildARMod.HitTestResultTypes.FeaturePoint with String = js.native
    /* "horizontalPlane" */ val HorizontalPlane: typings.expo.buildARMod.HitTestResultTypes.HorizontalPlane with String = js.native
    /* "verticalPlane" */ val VerticalPlane: typings.expo.buildARMod.HitTestResultTypes.VerticalPlane with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.HitTestResultTypes with String] = js.native
  }
  
  @js.native
  object PlaneDetection extends js.Object {
    /* "horizontal" */ val Horizontal: typings.expo.buildARMod.PlaneDetection.Horizontal with String = js.native
    /* "none" */ val None: typings.expo.buildARMod.PlaneDetection.None with String = js.native
    /* "vertical" */ val Vertical: typings.expo.buildARMod.PlaneDetection.Vertical with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.PlaneDetection with String] = js.native
  }
  
  @js.native
  object TrackingConfiguration extends js.Object {
    /* "ARFaceTrackingConfiguration" */ val Face: typings.expo.buildARMod.TrackingConfiguration.Face with String = js.native
    /* "AROrientationTrackingConfiguration" */ val Orientation: typings.expo.buildARMod.TrackingConfiguration.Orientation with String = js.native
    /* "ARWorldTrackingConfiguration" */ val World: typings.expo.buildARMod.TrackingConfiguration.World with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.TrackingConfiguration with String] = js.native
  }
  
  @js.native
  object TrackingState extends js.Object {
    /* "ARTrackingStateLimited" */ val Limited: typings.expo.buildARMod.TrackingState.Limited with String = js.native
    /* "ARTrackingStateNormal" */ val Normal: typings.expo.buildARMod.TrackingState.Normal with String = js.native
    /* "ARTrackingStateNotAvailable" */ val NotAvailable: typings.expo.buildARMod.TrackingState.NotAvailable with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.TrackingState with String] = js.native
  }
  
  @js.native
  object TrackingStateReason extends js.Object {
    /* "ARTrackingStateReasonExcessiveMotion" */ val ExcessiveMotion: typings.expo.buildARMod.TrackingStateReason.ExcessiveMotion with String = js.native
    /* "ARTrackingStateReasonInitializing" */ val Initializing: typings.expo.buildARMod.TrackingStateReason.Initializing with String = js.native
    /* "ARTrackingStateReasonInsufficientFeatures" */ val InsufficientFeatures: typings.expo.buildARMod.TrackingStateReason.InsufficientFeatures with String = js.native
    /* "ARTrackingStateReasonNone" */ val None: typings.expo.buildARMod.TrackingStateReason.None with String = js.native
    /* "ARTrackingStateReasonRelocalizing" */ val Relocalizing: typings.expo.buildARMod.TrackingStateReason.Relocalizing with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.TrackingStateReason with String] = js.native
  }
  
  @js.native
  object WorldAlignment extends js.Object {
    /* "alignmentCamera" */ val AlignmentCamera: typings.expo.buildARMod.WorldAlignment.AlignmentCamera with String = js.native
    /* "gravity" */ val Gravity: typings.expo.buildARMod.WorldAlignment.Gravity with String = js.native
    /* "gravityAndHeading" */ val GravityAndHeading: typings.expo.buildARMod.WorldAlignment.GravityAndHeading with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.expo.buildARMod.WorldAlignment with String] = js.native
  }
  
}

