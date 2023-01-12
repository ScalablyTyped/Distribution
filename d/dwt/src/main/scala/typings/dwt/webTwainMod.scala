package typings.dwt

import typings.dwt.addonDotBarcodeReaderMod.BarcodeReader
import typings.dwt.addonDotCameraMod.Camera
import typings.dwt.addonDotOCRMod.OCR
import typings.dwt.addonDotOCRProMod.OCRPro
import typings.dwt.addonDotPDFMod.PDF
import typings.dwt.addonDotWebcamMod.Webcam
import typings.dwt.dynamsoftDotEnumMod.DynamsoftEnums.EnumDWTBorderStyle
import typings.dwt.webTwainDotViewerMod.WebTwainViewer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTwainMod {
  
  trait Addon extends StObject {
    
    var BarcodeReader: typings.dwt.addonDotBarcodeReaderMod.BarcodeReader
    
    var Camera: typings.dwt.addonDotCameraMod.Camera
    
    var OCR: typings.dwt.addonDotOCRMod.OCR
    
    var OCRPro: typings.dwt.addonDotOCRProMod.OCRPro
    
    var PDF: typings.dwt.addonDotPDFMod.PDF
    
    var Webcam: typings.dwt.addonDotWebcamMod.Webcam
  }
  object Addon {
    
    inline def apply(BarcodeReader: BarcodeReader, Camera: Camera, OCR: OCR, OCRPro: OCRPro, PDF: PDF, Webcam: Webcam): Addon = {
      val __obj = js.Dynamic.literal(BarcodeReader = BarcodeReader.asInstanceOf[js.Any], Camera = Camera.asInstanceOf[js.Any], OCR = OCR.asInstanceOf[js.Any], OCRPro = OCRPro.asInstanceOf[js.Any], PDF = PDF.asInstanceOf[js.Any], Webcam = Webcam.asInstanceOf[js.Any])
      __obj.asInstanceOf[Addon]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Addon] (val x: Self) extends AnyVal {
      
      inline def setBarcodeReader(value: BarcodeReader): Self = StObject.set(x, "BarcodeReader", value.asInstanceOf[js.Any])
      
      inline def setCamera(value: Camera): Self = StObject.set(x, "Camera", value.asInstanceOf[js.Any])
      
      inline def setOCR(value: OCR): Self = StObject.set(x, "OCR", value.asInstanceOf[js.Any])
      
      inline def setOCRPro(value: OCRPro): Self = StObject.set(x, "OCRPro", value.asInstanceOf[js.Any])
      
      inline def setPDF(value: PDF): Self = StObject.set(x, "PDF", value.asInstanceOf[js.Any])
      
      inline def setWebcam(value: Webcam): Self = StObject.set(x, "Webcam", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WebTwain
    extends StObject
       with WebTwainViewer {
    
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
