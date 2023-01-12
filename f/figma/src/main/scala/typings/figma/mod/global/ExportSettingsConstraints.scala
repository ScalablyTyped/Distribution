package typings.figma.mod.global

import typings.figma.figmaStrings.HEIGHT
import typings.figma.figmaStrings.SCALE
import typings.figma.figmaStrings.WIDTH
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportSettingsConstraints extends StObject {
  
  val `type`: SCALE | WIDTH | HEIGHT
  
  val value: Double
}
object ExportSettingsConstraints {
  
  inline def apply(`type`: SCALE | WIDTH | HEIGHT, value: Double): ExportSettingsConstraints = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportSettingsConstraints]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportSettingsConstraints] (val x: Self) extends AnyVal {
    
    inline def setType(value: SCALE | WIDTH | HEIGHT): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
