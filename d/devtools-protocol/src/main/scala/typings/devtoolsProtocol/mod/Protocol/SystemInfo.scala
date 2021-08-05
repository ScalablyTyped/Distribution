package typings.devtoolsProtocol.mod.Protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object SystemInfo {
  
  trait GPUDevice extends StObject {
    
    /**
      * PCI ID of the GPU device, if available; 0 otherwise.
      */
    var deviceId: Double
    
    /**
      * String description of the GPU device, if the PCI ID is not available.
      */
    var deviceString: String
    
    /**
      * String description of the GPU driver vendor.
      */
    var driverVendor: String
    
    /**
      * String description of the GPU driver version.
      */
    var driverVersion: String
    
    /**
      * Revision of the GPU, only available on Windows.
      */
    var revision: js.UndefOr[Double] = js.undefined
    
    /**
      * Sub sys ID of the GPU, only available on Windows.
      */
    var subSysId: js.UndefOr[Double] = js.undefined
    
    /**
      * PCI ID of the GPU vendor, if available; 0 otherwise.
      */
    var vendorId: Double
    
    /**
      * String description of the GPU vendor, if the PCI ID is not available.
      */
    var vendorString: String
  }
  object GPUDevice {
    
    inline def apply(
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
    
    extension [Self <: GPUDevice](x: Self) {
      
      inline def setDeviceId(value: Double): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
      
      inline def setDeviceString(value: String): Self = StObject.set(x, "deviceString", value.asInstanceOf[js.Any])
      
      inline def setDriverVendor(value: String): Self = StObject.set(x, "driverVendor", value.asInstanceOf[js.Any])
      
      inline def setDriverVersion(value: String): Self = StObject.set(x, "driverVersion", value.asInstanceOf[js.Any])
      
      inline def setRevision(value: Double): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
      
      inline def setRevisionUndefined: Self = StObject.set(x, "revision", js.undefined)
      
      inline def setSubSysId(value: Double): Self = StObject.set(x, "subSysId", value.asInstanceOf[js.Any])
      
      inline def setSubSysIdUndefined: Self = StObject.set(x, "subSysId", js.undefined)
      
      inline def setVendorId(value: Double): Self = StObject.set(x, "vendorId", value.asInstanceOf[js.Any])
      
      inline def setVendorString(value: String): Self = StObject.set(x, "vendorString", value.asInstanceOf[js.Any])
    }
  }
  
  trait GPUInfo extends StObject {
    
    /**
      * An optional dictionary of additional GPU related attributes.
      */
    var auxAttributes: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The graphics devices on the system. Element 0 is the primary GPU.
      */
    var devices: js.Array[GPUDevice]
    
    /**
      * An optional array of GPU driver bug workarounds.
      */
    var driverBugWorkarounds: js.Array[String]
    
    /**
      * An optional dictionary of graphics features and their status.
      */
    var featureStatus: js.UndefOr[js.Any] = js.undefined
    
    /**
      * Supported accelerated image decoding capabilities.
      */
    var imageDecoding: js.Array[ImageDecodeAcceleratorCapability]
    
    /**
      * Supported accelerated video decoding capabilities.
      */
    var videoDecoding: js.Array[VideoDecodeAcceleratorCapability]
    
    /**
      * Supported accelerated video encoding capabilities.
      */
    var videoEncoding: js.Array[VideoEncodeAcceleratorCapability]
  }
  object GPUInfo {
    
    inline def apply(
      devices: js.Array[GPUDevice],
      driverBugWorkarounds: js.Array[String],
      imageDecoding: js.Array[ImageDecodeAcceleratorCapability],
      videoDecoding: js.Array[VideoDecodeAcceleratorCapability],
      videoEncoding: js.Array[VideoEncodeAcceleratorCapability]
    ): GPUInfo = {
      val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], driverBugWorkarounds = driverBugWorkarounds.asInstanceOf[js.Any], imageDecoding = imageDecoding.asInstanceOf[js.Any], videoDecoding = videoDecoding.asInstanceOf[js.Any], videoEncoding = videoEncoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[GPUInfo]
    }
    
    extension [Self <: GPUInfo](x: Self) {
      
      inline def setAuxAttributes(value: js.Any): Self = StObject.set(x, "auxAttributes", value.asInstanceOf[js.Any])
      
      inline def setAuxAttributesUndefined: Self = StObject.set(x, "auxAttributes", js.undefined)
      
      inline def setDevices(value: js.Array[GPUDevice]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
      
      inline def setDevicesVarargs(value: GPUDevice*): Self = StObject.set(x, "devices", js.Array(value :_*))
      
      inline def setDriverBugWorkarounds(value: js.Array[String]): Self = StObject.set(x, "driverBugWorkarounds", value.asInstanceOf[js.Any])
      
      inline def setDriverBugWorkaroundsVarargs(value: String*): Self = StObject.set(x, "driverBugWorkarounds", js.Array(value :_*))
      
      inline def setFeatureStatus(value: js.Any): Self = StObject.set(x, "featureStatus", value.asInstanceOf[js.Any])
      
      inline def setFeatureStatusUndefined: Self = StObject.set(x, "featureStatus", js.undefined)
      
      inline def setImageDecoding(value: js.Array[ImageDecodeAcceleratorCapability]): Self = StObject.set(x, "imageDecoding", value.asInstanceOf[js.Any])
      
      inline def setImageDecodingVarargs(value: ImageDecodeAcceleratorCapability*): Self = StObject.set(x, "imageDecoding", js.Array(value :_*))
      
      inline def setVideoDecoding(value: js.Array[VideoDecodeAcceleratorCapability]): Self = StObject.set(x, "videoDecoding", value.asInstanceOf[js.Any])
      
      inline def setVideoDecodingVarargs(value: VideoDecodeAcceleratorCapability*): Self = StObject.set(x, "videoDecoding", js.Array(value :_*))
      
      inline def setVideoEncoding(value: js.Array[VideoEncodeAcceleratorCapability]): Self = StObject.set(x, "videoEncoding", value.asInstanceOf[js.Any])
      
      inline def setVideoEncodingVarargs(value: VideoEncodeAcceleratorCapability*): Self = StObject.set(x, "videoEncoding", js.Array(value :_*))
    }
  }
  
  trait GetInfoResponse extends StObject {
    
    /**
      * The command line string used to launch the browser. Will be the empty string if not
      * supported.
      */
    var commandLine: String
    
    /**
      * Information about the GPUs on the system.
      */
    var gpu: GPUInfo
    
    /**
      * A platform-dependent description of the model of the machine. On Mac OS, this is, for
      * example, 'MacBookPro'. Will be the empty string if not supported.
      */
    var modelName: String
    
    /**
      * A platform-dependent description of the version of the machine. On Mac OS, this is, for
      * example, '10.1'. Will be the empty string if not supported.
      */
    var modelVersion: String
  }
  object GetInfoResponse {
    
    inline def apply(commandLine: String, gpu: GPUInfo, modelName: String, modelVersion: String): GetInfoResponse = {
      val __obj = js.Dynamic.literal(commandLine = commandLine.asInstanceOf[js.Any], gpu = gpu.asInstanceOf[js.Any], modelName = modelName.asInstanceOf[js.Any], modelVersion = modelVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfoResponse]
    }
    
    extension [Self <: GetInfoResponse](x: Self) {
      
      inline def setCommandLine(value: String): Self = StObject.set(x, "commandLine", value.asInstanceOf[js.Any])
      
      inline def setGpu(value: GPUInfo): Self = StObject.set(x, "gpu", value.asInstanceOf[js.Any])
      
      inline def setModelName(value: String): Self = StObject.set(x, "modelName", value.asInstanceOf[js.Any])
      
      inline def setModelVersion(value: String): Self = StObject.set(x, "modelVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetProcessInfoResponse extends StObject {
    
    /**
      * An array of process info blocks.
      */
    var processInfo: js.Array[ProcessInfo]
  }
  object GetProcessInfoResponse {
    
    inline def apply(processInfo: js.Array[ProcessInfo]): GetProcessInfoResponse = {
      val __obj = js.Dynamic.literal(processInfo = processInfo.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProcessInfoResponse]
    }
    
    extension [Self <: GetProcessInfoResponse](x: Self) {
      
      inline def setProcessInfo(value: js.Array[ProcessInfo]): Self = StObject.set(x, "processInfo", value.asInstanceOf[js.Any])
      
      inline def setProcessInfoVarargs(value: ProcessInfo*): Self = StObject.set(x, "processInfo", js.Array(value :_*))
    }
  }
  
  trait ImageDecodeAcceleratorCapability extends StObject {
    
    /**
      * Image coded, e.g. Jpeg.
      */
    var imageType: ImageType
    
    /**
      * Maximum supported dimensions of the image in pixels.
      */
    var maxDimensions: Size
    
    /**
      * Minimum supported dimensions of the image in pixels.
      */
    var minDimensions: Size
    
    /**
      * Optional array of supported subsampling formats, e.g. 4:2:0, if known.
      */
    var subsamplings: js.Array[SubsamplingFormat]
  }
  object ImageDecodeAcceleratorCapability {
    
    inline def apply(
      imageType: ImageType,
      maxDimensions: Size,
      minDimensions: Size,
      subsamplings: js.Array[SubsamplingFormat]
    ): ImageDecodeAcceleratorCapability = {
      val __obj = js.Dynamic.literal(imageType = imageType.asInstanceOf[js.Any], maxDimensions = maxDimensions.asInstanceOf[js.Any], minDimensions = minDimensions.asInstanceOf[js.Any], subsamplings = subsamplings.asInstanceOf[js.Any])
      __obj.asInstanceOf[ImageDecodeAcceleratorCapability]
    }
    
    extension [Self <: ImageDecodeAcceleratorCapability](x: Self) {
      
      inline def setImageType(value: ImageType): Self = StObject.set(x, "imageType", value.asInstanceOf[js.Any])
      
      inline def setMaxDimensions(value: Size): Self = StObject.set(x, "maxDimensions", value.asInstanceOf[js.Any])
      
      inline def setMinDimensions(value: Size): Self = StObject.set(x, "minDimensions", value.asInstanceOf[js.Any])
      
      inline def setSubsamplings(value: js.Array[SubsamplingFormat]): Self = StObject.set(x, "subsamplings", value.asInstanceOf[js.Any])
      
      inline def setSubsamplingsVarargs(value: SubsamplingFormat*): Self = StObject.set(x, "subsamplings", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg
    - typings.devtoolsProtocol.devtoolsProtocolStrings.webp
    - typings.devtoolsProtocol.devtoolsProtocolStrings.unknown
  */
  trait ImageType extends StObject
  object ImageType {
    
    inline def jpeg: typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg = "jpeg".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.jpeg]
    
    inline def unknown: typings.devtoolsProtocol.devtoolsProtocolStrings.unknown = "unknown".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.unknown]
    
    inline def webp: typings.devtoolsProtocol.devtoolsProtocolStrings.webp = "webp".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.webp]
  }
  
  trait ProcessInfo extends StObject {
    
    /**
      * Specifies cumulative CPU usage in seconds across all threads of the
      * process since the process start.
      */
    var cpuTime: Double
    
    /**
      * Specifies process id.
      */
    var id: integer
    
    /**
      * Specifies process type.
      */
    var `type`: String
  }
  object ProcessInfo {
    
    inline def apply(cpuTime: Double, id: integer, `type`: String): ProcessInfo = {
      val __obj = js.Dynamic.literal(cpuTime = cpuTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProcessInfo]
    }
    
    extension [Self <: ProcessInfo](x: Self) {
      
      inline def setCpuTime(value: Double): Self = StObject.set(x, "cpuTime", value.asInstanceOf[js.Any])
      
      inline def setId(value: integer): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    /**
      * Height in pixels.
      */
    var height: integer
    
    /**
      * Width in pixels.
      */
    var width: integer
  }
  object Size {
    
    inline def apply(height: integer, width: integer): Size = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeight(value: integer): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: integer): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.devtoolsProtocol.devtoolsProtocolStrings.yuv420
    - typings.devtoolsProtocol.devtoolsProtocolStrings.yuv422
    - typings.devtoolsProtocol.devtoolsProtocolStrings.yuv444
  */
  trait SubsamplingFormat extends StObject
  object SubsamplingFormat {
    
    inline def yuv420: typings.devtoolsProtocol.devtoolsProtocolStrings.yuv420 = "yuv420".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.yuv420]
    
    inline def yuv422: typings.devtoolsProtocol.devtoolsProtocolStrings.yuv422 = "yuv422".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.yuv422]
    
    inline def yuv444: typings.devtoolsProtocol.devtoolsProtocolStrings.yuv444 = "yuv444".asInstanceOf[typings.devtoolsProtocol.devtoolsProtocolStrings.yuv444]
  }
  
  trait VideoDecodeAcceleratorCapability extends StObject {
    
    /**
      * Maximum video dimensions in pixels supported for this |profile|.
      */
    var maxResolution: Size
    
    /**
      * Minimum video dimensions in pixels supported for this |profile|.
      */
    var minResolution: Size
    
    /**
      * Video codec profile that is supported, e.g. VP9 Profile 2.
      */
    var profile: String
  }
  object VideoDecodeAcceleratorCapability {
    
    inline def apply(maxResolution: Size, minResolution: Size, profile: String): VideoDecodeAcceleratorCapability = {
      val __obj = js.Dynamic.literal(maxResolution = maxResolution.asInstanceOf[js.Any], minResolution = minResolution.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoDecodeAcceleratorCapability]
    }
    
    extension [Self <: VideoDecodeAcceleratorCapability](x: Self) {
      
      inline def setMaxResolution(value: Size): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setMinResolution(value: Size): Self = StObject.set(x, "minResolution", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
  
  trait VideoEncodeAcceleratorCapability extends StObject {
    
    var maxFramerateDenominator: integer
    
    /**
      * Maximum encoding framerate in frames per second supported for this
      * |profile|, as fraction's numerator and denominator, e.g. 24/1 fps,
      * 24000/1001 fps, etc.
      */
    var maxFramerateNumerator: integer
    
    /**
      * Maximum video dimensions in pixels supported for this |profile|.
      */
    var maxResolution: Size
    
    /**
      * Video codec profile that is supported, e.g H264 Main.
      */
    var profile: String
  }
  object VideoEncodeAcceleratorCapability {
    
    inline def apply(
      maxFramerateDenominator: integer,
      maxFramerateNumerator: integer,
      maxResolution: Size,
      profile: String
    ): VideoEncodeAcceleratorCapability = {
      val __obj = js.Dynamic.literal(maxFramerateDenominator = maxFramerateDenominator.asInstanceOf[js.Any], maxFramerateNumerator = maxFramerateNumerator.asInstanceOf[js.Any], maxResolution = maxResolution.asInstanceOf[js.Any], profile = profile.asInstanceOf[js.Any])
      __obj.asInstanceOf[VideoEncodeAcceleratorCapability]
    }
    
    extension [Self <: VideoEncodeAcceleratorCapability](x: Self) {
      
      inline def setMaxFramerateDenominator(value: integer): Self = StObject.set(x, "maxFramerateDenominator", value.asInstanceOf[js.Any])
      
      inline def setMaxFramerateNumerator(value: integer): Self = StObject.set(x, "maxFramerateNumerator", value.asInstanceOf[js.Any])
      
      inline def setMaxResolution(value: Size): Self = StObject.set(x, "maxResolution", value.asInstanceOf[js.Any])
      
      inline def setProfile(value: String): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    }
  }
}
