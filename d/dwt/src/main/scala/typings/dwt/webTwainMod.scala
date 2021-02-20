package typings.dwt

import typings.dwt.addonBarcodeReaderMod.BarcodeReader
import typings.dwt.addonCameraMod.Camera
import typings.dwt.addonOCRMod.OCR
import typings.dwt.addonOCRProMod.OCRPro
import typings.dwt.addonPDFMod.PDF
import typings.dwt.addonWebcamMod.Webcam
import typings.dwt.dynamsoftEnumMod.DynamsoftEnums.EnumDWTBorderStyle
import typings.dwt.webTwainViewerMod.WebTwainViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainMod {
  
  @js.native
  trait Addon extends StObject {
    
    var BarcodeReader: typings.dwt.addonBarcodeReaderMod.BarcodeReader = js.native
    
    var Camera: typings.dwt.addonCameraMod.Camera = js.native
    
    var OCR: typings.dwt.addonOCRMod.OCR = js.native
    
    var OCRPro: typings.dwt.addonOCRProMod.OCRPro = js.native
    
    var PDF: typings.dwt.addonPDFMod.PDF = js.native
    
    var Webcam: typings.dwt.addonWebcamMod.Webcam = js.native
  }
  object Addon {
    
    @scala.inline
    def apply(BarcodeReader: BarcodeReader, Camera: Camera, OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): Addon = {
      val __obj = js.Dynamic.literal(BarcodeReader = BarcodeReader.asInstanceOf[js.Any], Camera = Camera.asInstanceOf[js.Any], OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addon]
    }
    
    @scala.inline
    implicit class AddonMutableBuilder[Self <: Addon] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBarcodeReader(value: BarcodeReader): Self = StObject.set(x, "BarcodeReader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCamera(value: Camera): Self = StObject.set(x, "Camera", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOCR(value: OCR): Self = StObject.set(x, "OCR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOCRPro(value: OCRPro): Self = StObject.set(x, "OCRPro", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPDF(value: PDF): Self = StObject.set(x, "PDF", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebcam(value: Webcam): Self = StObject.set(x, "Webcam", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebTwain extends WebTwainViewer {
    
    /**
      * Addons to WebTwain instances.
      */
    var Addon: typings.dwt.webTwainMod.Addon = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var AllowMultiSelect: Boolean = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var AllowPluginAuthentication: Boolean = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var AsyncMode: Boolean = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var BorderStyle: EnumDWTBorderStyle | Double = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var BrokerProcessType: Double = js.native
    
    /**
      * [Deprecation] This API is no longer needed.
      */
    var EnableInteractiveZoom: Boolean = js.native
    
    /**
      * Return whether a WebTwain instance is ready to use.
      */
    val bReady: Boolean = js.native
  }
}
