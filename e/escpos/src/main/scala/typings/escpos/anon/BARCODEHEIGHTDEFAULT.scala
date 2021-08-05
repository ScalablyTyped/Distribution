package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreehCentsign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BARCODEHEIGHTDEFAULT extends StObject {
  
  var BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign
  
  var BARCODE_MODE: OFF
  
  // Barcode height default=162
  var CODE2D_FORMAT: LENOFFSET
}
object BARCODEHEIGHTDEFAULT {
  
  inline def apply(BARCODE_MODE: OFF, CODE2D_FORMAT: LENOFFSET): BARCODEHEIGHTDEFAULT = {
    val __obj = js.Dynamic.literal(BARCODE_HEIGHT_DEFAULT = "\u001Dh\u00A2", BARCODE_MODE = BARCODE_MODE.asInstanceOf[js.Any], CODE2D_FORMAT = CODE2D_FORMAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BARCODEHEIGHTDEFAULT]
  }
  
  extension [Self <: BARCODEHEIGHTDEFAULT](x: Self) {
    
    inline def setBARCODE_HEIGHT_DEFAULT(value: InformationseparatorthreehCentsign): Self = StObject.set(x, "BARCODE_HEIGHT_DEFAULT", value.asInstanceOf[js.Any])
    
    inline def setBARCODE_MODE(value: OFF): Self = StObject.set(x, "BARCODE_MODE", value.asInstanceOf[js.Any])
    
    inline def setCODE2D_FORMAT(value: LENOFFSET): Self = StObject.set(x, "CODE2D_FORMAT", value.asInstanceOf[js.Any])
  }
}
