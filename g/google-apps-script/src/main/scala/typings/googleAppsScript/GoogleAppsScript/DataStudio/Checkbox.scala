package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains checkbox information for the config. Its properties determine how the checkbox is
  * displayed in Data Studio.
  *
  *     var checkbox = config.newCheckbox()
  *       .setId("use_https")
  *       .setName("Use Https?")
  *       .setHelpText("Whether or not https should be used.")
  *       .setAllowOverride(true);
  */
trait Checkbox extends StObject {
  
  def setAllowOverride(allowOverride: Boolean): Checkbox
  
  def setHelpText(helpText: String): Checkbox
  
  def setId(id: String): Checkbox
  
  def setIsDynamic(isDynamic: Boolean): Checkbox
  
  def setName(name: String): Checkbox
}
object Checkbox {
  
  inline def apply(
    setAllowOverride: Boolean => Checkbox,
    setHelpText: String => Checkbox,
    setId: String => Checkbox,
    setIsDynamic: Boolean => Checkbox,
    setName: String => Checkbox
  ): Checkbox = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[Checkbox]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    inline def setSetAllowOverride(value: Boolean => Checkbox): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => Checkbox): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetId(value: String => Checkbox): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIsDynamic(value: Boolean => Checkbox): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => Checkbox): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
