package typings.djangoBananas

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object colorsMod {
  
  @JSImport("django-bananas/colors", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def createColor(base: String): Color = ^.asInstanceOf[js.Dynamic].applyDynamic("createColor")(base.asInstanceOf[js.Any]).asInstanceOf[Color]
  
  @JSImport("django-bananas/colors", "django")
  @js.native
  val django: Color = js.native
  
  trait Color extends StObject {
    
    var `100`: String
    
    var `200`: String
    
    var `300`: String
    
    var `400`: String
    
    var `500`: String
    
    var `600`: String
    
    var `700`: String
    
    var `800`: String
    
    var `900`: String
  }
  object Color {
    
    inline def apply(
      `100`: String,
      `200`: String,
      `300`: String,
      `400`: String,
      `500`: String,
      `600`: String,
      `700`: String,
      `800`: String,
      `900`: String
    ): Color = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("100")(`100`.asInstanceOf[js.Any])
      __obj.updateDynamic("200")(`200`.asInstanceOf[js.Any])
      __obj.updateDynamic("300")(`300`.asInstanceOf[js.Any])
      __obj.updateDynamic("400")(`400`.asInstanceOf[js.Any])
      __obj.updateDynamic("500")(`500`.asInstanceOf[js.Any])
      __obj.updateDynamic("600")(`600`.asInstanceOf[js.Any])
      __obj.updateDynamic("700")(`700`.asInstanceOf[js.Any])
      __obj.updateDynamic("800")(`800`.asInstanceOf[js.Any])
      __obj.updateDynamic("900")(`900`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def set100(value: String): Self = StObject.set(x, "100", value.asInstanceOf[js.Any])
      
      inline def set200(value: String): Self = StObject.set(x, "200", value.asInstanceOf[js.Any])
      
      inline def set300(value: String): Self = StObject.set(x, "300", value.asInstanceOf[js.Any])
      
      inline def set400(value: String): Self = StObject.set(x, "400", value.asInstanceOf[js.Any])
      
      inline def set500(value: String): Self = StObject.set(x, "500", value.asInstanceOf[js.Any])
      
      inline def set600(value: String): Self = StObject.set(x, "600", value.asInstanceOf[js.Any])
      
      inline def set700(value: String): Self = StObject.set(x, "700", value.asInstanceOf[js.Any])
      
      inline def set800(value: String): Self = StObject.set(x, "800", value.asInstanceOf[js.Any])
      
      inline def set900(value: String): Self = StObject.set(x, "900", value.asInstanceOf[js.Any])
    }
  }
}
