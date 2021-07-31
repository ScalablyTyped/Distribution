package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains select single information for the config. Its properties determine how the select single
  * is displayed in Data Studio.
  *
  *     var option1 = config.newOptionBuilder()
  *       .setLabel("option label")
  *       .setValue("option_value");
  *
  *     var option2 = config.newOptionBuilder()
  *       .setLabel("second option label")
  *       .setValue("option_value_2");
  *
  *     var info1 = config.newSelectSingle()
  *       .setId("api_endpoint")
  *       .setName("Data Type")
  *       .setHelpText("Select the data type you're interested in.")
  *       .setAllowOverride(true)
  *       .addOption(option1)
  *       .addOption(option2);
  */
trait SelectSingle extends StObject {
  
  def addOption(optionBuilder: OptionBuilder): SelectSingle
  
  def setAllowOverride(allowOverride: Boolean): SelectSingle
  
  def setHelpText(helpText: String): SelectSingle
  
  def setId(id: String): SelectSingle
  
  def setIsDynamic(isDynamic: Boolean): SelectSingle
  
  def setName(name: String): SelectSingle
}
object SelectSingle {
  
  @scala.inline
  def apply(
    addOption: OptionBuilder => SelectSingle,
    setAllowOverride: Boolean => SelectSingle,
    setHelpText: String => SelectSingle,
    setId: String => SelectSingle,
    setIsDynamic: Boolean => SelectSingle,
    setName: String => SelectSingle
  ): SelectSingle = {
    val __obj = js.Dynamic.literal(addOption = js.Any.fromFunction1(addOption), setAllowOverride = js.Any.fromFunction1(setAllowOverride), setHelpText = js.Any.fromFunction1(setHelpText), setId = js.Any.fromFunction1(setId), setIsDynamic = js.Any.fromFunction1(setIsDynamic), setName = js.Any.fromFunction1(setName))
    __obj.asInstanceOf[SelectSingle]
  }
  
  @scala.inline
  implicit class SelectSingleMutableBuilder[Self <: SelectSingle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddOption(value: OptionBuilder => SelectSingle): Self = StObject.set(x, "addOption", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetAllowOverride(value: Boolean => SelectSingle): Self = StObject.set(x, "setAllowOverride", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetHelpText(value: String => SelectSingle): Self = StObject.set(x, "setHelpText", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetId(value: String => SelectSingle): Self = StObject.set(x, "setId", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetIsDynamic(value: Boolean => SelectSingle): Self = StObject.set(x, "setIsDynamic", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetName(value: String => SelectSingle): Self = StObject.set(x, "setName", js.Any.fromFunction1(value))
  }
}
