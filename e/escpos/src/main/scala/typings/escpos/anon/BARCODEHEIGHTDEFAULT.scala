package typings.escpos.anon

import typings.escpos.escposStrings.InformationseparatorthreehCentsign
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BARCODEHEIGHTDEFAULT extends StObject {
  
  var BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign = js.native
  
  var BARCODE_MODE: OFF = js.native
  
  // Barcode height default=162
  var CODE2D_FORMAT: LENOFFSET = js.native
}
object BARCODEHEIGHTDEFAULT {
  
  @scala.inline
  def apply(
    BARCODE_HEIGHT_DEFAULT: InformationseparatorthreehCentsign,
    BARCODE_MODE: OFF,
    CODE2D_FORMAT: LENOFFSET
  ): BARCODEHEIGHTDEFAULT = {
    val __obj = js.Dynamic.literal(BARCODE_HEIGHT_DEFAULT = BARCODE_HEIGHT_DEFAULT.asInstanceOf[js.Any], BARCODE_MODE = BARCODE_MODE.asInstanceOf[js.Any], CODE2D_FORMAT = CODE2D_FORMAT.asInstanceOf[js.Any])
    __obj.asInstanceOf[BARCODEHEIGHTDEFAULT]
  }
  
  @scala.inline
  implicit class BARCODEHEIGHTDEFAULTMutableBuilder[Self <: BARCODEHEIGHTDEFAULT] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBARCODE_HEIGHT_DEFAULT(value: InformationseparatorthreehCentsign): Self = StObject.set(x, "BARCODE_HEIGHT_DEFAULT", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBARCODE_MODE(value: OFF): Self = StObject.set(x, "BARCODE_MODE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCODE2D_FORMAT(value: LENOFFSET): Self = StObject.set(x, "CODE2D_FORMAT", value.asInstanceOf[js.Any])
  }
}
