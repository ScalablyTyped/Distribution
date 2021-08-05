package typings.googleAppsScript.GoogleAppsScript.DataStudio

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the configuration entries for a connector. These configuration entries define what
  * questions are asked when adding a new connector.
  *
  *     var cc = DataStudioApp.createCommunityConnector();
  *     var config = cc.getConfig();
  *
  *     var info_entry = config.newInfo()
  *       .setId("info_id")
  *       .setHelpText("This connector can connect to multiple data endpoints.");
  */
trait Config extends StObject {
  
  def build(): Config
  
  def newCheckbox(): Checkbox
  
  def newInfo(): Info
  
  def newOptionBuilder(): OptionBuilder
  
  def newSelectMultiple(): SelectMultiple
  
  def newSelectSingle(): SelectSingle
  
  def newTextArea(): TextArea
  
  def newTextInput(): TextInput
  
  def printJson(): String
  
  def setDateRangeRequired(dateRangeRequired: Boolean): Config
  
  def setIsSteppedConfig(isSteppedConfig: Boolean): Config
}
object Config {
  
  inline def apply(
    build: () => Config,
    newCheckbox: () => Checkbox,
    newInfo: () => Info,
    newOptionBuilder: () => OptionBuilder,
    newSelectMultiple: () => SelectMultiple,
    newSelectSingle: () => SelectSingle,
    newTextArea: () => TextArea,
    newTextInput: () => TextInput,
    printJson: () => String,
    setDateRangeRequired: Boolean => Config,
    setIsSteppedConfig: Boolean => Config
  ): Config = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), newCheckbox = js.Any.fromFunction0(newCheckbox), newInfo = js.Any.fromFunction0(newInfo), newOptionBuilder = js.Any.fromFunction0(newOptionBuilder), newSelectMultiple = js.Any.fromFunction0(newSelectMultiple), newSelectSingle = js.Any.fromFunction0(newSelectSingle), newTextArea = js.Any.fromFunction0(newTextArea), newTextInput = js.Any.fromFunction0(newTextInput), printJson = js.Any.fromFunction0(printJson), setDateRangeRequired = js.Any.fromFunction1(setDateRangeRequired), setIsSteppedConfig = js.Any.fromFunction1(setIsSteppedConfig))
    __obj.asInstanceOf[Config]
  }
  
  extension [Self <: Config](x: Self) {
    
    inline def setBuild(value: () => Config): Self = StObject.set(x, "build", js.Any.fromFunction0(value))
    
    inline def setNewCheckbox(value: () => Checkbox): Self = StObject.set(x, "newCheckbox", js.Any.fromFunction0(value))
    
    inline def setNewInfo(value: () => Info): Self = StObject.set(x, "newInfo", js.Any.fromFunction0(value))
    
    inline def setNewOptionBuilder(value: () => OptionBuilder): Self = StObject.set(x, "newOptionBuilder", js.Any.fromFunction0(value))
    
    inline def setNewSelectMultiple(value: () => SelectMultiple): Self = StObject.set(x, "newSelectMultiple", js.Any.fromFunction0(value))
    
    inline def setNewSelectSingle(value: () => SelectSingle): Self = StObject.set(x, "newSelectSingle", js.Any.fromFunction0(value))
    
    inline def setNewTextArea(value: () => TextArea): Self = StObject.set(x, "newTextArea", js.Any.fromFunction0(value))
    
    inline def setNewTextInput(value: () => TextInput): Self = StObject.set(x, "newTextInput", js.Any.fromFunction0(value))
    
    inline def setPrintJson(value: () => String): Self = StObject.set(x, "printJson", js.Any.fromFunction0(value))
    
    inline def setSetDateRangeRequired(value: Boolean => Config): Self = StObject.set(x, "setDateRangeRequired", js.Any.fromFunction1(value))
    
    inline def setSetIsSteppedConfig(value: Boolean => Config): Self = StObject.set(x, "setIsSteppedConfig", js.Any.fromFunction1(value))
  }
}
