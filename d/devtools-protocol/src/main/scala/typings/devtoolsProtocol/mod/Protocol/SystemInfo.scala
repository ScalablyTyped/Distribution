package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SystemInfo {
  
  @js.native
  trait GPUDevice extends StObject {
    
    /**
      * PCI ID of the GPU device, if available; 0 otherwise.
      */
    var deviceId: Double = js.native
    
    /**
      * String description of the GPU device, if the PCI ID is not available.
      */
    var deviceString: String = js.native
    
    /**
      * String description of the GPU driver vendor.
      */
    var driverVendor: String = js.native
    
    /**
      * String description of the GPU driver version.
      */
    var driverVersion: String = js.native
    
    /**
      * Revision of the GPU, only available on Windows.
      */
    var revision: js.UndefOr[Double] = js.native
    
    /**
      * Sub sys ID of the GPU, only available on Windows.
      */
    var subSysId: js.UndefOr[Double] = js.native
    
    /**
      * PCI ID of the GPU vendor, if available; 0 otherwise.
      */
    var vendorId: Double = js.native
    
    /**
      * String description of the GPU vendor, if the PCI ID is not available.
      */
    var vendorString: String = js.native
  }
  object GPUDevice {
    
    @scala.inline
    def apply(
      deviceId: Double,
      deviceString: String,
      driverVendor: String,
      driverVersion: String,
      vendorId: Double,
      vendorString: String
    ): GPUDevice = {
      val __obj = js.Dynamic.literal(deviceId = deviceId.asInstanceOf[js.Any], deviceString = deviceString.asInstanceOf[js.Any], driverVendor = driverVendor.asInstanceOf[js.Any], driverVersion = driverVersion.asInstanceOf[js.Any], vendorId = vendorId.asInstanceOf[js.Any], vendorString = vendorString.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPUDevice]
    }
    
    @scala.inline
    implicit class GPUDeviceMutableBuilder[Self <: GPUDevice] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeviceId(value: Double): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeviceString(value: String): Self = StObject.set(x, "deviceString", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverVendor(value: String): Self = StObject.set(x, "driverVendor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      @scala.inline
      def setSubSysId(value: Double): Self = StObject.set(x, "subSysId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubSysIdUndefined: Self = StObject.set(x, "subSysId", js.undefined)
      
      @scala.inline
      def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVendorString(value: String): Self = StObject.set(x, "vendorString", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GPUInfo extends StObject {
    
    /**
      * An optional dictionary of additional GPU related attributes.
      */
    var auxAttributes: js.UndefOr[js.Any] = js.native
    
    /**
      * The graphics devices on the system. Element 0 is the primary GPU.
      */
    var devices: js.Array[GPUDevice] = js.native
    
    /**
      * An optional array of GPU driver bug workarounds.
      */
    var driverBugWorkarounds: js.Array[String] = js.native
    
    /**
      * An optional dictionary of graphics features and their status.
      */
    var featureStatus: js.UndefOr[js.Any] = js.native
    
    /**
      * Supported accelerated image decoding capabilities.
      */
    var imageDecoding: js.Array[ImageDecodeAcceleratorCapability] = js.native
    
    /**
      * Supported accelerated video decoding capabilities.
      */
    var videoDecoding: js.Array[VideoDecodeAcceleratorCapability] = js.native
    
    /**
      * Supported accelerated video encoding capabilities.
      */
    var videoEncoding: js.Array[VideoEncodeAcceleratorCapability] = js.native
  }
  object GPUInfo {
    
    @scala.inline
    def apply(
      devices: js.Array[GPUDevice],
      driverBugWorkarounds: js.Array[String],
      imageDecoding: js.Array[ImageDecodeAcceleratorCapability],
      videoDecoding: js.Array[VideoDecodeAcceleratorCapability],
      videoEncoding: js.Array[VideoEncodeAcceleratorCapability]
    ): GPUInfo = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], driverBugWorkarounds = driverBugWorkarounds.asInstanceOf[js.Any], imageDecoding = imageDecoding.asInstanceOf[js.Any], videoDecoding = videoDecoding.asInstanceOf[js.Any], videoEncoding = videoEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPUInfo]
    }
    
    @scala.inline
    implicit class GPUInfoMutableBuilder[Self <: GPUInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuxAttributes(value: js.Any): Self = StObject.set(x, "auxAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuxAttributesUndefined: Self = StObject.set(x, "auxAttributes", js.undefined)
      
      @scala.inline
      def setDevices(value: js.Array[GPUDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDevicesVarargs(value: GPUDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
      
      @scala.inline
      def setDriverBugWorkarounds(value: js.Array[String]): Self = StObject.set(x, "driverBugWorkarounds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDriverBugWorkaroundsVarargs(value: String*): Self = StObject.set(x, "driverBugWorkarounds", js.Array(value :_*))
      
      @scala.inline
      def setFeatureStatus(value: js.Any): Self = StObject.set(x, "featureStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFeatureStatusUndefined: Self = StObject.set(x, "featureStatus", js.undefined)
      
      @scala.inline
      def setImageDecoding(value: js.Array[ImageDecodeAcceleratorCapability]): Self = StObject.set(x, "imageDecoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImageDecodingVarargs(value: ImageDecodeAcceleratorCapability*): Self = StObject.set(x, "imageDecoding", js.Array(value :_*))
      
      @scala.inline
      def setVideoDecoding(value: js.Array[VideoDecodeAcceleratorCapability]): Self = StObject.set(x, "videoDecoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoDecodingVarargs(value: VideoDecodeAcceleratorCapability*): Self = StObject.set(x, "videoDecoding", js.Array(value :_*))
      
      @scala.inline
      def setVideoEncoding(value: js.Array[VideoEncodeAcceleratorCapability]): Self = StObject.set(x, "videoEncoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVideoEncodingVarargs(value: VideoEncodeAcceleratorCapability*): Self = StObject.set(x, "videoEncoding", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetInfoResponse extends StObject {
    
    /**
      * The command line string used to launch the browser. Will be the empty string if not
      * supported.
      */
    var commandLine: String = js.native
    
    /**
      * Information about the GPUs on the system.
      */
    var gpu: GPUInfo = js.native
    
    /**
      * A platform-dependent description of the model of the machine. On Mac OS, this is, for
      * example, 'MacBookPro'. Will be the empty string if not supported.
      */
    var modelName: String = js.native
    
    /**
      * A platform-dependent description of the version of the machine. On Mac OS, this is, for
      * example, '10.1'. Will be the empty string if not supported.
      */
    var modelVersion: String = js.native
  }
  object GetInfoResponse {
    
    @scala.inline
    def apply(commandLine: String, gpu: GPUInfo, modelName: String, modelVersion: String): GetInfoResponse = {
      val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelVersion = modelVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfoResponse]
    }
    
    @scala.inline
    implicit class GetInfoResponseMutableBuilder[Self <: GetInfoResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGpu(value: GPUInfo): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetProcessInfoResponse extends StObject {
    
    /**
      * An array of process info blocks.
      */
    var processInfo: js.Array[ProcessInfo] = js.native
  }
  object GetProcessInfoResponse {
    
    @scala.inline
    def apply(processInfo: js.Array[ProcessInfo]): GetProcessInfoResponse = {
      val __obj = js.Dynamic.literal(processInfo = processInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProcessInfoResponse]
    }
    
    @scala.inline
    implicit class GetProcessInfoResponseMutableBuilder[Self <: GetProcessInfoResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setProcessInfo(value: js.Array[ProcessInfo]): Self = StObject.set(x, "processInfo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcessInfoVarargs(value: ProcessInfo*): Self = StObject.set(x, "processInfo", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ImageDecodeAcceleratorCapability extends StObject {
    
    /**
      * Image coded, e.g. Jpeg.
      */
    var imageType: ImageType = js.native
    
    /**
      * Maximum supported dimensions of the image in pixels.
      */
    var maxDimensions: Size = js.native
    
    /**
      * Minimum supported dimensions of the image in pixels.
      */
    var minDimensions: Size = js.native
    
    /**
      * Optional array of supported subsampling formats, e.g. 4:2:0, if known.
      */
    var subsamplings: js.Array[SubsamplingFormat] = js.native
  }
  object ImageDecodeAcceleratorCapability {
    
    @scala.inline
    def apply(
      imageType: ImageType,
      maxDimensions: Size,
      minDimensions: Size,
      subsamplings: js.Array[SubsamplingFormat]
    ): ImageDecodeAcceleratorCapability = {
      val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], maxDimensions = maxDimensions.asInstanceOf[js.Any], minDimensions = minDimensions.asInstanceOf[js.Any], subsamplings = subsamplings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDecodeAcceleratorCapability]
    }
    
    @scala.inline
    implicit class ImageDecodeAcceleratorCapabilityMutableBuilder[Self <: ImageDecodeAcceleratorCapability] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setImageType(value: ImageType): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxDimensions(value: Size): Self = StObject.set(x, "maxDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinDimensions(value: Size): Self = StObject.set(x, "minDimensions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubsamplings(value: js.Array[SubsamplingFormat]): Self = StObject.set(x, "subsamplings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubsamplingsVarargs(value: SubsamplingFormat*): Self = StObject.set(x, "subsamplings", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
    - typings.devtoolsProtocol.devtoolsProtocolStrings.webp
    - typings.devtoolsProtocol.devtoolsProtocolStrings.unknown
  */
  trait ImageType extends StObject
  object ImageType {
    
    @scala.inline
    def jpeg: typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg = "jpeg".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg]
    
    @scala.inline
    def unknown: typings.devtoolsProtocol.devtoolsProtocolStrings.unknown = "unknown".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.unknown]
    
    @scala.inline
    def webp: typings.devtoolsProtocol.devtoolsProtocolStrings.webp = "webp".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.webp]
  }
  
  @js.native
  trait ProcessInfo extends StObject {
    
    /**
      * Specifies cumulative CPU usage in seconds across all threads of the
      * process since the process start.
      */
    var cpuTime: Double = js.native
    
    /**
      * Specifies process id.
      */
    var id: integer = js.native
    
    /**
      * Specifies process type.
      */
    var `type`: String = js.native
  }
  object ProcessInfo {
    
    @scala.inline
    def apply(cpuTime: Double, id: integer, `type`: String): ProcessInfo = {
      val __obj = js.Dynamic.literal(cpuTime = cpuTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessInfo]
    }
    
    @scala.inline
    implicit class ProcessInfoMutableBuilder[Self <: ProcessInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCpuTime(value: Double): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Size extends StObject {
    
    /**
      * Height in pixels.
      */
    var height: integer = js.native
    
    /**
      * Width in pixels.
      */
    var width: integer = js.native
  }
  object Size {
    
    @scala.inline
    def apply(height: integer, width: integer): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    @scala.inline
    implicit class SizeMutableBuilder[Self <: Size] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.yuv420
    - typings.devtoolsProtocol.devtoolsProtocolStrings.yuv422
    - typings.devtoolsProtocol.devtoolsProtocolStrings.yuv444
  */
  trait SubsamplingFormat extends StObject
  object SubsamplingFormat {
    
    @scala.inline
    def yuv420: typings.devtoolsProtocol.devtoolsProtocolStrings.yuv420 = "yuv420".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.yuv420]
    
    @scala.inline
    def yuv422: typings.devtoolsProtocol.devtoolsProtocolStrings.yuv422 = "yuv422".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.yuv422]
    
    @scala.inline
    def yuv444: typings.devtoolsProtocol.devtoolsProtocolStrings.yuv444 = "yuv444".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.yuv444]
  }
  
  @js.native
  trait VideoDecodeAcceleratorCapability extends StObject {
    
    /**
      * Maximum video dimensions in pixels supported for this |profile|.
      */
    var maxResolution: Size = js.native
    
    /**
      * Minimum video dimensions in pixels supported for this |profile|.
      */
    var minResolution: Size = js.native
    
    /**
      * Video codec profile that is supported, e.g. VP9 Profile 2.
      */
    var profile: String = js.native
  }
  object VideoDecodeAcceleratorCapability {
    
    @scala.inline
    def apply(maxResolution: Size, minResolution: Size, profile: String): VideoDecodeAcceleratorCapability = {
      val __obj = js.Dynamic.literal(maxResolution = maxResolution.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoDecodeAcceleratorCapability]
    }
    
    @scala.inline
    implicit class VideoDecodeAcceleratorCapabilityMutableBuilder[Self <: VideoDecodeAcceleratorCapability] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxResolution(value: Size): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinResolution(value: Size): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait VideoEncodeAcceleratorCapability extends StObject {
    
    var maxFramerateDenominator: integer = js.native
    
    /**
      * Maximum encoding framerate in frames per second supported for this
      * |profile|, as fraction's numerator and denominator, e.g. 24/1 fps,
      * 24000/1001 fps, etc.
      */
    var maxFramerateNumerator: integer = js.native
    
    /**
      * Maximum video dimensions in pixels supported for this |profile|.
      */
    var maxResolution: Size = js.native
    
    /**
      * Video codec profile that is supported, e.g H264 Main.
      */
    var profile: String = js.native
  }
  object VideoEncodeAcceleratorCapability {
    
    @scala.inline
    def apply(
      maxFramerateDenominator: integer,
      maxFramerateNumerator: integer,
      maxResolution: Size,
      profile: String
    ): VideoEncodeAcceleratorCapability = {
      val __obj = js.Dynamic.literal(maxFramerateDenominator = maxFramerateDenominator.asInstanceOf[js.Any], maxFramerateNumerator = maxFramerateNumerator.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoEncodeAcceleratorCapability]
    }
    
    @scala.inline
    implicit class VideoEncodeAcceleratorCapabilityMutableBuilder[Self <: VideoEncodeAcceleratorCapability] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxFramerateDenominator(value: integer): Self = StObject.set(x, "maxFramerateDenominator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxFramerateNumerator(value: integer): Self = StObject.set(x, "maxFramerateNumerator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxResolution(value: Size): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
}
