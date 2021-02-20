package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@js.native
trait Checkbox extends StObject {
  
  def setAllowOverride(allowOverride: Boolean): Checkbox = js.native
  
  def setHelpText(helpText: String): Checkbox = js.native
  
  def setId(id: String): Checkbox = js.native
  
  def setIsDynamic(isDynamic: Boolean): Checkbox = js.native
  
  def setName(name: String): Checkbox = js.native
}
object Checkbox {
  
  @scala.inline
  def apply(
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
  implicit class CheckboxMutableBuilder[Self <: Checkbox] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetAllowOverride(value: Boolean => Checkbox): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => Checkbox): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: String => Checkbox): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsDynamic(value: Boolean => Checkbox): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => Checkbox): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
