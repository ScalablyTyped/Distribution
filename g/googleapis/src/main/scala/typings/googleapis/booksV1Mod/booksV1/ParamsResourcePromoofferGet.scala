package typings.googleapis.booksV1Mod.booksV1

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParamsResourcePromoofferGet
  extends StObject
     with StandardParameters {
  
  /**
    * device android_id
    */
  var androidId: js.UndefOr[String] = js.undefined
  
  /**
    * device device
    */
  var device: js.UndefOr[String] = js.undefined
  
  /**
    * device manufacturer
    */
  var manufacturer: js.UndefOr[String] = js.undefined
  
  /**
    * device model
    */
  var model: js.UndefOr[String] = js.undefined
  
  /**
    * device product
    */
  var product: js.UndefOr[String] = js.undefined
  
  /**
    * device serial
    */
  var serial: js.UndefOr[String] = js.undefined
}
object ParamsResourcePromoofferGet {
  
  inline def apply(): ParamsResourcePromoofferGet = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParamsResourcePromoofferGet]
  }
  
  extension [Self <: ParamsResourcePromoofferGet](x: Self) {
    
    inline def setAndroidId(value: String): Self = StObject.set(x, "androidId", value.asInstanceOf[js.Any])
    
    inline def setAndroidIdUndefined: Self = StObject.set(x, "androidId", js.undefined)
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setDeviceUndefined: Self = StObject.set(x, "device", js.undefined)
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setManufacturerUndefined: Self = StObject.set(x, "manufacturer", js.undefined)
    
    inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
    
    inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
    
    inline def setProduct(value: String): Self = StObject.set(x, "product", value.asInstanceOf[js.Any])
    
    inline def setProductUndefined: Self = StObject.set(x, "product", js.undefined)
    
    inline def setSerial(value: String): Self = StObject.set(x, "serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "serial", js.undefined)
  }
}
