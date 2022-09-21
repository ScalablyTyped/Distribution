package typings.dockerode.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* tslint:enable:interface-name */
trait VolumeCreateOptions extends StObject {
  
  var Driver: js.UndefOr[String] = js.undefined
  
  var DriverOpts: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Labels: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var Name: js.UndefOr[String] = js.undefined
}
object VolumeCreateOptions {
  
  inline def apply(): VolumeCreateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VolumeCreateOptions]
  }
  
  extension [Self <: VolumeCreateOptions](x: Self) {
    
    inline def setDriver(value: String): Self = StObject.set(x, "Driver", value.asInstanceOf[js.Any])
    
    inline def setDriverOpts(value: StringDictionary[String]): Self = StObject.set(x, "DriverOpts", value.asInstanceOf[js.Any])
    
    inline def setDriverOptsUndefined: Self = StObject.set(x, "DriverOpts", js.undefined)
    
    inline def setDriverUndefined: Self = StObject.set(x, "Driver", js.undefined)
    
    inline def setLabels(value: StringDictionary[String]): Self = StObject.set(x, "Labels", value.asInstanceOf[js.Any])
    
    inline def setLabelsUndefined: Self = StObject.set(x, "Labels", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
