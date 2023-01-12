package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains text input information for the config. Its properties determine how the text input is
  * displayed in Data Studio.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info1 = config.newTextInput()
  *       .setId("info1")
  *       .setName("Search")
  *       .setHelpText("for example, Coldplay")
  *       .setAllowOverride(true)
  *       .setPlaceholder("Search for an artist for all songs.");
  */
trait TextInput extends StObject {
  
  def setAllowOverride(allowOverride: Boolean): TextInput
  
  def setHelpText(helpText: String): TextInput
  
  def setId(id: String): TextInput
  
  def setIsDynamic(isDynamic: Boolean): TextInput
  
  def setName(name: String): TextInput
  
  def setPlaceholder(placeholder: String): TextInput
}
object TextInput {
  
  inline def apply(
    setAllowOverride: Boolean => TextInput,
    setHelpText: String => TextInput,
    setId: String => TextInput,
    setIsDynamic: Boolean => TextInput,
    setName: String => TextInput,
    setPlaceholder: String => TextInput
  ): TextInput = {
    val __obj = js.Dynamic.literal(setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName), setPlaceholder = js.Any.fromFunction1(setPlaceholder))
    __obj.asInstanceOf[TextInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextInput] (val x: Self) extends AnyVal {
    
    inline def setSetAllowOverride(value: Boolean => TextInput): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    inline def setSetHelpText(value: String => TextInput): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    inline def setSetId(value: String => TextInput): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    inline def setSetIsDynamic(value: Boolean => TextInput): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    inline def setSetName(value: String => TextInput): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
    
    inline def setSetPlaceholder(value: String => TextInput): Self = StObject.set(x, "setPlaceholder", js.Any.fromFunction1(value))
  }
}
